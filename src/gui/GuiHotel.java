/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Hotel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitario.AdminSerializacion;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author aarve
 */
public class GuiHotel extends javax.swing.JInternalFrame {

    private boolean agregando = false;
    private int posicionElemento;

    /**
     * Creates new form GuiCategoriaHabitacion
     */
    public GuiHotel() {

        initComponents();
        actualizarElementosEnTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCategoria = new javax.swing.JLabel();
        txtNombreHotel = new javax.swing.JTextField();
        fontoTexto = new javax.swing.JLabel();
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
        txtDireccionHotel = new javax.swing.JTextField();
        fontoTexto1 = new javax.swing.JLabel();
        lblCategoria4 = new javax.swing.JLabel();
        txtRtn = new javax.swing.JTextField();
        fontoTexto2 = new javax.swing.JLabel();
        lblCategoria5 = new javax.swing.JLabel();
        txtNumeroTelefono = new javax.swing.JTextField();
        fontoTexto3 = new javax.swing.JLabel();
        lblCategoria6 = new javax.swing.JLabel();
        lblCategoria7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        fontoTexto4 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        lblCancelar1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblHotel = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Hotel ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setMinimumSize(new java.awt.Dimension(670, 730));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategoria.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Nombre del Hotel");
        jPanel2.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        txtNombreHotel.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreHotel.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreHotel.setText("Nombre del Hotel");
        txtNombreHotel.setBorder(null);
        txtNombreHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreHotelMouseClicked(evt);
            }
        });
        txtNombreHotel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtNombreHotelCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtNombreHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreHotelActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 220, 30));

        fontoTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        jPanel2.add(fontoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 250, 50));

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
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 60, 40));

        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setText("Nuevo");
        jPanel2.add(lblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setText("Cancelar");
        jPanel2.add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

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
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 60, 40));

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
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 60, 40));

        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setText("Guardar");
        jPanel2.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

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
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 70, 40));

        lblEditar1.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar1.setText("Eliminar");
        jPanel2.add(lblEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 50, 20));

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
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 70, 40));

        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        jPanel2.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 50, 20));

        txtDireccionHotel.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionHotel.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccionHotel.setText("Direccion del Hotel");
        txtDireccionHotel.setBorder(null);
        txtDireccionHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDireccionHotelMouseClicked(evt);
            }
        });
        txtDireccionHotel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtDireccionHotelCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtDireccionHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionHotelActionPerformed(evt);
            }
        });
        jPanel2.add(txtDireccionHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 220, 30));

        fontoTexto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        jPanel2.add(fontoTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 50));

        lblCategoria4.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoria4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria4.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria4.setText("Direccion del Hotel");
        jPanel2.add(lblCategoria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 20));

        txtRtn.setBackground(new java.awt.Color(255, 255, 255));
        txtRtn.setForeground(new java.awt.Color(0, 0, 0));
        txtRtn.setText("Registro tributario Nacional");
        txtRtn.setBorder(null);
        txtRtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRtnMouseClicked(evt);
            }
        });
        txtRtn.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtRtnCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtRtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRtnActionPerformed(evt);
            }
        });
        jPanel2.add(txtRtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 220, 20));

        fontoTexto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        jPanel2.add(fontoTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 250, 40));

        lblCategoria5.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoria5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria5.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria5.setText("RTN");
        jPanel2.add(lblCategoria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 140, 20));

        txtNumeroTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroTelefono.setText("Numero de telefono");
        txtNumeroTelefono.setBorder(null);
        txtNumeroTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumeroTelefonoMouseClicked(evt);
            }
        });
        txtNumeroTelefono.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtNumeroTelefonoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtNumeroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 220, 20));

        fontoTexto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        jPanel2.add(fontoTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 250, 60));

        lblCategoria6.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoria6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria6.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria6.setText("Numero de telefono");
        jPanel2.add(lblCategoria6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, 20));

        lblCategoria7.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoria7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria7.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria7.setText("Correo electronico");
        jPanel2.add(lblCategoria7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 140, 30));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setText("Numero de telefono");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        txtCorreo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtCorreoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 220, 30));

        fontoTexto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        jPanel2.add(fontoTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 250, 70));

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
        jPanel2.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 60, 40));

        lblCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar1.setText("Reportes");
        jPanel2.add(lblCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 50, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra botones.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 450, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hotel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblHotel.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblHotelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtblHotelMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtblHotel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 610, 200));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 60, 50));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setText("Buscar por ID");
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
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja de texto.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo con transparencia.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 370, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 630, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.txtCorreo.setText("");
        this.txtDireccionHotel.setText("");
        this.txtNombreHotel.setText("");
        this.txtNumeroTelefono.setText("");
        this.txtRtn.setText("");

        this.agregando = true;
        this.btnGuardar.setEnabled(true);
        this.btnNuevo.setEnabled(false);
        this.btnEditar.setEnabled(false);
        this.btnCancelar.setEnabled(false);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            if (agregando) {
                String nombreHotel, direccion, rtn, correo, telefono;
                nombreHotel = this.txtNombreHotel.getText();
                direccion = this.txtDireccionHotel.getText();
                rtn = this.txtRtn.getText();
                correo = this.txtCorreo.getText();
                telefono = this.txtNumeroTelefono.getText();

                Hotel htl = new Hotel();
                htl.setCorreo(correo);
                htl.setDireccionHotel(direccion);
                htl.setNombreHotel(nombreHotel);
                htl.setNumTelefono(telefono);
                htl.setRtn(rtn);

                PantallaPrincipal.gHtl.agregarHotel(htl);
                actualizarElementosEnTabla();
                this.agregando = false;
            } else {
                String nombreHotel, direccion, rtn, correo, telefono;
                nombreHotel = this.txtNombreHotel.getText();
                direccion = this.txtDireccionHotel.getText();
                rtn = this.txtRtn.getText();
                correo = this.txtCorreo.getText();
                telefono = this.txtNumeroTelefono.getText();

                Hotel objModificado = new Hotel();
                objModificado.setCorreo(correo);
                objModificado.setDireccionHotel(direccion);
                objModificado.setNombreHotel(nombreHotel);
                objModificado.setNumTelefono(telefono);
                objModificado.setRtn(rtn);

                PantallaPrincipal.gHtl.modificarHotel(objModificado, posicionElemento);
                actualizarElementosEnTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar "+e);
        }
        // TODO add your handling code here:


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this.agregando = false;
        this.btnGuardar.setEnabled(true);
        this.btnNuevo.setEnabled(false);
        this.btnEditar.setEnabled(false);
        this.btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(this, "Esta seguro?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            PantallaPrincipal.gCatHab.eliminarCatHabitacion(this.posicionElemento);
            this.actualizarElementosEnTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreHotelActionPerformed

    private void txtNombreHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreHotelMouseClicked
        // TODO add your handling code here:
        this.txtNombreHotel.setText("");
    }//GEN-LAST:event_txtNombreHotelMouseClicked

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        // TODO add your handling code here:
        this.txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void txtNombreHotelCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNombreHotelCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreHotelCaretPositionChanged

    private void jtblHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblHotelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblHotelMouseClicked

    private void jtblHotelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblHotelMousePressed
        // TODO add your handling code here:
        this.posicionElemento = this.jtblHotel.getSelectedRow();
        Hotel htl = PantallaPrincipal.gHtl.objHotel(this.posicionElemento);
        this.txtCorreo.setText(htl.getCorreo());
        this.txtDireccionHotel.setText(htl.getDireccionHotel());
        this.txtNombreHotel.setText(htl.getNombreHotel());
        this.txtNumeroTelefono.setText(htl.getNumTelefono());
        this.txtRtn.setText(htl.getRtn());

        this.btnEditar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnGuardar.setEnabled(false);

    }//GEN-LAST:event_jtblHotelMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
        this.txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed

    }//GEN-LAST:event_btnBuscarMousePressed

    private void txtDireccionHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionHotelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionHotelMouseClicked

    private void txtDireccionHotelCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtDireccionHotelCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionHotelCaretPositionChanged

    private void txtDireccionHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionHotelActionPerformed

    private void txtRtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRtnMouseClicked

    private void txtRtnCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtRtnCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRtnCaretPositionChanged

    private void txtRtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRtnActionPerformed

    private void txtNumeroTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTelefonoMouseClicked

    private void txtNumeroTelefonoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTelefonoCaretPositionChanged

    private void txtNumeroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTelefonoActionPerformed

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void txtCorreoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCorreoCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoCaretPositionChanged

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:

        String nombreArchivo = "Hotel";
        String contenido = PantallaPrincipal.gHtl.getInformacionGestion();
        String ruta = "Reportes/" + nombreArchivo;

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

    //Metodo para actualizar los elementos de la tabla
    public void actualizarElementosEnTabla() {

        String[] tituloColumnas = {"Nombre del Hotel", "Direccion", "RTN", "Num. telefono", "Correo electronico"};
        DefaultTableModel tablaCatHabitacion = new DefaultTableModel(PantallaPrincipal.gHtl.getArrayGestion(), tituloColumnas);

        this.jtblHotel.setModel(tablaCatHabitacion);
        AdminSerializacion.guardar(PantallaPrincipal.gHtl, "objHotel.obj");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel fontoTexto;
    private javax.swing.JLabel fontoTexto1;
    private javax.swing.JLabel fontoTexto2;
    private javax.swing.JLabel fontoTexto3;
    private javax.swing.JLabel fontoTexto4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtblHotel;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblCancelar1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoria4;
    private javax.swing.JLabel lblCategoria5;
    private javax.swing.JLabel lblCategoria6;
    private javax.swing.JLabel lblCategoria7;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditar1;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccionHotel;
    private javax.swing.JTextField txtNombreHotel;
    private javax.swing.JTextField txtNumeroTelefono;
    private javax.swing.JTextField txtRtn;
    // End of variables declaration//GEN-END:variables
}
