/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class EstudianteTableRenderer extends DefaultTableCellRenderer {
    
    private JProgressBar progressBar;
    
    public EstudianteTableRenderer() {
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
      
        if (column == 0) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            if (!isSelected) {
                if (row % 2 == 0) {
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);
                } else {
                    c.setBackground(Color.LIGHT_GRAY);
                    c.setForeground(Color.BLACK);
                }
            }
            return c;
        }
        
        if (column == 1) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            if (!isSelected && value != null) {
                String apellidos = value.toString().toLowerCase();
                if (apellidos.contains("z")) {
                    c.setBackground(Color.BLACK);
                    c.setForeground(Color.WHITE);
                } else {
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);
                }
            }
            return c;
        }
        
        if (column == 2) {
            if (value instanceof Double) {
                int progress = ((Double) value).intValue();
                progressBar.setValue(progress);
                progressBar.setString(progress + "%");
            }
            return progressBar;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}