package View;

import Controller.Controlador;
import java.awt.Color;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMenu = new javax.swing.JLabel();
        jButtonTematica = new javax.swing.JButton();
        jButtonPostulante = new javax.swing.JButton();
        jButtonPuesto = new javax.swing.JButton();
        jButtonEvaluador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelMenu.setText("Menu");

        jButtonTematica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonTematica.setText("Tematica");
        jButtonTematica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTematicaMouseClicked(evt);
            }
        });

        jButtonPostulante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonPostulante.setText("Postulante");
        jButtonPostulante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPostulanteMouseClicked(evt);
            }
        });

        jButtonPuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonPuesto.setText("Puesto");
        jButtonPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPuestoMouseClicked(evt);
            }
        });

        jButtonEvaluador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonEvaluador.setText("Registro de Evaluador");
        jButtonEvaluador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEvaluadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEvaluador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMenu)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMenu)
                .addGap(18, 18, 18)
                .addComponent(jButtonTematica)
                .addGap(18, 18, 18)
                .addComponent(jButtonPuesto)
                .addGap(18, 18, 18)
                .addComponent(jButtonPostulante)
                .addGap(18, 18, 18)
                .addComponent(jButtonEvaluador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_formWindowOpened

    private void jButtonTematicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTematicaMouseClicked
        this.setVisible(false);
        Controlador.initMenuTematica();
    }//GEN-LAST:event_jButtonTematicaMouseClicked

    private void jButtonPuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPuestoMouseClicked
        this.setVisible(false);
        Controlador.initMenuPuesto();
    }//GEN-LAST:event_jButtonPuestoMouseClicked

    private void jButtonPostulanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPostulanteMouseClicked
        this.setVisible(false);
        Controlador.initMenuPostulante();
    }//GEN-LAST:event_jButtonPostulanteMouseClicked

    private void jButtonEvaluadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEvaluadorMouseClicked
        this.setVisible(false);
        Controlador.initRegistroEvaluador();
}//GEN-LAST:event_jButtonEvaluadorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEvaluador;
    private javax.swing.JButton jButtonPostulante;
    private javax.swing.JButton jButtonPuesto;
    private javax.swing.JButton jButtonTematica;
    private javax.swing.JLabel jLabelMenu;
    // End of variables declaration//GEN-END:variables
}
