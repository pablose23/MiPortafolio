/* let nombre="Pepito";
console.log(nombre);
nombre="Luisito";
console.log("Después de modificar el contenido "+nombre);

let edades=[12,10,45,7,90];
console.log(edades);

let auxedades=edades;
console.log(edades);
console.log(auxedades);

auxedades[0]=190;
console.log("Hemos modificado auxedades");
console.log(edades);
console.log(auxedades); */

/* const user = {
    nombre: "Pepito",
    edad: 23,
    email: "sfsfs<@afaf.es",
};

user.nombre = "Juan";
console.log(user); */

/* let auxuser = { ...user , apellido: "Pérez"};
console.log(auxuser);
console.log(user); */

/* let nuevo = [10, 20];
let pesos = [1, 2, 3, 4, 5];
let auxpesos = [...nuevo, ...pesos, 123];
pesos[0] = 88;
console.log(pesos); //88,2,3,4,5
console.log(auxpesos); //1,2,3,4,5 */

/* let nombre = "Juan";
let i = "25";
console.log(nombre);

if (i == 25) {
    let nombre = "Pedro";
    console.log(nombre);
}
console.log(nombre); */

/*let edades=[1,2,3,4,5,6,7,8,9,10];
for(const edad of edades){
    console.log(edad);
}

/* for (let i = 0; i < edades.length; i++) {
    console.log(edades[i]);
} 

for (const i in edades) {
    console.log(edades[i]);
} */

/* const edades = [10, 20, 30, 40];
const auxedades = edades.findIndex((edad) =>{
   /*  console.log(edad); 
    return edad >=30;
});

//console.log(edades); //10,20,30,40
console.log(auxedades); //10,20,30,40,5 */


/* filter=edades.filter((edad) => {
    console.log(edad);
    return edad > 5;
}) */

const parrafo=document.getElementById("parrafo");
console.log(parrafo);

const link = document.getElementById("link");
console.log(link.href);
console.log(link.textContent);
link.href="https://www.elmundo.es";
link.textContent="El Mundo";
link.target="_blank";

link.style.color="red";

link.style.backgroundColor="green";

link.style.fontSize="30px";

const cuerpo = document.getElementById("cuerpo");
console.log(cuerpo);

const cabecera= document.getElementsById("cabecera");
console.log(cabecera);

//selecion por clase
/* const images=document.getElementsByClassName("img"); */
const images=cabecera.getElementsByTagName("IMG");
/* console.log(images); */

for(img of images){
    img.style.width="100px";
    img.style.height="100px";
    img.style.border="3px solid blue";
    img.style.margin="4px";
}

/* Array.from(images).forEach(img => {
    img.style.width="100px";
    img.style.height="100px";
}); */


