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
        })
        .always(function( datajqXHR, textStatus, jerrorThrown ) {
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
        }).always(function( datajqXHR, textStatus, jqXHRerrorThrown ) {
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
        }).always(function( datajqXHR, textStatus, jqXHRerrorThrown ) {
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
        }).always(function( datajqXHR, textStatus, jqXHRerrorThrown ) {
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
    var items = [];
    var json = JSON.parse(response);
    json.forEach(function(obj, index, array) {
        var item = {};
        item.title = obj.title;
        item.year = obj.year;
        item.plot = obj.overview;
        item.image = obj.remotePoster;
        items[index] = item;
    });
    displayResults(items);
};

var setMovieList = function(response) {
    var items = [];
    var json = JSON.parse(response);
    json.movies.forEach(function(obj, index, array) {
        var item = {};
        item.title = obj.original_title;
        item.year = obj.year;
        item.plot = obj.plot;
        item.image = obj.images.poster[0];
        items[index] = item;
    });
    displayResults(items);
};

var displayResults = function(items) {
    var html = "";
    items.forEach(function(item, index, array) {
        html = html + "<li><div><img src=\"" + item.image + "\" style=\"width: 10%; height: 10%\"></img></div><div><div>" + item.title + " (" + item.year + ")</div><div>" + item.plot + "</div></div>";    
    }    
    //<li><div><img></img></div><div><div>title (year)</div><div>plot</div></div>
    
    $("#request-list").html(html);
}
