//funcion calendario filtro rango fechas
$(function () {
    $('#datetimepickerTo').datetimepicker({
        format: 'L'
    });
});

$(function () {
    $('#datetimepickerFrom').datetimepicker({
        format: 'L'
    });
});



//jquery datapicker
$( "#datepicker" ).datepicker();





//funcion para resetear filtro
function clear() {


}


function submit() {
    var ordenar = document.getElementById("ordenar").value;
    var ordenar = document.getElementById("rango").value;

}




