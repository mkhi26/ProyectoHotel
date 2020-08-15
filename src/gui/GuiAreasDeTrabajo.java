/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.AreaDeTrabajo;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitario.AdminArchivos;
import utilitario.AdminSerializacion;

/**
 *
 * @author aarve
 */
public class GuiAreasDeTrabajo extends javax.swing.JInternalFrame {

    private boolean agregando = false;
    private int posicionElemento;
    private AreaDeTrabajo objArea;

    /**
     * Creates new form GuiAreasDeTrabajo
     */
    public GuiAreasDeTrabajo() {
        initComponents();
        this.actualizarElementosEnTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnReportes = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        lblNuevo = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblAgregar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblEditar1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        lblEditar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblCancelar1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbListaAreas = new javax.swing.JTable();
        cbxBuscar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Areas de trabajo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1900, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonReportes 1.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setFocusPainted(false);
        btnReportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonReportes 3.png"))); // NOI18N
        btnReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonReportes 2.png"))); // NOI18N
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 60, 40));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton 1 nuevo.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setFocusPainted(false);
        btnNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton 3 nuevo.png"))); // NOI18N
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton 2 nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 60, 40));

        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setText("Nuevo");
        jPanel1.add(lblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 40, -1));

        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setText("Cancelar");
        jPanel1.add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 50, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton cancelar 2.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton cancelar 3.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton cancelar 1.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 60, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton agregar 2 png.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton agregar 3.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton agregar 1.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 60, 40));

        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setText("Guardar");
        jPanel1.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 50, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton eliminar 1.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton eliminar 3.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton eliminar 2.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 70, 40));

        lblEditar1.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar1.setText("Eliminar");
        jPanel1.add(lblEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 50, 20));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton editar 2.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setEnabled(false);
        btnEditar.setFocusPainted(false);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton editar 3.png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton editar 1.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 70, 40));

        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        jPanel1.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 40, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 27, 20, 20));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setText("ID");
        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ID.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 70, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, 30));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setText("             Descripción");
        txtDescripcion.setBorder(null);
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDescripcionMouseClicked(evt);
            }
        });
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 250, 50));

        lblCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar1.setText("Reporte");
        jPanel1.add(lblCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 40, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra botones.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 450, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setText("Seleccione manera de buscar");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 210, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 240, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton buscar 1.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton buscar 3.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton buscar 2.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 60, 50));

        jtbListaAreas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbListaAreas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbListaAreasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbListaAreasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtbListaAreas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 550, 220));

        cbxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por ID", "Buscar por descripcion" }));
        cbxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(cbxBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoTransparencia oscura.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 420, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoFormulario.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 550, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:

        txtDescripcion.setText("");

        this.agregando = true;
        this.btnGuardar.setEnabled(true);
        this.btnNuevo.setEnabled(false);
        this.btnEditar.setEnabled(false);
        this.txtDescripcion.setVisible(true);
        this.btnCancelar.setEnabled(false);
        txtID.setText(Integer.toString(PantallaPrincipal.gArea.AsignarId()));

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.btnNuevo.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnEditar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        //dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        
       
        if (agregando) {
            /*
            1. Obtener el valor de los textbox
            2. Crear el objeto grado
            3. Agregarlo a la gestion
             */
            //Paso 1
            try {
                String descripcion = this.txtDescripcion.getText();
                int id = PantallaPrincipal.gArea.AsignarId();  //El ID es automatico.

                // Paso 2
                AreaDeTrabajo areas = new AreaDeTrabajo();
                areas.setDescripcionarea(descripcion);
                areas.setIdArea(id);
                // Paso 3

                PantallaPrincipal.gArea.agregarArea(areas);

                //Actualizar tabla
                actualizarElementosEnTabla();
                this.agregando = false;
                this.btnGuardar.setEnabled(false);
                this.btnEditar.setEnabled(false);
                this.btnEliminar.setEnabled(false);
                this.btnNuevo.setEnabled(true);
                this.btnCancelar.setEnabled(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al registrar la categoria de habitacion");

            }

        } else {
            /*
            1. Obtener el valor de los textbox
            2. Crear el objeto grado
            3. Agregarlo a la gestion
             */
            //Paso 1

            try {
                String descripcion = this.txtDescripcion.getText();

                // Paso 2
                AreaDeTrabajo objModificado = new AreaDeTrabajo();
                objModificado.setDescripcionarea(descripcion);
                objModificado.setIdArea(PantallaPrincipal.gCatHab.AsignarId());
                // Paso 3

                PantallaPrincipal.gArea.modificarArea(objModificado, posicionElemento);

                //Actualizar tabla
                actualizarElementosEnTabla();

                this.btnGuardar.setEnabled(false);
                this.btnEditar.setEnabled(false);
                this.btnEliminar.setEnabled(false);
                this.btnNuevo.setEnabled(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al editar");

            }

        }
        this.txtDescripcion.setVisible(false);
        this.btnCancelar.setEnabled(false);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Esta seguro?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            PantallaPrincipal.gArea.eliminarArea(this.posicionElemento);
            this.actualizarElementosEnTabla();
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this.agregando = false;
        this.btnGuardar.setEnabled(true);
        this.btnNuevo.setEnabled(false);
        this.btnEditar.setEnabled(false);
        this.txtDescripcion.setVisible(true);
        this.btnCancelar.setEnabled(true);


    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        // TODO add your handling code here:
        this.txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
        this.txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed

    }//GEN-LAST:event_btnBuscarMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String accion = this.cbxBuscar.getSelectedItem().toString();
        /**
         * Buscar por ID Buscar por descripcion
         */

        if (accion.equalsIgnoreCase("Buscar por ID")) {
            int idBuscar;
            idBuscar = Integer.parseInt(txtBuscar.getText());
            this.posicionElemento = PantallaPrincipal.gArea.buscarAreaPorId(idBuscar);

            AreaDeTrabajo areas = PantallaPrincipal.gArea.getObj(this.posicionElemento);
            this.txtID.setText(Integer.toString(areas.getIdArea()));
            this.txtDescripcion.setText(areas.getDescripcionarea());
            this.btnEditar.setEnabled(true);
            this.btnEliminar.setEnabled(true);
            this.btnGuardar.setEnabled(false);
            this.txtDescripcion.setVisible(true);

        } else {
            String DescripcionBuscar;
            DescripcionBuscar = txtBuscar.getText();
            this.posicionElemento = PantallaPrincipal.gArea.buscarAreaPornombre(DescripcionBuscar);

            AreaDeTrabajo areas = PantallaPrincipal.gArea.getObj(this.posicionElemento);
            this.txtID.setText(Integer.toString(areas.getIdArea()));
            this.txtDescripcion.setText(areas.getDescripcionarea());
            this.btnEditar.setEnabled(true);
            this.btnEliminar.setEnabled(true);
            this.btnGuardar.setEnabled(false);
            this.txtDescripcion.setVisible(true);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtbListaAreasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbListaAreasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbListaAreasMouseClicked

    private void jtbListaAreasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbListaAreasMousePressed
        // TODO add your handling code here:
        this.posicionElemento = this.jtbListaAreas.getSelectedRow();
        AreaDeTrabajo areas = PantallaPrincipal.gArea.getObj(this.posicionElemento);
        this.txtID.setText(Integer.toString(areas.getIdArea()));
        this.txtDescripcion.setText(areas.getDescripcionarea());

        this.btnEditar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.txtDescripcion.setVisible(true);
    }//GEN-LAST:event_jtbListaAreasMousePressed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void txtDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseClicked
        // TODO add your handling code here:
        this.txtDescripcion.setText("");
    }//GEN-LAST:event_txtDescripcionMouseClicked

    private void cbxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBuscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxBuscarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:

        String nombreArchivo = "AreasDeTrabajo";
        String contenido = PantallaPrincipal.gArea.getInformacionGestion();
        String ruta = "Reportes\\" + nombreArchivo;

        try {
            FileOutputStream archivo = new FileOutputStream(ruta + ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph(contenido));
            doc.close();
            JOptionPane.showMessageDialog(null, "Reporte generado correctamente");
        } catch (Exception e) {
            System.out.println("error" + e);
        }


    }//GEN-LAST:event_btnReportesActionPerformed

    public void actualizarElementosEnTabla() {

        String[] tituloColumnas = {"ID", "Descripción"};
        DefaultTableModel modeloTabla = new DefaultTableModel(PantallaPrincipal.gArea.getArrayGestion(), tituloColumnas);
        this.jtbListaAreas.setModel(modeloTabla);
        AdminSerializacion.guardar(PantallaPrincipal.gArea, "AreaDeTrabajo.obj");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JComboBox<String> cbxBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbListaAreas;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblCancelar1;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditar1;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
