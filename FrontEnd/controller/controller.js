"use strict";
$("document").ready(function () {
    $("#datepicker").datepicker({
        onSelect: function (date) {
            addListDate(date);
        }
    });
    $("#dates_list li i");
});
/*
function addUnableDate(dates: string[]) {
    Professor.
}*/
function addListDate(date) {
    $("#dates_list").append("<li class=\"list-group-item list-group-item-primary\">\n    <span>" + date + "</span>\n    <i class=\"fas fa-times-circle\"></i></li>");
}
