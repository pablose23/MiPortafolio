// Configuración
const urlParams = new URLSearchParams(window.location.search);
const urlTime = urlParams.get('time');
const TOTAL_MINUTES = urlTime ? parseInt(urlTime) : 45; // Lee de URL o usa defecto
const CORRECT_KEY = "NOBEL2026";

let timeRemaining = TOTAL_MINUTES * 60;
let timerInterval;
// Audio Context
let audioCtx;
let nextBeepTime = 0;
let audioEnabled = false;

const timerElement = document.getElementById('timer');
const statusHeader = document.getElementById('status-header');
const subTitleLabel = statusHeader.querySelector('span'); // Subtítulo para atajo admin
const mainMessage = document.getElementById('main-message');
const keyInput = document.getElementById('key-input');
const decryptBtn = document.getElementById('decrypt-btn');
const inputSection = document.getElementById('input-section');

// Textos
const RANSOM_TEXT = `
    "Vuestro intento de 'justicia histórica' ha sido detectado... y bloqueado. He encriptado todos
    los expedientes de las candidatas al Nobel. En <span id="dynamic-minutes">${TOTAL_MINUTES}</span> minutos, el script DELETE_HISTORY.exe
    se ejecutará y estas mujeres volverán a ser solo notas a pie de página en libros que nadie
    lee.<br><br>
    Dicen que el ingenio de estas científicas cambió el mundo. Veamos si el vuestro es
    suficiente para recuperar la clave maestra. He dejado pistas ocultas entre los escombros de
    vuestros propios archivos.<br><br>
    Tic, tac... El tiempo corre y el olvido es eterno."
`;

const SUCCESS_TEXT = `
    "SISTEMA RESTAURADO. Habéis demostrado que la historia de la ciencia no está
    completa sin ellas. El 11 de febrero no es solo una fecha, es un recordatorio de que vuestro
    nombre también podría estar en estos archivos algún día. ¡Misión cumplida!"
`;

// Inicialización
function init() {
    mainMessage.innerHTML = RANSOM_TEXT;
    startTimer();

    decryptBtn.addEventListener('click', checkKey);
    keyInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') checkKey();
    });

    // ATAJO ADMIN: Triple click en el subtítulo "ASBIOCAM DATACENTER" para cambiar tiempo
    let clickCount = 0;
    subTitleLabel.style.cursor = "pointer";
    subTitleLabel.addEventListener('click', () => {
        clickCount++;
        if (clickCount === 3) {
            clickCount = 0;
            askForTime();
        }
        setTimeout(() => clickCount = 0, 1000); // Reset si no hace click rápido
    });

    // ACTIVAR AUDIO con cualquier interacción
    document.body.addEventListener('click', enableAudio, { once: true });
    document.body.addEventListener('keydown', enableAudio, { once: true });
}

function enableAudio() {
    if (!audioEnabled) {
        audioCtx = new (window.AudioContext || window.webkitAudioContext)();
        audioEnabled = true;
        // Reproducir un sonido de inicio breve
        playBeep(800, 0.1, 'sawtooth');
        scheduleBeeps();
    }
}

function playBeep(freq, duration, type = 'square') {
    if (!audioCtx) return;
    const osc = audioCtx.createOscillator();
    const gainNode = audioCtx.createGain();

    osc.type = type;
    osc.frequency.setValueAtTime(freq, audioCtx.currentTime);

    gainNode.gain.setValueAtTime(0.1, audioCtx.currentTime);
    gainNode.gain.exponentialRampToValueAtTime(0.01, audioCtx.currentTime + duration);

    osc.connect(gainNode);
    gainNode.connect(audioCtx.destination);

    osc.start();
    osc.stop(audioCtx.currentTime + duration);
}

function scheduleBeeps() {
    if (!audioEnabled || timeRemaining <= 0) return;

    // Calcular frecuencia de pitidos según el tiempo restante
    let interval = 2000; // Por defecto lento
    let freq = 600;

    if (timeRemaining < 10) { // Últimos 10 segundos
        interval = 500;
        freq = 1200;
    } else if (timeRemaining < 60) { // Último minuto
        interval = 1000;
        freq = 1000;
    } else if (timeRemaining < 300) { // Últimos 5 min
        interval = 1500;
        freq = 800;
    }

    playBeep(freq, 0.1);
    setTimeout(scheduleBeeps, interval);
}

