$("document").ready(function() {
  $("#datepicker").datepicker({
    onSelect: function(date: string) {
      addListDate(date);
    }
  });

  $("#dates_list li i")
});

/*
function addUnableDate(dates: string[]) {
    Professor.
}*/

function addListDate(date: string) {
    $("#dates_list").append(`<li class="list-group-item list-group-item-primary">
    <span>${date}</span>
    <i class="fas fa-times-circle"></i></li>`);
}
