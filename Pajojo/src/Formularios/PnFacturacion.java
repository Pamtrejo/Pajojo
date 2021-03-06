/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import DAL.*;
import Modelos.*;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RojeruSan
 */
public class PnFacturacion extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    
    private JPanel pnPrincipal;
    
    public PnFacturacion() {
        initComponents();
        
    }
    
     public PnFacturacion(JPanel pnPrincipal) {
        initComponents();        
        this.pnPrincipal = pnPrincipal;
        llenarTabla();
        
    }

    public void llenarTabla(){
    
        DALRecibos recibos = new DALRecibos();
        DALVivienda viviendas = new DALVivienda();
        DALPagos pagos = new DALPagos();
        DALDueno dueno = new DALDueno();
        List<Recibos>  listarecibos = new LinkedList<Recibos>();
        try {
            
            
            listarecibos = recibos.getRecibos();
            DefaultTableModel model = new DefaultTableModel();
            String[] columnas = {"Código de Recibo",
                                "Código de Pago",
                                "Vivienda",
                                "Dueño",
                                "Descripción"};
            
            
            model.setColumnIdentifiers(columnas);
            
            
            for(Recibos r : listarecibos){
            
                Pagos pag = pagos.getPagos(r.getIdPago()).get(0);
                Viviendas vivien = viviendas.getViviendas(pag.getIdVivienda()).get(0);
                Dueno duen = dueno.getDuenos(vivien.getIdDueno()).get(0);
                Object[] o = new Object[5];
                o[0] = r.getIdRecibos();
                o[1] = r.getIdPago();
                o[2] = pag.getIdVivienda();
                o[3] = duen.getNombre();
                o[4] = r.getDescripcion();
                model.addRow(o);
            }
            
            FacturasTable.setModel(model);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PnFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BuscarTextField = new javax.swing.JTextField();
        BuscarBtn = new javax.swing.JButton();
        AgregarBtn = new javax.swing.JButton();
        ModificarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FacturasTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(811, 384));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FACTURACIÓN");
        add(jLabel7);

        BuscarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTextFieldActionPerformed(evt);
            }
        });

        BuscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconbuscargrid.png"))); // NOI18N
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        AgregarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });

        ModificarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modify.png"))); // NOI18N
        ModificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBtnActionPerformed(evt);
            }
        });

        FacturasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Correlativo", "Vivienda", "Dueño", "Mes"
            }
        ));
        jScrollPane1.setViewportView(FacturasTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BuscarTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(BuscarBtn)
                        .addGap(74, 74, 74)
                        .addComponent(AgregarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ModificarBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 228, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarBtn)
                    .addComponent(ModificarBtn)
                    .addComponent(BuscarBtn)
                    .addComponent(BuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarBtnActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(pnPrincipal,new PnDetFacturacion());
    }//GEN-LAST:event_AgregarBtnActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void BuscarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JTextField BuscarTextField;
    private javax.swing.JTable FacturasTable;
    private javax.swing.JButton ModificarBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
