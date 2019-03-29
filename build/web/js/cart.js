/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /* global click */

var Desktop = 4,
                                        tabletportrait = 2,
                                        mobilelandscape = 2,
                                        mobileportrait = 1,
                                        resizeTimer = null;

                                jQuery(window).load(function () {
                                    jQuery('div.slotholder').prepend('<div class="bk-responsive-slide"></div>');
                                });
                                var cart = [];
                                var dem = 0;
                                var getquantity=0;
                                jQuery(document).ready(function () {

                                    jQuery('.add2cart').on('click', function () {

                                        var proId = jQuery(this).attr('productId');
                                        var pName = jQuery('#pro-' + proId).children('#productName').text();
                                        var imgURL = jQuery('#pro-' + proId).find('img').attr('src');
                                        var price = jQuery('#pro-' + proId).find('#price').text();

                                        var obj = {
                                            id: proId,
                                            productName: pName,
                                            imageURL: imgURL,
                                            price: price
                                        };

                                        //check san pham co trong gio chua?
                                        var flag = false;
                                        for (var i = 0; i < cart.length; i++) {
                                            if (cart[i].id === obj.id) {
                                                flag = true;
                                                break;
                                            }
                                        }
                                        //chua co sp
                                        if (flag === false) {
                                            dem++;
                                            obj.quantity = 1;
                                            cart.push(obj);
                                        } else { //da cos
                                            cart[i].quantity += 1;
                                        }
                                        saveCart();
                                        drawCheckout();
                                    });
                                });
                                function drawCheckout() {
                                    jQuery('tbody').empty();
                                    var ckUnit = "";
                                    var totalMoney = 0;
                                    for (var i = 0; i < cart.length; i++) {
                                        
                                        var del = cart[i].id;
                                        totalMoney += cart[i].price * cart[i].quantity;
                                        ckUnit += `
                                                <tr class="cart_table_item">
                                        <td class="product-img">
                                        <img alt="" src="` + cart[i].imageURL + `">
                                        </td>
                                                <td>`
                                                + cart[i].productName +
                                                `</td>
                                                <td>
                                                    <input type="number" id="`+cart[i].id+`" onchange="changeUnitQuantity(jQuery('#`+cart[i].id+`').val(),`+cart[i].id+`)" min="0" value="`+cart[i].quantity+`" step="1" />
                                                </td>`;
                                        var total = cart[i].quantity;
                                        var gia = cart[i].price;
                                        var tong = total * gia;
                                                ckUnit+=`<td>
                                                    <span>` + tong +
                                                `</span>
                                                </td>
                                                <td>
                                                    <i class="fa fa-trash-o" id="del1" onclick="removeUnit('`+cart[i].id+`')" ></i>
                                                </td>
                                            </tr>`;
                                    }
                                    ckUnit += `
                                            <tr>
                                                <td colspan="3">Total Price</td>
                                                <td><b>` + totalMoney + ` vnđ</b></td>
                                            </tr>
                                                <tr>
                                                <td colspan="5"><a type="button" href="checkout.jsp" class="btnCheck">Check Out</a></td>
                                                </tr>`;
        
                                    jQuery('tbody').append(ckUnit);
                                };
                                
                                function removeUnit(id) {
                                 //check san pham co trong gio chua?
                                 //alert(id);
                                 for (var i = 0; i < cart.length; i++) {
                                    if (cart[i].id == id) {
                                        cart.splice(i,1);
                                        break;
                                    }
                                 }
                                 saveCart();
                                 drawCheckout();
                                };
                                
                                function changeUnitQuantity(e,id){
                                    if(e>0)
                                    {for(var i=0 ; i<cart.length ; i++)
                                    {
                                        if(cart[i].id == id)
                                        {
                                        cart[i].quantity=e;
                                        console.log(cart[i].quantity,id);
                                        break;
                                        }
                                    }
                                    drawCheckout();
                                }else{
                                    removeUnit(id);
                                }
                                saveCart();
                                };

function saveCart() {
    sessionStorage.setItem("shoppingCart", JSON.stringify(cart));
}
;

function loadCart() {
    cart = JSON.parse(sessionStorage.getItem("shoppingCart"));
}

loadCart();
drawCheckout();
console.log(cart);

// Get the modal
var modal = document.getElementById('login01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
// Get the modal1
var modal1 = document.getElementById('cart01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal1) {
        modal1.style.display = "none";
    }
}

/**/