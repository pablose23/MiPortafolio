const animalsImage = [
  "cabra.jpg",
  "cerdo.jpg",
  "conejo.png",
  "conejo2.jpg",
  "cordero.png",
  "elefante.jpg",
  "erizo.jpg",
  "gato.png",
  "jirafa.png",
  "leon.png",
  "mono.jpg",
  "oso.jpg",
  "osoblanco.png",
  "osopanda.png",
  "pato.png",
  "perro.png",
  "pollo.png",
  "pradera.jpg",
  "tigre.jpg",
  "vaca.png",
  "tucan.jpg",
  "loro.jpg",
  "cigueña.jpg",
  "foca.jpg",
  "koala.jpg",
  "cebra.jpg",
  "canguro.jpg",
  "pinguino.jpg",
  "zorro.jpg",
  "potro.jpg",
  "tortuga.jpg",
  "lobo.jpg",
];

const cardsImage = [
  "atras1.jpg",
  "atras2.jpg",
  "atras3.jpg",
  "atras4.jpg",
  "atras5.jpg",
  "atras6.jpg",
  "atras7.jpg",
  "atras8.jpg",
];
const units = ["10", "12", "14", "16", "18", "20"];
const levels = ["Alto", "Medio", "Bajo"];

// para hacer aparecer y desarparecer las capas
let header_title = document.getElementById("header_title");
let configurador = document.getElementById("configurador");
let juego = document.getElementById("juego");

let buttons = document.getElementById("buttons");
let end_game = document.getElementById("end_game");

let config_num = document.getElementById("config_num");
let config_time = document.getElementById("config_time");
let config_help = document.getElementById("config_help");

let config_card = document.getElementById("config_card");
let configuracion_juego = document.getElementById("configuracion_juego");
let configuracion_ayuda = document.getElementById("configuracion_ayuda");

let config_card_body = document.getElementById("config_card_body");
let visor_imagenes_juego = document.getElementById("visor_imagenes_juego");
let visor_marcador = document.getElementById("visor_marcador");

let select_help = document.getElementById("select_help");
let select_num = document.getElementById("select_num");
let select_time = document.getElementById("select_time");

let btn_check_game = document.getElementById("btn_check_game");
let btn_validation = document.getElementById("btn_validation");
let btn_new_game = document.getElementById("btn_new_game");

const desarparecer = (event) => {
  juego.style.display = "none";
  end_game.style.display = "none";
  btn_check_game.style.display = "none";
  btn_new_game.style.display = "none";
}

document.addEventListener("DOMContentLoaded", desarparecer);

const cargarSelects = (event) => {
  let contenidoCartas = '<option selected disabled>Selecciona un valor</option>'

  units.forEach((units) => {
    contenidoCartas += '<option value="' + units + '">' + units + ' Cartas</option>'
  })

  let contenidoTiempo = ' <option selected disabled>Selecciona un valor</option>'

  units.forEach((units) => {
    contenidoTiempo += '<option value="' + units + '">' + units + ' Segundos</option>'
  })
  select_num.innerHTML = contenidoCartas;
  select_time.innerHTML = contenidoTiempo;
}

document.addEventListener("DOMContentLoaded", cargarSelects);

const cargarAyuda = (event) => {
  let contenidoAyuda = '<option selected disabled>Selecciona un valor</option>'
  levels.forEach((levels) => {
    contenidoAyuda += '<option value="' + levels + '">' + levels + '</option>'
  })

  select_help.innerHTML = contenidoAyuda;
}

document.addEventListener("DOMContentLoaded", cargarAyuda);

const cargarImages = (event) => {
  for (let i = 0; i < 8; i++) {
    let imgrandom = Math.floor(Math.random() * cardsImage.length);
    console.log(imgrandom)
    let contenidoImg = '<div class="config-card__card"><img src="./assets/images/cartas/' + cardsImage[imgrandom] + '" class="config-card__img"> </div>';

    console.log(cardsImage[imgrandom])

    config_card_body.innerHTML += contenidoImg;
  }
}
document.addEventListener("DOMContentLoaded", cargarImages);

// Imagen de la imagencartajuego
let gameCard = "";
// Número de imagenes
let numImages = 0;
// config_time de juego
let numSeconds = 0;
// Nivel de ayuda
let levelHelp = "";



// Para recargar la pagina puedes utilizar:
// location.reload();
