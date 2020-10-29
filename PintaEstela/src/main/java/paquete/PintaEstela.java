package paquete;

import java.awt.Color;

/**
 * @author Pablo
 */
public class PintaEstela extends javax.swing.JFrame {
    
    private int delay = 0;
    
    public PintaEstela() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new paquete.Lienzo();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JComboBox<>();
        pincel = new javax.swing.JComboBox<>();
        fondoText = new javax.swing.JLabel();
        cursorText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idiomaText = new javax.swing.JLabel();
        idioma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pablo Morales Gómez y Carlos Brito Pérez");
        setResizable(false);

        lienzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lienzo.setToolTipText("Pasa el ratón sobre el rectángulo para ver su estela");
        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lienzoMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecciona el Color"));

        fondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Cyan", "Rosa" }));
        fondo.setToolTipText("Selecciona el color de fondo para el lienzo");
        fondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoActionPerformed(evt);
            }
        });

        pincel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Rojo", "Azul" }));
        pincel.setToolTipText("Selecciona el color del cursor cuando pasa sobre el cuadrado");
        pincel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincelActionPerformed(evt);
            }
        });

        fondoText.setText("Fondo");

        cursorText.setText("Cursor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cursorText, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(fondoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pincel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fondoText)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cursorText)
                    .addComponent(pincel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("Carlos Brito Pérez");

        jLabel2.setText("Pablo Morales Gómez");

        idiomaText.setText("Idioma");

        idioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "English" }));
        idioma.setToolTipText("Selecciona el idoma");
        idioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(idiomaText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idiomaText)
                            .addComponent(idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoActionPerformed
        lienzo.paintLienzo(fondo.getSelectedIndex());
    }//GEN-LAST:event_fondoActionPerformed

    private void pincelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincelActionPerformed
        lienzo.paintPincel(pincel.getSelectedIndex());
    }//GEN-LAST:event_pincelActionPerformed

    private void lienzoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseMoved
        if(delay < 10){
            delay++;
        }else{
            lienzo.setCoordinates(evt.getX(), evt.getY());
            delay = 0;
        }
    }//GEN-LAST:event_lienzoMouseMoved

    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
        if(delay < 10){
            delay++;
        }else{
            lienzo.setCoordinates(evt.getX(), evt.getY());
            delay = 0;
        }
    }//GEN-LAST:event_lienzoMouseDragged

    private void idiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomaActionPerformed
        if(idioma.getSelectedIndex() == 1){
            idiomaText.setText("Language");
            fondoText.setText("Background");
            
            fondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Cyan", "Rose" }));
            pincel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "Red", "Blue" }));
            
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose the Colour"));
            
            pincel.setToolTipText("Choose the colour of the trail");
            fondo.setToolTipText("Choose the colour of the background");
            lienzo.setToolTipText("Move the mouse over the area to see the trail");
            idioma.setToolTipText("Choose the language");
        }else{
            idiomaText.setText("Idioma");
            fondoText.setText("Fondo");
            
            fondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Cyan", "Rosa" }));
            pincel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Rojo", "Azul" }));
            
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecciona el Color"));
            
            pincel.setToolTipText("Selecciona el color del cursor cuando pasa sobre el cuadrado");
            fondo.setToolTipText("Selecciona el color de fondo para el lienzo");
            lienzo.setToolTipText("Pasa el ratón sobre el rectángulo para ver su estela");
            idioma.setToolTipText("Selecciona el idioma");
        }
    }//GEN-LAST:event_idiomaActionPerformed

    public static void main(String args[]) {
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PintaEstela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PintaEstela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PintaEstela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PintaEstela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PintaEstela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cursorText;
    private javax.swing.JComboBox<String> fondo;
    private javax.swing.JLabel fondoText;
    private javax.swing.JComboBox<String> idioma;
    private javax.swing.JLabel idiomaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private paquete.Lienzo lienzo;
    private javax.swing.JComboBox<String> pincel;
    // End of variables declaration//GEN-END:variables

}
