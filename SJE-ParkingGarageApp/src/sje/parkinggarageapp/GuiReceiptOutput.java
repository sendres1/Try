/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sje.parkinggarageapp;

import javax.swing.JOptionPane;


public class GuiReceiptOutput implements ReceiptOutputStrategy {
     String line;

    public GuiReceiptOutput(String line) {
        setLine(line);
    }
     
   
    public final void setLine(String line) {
        if (line == null || line.isEmpty())
        {
            throw new IllegalArgumentException("Line is invalid.");
        }
        this.line = line;
    }
    
    
    @Override
    public final void writeReceipt(String line) {
        if (line == null || line.isEmpty())
        {
            throw new IllegalArgumentException("Line is invalid.");
        }
        JOptionPane.showMessageDialog(null, line);
         
    }
    
}
