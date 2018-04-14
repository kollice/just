/**
 * Created by kollice on 2018/4/14.
 */
$(function () {
    $('.rem').click(function () {
        $(this).toggleClass('selected');
    })

    $('.login-btn').click(function () {
        console.log($('#username').val());
        $.post("/dologin", {username: $('#username').val(), password: $('#password').val()}, function (result) {

            if (result.success === true) {
                window.location.href="Just/index.html";
            }
        });
    })
})