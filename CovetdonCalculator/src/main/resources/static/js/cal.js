$(function () {
    $(".button").on("click", function () {
        let bu = $(this).html();
        $(".screen").append(bu);
    });


    //초기화 버튼
    $("#init").on("click", function () {
        $(".screen").html("0");
    })
})