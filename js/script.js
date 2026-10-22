const operators = [
  "suma.png",
  "resta.png",
  "producto.png",
  "division.png",
  "igual.png",
  "porcentaje.png",
];

const avatars = [
  "avatar1.png",
  "avatar2.png",
  "avatar3.png",
  "avatar4.png",
  "avatar5.png",
  "avatar6.png",
];

const foods = [
  "chicken.png",
  "burger.png",
  "hot-dog.png",
  "ice-cream.png",
  "pizza.png",
  "potatos.png",
];
const flowers = [
  "daisy.png",
  "iris.png",
  "lavender.png",
  "rose.png",
  "sakura.png",
  "sunflower.png",
];

//Selección de juegos
const selectgame_image = document.getElementById("selectgame_image");
const selectgame_plus = document.getElementById("selectgame_plus");

// Juego suma
const plus = document.getElementById("plus");
const results_plus = document.getElementById("results_plus");

// Primer operador suma
const plus_container_op1 = document.getElementById("plus_container_op1");
const plus_input_op1 = document.getElementById("plus_input_op1");

// Segundo operador suma
const plus_container_op2 = document.getElementById("plus_container_op2");
const plus_input_op2 = document.getElementById("plus_input_op2");

// Realizar suma
const plus_container_result = document.getElementById("plus_container_result");
const plus_input_result = document.getElementById("plus_input_result");

// Comprobar el resultado de la suma
const plus_valid_result = document.getElementById("plus_valid_result");
const plus_stars = document.getElementById("plus_stars");


// Juego de las imágenes
const images = document.getElementById("images");
let visor = document.getElementById("visor");
const options = document.getElementById("options");
const options_button_validate = document.getElementById("options_button_validate");
const results_images = document.getElementById("results_images");

// Variables
let contstars = 0;
let contaciertos = 0;
let conterrores = 0;
let optiongame = null;
let isselectinput = false;

// Funciones

// Genera las imágenes aleatorias del visor
const generateImages = () => {
  visor.innerHTML = "";
  for (let i = 0; i < 8; i++) {
    let pos = Math.floor(Math.random() * foods.length);
   
  }
};


// Eventos
const cargar=(event)=>{
  plus.style.display="none";
  images.style.display="none";
}

document.addEventListener("DOMContentLoaded", cargar);

const iniciarsum=(event)=>{
  let selectgame_plus=event.target;
  if(selectgame_plus.nodeName==="BUTTON"){
    console.log(selectgame_plus)
    images.style.display="none";
    plus.style.display="flex";
  }
}

const iniciarimgs=(event)=>{
  let selectgame_image=event.target;
  if(selectgame_image.nodeName==="BUTTON"){
    console.log(selectgame_image)
    plus.style.display="none";
    images.style.display="flex";
  }
}

selectgame_plus.addEventListener("click", iniciarsum);
selectgame_image.addEventListener("click", iniciarimgs);

/* const flechasnum=(event)=>{
  let plus=event.target;
  if(plus.nodeName==="IMG"){
    console.log(plus)
  }
} */

  let contador=1;

const flechasum1=(event)=>{
  let plus_container_op1=event.target;
  if(plus_container_op1.className==="plus__imgarrow"){
    console.log(plus)
    contador=plus_input_op1.value++;
    console.log(contador)
  }else if(plus_container_op1.className==="minus__imgarrow"){
    console.log(plus)
    if(contador>0){
      contador--;
      plus_input_op1.value=contador;
    }
    console.log(contador)
  }

}



const flechasum2=(event)=>{
  let plus_container_op2=event.target;
  if(plus_container_op2.className==="plus__imgarrow"){
    console.log(plus)
    contador=plus_input_op2.value++;
    console.log(contador)
  }else if(plus_container_op2.className==="minus__imgarrow"){
    console.log(plus)
    if(contador>0){
      contador--;
      plus_input_op2.value=contador;
    }
    console.log(contador)
  }

}


const flechasumresult=(event)=>{
  let plus_container_result=event.target;
  if(plus_container_result.className==="plus__imgarrow"){
    console.log(plus)
    contador=plus_input_result.value++;
    console.log(contador)
  }else if(plus_container_result.className==="minus__imgarrow"){
    console.log(plus)
    if(contador>0){
      contador--;
      plus_input_result.value=contador;
    }
    console.log(contador)
  }

}

const flechas=(event,targetinput )=>{
  if(event.target.classList.contains("plus__imgarrow")){
    isselectinput=true;
    targetinput.value=parseInt(targetinput.value)+1
  }
  if(event.target.classList.contains("minus__imgarrow")){
    isselectinput=true;
    if(parseInt(targetinput.value)>0){
      targetinput.value=parseInt(targetinput.value)-1
    }
  }
}

plus_container_op1.addEventListener("click", (event)=> flechas(event, plus_input_op1));

plus_container_op2.addEventListener("click", (event)=> flechas(event, plus_input_op2));

plus_container_result.addEventListener("click", (event) => flechas(event, plus_input_result));

const validar=(event)=>{
  if(!isselectinput){
    plus_input_result.style.backgroundColor="tomato";
    return;
  }
  if(isselectinput){
    plus_input_result.style.backgroundColor="";
    return;
  }
}

plus_valid_result.addEventListener("click", validar);