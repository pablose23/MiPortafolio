const nuevoalimento = document.getElementById("nuevoalimento");
const list = document.getElementById("list");
const btnaniadir = document.getElementById("btnaniadir");
const btncomprar = document.getElementById("btncomprar");

const añadirItem = () => {
    let unidad = Math.floor(Math.random() * 50) + 1;
    let contenido = '<li class="listitem"><span class="listitem__name"> ' +nuevoalimento.value +'</span><span class="listitem__price">' +unidad+ ' </span><button class="listbtn__add">+ </button><button class="listbtn__decrease"> - </button><span class="listitem__amount">0<span></li>'

    list.innerHTML +=contenido;
}

btnaniadir.addEventListener("click", () => {
    añadirItem();
    nuevoalimento.value = "";
    nuevoalimento.focus;
})

btncomprar.addEventListener("click", () => {
    list.innerHTML = "";
})
