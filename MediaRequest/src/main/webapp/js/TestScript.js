/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $("#get-requests").on("click", function() {
        $("#request-loading").show();
        $.ajax({
            url: 'StoreRequest',
            datatype: 'json',
            data: {request: "data-request"},
            cache:false,
            type:'get',
            success: function(response) {
                setList(response);
            }
        }).always(function( data|jqXHR, textStatus, jqXHR|errorThrown ) {
            $("#request-loading").hide();
        });
    });
    $("#submit-request").on("click", function() {
        $("#request-loading").show();
        var name = $("#media-name").val();
        $.ajax({
            url: 'StoreRequest',
            datatype: 'json',
            data: {request: "submit-request", medianame: name},
            cache:false,
            type:'get',
            success: function(response) {
                setList(response);
            }
        }).always(function( data|jqXHR, textStatus, jqXHR|errorThrown ) {
            $("#request-loading").hide();
        });
    });
    $("#search-tv").on("click", function() {
        var searchTerm = $("#tv-search-term").val();
        $("#tv-loading").show();
        $.ajax({
            url: '/SonarrService',
            datatype: 'json',
            data: {searchTerm: searchTerm},
            cache:false,
            type:'get',
            success: function(response) {
                setTVList(response);
            }
        }).always(function( data|jqXHR, textStatus, jqXHR|errorThrown ) {
            $("#tv-loading").hide();
        });
    });
    $("#search-movie").on("click", function() {
        var searchTerm = $("#movie-search-term").val();
        $("#movie-loading").show();
        $.ajax({
            url: '/CouchPotatoService',
            datatype: 'json',
            data: {searchTerm: searchTerm},
            cache:false,
            type:'get',
            success: function(response) {
                setMovieList(response);
            }
        }).always(function( data|jqXHR, textStatus, jqXHR|errorThrown ) {
            $("#movie-loading").hide();
        });
    });
});

var setList = function(response) {
    var html = "";
    var json = JSON.parse(response);
    json.forEach(function(obj) {
        html = html + "<li>" + obj + "</li>";
    });
    $("#request-list").html(html);
};

var setTVList = function(response) {
    var html = "";
    var json = JSON.parse(response);
    json.forEach(function(obj) {
        html = html + "<li>" + obj.title + " " + obj.year + "</br>" + obj.overview + "</br><img src=\"" + obj.remotePoster + "\" style=\"width: 10%; height: 10%\"></img></li>";
    });
    $("#request-list").html(html);
};

var setMovieList = function(response) {
    var html = "";
    var json = JSON.parse(response);
    json.movies.forEach(function(obj) {
        html = html + "<li>" + obj.original_title + " " + obj.year + "</br>" + obj.plot + "</br><img src=\"" + obj.images.poster[0] + "\" style=\"width: 10%; height: 10%\"></img></li>";
    });
    $("#request-list").html(html);
};
