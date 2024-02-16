function agregarCaracter(caracter) {
    var display = document.getElementById('display');
    if (display.innerHTML === '0') {
      display.innerHTML = caracter;
    } else {
      display.innerHTML += caracter;
    }
}

function borrar() {
  document.getElementById('display').innerHTML = '0';
}

function calcular() {
  var expresion = document.getElementById('display').innerHTML;
  var resultado = eval(expresion);
  document.getElementById('display').innerHTML = resultado;
}
  