"use strict";
$("document").ready(function () {
    $("#datepicker").datepicker({
        onSelect: function (date) {
            addListDate(date);
        }
    });
    $("#dates_list").on("click", "li", function () {
        removeListDate($("li").index(this));
    });
    $("#dates_list").on("mouseover mouseleave", "li", function () {
        $(this).toggleClass("list-group-item-danger");
    });
});
/*
function addUnableDate(dates: string[]) {
    Professor.
}*/
function addListDate(date) {
    $("#dates_list").append("<li class=\"list-group-item list-group-item-action list-group-item-primary\">\n    <span>" + date + "</span>\n    <i class=\"fas fa-times-circle\"></i></li>");
}
function removeListDate(indexLi) {
    var numChild = indexLi + 1;
    $("#dates_list li:nth-child(" + numChild + ")").remove();
}
