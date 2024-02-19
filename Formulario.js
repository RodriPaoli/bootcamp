const selectDocumento = document.getElementById('selecttipoDocumento');
const inputNumero = document.getElementById('inputNumero'); 

selectDocumento.addEventListener('change', function () {
    // Obtener el valor seleccionado
    const valorElegido = selectDocumento.value;

    if (valorElegido === 'opcionRUC') {
        funcionRUC();
    } else if (valorElegido === 'opcionCedula') {
        funcionCedula();
    } else if (valorElegido === 'opcionPersonaNoResidente') {
        funcionPersonaNoResidente();
    } else if (valorElegido === 'opcionPersonaResidente') {
        funcionPersonaResidente();
    }

    function funcionRUC() {
        inputNumero.placeholder = "999999-9";
        inputNumero.maxLength = 11;
        inputNumero.pattern = "\\d{9}-\\d";
        console.log('Ha ingresado su Registro Unico del Contribuyente');
    }

    function funcionCedula() {
        inputNumero.placeholder = "Ingrese el numero de Cedula de Identidad";
        inputNumero.maxLength = 10;
        inputNumero.pattern = "\\d{10}";
        console.log('Ha ingresado su Cedula de Identidad');
    }

    function funcionPersonaNoResidente() {
        inputNumero.placeholder = "Ingrese el codigo de Persona No Residente";
        inputNumero.maxLength = 9;
        inputNumero.pattern = "\\d{9}";
        console.log('Ha ingresado su codigo de Persona No Residente');
    }

    function funcionPersonaResidente() {
        inputNumero.placeholder = "Ingrese el codigo de Persona Residente";
        inputNumero.maxLength = 9;
        inputNumero.pattern = "\\d{9}";
        console.log('Ha ingresado su codigo de Persona Residente');
    }
});
