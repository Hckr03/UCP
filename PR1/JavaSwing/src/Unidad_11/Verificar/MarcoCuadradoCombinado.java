
package Unidad_11.Verificar;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Hckr
 */
public class MarcoCuadradoCombinado extends javax.swing.JFrame {

    private static final String nombres[]
            = {"insecto1.gif",
               "insecto2.gif",
               "insectviaje.gif",
               "insectanim.gif"};
    private final Icon iconos[] ={
        new ImageIcon(getClass().getResource(nombres[0])),
        new ImageIcon(getClass().getResource(nombres[1])),
        new ImageIcon(getClass().getResource(nombres[2])),
        new ImageIcon(getClass().getResource(nombres[3]))
    };
    
    public MarcoCuadradoCombinado() {
        initComponents();
        
        cbImagenes.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                Etiqueta.setIcon(iconos[cbImagenes.getSelectedIndex()]);
//                Etiqueta.setIcon(new ImageIcon(getClass().getResource(cbImagenes.getSelectedItem().toString()))); //es otra forma de seleccionar la posicion
            }
        });
    }
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbImagenes = new javax.swing.JComboBox<>();
        Etiqueta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbImagenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "insecto1.gif", "insecto2.gif", "insectviaje.gif", "insectanim.gif" }));
        cbImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbImagenesActionPerformed(evt);
            }
        });

        Etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unidad_11/img/insecto1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Etiqueta)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Etiqueta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cbImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbImagenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbImagenesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JComboBox<String> cbImagenes;
    // End of variables declaration//GEN-END:variables
}
