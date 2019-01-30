$("document").ready(function() {
  
  $("#datepicker").datepicker({
    onSelect: function(date: string) {
      addListDate(date);
    }
  });

   $("#dates_list").on("click", "li", function () {
        removeListDate($("li").index(this));
    });
  
    $("#dates_list").on("mouseenter mouseleave", "li", function(){
      $(this).toggleClass("list-group-item-danger");
    })

});



/*
function addUnableDate(dates: string[]) {
    Professor.
}*/

function addListDate(date: string) {
  let newLi =`<li class="list-group-item list-group-item-action list-group-item-primary">
  <span>${date}</span>
  <i class="fas fa-times-circle"></i></li>`;

  $("#dates_list").append(newLi);

}

function removeListDate(indexLi:number) {
  let numChild = indexLi +1;
  
  $("#dates_list li:nth-child(" + numChild + ")").effect("blind", 200, function() {
    $(this).remove();
  });
  //$("#dates_list li:nth-child(" + numChild + ")").remove();

}
