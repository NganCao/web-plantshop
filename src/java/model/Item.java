/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.client.service.SanPham;

/**
 *
 * @author Administrator
 */
public class Item {
    
    private SanPham sanpham;
    private int quantity;
    
    public Item(){
        
    }

    public Item (SanPham sanpham, int quantity){
        this.sanpham = sanpham;
        this.quantity = quantity;
    }
    
    public SanPham getSanpham() {
        return sanpham;
    }

    public void setSanpham(SanPham sanpham) {
        this.sanpham = sanpham;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
