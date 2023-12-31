package View;

import Controller.Controlador;
import Model.CriterioUltimoPuntaje;
import Model.Experiencia;
import Model.Puesto;
import Model.Postulante;
import Model.Tema;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class ConsultaPuesto extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaPuesto
     */
    public ConsultaPuesto() {
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

        jLabelPuesto = new javax.swing.JLabel();
        jScrollPanePuestos = new javax.swing.JScrollPane();
        jListPuestos = new javax.swing.JList<>();
        jLabelNivel = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jSpinnerNivel = new javax.swing.JSpinner();
        jButtonConsulta = new javax.swing.JButton();
        jLabelPostulante = new javax.swing.JLabel();
        jScrollPanePostulante = new javax.swing.JScrollPane();
        jListPostulante = new javax.swing.JList<>();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExportar = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta para Puesto");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelPuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPuesto.setLabelFor(jListPuestos);
        jLabelPuesto.setText("Puestos:");

        jScrollPanePuestos.setBackground(new java.awt.Color(236, 236, 236));
        jScrollPanePuestos.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jListPuestos.setBackground(new java.awt.Color(236, 236, 236));
        jScrollPanePuestos.setViewportView(jListPuestos);

        jLabelNivel.setLabelFor(jSpinnerNivel);
        jLabelNivel.setText("Nivel:");

        jSpinnerNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinnerNivel.setBorder(null);

        jButtonConsulta.setText("Consultar");
        jButtonConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultaMouseClicked(evt);
            }
        });

        jLabelPostulante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPostulante.setLabelFor(jListPostulante);
        jLabelPostulante.setText("Postulantes:");

        jScrollPanePostulante.setBackground(new java.awt.Color(236, 236, 236));
        jScrollPanePostulante.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jListPostulante.setBackground(new java.awt.Color(236, 236, 236));
        jScrollPanePostulante.setViewportView(jListPostulante);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });

        jButtonExportar.setText("Exportar");
        jButtonExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExportarMouseClicked(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel.setText("Consulta para Puesto");

        jError.setForeground(new java.awt.Color(255, 0, 0));
        jError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonCancelar)
                                .addGap(219, 219, 219)
                                .addComponent(jButtonExportar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelPuesto)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPanePuestos)))
                .addContainerGap())
            .addComponent(jSeparator)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPanePostulante)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNivel)
                        .addGap(35, 35, 35)
                        .addComponent(jSpinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConsulta)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPostulante)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jError)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPanePuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jError)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNivel)
                    .addComponent(jSpinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPostulante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanePostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonExportar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Controlador.initMenuPuesto();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaMouseClicked
        if (jListPuestos.getSelectedValue() != null) {
            this.jError.setText(" ");
            int nivelSpinner = (int) jSpinnerNivel.getValue();
            Puesto puestoSeleccionado = jListPuestos.getSelectedValue();
            Tema[] selecionadoTema = puestoSeleccionado.getTemasRequeridos();
            ArrayList<Postulante> postulantesFiltrados = new ArrayList<Postulante>();

            for (int i = 0; i < this.listaPostulante.size(); i++) {
                Postulante aFiltrar = this.listaPostulante.get(i);
                if (aFiltrar.getEntrevistas().size() > 0 && aFiltrar.getFormato().equals(puestoSeleccionado.getTipo())) {
                    Experiencia[] aFiltrarExperiencia = aFiltrar.getExperiencia();
                    boolean compartenTodo = true;
                    for (int j = 0; j < selecionadoTema.length && compartenTodo; j++) {
                        boolean comparteAlguno = false;
                        for (int k = 0; k < aFiltrarExperiencia.length && !comparteAlguno; k++) {
                            if (selecionadoTema[j] == aFiltrarExperiencia[k].getTema() && aFiltrarExperiencia[k].getNivel() >= nivelSpinner) {
                                comparteAlguno = true;
                            }
                        }
                        if (!comparteAlguno) {
                            compartenTodo = false;
                        }
                    }
                    if (compartenTodo) {
                        postulantesFiltrados.add(aFiltrar);
                    }
                }
            }

            this.modeloPost.removeAllElements();
            Collections.sort(postulantesFiltrados, new CriterioUltimoPuntaje());

            this.modeloPost.addAll(postulantesFiltrados);
            this.jListPostulante.setModel(this.modeloPost);
        } else {
            this.jError.setText("Tiene que haber un puesto seleccionado");
        }
    }//GEN-LAST:event_jButtonConsultaMouseClicked

    private void jButtonExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExportarMouseClicked
        String outPut = "";
        String puesto = this.jListPuestos.getSelectedValue().toString();
        outPut += puesto + "\n";
        for (int i = 0; i < this.modeloPost.size(); i++) {
            Postulante postulante = this.modeloPost.getElementAt(i);
            outPut += postulante.getNombre() + " - ";
            outPut += postulante.getCedula() + " - ";
            outPut += postulante.getMail() + "\n";
        }

        Controlador.exportarPostulantes(outPut);
    }//GEN-LAST:event_jButtonExportarMouseClicked

    public void reset() {
        this.jSpinnerNivel.setValue(1);

        this.modeloPuesto = new DefaultListModel<>();
        this.jListPuestos.setModel(this.modeloPuesto);

        this.modeloPost = new DefaultListModel<>();
        this.jListPostulante.setModel(this.modeloPost);
    }

    public void set(ArrayList<Puesto> puestoList, ArrayList<Postulante> postulanteList) {
        this.setPuesto(puestoList);

        this.setPostulante(postulanteList);
    }

    public void setPuesto(ArrayList<Puesto> puestoList) {
        this.modeloPuesto.addAll((Collection<Puesto>) puestoList);
        this.jListPuestos.setModel(this.modeloPuesto);
    }

    public void setPostulante(ArrayList<Postulante> postulanteList) {
        this.listaPostulante = postulanteList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelPostulante;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JList<Postulante> jListPostulante;
    private javax.swing.JList<Puesto> jListPuestos;
    private javax.swing.JScrollPane jScrollPanePostulante;
    private javax.swing.JScrollPane jScrollPanePuestos;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSpinner jSpinnerNivel;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel<Puesto> modeloPuesto;
    private DefaultListModel<Postulante> modeloPost;
    private ArrayList<Postulante> listaPostulante;

}
