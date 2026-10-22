
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author centr
 */
public class Componente {
    public static JLabel titulo(String texto, Component vt){
        JLabel jl= new JLabel(texto);
        jl.setBounds(0, 0, vt.getWidth(), 70);
        jl.setOpaque(true);
        jl.setBackground(Color.red);
        jl.setForeground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        return jl;
    }
    
    public static JLabel titulo(String texto, Component vt, String img){
        JLabel jl= titulo(texto, vt);
        ImageIcon ii= new ImageIcon(vt.getClass().getResource(img));
        jl.setIcon(ii);
        return jl;
    }
}
