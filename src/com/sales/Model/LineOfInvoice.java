/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.Model;

/**
 *
 * @author PC_2023
 */
public class LineOfInvoice {
    private int itemNum;
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private Invoice invoice;
    

    public LineOfInvoice() {
    }

    public LineOfInvoice(int itemNum, String itemName, double itemPrice, int itemCount, Invoice invoice) {
        this.itemNum = itemNum;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.invoice = invoice;
    }

    // new Fun 
    public double getTotalCount(){
       return  itemCount*itemPrice;
    }
    
    
    public int getItemnum() {
        return itemNum;
    }

    public void setItemnum(int itemNum) {
        this.itemNum = itemNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    
    
    @Override
    public String toString() {
        return "LineOfInvoice{" + "itemNum=" + itemNum + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }
    
    public String getAsCSV(){
        return itemNum + "," + itemName + "," + itemPrice + "," + itemCount;
    }
    
}
