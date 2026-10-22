/*1. Crea una variable para cada uno de los id de los nodos*/

/*2. cte para acceder al nodo con id encabezado (distinta a la anterior)*/

/*3. cte para acceder a todos las imagenes  (2 formas)*/
let imgs=document.getElementsByTagName("IMG");
console.log(imgs);

let images=document.getElementsByClassName("imagen");
console.log(images);

/*4. cte para acceder a los nodos de la clase texto (2 formas)*/
let texto=document.getElementsByTagName("P");
console.log(texto);

let text=document.getElementsByClassName("texto");
console.log(text);

let parrafos=document.getElementsByTagName("P");
for (const parrafo of parrafos) {
    parrafo.textContent="Texto...";
    parrafo.style.backgroundColor="rgb(255 100 255)";
    parrafo.style.fontSize="25px";
}


/*5. cambia una imagen de la galería (2 formas de cambiar el atributo)*/

/*6. cambia el href de una a (2 formas de cambiar el atributo)*/

/*7. mostrar por consola cuantas etiquetas p hay en nuestro documento HTML*/

/*8. mostrar por consola cuantas etiquetas article hay en nuestro documento HTML*/

/*9. mostrar por consola todas las rutas de las imagenes que tenemos en nuestro documento HTML
Realiza la selección de las imagenes con getElementsByClassName (hacer el ejercicio con un for y con un for of, un for in, un forEach y un map)*/

/*10. cambia el color de la fuente a verde de los parrafos pares, consideramos que el primer parrafo
tiene es el número 1*/

/*****************************************************************************************************/
/* EVENTOS EN LOS BOTONES PARA CAMBIAR LAS IMAGENES*/
/*****************************************************************************************************/

/* 11. Al pulsar un botón que se cambie la imagen que esta debajo del botón siempre por la misma imagen.
(haz el ejericicio con una sola función)*/

//*12. Al pulsar encima de cualquier botón que se cambien las cuatro imagenes, de forma aleatoria */
