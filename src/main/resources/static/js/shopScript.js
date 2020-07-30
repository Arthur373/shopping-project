$(document).ready(function () {

    // $("select.country").change(function(){
    //     var selectedCountry = $(this).children("option:selected").val();
    //     alert("You have selected the country - " + selectedCountry);
    // });

});

function mySorting() {
    if (event) {
        event.stopPropagation();
    }
    let sort = $("#sort").val();
    $.ajax({
        type: "GET",
        url: '/shop',
        data: {sort : sort},
        success: function (data) {

        }
    });
}

/*
function changeShopContent(data) {
    let product = $("#shopProduct").

}*/


function shopCategory(slug) {
    if (event) {
        event.stopPropagation();
    }
    var category = $("#shop_category").find('div');
    // alert(category);
    $.ajax({
        type: "GET",
        url: '/shop',
        data: {slug: slug},
        success: function () {
            // changeShopContent(data);
        }
    });
    // let products = $("#shopProduct .single-product").empty();
}

function changeShopContent(data) {
    var products = $('#shopProduct').find('div');
    // $.ajax({
    //     type: "GET",
    //     url: '/shop',
    //     success: function (data) {
    var template = '';
    products.empty();
    data.forEach(function (productData) {
        template += addCategoryProduct(productData);
    });
    products.empty();
    products.append(template);
    //     }
    // });
}

function addCategoryProduct(productData) {
    var template = '<div class="single-product">\n' +
        '                <a href="/shop/' + productData['id'] + '"><img class="img-fluid"\n' +
        '                style="width: 263px; height:280px"\n' +
        '                src="/shop/img/product/' + productData['img'] + '" alt=""></a>\n' +
        '                <div class="product-details">\n' +
        '                  <h6>' + productData['title'] + '</h6>\n' +
        '                  <div class="price">\n' +
        '                    <h6>$' + productData['price'] + '</h6>\n' +
        '                    <h6 class="l-through">$' + productData['old_price'] + '</h6>\n' +
        '                  </div>\n' +
        '                </div>\n' +
        '              </div>';
    return template;
}
