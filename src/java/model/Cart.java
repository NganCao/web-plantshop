/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class Cart {
    
//    private HashMap<int, Item> cartItems;
    private HashMap<Integer, Item> cartItems;
 
    public Cart() {
        cartItems = new HashMap<>();
    }
 
    public Cart(HashMap<Integer, Item> cartItems) {
        this.cartItems = cartItems;
    }
 
    public HashMap<Integer, Item> getCartItems() {
        return cartItems;
    }
 
    public void setCartItems(HashMap<Integer, Item> cartItems) {
        this.cartItems = cartItems;
    }
    
    //insert to cart
    public void insertToCart(int key, Item item){
        boolean check = cartItems.containsKey(key);
        if(check){
            int quantity_old = item.getQuantity();
            item.setQuantity(quantity_old +1);
            cartItems.put(key, item);
        }else{
            cartItems.put(key, item);
        }
    }
    
    //sub to cart
    public void subToCart(int key, Item item){
        boolean check = cartItems.containsKey(key);
        if(check){
            int quantity_old = item.getQuantity();
            if(quantity_old <=1){
                cartItems.remove(key);
            }else{
                item.setQuantity(quantity_old-1);
                cartItems.put(key, item);
            }
        }
    }
    
    //remove Item
    public void removeToCart (int key){
        boolean check = cartItems.containsKey(key);
        if(check){
            cartItems.remove(key);
        }
    }
    
    //count item
    public int countItem(){
        return cartItems.size();
    }
    
    //sum total
    public double totalCart(){
        double count = 0;
        //count = sanpham * quantity
        for(Map.Entry<Integer, Item> list :cartItems.entrySet()){
            count += list.getValue().getSanpham().getGia() + list.getValue().getQuantity();
        }
        return count;
    }
}
