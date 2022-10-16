/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC_2023
 */
public class Lines_T_M extends AbstractTableModel{
    
    private ArrayList<LineOfInvoice> lin ; 
    private String[] cols = {"No." , "Item Name " , "Item Price " , "Count" , "Item Total "};

    public Lines_T_M(ArrayList<LineOfInvoice> lin) {
        this.lin = lin;
    }
 
    
    @Override
    public int getRowCount() {
        return lin.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int colsumn) {
         return cols[colsumn];     
    } 

    public ArrayList<LineOfInvoice> getLin() {
        return lin;
    }
   
    @Override
    public Object getValueAt(int rowIndex, int colsumnIndex) {
         LineOfInvoice line = lin.get(rowIndex);
       switch (colsumnIndex) {
            case 0: return line.getInvoice().getNum_Customer();
            case 1: return line.getItemName();
            case 2: return line.getItemPrice();
            case 3: return line.getItemCount();
            case 4: return line.getTotalCount();
            default : return "";
                
        }
    
    }
    
    
    
}
