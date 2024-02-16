var a = parseFloat(prompt("Ingrese el coeficiente 'a' de la ecuación cuadrática:"));
var b = parseFloat(prompt("Ingrese el coeficiente 'b' de la ecuación cuadrática:"));
var c = parseFloat(prompt("Ingrese el coeficiente 'c' de la ecuación cuadrática:"))

var discriminante = b * b - 4 * a * c;
if (discriminante > 0) {
    var x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
    console.log("La solucion a la ecuacion cuadratica es:", x1);
}

if (discriminante >0) {
    var x2 = (-b - Math.sqrt(discriminante)) / (2 *a);
    console.log("La solucion a la ecuacion cuadratica que resta es:", x2)
}