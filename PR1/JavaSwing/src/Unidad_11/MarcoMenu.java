
package Unidad_11;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Hckr
 */
public class MarcoMenu extends javax.swing.JFrame {

    private final Color valoresColores[]
            = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private final JRadioButtonMenuItem elementosColores[];
    private final JRadioButtonMenuItem fuentes[];
    private final JCheckBoxMenuItem elementosEstilos[];
    private final ButtonGroup fuentesButtonGroup;
    private final ButtonGroup coloresButtonGroup;
    private int estilo;
    
    /**
     * Creates new form MarcoMenu
     */
    public MarcoMenu() {
        initComponents();
        String colores[] = {"Negro", "Azul", "Rojo", "Verde"};
        elementosColores = new JRadioButtonMenuItem[colores.length];
        coloresButtonGroup = new ButtonGroup();
        ManejadorElementos manejadorElmentos = new ManejadorElementos();
        
        for(int cuenta = 0; cuenta < colores.length; cuenta++){
            elementosColores[cuenta]
                    = new JRadioButtonMenuItem(colores[cuenta]);
            mColor.add(elementosColores[cuenta]);
            coloresButtonGroup.add(elementosColores[cuenta]);
            elementosColores[cuenta].addActionListener(manejadorElmentos);
        }
        elementosColores[0].setSelected(true);
        
        String nombresFuentes[] = {"Serif", "Monospaced", "SansSerif"};
        
        fuentes = new JRadioButtonMenuItem[nombresFuentes.length];
        fuentesButtonGroup = new ButtonGroup();
        
        for(int cuenta = 0; cuenta < fuentes.length; cuenta++){
            fuentes[cuenta] = new JRadioButtonMenuItem(nombresFuentes[cuenta]);
            mFuente.add(fuentes[cuenta]);
            fuentesButtonGroup.add(fuentes[cuenta]);
            fuentes[cuenta].addActionListener(manejadorElmentos);
        }
        fuentes[0].setSelected(true);
        mFuente.addSeparator();
        
        String nombresEstilos[] = {"Negrita", "Cursiva"};
        elementosEstilos = new JCheckBoxMenuItem[nombresEstilos.length];
        ManejadorEstilos manejadorEstilos = new ManejadorEstilos();
        
        for(int cuenta = 0; cuenta < nombresEstilos.length; cuenta++){
            elementosEstilos[cuenta] = new JCheckBoxMenuItem(nombresEstilos[cuenta]);
            mFuente.add(elementosEstilos[cuenta]);
            elementosEstilos[cuenta].addItemListener(manejadorEstilos);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPanel = new javax.swing.JPanel();
        lEtiqueta = new javax.swing.JLabel();
        mbMenu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miAcerca = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();
        mFormato = new javax.swing.JMenu();
        mColor = new javax.swing.JMenu();
        mFuente = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Panel"));

        lEtiqueta.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        lEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lEtiqueta.setText("Texto de ejemplo");

        javax.swing.GroupLayout pPanelLayout = new javax.swing.GroupLayout(pPanel);
        pPanel.setLayout(pPanelLayout);
        pPanelLayout.setHorizontalGroup(
            pPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
        pPanelLayout.setVerticalGroup(
            pPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEtiqueta)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        mArchivo.setMnemonic('A');
        mArchivo.setText("Archivo");

        miAcerca.setMnemonic('c');
        miAcerca.setText("Acerca de...");
        miAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaActionPerformed(evt);
            }
        });
        mArchivo.add(miAcerca);

        miSalir.setMnemonic('S');
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        mbMenu.add(mArchivo);

        mFormato.setMnemonic('F');
        mFormato.setText("Formato");

        mColor.setMnemonic('C');
        mColor.setText("Color");
        mFormato.add(mColor);

        mFuente.setMnemonic('U');
        mFuente.setText("Fuente");
        mFormato.add(mFuente);

        mbMenu.add(mFormato);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaActionPerformed
        JOptionPane.showMessageDialog(MarcoMenu.this, 
                "Este es un ejemplo\ndel uso de menus", 
                "Acerca de", 
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_miAcercaActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lEtiqueta;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mColor;
    private javax.swing.JMenu mFormato;
    private javax.swing.JMenu mFuente;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miAcerca;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel pPanel;
    // End of variables declaration//GEN-END:variables

    private class ManejadorElementos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int cuenta = 0; cuenta <elementosColores.length; cuenta++){
                if(elementosColores[cuenta].isSelected()){
                    lEtiqueta.setForeground(valoresColores[cuenta]);
                    break;
                }
            }
            
            for (int cuenta = 0; cuenta <fuentes.length; cuenta++){
                if(e.getSource() == fuentes[cuenta]){
                    lEtiqueta.setFont(new Font(fuentes[cuenta].getText(), estilo, 48));
                    break;
                }
            }
        }
    }
    
    private class ManejadorEstilos implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            estilo = 0;
            if(elementosEstilos[0].isSelected()){
                estilo += Font.BOLD;
            }
            
            if(elementosEstilos[1].isSelected()){
                estilo += Font.ITALIC;
            }
            lEtiqueta.setFont(new Font(lEtiqueta.getFont().getName(), estilo, 48));
        }
    }
}
