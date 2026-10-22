
package rompecocos;

import java.awt.event.KeyEvent;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import static rompecocos.Rompecocos.Cselect;

public class Rompecocos extends javax.swing.JFrame {
    static Bloque[][] arrayp;
    Integer [] virtual;
    static int Fselect,Cselect,Fempty,Cempty;
    Random rnd=new Random();
    Set<Integer> generated = new LinkedHashSet<>();
    public Rompecocos() {
        Rompecocos.arrayp = new Bloque[4][4];
        this.virtual=new Integer[16];
        while (generated.size() < 16)
        {
            Integer next = rnd.nextInt(16) + 0;
            generated.add(next);
        }
        Fselect=rnd.nextInt(3)+1;
        Cselect=rnd.nextInt(3)+1;
        
        generated.toArray(virtual);
        int x=0;
        initComponents();
        
        Bloque bloque;
        for(int a=0;a<4;a++){   
            for(int b=0;b<4;b++){
                bloque=new Bloque(""+virtual[x]);
                if(virtual[x]==0){
                    Fempty=a;
                    Cempty=b;
                }
                arrayp[a][b]=bloque;
                pane.add(bloque);
                x++;
            }
        }  
        arrayp[Fselect][Cselect].setSelectedBackGround();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rompecocos");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(418, 417));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        pane.setBackground(new java.awt.Color(0, 0, 0));
        pane.setLayout(new java.awt.GridLayout(4, 4, 3, 2));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("MOVER SELECTOR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("MOVER BLOQUES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("W - ARRIBA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("S - ABAJO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("A - IZQUIERDA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("D - DERECHA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("↑ - ARRIBA");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("↓ - ABAJO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("← - IZQUIERDA");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("→ - DERECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
                int key=evt.getKeyCode();
        switch(key){
            case KeyEvent.VK_W:
                Movimiento.arribaSelect();
                break;
            case KeyEvent.VK_S:
                Movimiento.abajoSelect();
                break;    
            case KeyEvent.VK_A:
                Movimiento.izqierdaSelect();
                break;
            case KeyEvent.VK_D:
                Movimiento.derechaSelect();
                break;    
            case KeyEvent.VK_UP:
                Movimiento.arribaDesplaz();
                break;   
            case KeyEvent.VK_DOWN:
                Movimiento.abajoDesplaz();
                break;   
            case KeyEvent.VK_RIGHT:
                Movimiento.derechaDesplaz();
                break;   
            case KeyEvent.VK_LEFT:
                Movimiento.izquierdaDesplaz();
                break;       
                
        
        }
    }//GEN-LAST:event_formKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Rompecocos().setVisible(true);
        });
    }
    //************************Clase Movimiento************************//
    private static class Movimiento{
    private static int F,C;
    
    static void arribaSelect(){
        if(Fselect>0){
            if(!arrayp[Fselect][Cselect].isEmpty())
                arrayp[Fselect][Cselect].setDefaultBackGround();
            else
                arrayp[Fselect][Cselect].setEmptyBackGround();
            Fselect--;
            arrayp[Fselect][Cselect].setSelectedBackGround();
            
        }
        
    }
    static void abajoSelect(){
        if(Fselect<3){
            
            if(!arrayp[Fselect][Cselect].isEmpty())
                arrayp[Fselect][Cselect].setDefaultBackGround();
            else
                arrayp[Fselect][Cselect].setEmptyBackGround();
            Fselect++;
            arrayp[Fselect][Cselect].setSelectedBackGround();
        }  
        
    }
    static void izqierdaSelect(){
        if(Cselect>0){
            
            if(!arrayp[Fselect][Cselect].isEmpty())
                arrayp[Fselect][Cselect].setDefaultBackGround();
            else
                arrayp[Fselect][Cselect].setEmptyBackGround();
            Cselect--;
            arrayp[Fselect][Cselect].setSelectedBackGround();
        }   
        
    }
    static void derechaSelect(){
        if(Cselect<3){
            
            if(!arrayp[Fselect][Cselect].isEmpty())
                arrayp[Fselect][Cselect].setDefaultBackGround();
            else
                arrayp[Fselect][Cselect].setEmptyBackGround();
            Cselect++;
            arrayp[Fselect][Cselect].setSelectedBackGround();
        }
        
    }
    static void arribaDesplaz(){
        if(Fselect==Fempty&&Cselect==Cempty)
            System.out.println("ar,FS "+Fselect+"FE "+Fempty+"CS "+Cselect+"CE "+Cempty);
        else{
            if(Cselect==Cempty&&Fempty<Fselect){
                    F=Fempty+1;
                    //list.clear();
                    while(F<=Fselect){
                        arrayp[F-1][Cempty].setID(arrayp[F][Cempty].getID());
                        F++;
                    }
                    Fempty=Fselect; Cempty=Cselect;
                    arrayp[Fselect][Cselect].setEmpty();
                    arrayp[Fselect][Cselect].setSelectedBackGround();
                }
        }
    }      
    static void abajoDesplaz(){
        if(Fselect==Fempty&&Cselect==Cempty)
            System.out.println("ab,FS "+Fselect+"FE "+Fempty+"CS "+Cselect+"CE "+Cempty);
            else{
                if(Cselect==Cempty&&Fempty>Fselect){
                    F=Fempty-1;
                    //list.clear();
                    while(F>=Fselect){
                        arrayp[F+1][Cempty].setID(arrayp[F][Cempty].getID());
                        F--;
                    }
                    Fempty=Fselect; Cempty=Cselect;
                    arrayp[Fselect][Cselect].setEmpty();
                    arrayp[Fselect][Cselect].setSelectedBackGround();
                }
                   
            }        
        
    }
    static void derechaDesplaz(){
        if(Fselect==Fempty&&Cselect==Cempty)
            System.out.println("der,FS "+Fselect+"FE "+Fempty+"CS "+Cselect+"CE "+Cempty);
        else{
            if(Fselect==Fempty&&Cempty>Cselect){
                    C=Cempty-1;
                    
                    while(C>=Cselect){
                        arrayp[Fempty][C+1].setID(arrayp[Fempty][C].getID());
                        C--;
                    }
                    Fempty=Fselect; Cempty=Cselect;
                    arrayp[Fselect][Cselect].setEmpty();
                    arrayp[Fselect][Cselect].setSelectedBackGround();
                }
        }        
                 
    }
    static void izquierdaDesplaz(){
        if(Fselect==Fempty&&Cselect==Cempty)
            System.out.println("izq,FS "+Fselect+" FE "+Fempty+ " CS "+Cselect+" CE "+Cempty);
        else{
            if(Fselect==Fempty&&Cempty<Cselect){
                    C=Cempty+1;
                    
                    while(C<=Cselect){
                        arrayp[Fempty][C-1].setID(arrayp[Fempty][C].getID());
                        C++;
                    }
                    Fempty=Fselect; Cempty=Cselect;
                    arrayp[Fselect][Cselect].setEmpty();
                    arrayp[Fselect][Cselect].setSelectedBackGround();
                }
        } 
    }
    }
    
    //******************************************************************//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel pane;
    // End of variables declaration//GEN-END:variables
}
