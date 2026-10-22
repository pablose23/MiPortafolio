package rompecocos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bloque extends JPanel {
    private JLabel lb;
    private int r=110,g=41,b=6;
    private boolean empty;
    public Bloque(String texto) {
        setLayout(new GridBagLayout());
        
        if(texto.equals("0")){
            texto=" ";
            r=51;  g=r;  b=r;
        }
        setBackground(new Color(r,g,b));
        lb=new JLabel(texto);
        lb.setFont(new Font("Tahoma", 0, 16));
        lb.setForeground(new java.awt.Color(255, 255, 255));
        empty=false;
        add(lb, 0);
    }
    public boolean isEmpty(){
        return lb.getText().equals(" ");
    }
    
    public void setEmpty(){
         this.lb.setText(" ");
         setEmptyBackGround();
         revalidate();
         updateUI();
         repaint();
    }
    
    public void setSelectedBackGround(){
          setBackground(new Color(88,68,7));
    }
    
    public void setEmptyBackGround(){
          setBackground(new Color(51,51,51));
    }
    
    public void setDefaultBackGround(){
          setBackground(new Color(110,41,6));
    }
    
    public void setID(String Id){
         lb.setText(Id);
         setDefaultBackGround();
         revalidate();
         updateUI();
         repaint();
    }
    
    public String getID(){
         return lb.getText();
    }
    
}