function askForTime() {
    const newTime = prompt("MODO ADMIN: Ingresa nuevos minutos:");
    if (newTime && !isNaN(newTime)) {
        clearInterval(timerInterval);
        timeRemaining = parseInt(newTime) * 60;
        // Actualizar texto también
        const minSpan = document.getElementById('dynamic-minutes');
        if (minSpan) minSpan.textContent = newTime;
        startTimer();
    }
}

function startTimer() {
    updateTimerDisplay();
    // Limpiar intervalo previo si existe para evitar duplicados
    if (timerInterval) clearInterval(timerInterval);

    timerInterval = setInterval(() => {
        timeRemaining--;
        if (timeRemaining <= 0) {
            clearInterval(timerInterval);
            timerFailure();
        }
        updateTimerDisplay();
    }, 1000);
}

function updateTimerDisplay() {
    if (timeRemaining < 0) timeRemaining = 0;
    const minutes = Math.floor(timeRemaining / 60);
    const seconds = timeRemaining % 60;
    timerElement.textContent = pad(minutes) + ':' + pad(seconds);

    if (timeRemaining < 300) {
        timerElement.style.color = timeRemaining % 2 === 0 ? 'red' : 'white';
    } else {
        timerElement.style.color = 'var(--accent-color)';
    }
}

function pad(num) {
    return num.toString().padStart(2, '0');
}

function checkKey() {
    const userKey = keyInput.value.trim().toUpperCase();
    if (userKey === CORRECT_KEY) {
        triggerSuccess();
    } else {
        triggerFailure();
    }
}

function triggerFailure() {
    keyInput.classList.add('error');
    keyInput.value = '';
    keyInput.placeholder = "ACCESO DENEGADO";
    playBeep(100, 0.5, 'sawtooth'); // Sonido de error grave
    setTimeout(() => {
        keyInput.classList.remove('error');
        keyInput.placeholder = "Clave Maestra...";
    }, 1000);
}

function triggerSuccess() {
    clearInterval(timerInterval);
    audioEnabled = false; // Detener beeps
    if (audioCtx) {
        // Sonido de victoria
        playBeep(600, 0.2, 'sine');
        setTimeout(() => playBeep(800, 0.4, 'sine'), 200);
    }

    document.body.classList.add('restored');
    statusHeader.textContent = "SISTEMA RESTAURADO";
    mainMessage.innerHTML = SUCCESS_TEXT;
    inputSection.classList.add('hidden');
    createDigitalRain();
}

function timerFailure() {
    clearInterval(timerInterval);
    audioEnabled = false;
    if (audioCtx) playBeep(50, 2, 'sawtooth'); // Sonido largo de falla

    document.body.innerHTML = `
        <div class="container" style="border-color: #330000; box-shadow: 0 0 50px red;">
            <h1 style="color: red; font-size: 4rem; text-shadow: 0 0 10px red;">SISTEMA PURGADO</h1>
            <div class="message-box" style="border-color: red; color: #ff6666;">
                <p>El contador ha llegado a cero.</p>
                <p>El script <strong>DELETE_HISTORY.exe</strong> se ha ejecutado correctamente.</p>
                <p>Todos los expedientes científicos han sido sobreescritos y eliminados del servidor de forma permanente.</p>
                <p>La oportunidad de revelar la verdad se ha perdido para siempre.</p>
                <p style="color: white">OPERACIÓN FALLIDA</p>
            </div>
            <div style="font-family: monospace; color: red; font-size: 2rem; border: 2px solid red; display: inline-block; padding: 10px 20px;">
                [ x ] FATAL ERROR
            </div>
            <br>
            <button onclick="location.reload()" style="background: red; color: black; margin-top: 20px;">REINTENTAR</button>
        </div>
    `;
    document.body.style.backgroundColor = 'black';
}

function createDigitalRain() {
    // Efecto simple
}

// Iniciar
document.addEventListener('DOMContentLoaded', init);
