function generarNumeros() {
  var numeros = [];
  for (var i = 0; i < 5; i++) {
    numeros.push(Math.floor(Math.random() * 6) + 1);
  }
  return numeros;
}

function tirarDados() {
  var dadosHTML = '';
  var numeros = generarNumeros();
  for (var i = 0; i < numeros.length; i++) {
    dadosHTML += '<div class="dado">';
    dadosHTML += '<img src="dado' + numeros[i] + '.png" alt="Dado ' + numeros[i] + '">';
    dadosHTML += '</div>';
  }
  document.getElementById('dados').innerHTML = dadosHTML;
}