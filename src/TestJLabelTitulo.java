
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author centr
 */
public class TestJLabelTitulo extends JFrame{
    
    public TestJLabelTitulo(){
        super("TestJLabelTitulo");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        crearGUI();
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        TestJLabelTitulo tj= new TestJLabelTitulo();
    }
    
    private void crearGUI(){
        JLabel tt =Componente.titulo("TestJLabelTitulo", this, "./images/berenjena.jpeg");
        add(tt);
    }
}
