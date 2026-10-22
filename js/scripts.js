/*1. Crea una variable para cada los id de los nodos*/


/*2. cte para acceder al nodo con id encabezado (distinta a la anterior)
const encabezado = document.getElementById("encabezado");
console.log(encabezado);

/*3. cte para acceder a todos las imagenes  (2 formas)*/


/*4. cte para acceder a los nodos de la clase texto (2 formas)*/
/* const texts=document.getElementsByClassName("texto");
console.log(texts);

for (text of texts) {
    text.textContent="Hola que tal";
}

const images=document.getElementsByTagName("img");
console.log(images);

/* for (img in images) {
    if(img%2==0){
        images[img].style.display="none";
    }
} 

images[3].src="./images/delfin_tortuga.jpg";  

const p=document.getElementsByTagName("p");
console.log(p); */
/* images[3].src=images[2].src; */

/*5. cambia una imagen de la galería (2 formas de cambiar el atributo)*/


/*6. cambia el href de una a (2 formas de cambiar el atributo)*/


/*7. mostrar por consola cuantas etiquetas p hay en nuestro documento HTML*/


/*8. mostrar por consola cuantas etiquetas article hay en nuestro documento HTML*/


/*9. mostrar por consola todas las rutas de las imagenes que tenemos en nuestro documento HTML
Realiza la selección de las imagenes con getElementsByClassName (hacer el ejercicio con un for y con un for of, un for in, un forEach y un map)*/

/* const imagenes = document.getElementsByClassName("imagen"); 
const img = document.querySelectorAll(".imagen");
for(i=0; i<img.length; i++){
    console.log(img[i].src)
}
console.log("------------------");
for (imagenes of img) {
    console.log(imagenes.src);
}
console.log("------------------");
for(i in img) {
    console.log(img[i].src);
}
console.log("------------------");

Array.from(img).forEach((img)=>{
    console.log(img.src);
}
);
console.log("------------------");
Array.from(img).map((img)=>{
    console.log(img.src);
}
);
/*10. cambia el color de la fuente a verde de los parrafos pares, consideramos que el primer parrafo
tiene es el número 1*/


/*****************************************************************************************************/
/* EVENTOS EN LOS BOTONES PARA CAMBIAR LAS IMAGENES*/
/*****************************************************************************************************/

/* 11. Al pulsar un botón que se cambie la imagen que esta debajo del botón siempre por la misma imagen.
(haz el ejericicio con una sola función)*/

//*12. Al pulsar encima de cualquier botón que se cambien las cuatro imagenes, de forma aleatoria */






let btnhola=document.getElementById("btnhola");
let btnadios=document.getElementById("btnadios");
let btncambio=document.getElementById("btncambio");
let btn=document.getElementById("btn");
let btncambio2=document.getElementById("btncambio2");
console.log(btnhola);
console.log(btnadios);
console.log(btncambio);

const saludar=()=>{
    console.log("Hola");
};

const despedir=()=>{
    console.log(btnadios.textContent);
}

const cambiar=()=>{
    btnadios.textContent="Hasta luego Lucas";
}

const pulsame=(user)=>{
    console.log("pulsado por: "+ user);
}

const cambio=()=>{
    if(btncambio2.textContent==="pulsame"){
        btncambio2.textContent="pulsate";
    }else{
        btncambio2.textContent="pulsame";
    }
};

btnhola.addEventListener("click",saludar);

btnadios.addEventListener("click",despedir);

btncambio.addEventListener("click",cambiar);

btncambio.addEventListener("mouseover", cambiar);

btn.addEventListener("click",()=> pulsame("Pepito"));

btncambio2.addEventListener("click",cambio);
