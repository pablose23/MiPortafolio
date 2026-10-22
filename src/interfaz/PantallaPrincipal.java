

package interfaz;


import dto.Alumno;
import interfaz.tablemodels.AlumnosTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.LogicaNegocio;

/**
 *
 * @author centr
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    private LogicaNegocio logicaNegocio= new LogicaNegocio();
    private TableRowSorter<AlumnosTableModel>sorter;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName());

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        rellenarTablaAlumnos();
    }

    private void rellenarTablaAlumnos(){
        AlumnosTableModel atm=new AlumnosTableModel(logicaNegocio.getListaAlumnos());
        jTableAlumnos.setModel(atm);
        
        sorter=new TableRowSorter<>(atm);
        jTableAlumnos.setRowSorter(sorter);
        
        List<SortKey> soertKeys= new ArrayList<>();
        soertKeys.add(new SortKey(0, SortOrder.DESCENDING));
        sorter.setSortKeys(soertKeys);
    }
    
    private void rellenarTablaAlumnos2(){
        String[]columnas={"Nombre", "Curso"};
        DefaultTableModel dtm=new DefaultTableModel(columnas, 0);
        for(Alumno alumno: logicaNegocio.getListaAlumnos()){
            String[]a=new String[2];
            a[0]=alumno.getNombre();
            a[1]=alumno.getCurso();
            dtm.addRow(a);
        }
        jTableAlumnos.setModel(dtm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jLabelSeleccionado = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAlumnos.setShowHorizontalLines(true);
        jTableAlumnos.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTableAlumnos);

        jLabelSeleccionado.setText("jLabel1");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSeleccionado)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFiltrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeleccionado)
                    .addComponent(jButtonAceptar)
                    .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar))
                .addGap(0, 74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        int seleccionado=jTableAlumnos.convertRowIndexToModel(jTableAlumnos.getSelectedRow());
        jLabelSeleccionado.setText(logicaNegocio.getListaAlumnos().get(seleccionado).getNombre());
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        RowFilter<AlumnosTableModel,Integer> rf= RowFilter.regexFilter(jTextFieldFiltrar.getText(), 0);
        sorter.setRowFilter(rf);
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PantallaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JLabel jLabelSeleccionado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
