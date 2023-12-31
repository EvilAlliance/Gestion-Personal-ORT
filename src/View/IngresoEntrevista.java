package View;

import Controller.Controlador;
import Model.Entrevistador;
import Model.Postulante;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class IngresoEntrevista extends javax.swing.JFrame {

    /**
     * Creates new form IngresoEntrevista
     */
    public IngresoEntrevista() {
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

        jScrollPaneIntrevistador = new javax.swing.JScrollPane();
        jListEntrevistador = new javax.swing.JList<>();
        jScrollPanePostulante = new javax.swing.JScrollPane();
        jListPostulante = new javax.swing.JList<>();
        jLabelIngresoEntrevista = new javax.swing.JLabel();
        jLabelPuntaje = new javax.swing.JLabel();
        jSpinnerPuntaje = new javax.swing.JSpinner();
        jLabelIntrevistador = new javax.swing.JLabel();
        jLabelPostulante = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jErrorPuntaje = new javax.swing.JLabel();
        jErrorEntrevistador = new javax.swing.JLabel();
        jErrorPostulante = new javax.swing.JLabel();
        jLabelComentario = new javax.swing.JLabel();
        jScrollPaneComentario = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();
        jErrorComentario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPaneIntrevistador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jListEntrevistador.setBackground(new java.awt.Color(236, 236, 236));
        jListEntrevistador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListEntrevistadorMouseClicked(evt);
            }
        });
        jScrollPaneIntrevistador.setViewportView(jListEntrevistador);

        jScrollPanePostulante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jListPostulante.setBackground(new java.awt.Color(236, 236, 236));
        jListPostulante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPostulanteMouseClicked(evt);
            }
        });
        jScrollPanePostulante.setViewportView(jListPostulante);

        jLabelIngresoEntrevista.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelIngresoEntrevista.setText("Ingreso de Entrevista");

        jLabelPuntaje.setText("Puntaje");

        jSpinnerPuntaje.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabelIntrevistador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIntrevistador.setText("Entrevistador");

        jLabelPostulante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPostulante.setText("Postulante");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });

        jErrorPuntaje.setForeground(new java.awt.Color(255, 0, 0));
        jErrorPuntaje.setText(" ");

        jErrorEntrevistador.setForeground(new java.awt.Color(255, 0, 0));
        jErrorEntrevistador.setText(" ");

        jErrorPostulante.setForeground(new java.awt.Color(255, 0, 0));
        jErrorPostulante.setText(" ");

        jLabelComentario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelComentario.setText("Comentario");

        jScrollPaneComentario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jTextAreaComentario.setBackground(new java.awt.Color(236, 236, 236));
        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setRows(5);
        jTextAreaComentario.setBorder(null);
        jScrollPaneComentario.setViewportView(jTextAreaComentario);

        jErrorComentario.setForeground(new java.awt.Color(255, 0, 0));
        jErrorComentario.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneComentario)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelIngresoEntrevista)
                        .addGap(296, 296, 296))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jErrorComentario)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIntrevistador)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPaneIntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSpinnerPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabelPuntaje))
                                            .addComponent(jErrorPuntaje)))
                                    .addComponent(jLabelComentario)
                                    .addComponent(jErrorEntrevistador))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPanePostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jErrorPostulante)
                                            .addComponent(jLabelPostulante))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelIngresoEntrevista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIntrevistador)
                    .addComponent(jLabelPostulante, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPaneIntrevistador)
                            .addComponent(jScrollPanePostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jErrorEntrevistador)
                            .addComponent(jErrorPostulante)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabelPuntaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jErrorPuntaje)))
                .addGap(0, 0, 0)
                .addComponent(jLabelComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jErrorComentario)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Controlador.initMenuPostulante();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
        boolean entrevistadorOK = this.jListEntrevistador.getSelectedIndex() != -1;
        boolean postulanteOK = this.jListPostulante.getSelectedIndex() != -1;
        boolean comentarioOK = !this.jTextAreaComentario.getText().equals("");
        int puntaje = (int) this.jSpinnerPuntaje.getValue();
        boolean puntajeOK = 0 <= puntaje && puntaje <= 100;
        if (entrevistadorOK && postulanteOK && puntajeOK && comentarioOK) {
            JOptionPane.showMessageDialog(this, "Numero de entrevista " + Controlador.getEntrevistaLastIndex());
            Controlador.addEntrevista(this.jListPostulante.getSelectedValue(), this.jListEntrevistador.getSelectedValue(), puntaje + "", this.jTextAreaComentario.getText());
            this.dispose();
        } else {
            this.jErrorEntrevistador.setText(entrevistadorOK ? " " : "No hay selección");
            this.jErrorPostulante.setText(postulanteOK ? " " : "No hay selección");
            this.jErrorPuntaje.setText(puntajeOK ? " " : "0 - 100");
            this.jErrorComentario.setText(comentarioOK ? " " : "Esta vacio");
        }
    }//GEN-LAST:event_jButtonGuardarMouseClicked

    private void jListPostulanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPostulanteMouseClicked
        boolean postulanteOK = this.jListPostulante.getSelectedIndex() != -1;
        this.jErrorPostulante.setText(postulanteOK ? " " : "No hay selección");
    }//GEN-LAST:event_jListPostulanteMouseClicked

    private void jListEntrevistadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListEntrevistadorMouseClicked
        boolean entrevistadorOK = this.jListEntrevistador.getSelectedIndex() != -1;
        this.jErrorEntrevistador.setText(entrevistadorOK ? " " : "No hay selección");    }//GEN-LAST:event_jListEntrevistadorMouseClicked

    public void reset() {
        this.jSpinnerPuntaje.setValue(0);
        this.jErrorEntrevistador.setText(" ");
        this.jErrorPostulante.setText(" ");
        this.jErrorPuntaje.setText(" ");
        this.jTextAreaComentario.setText("");
        this.jErrorComentario.setText(" ");
        this.modeloPostulante = new DefaultListModel<Postulante>();
        this.jListPostulante.setModel(this.modeloPostulante);
        this.modeloEntrevistador = new DefaultListModel<Entrevistador>();
        this.jListEntrevistador.setModel(this.modeloEntrevistador);
    }

    public void set(ArrayList<Postulante> postulanteList, ArrayList<Entrevistador> entrevistadorList) {
        this.modeloPostulante.addAll((Collection<Postulante>) postulanteList);
        this.jListPostulante.setModel(this.modeloPostulante);
        this.modeloEntrevistador.addAll((Collection<Entrevistador>) entrevistadorList);
        this.jListEntrevistador.setModel(this.modeloEntrevistador);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jErrorComentario;
    private javax.swing.JLabel jErrorEntrevistador;
    private javax.swing.JLabel jErrorPostulante;
    private javax.swing.JLabel jErrorPuntaje;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelIngresoEntrevista;
    private javax.swing.JLabel jLabelIntrevistador;
    private javax.swing.JLabel jLabelPostulante;
    private javax.swing.JLabel jLabelPuntaje;
    private javax.swing.JList<Entrevistador> jListEntrevistador;
    private javax.swing.JList<Postulante> jListPostulante;
    private javax.swing.JScrollPane jScrollPaneComentario;
    private javax.swing.JScrollPane jScrollPaneIntrevistador;
    private javax.swing.JScrollPane jScrollPanePostulante;
    private javax.swing.JSpinner jSpinnerPuntaje;
    private javax.swing.JTextArea jTextAreaComentario;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel modeloPostulante;
    private DefaultListModel modeloEntrevistador;
}
