
package Unidad_11.Tarea_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Hckr
 */
public class ConvertidorTemperatura extends javax.swing.JFrame {

    private static final String listSalida[] = {"Centigrados", "Fahrenheit", "Kelvin"};
    private Celsius celsius = new Celsius();
    private Kelvin kelvin = new Kelvin();
    private Fahrenheit fahrenheit = new Fahrenheit();
    /**
     * Creates new form ConvertidorTemperatura
     */
    public ConvertidorTemperatura() {
        initComponents();
        btnGroup();
        addCbSalida();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEntrada = new javax.swing.ButtonGroup();
        bgSalida = new javax.swing.ButtonGroup();
        bgpeEntrada = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        pConvertidor = new javax.swing.JPanel();
        pEntrada = new javax.swing.JPanel();
        rbpeCentigrados = new javax.swing.JRadioButton();
        rbpeFahrenheit = new javax.swing.JRadioButton();
        rbpeKelvin = new javax.swing.JRadioButton();
        pSalida = new javax.swing.JPanel();
        cbSalida = new javax.swing.JComboBox<>();
        pTemperatura = new javax.swing.JPanel();
        txtTemperatura = new javax.swing.JTextField();
        lbResultado = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenuItem();
        mConvertidor = new javax.swing.JMenu();
        mEntrada = new javax.swing.JMenu();
        rbeCentigrados = new javax.swing.JRadioButtonMenuItem();
        rbeFahrenheit = new javax.swing.JRadioButtonMenuItem();
        rbeKelvin = new javax.swing.JRadioButtonMenuItem();
        mSalida = new javax.swing.JMenu();
        rbsCentigrados = new javax.swing.JRadioButtonMenuItem();
        rbsFahrenheit = new javax.swing.JRadioButtonMenuItem();
        rbsKelvin = new javax.swing.JRadioButtonMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de Temperatura");
        setMaximumSize(new java.awt.Dimension(736, 241));
        setMinimumSize(new java.awt.Dimension(736, 241));

        pConvertidor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Convertidor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        pEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Entrada"));
        pEntrada.setPreferredSize(new java.awt.Dimension(200, 150));

        rbpeCentigrados.setText("Centigrados");
        rbpeCentigrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpeCentigradosActionPerformed(evt);
            }
        });

        rbpeFahrenheit.setText("Fahrenheit");
        rbpeFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpeFahrenheitActionPerformed(evt);
            }
        });

        rbpeKelvin.setText("Kelvin");
        rbpeKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpeKelvinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEntradaLayout = new javax.swing.GroupLayout(pEntrada);
        pEntrada.setLayout(pEntradaLayout);
        pEntradaLayout.setHorizontalGroup(
            pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbpeKelvin, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbpeFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbpeCentigrados, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap())
        );
        pEntradaLayout.setVerticalGroup(
            pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntradaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbpeCentigrados, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(rbpeFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(rbpeKelvin, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pSalida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Salida"));
        pSalida.setPreferredSize(new java.awt.Dimension(200, 150));

        cbSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSalidaLayout = new javax.swing.GroupLayout(pSalida);
        pSalida.setLayout(pSalidaLayout);
        pSalidaLayout.setHorizontalGroup(
            pSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSalida, 0, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        pSalidaLayout.setVerticalGroup(
            pSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSalidaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Temperatura"));
        pTemperatura.setPreferredSize(new java.awt.Dimension(222, 150));

        txtTemperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemperaturaKeyPressed(evt);
            }
        });

        lbResultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultado.setText("Resultado");
        lbResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTemperaturaLayout = new javax.swing.GroupLayout(pTemperatura);
        pTemperatura.setLayout(pTemperaturaLayout);
        pTemperaturaLayout.setHorizontalGroup(
            pTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTemperaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTemperaturaLayout.createSequentialGroup()
                        .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pTemperaturaLayout.createSequentialGroup()
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lbResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pTemperaturaLayout.setVerticalGroup(
            pTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTemperaturaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConvertir)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pConvertidorLayout = new javax.swing.GroupLayout(pConvertidor);
        pConvertidor.setLayout(pConvertidorLayout);
        pConvertidorLayout.setHorizontalGroup(
            pConvertidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConvertidorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(pSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(pTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pConvertidorLayout.setVerticalGroup(
            pConvertidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConvertidorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(pConvertidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        mArchivo.setMnemonic('A');
        mArchivo.setText("Archivo");

        jMenuItem1.setText("Acerca de...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mArchivo.add(jMenuItem1);

        mSalir.setMnemonic('S');
        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mArchivo.add(mSalir);
        mSalir.getAccessibleContext().setAccessibleName("");

        Menu.add(mArchivo);
        mArchivo.getAccessibleContext().setAccessibleName("");

        mConvertidor.setMnemonic('C');
        mConvertidor.setText("Convertidor");

        mEntrada.setMnemonic('E');
        mEntrada.setText("Entrada");

        rbeCentigrados.setMnemonic('G');
        rbeCentigrados.setSelected(true);
        rbeCentigrados.setText("Centigrados");
        rbeCentigrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbeCentigradosActionPerformed(evt);
            }
        });
        mEntrada.add(rbeCentigrados);

        rbeFahrenheit.setMnemonic('F');
        rbeFahrenheit.setSelected(true);
        rbeFahrenheit.setText("Fahrenheit");
        rbeFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbeFahrenheitActionPerformed(evt);
            }
        });
        mEntrada.add(rbeFahrenheit);

        rbeKelvin.setMnemonic('K');
        rbeKelvin.setSelected(true);
        rbeKelvin.setText("Kelvin");
        rbeKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbeKelvinActionPerformed(evt);
            }
        });
        mEntrada.add(rbeKelvin);

        mConvertidor.add(mEntrada);

        mSalida.setMnemonic('A');
        mSalida.setText("Salida");

        rbsCentigrados.setMnemonic('G');
        rbsCentigrados.setSelected(true);
        rbsCentigrados.setText("Centigrados");
        rbsCentigrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsCentigradosActionPerformed(evt);
            }
        });
        mSalida.add(rbsCentigrados);

        rbsFahrenheit.setMnemonic('F');
        rbsFahrenheit.setSelected(true);
        rbsFahrenheit.setText("Fahrenheit");
        rbsFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsFahrenheitActionPerformed(evt);
            }
        });
        mSalida.add(rbsFahrenheit);

        rbsKelvin.setMnemonic('K');
        rbsKelvin.setSelected(true);
        rbsKelvin.setText("Kelvin");
        rbsKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsKelvinActionPerformed(evt);
            }
        });
        mSalida.add(rbsKelvin);

        mConvertidor.add(mSalida);

        Menu.add(mConvertidor);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pConvertidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pConvertidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void rbeCentigradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbeCentigradosActionPerformed
        // TODO add your handling code here:
        rdmControlEntradaSelected();
    }//GEN-LAST:event_rbeCentigradosActionPerformed

    private void rbeFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbeFahrenheitActionPerformed
        // TODO add your handling code here:
        rdmControlEntradaSelected();
    }//GEN-LAST:event_rbeFahrenheitActionPerformed

    private void rbeKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbeKelvinActionPerformed
        // TODO add your handling code here:
        rdmControlEntradaSelected();
    }//GEN-LAST:event_rbeKelvinActionPerformed

    private void rbpeKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpeKelvinActionPerformed
        // TODO add your handling code here:
        rdpControlEntradaSelected();
    }//GEN-LAST:event_rbpeKelvinActionPerformed

    private void rbpeFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpeFahrenheitActionPerformed
        // TODO add your handling code here:
        rdpControlEntradaSelected();
    }//GEN-LAST:event_rbpeFahrenheitActionPerformed

    private void rbpeCentigradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpeCentigradosActionPerformed
        // TODO add your handling code here:
        rdpControlEntradaSelected();
    }//GEN-LAST:event_rbpeCentigradosActionPerformed

    private void rbsCentigradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsCentigradosActionPerformed
        // TODO add your handling code here:
        rdmControlSalidaSelected();
    }//GEN-LAST:event_rbsCentigradosActionPerformed

    private void rbsFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsFahrenheitActionPerformed
        // TODO add your handling code here:
        rdmControlSalidaSelected();
    }//GEN-LAST:event_rbsFahrenheitActionPerformed

    private void rbsKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsKelvinActionPerformed
        // TODO add your handling code here:
        rdmControlSalidaSelected();
    }//GEN-LAST:event_rbsKelvinActionPerformed

    private void cbSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalidaActionPerformed
        // TODO add your handling code here:
        cbControlSalidaSelected();
    }//GEN-LAST:event_cbSalidaActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
        calcularConversion();
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtTemperaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperaturaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            calcularConversion();
        }
    }//GEN-LAST:event_txtTemperaturaKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, """
                                            Tarea Unidad 11 - Convertidor de temperatura
                                                             Usando JavaSwing
                                                        © Gabriel Caballero 2023
                                            """);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.ButtonGroup bgEntrada;
    private javax.swing.ButtonGroup bgSalida;
    private javax.swing.ButtonGroup bgpeEntrada;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cbSalida;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mConvertidor;
    private javax.swing.JMenu mEntrada;
    private javax.swing.JMenu mSalida;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JPanel pConvertidor;
    private javax.swing.JPanel pEntrada;
    private javax.swing.JPanel pSalida;
    private javax.swing.JPanel pTemperatura;
    private javax.swing.JRadioButtonMenuItem rbeCentigrados;
    private javax.swing.JRadioButtonMenuItem rbeFahrenheit;
    private javax.swing.JRadioButtonMenuItem rbeKelvin;
    private javax.swing.JRadioButton rbpeCentigrados;
    private javax.swing.JRadioButton rbpeFahrenheit;
    private javax.swing.JRadioButton rbpeKelvin;
    private javax.swing.JRadioButtonMenuItem rbsCentigrados;
    private javax.swing.JRadioButtonMenuItem rbsFahrenheit;
    private javax.swing.JRadioButtonMenuItem rbsKelvin;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables

    private void btnGroup(){
       //rbGroupText.add(rbSimple);
       //RadioButtonGroup MenuEntrada
       bgEntrada.add(rbeCentigrados);
       bgEntrada.add(rbeFahrenheit);
       bgEntrada.add(rbeKelvin);
       
       //RadioButtonGroup MenuSalida
       bgSalida.add(rbsCentigrados);
       bgSalida.add(rbsFahrenheit);
       bgSalida.add(rbsKelvin);
       
       //RadioButtonGroup PanelEntrada
       bgpeEntrada.add(rbpeCentigrados);
       bgpeEntrada.add(rbpeFahrenheit);
       bgpeEntrada.add(rbpeKelvin);
       
       rbpeCentigrados.setSelected(true);
       cbSalida.setSelectedItem(rbsCentigrados.getText());
    }
    
    private void addCbSalida(){
        for(int i=0; i < listSalida.length; i++){
            cbSalida.addItem(listSalida[i]);
        }
    }
    
    private void rdpControlEntradaSelected(){
        if(rbpeCentigrados.isSelected()){
            rbeCentigrados.setSelected(true);
            return;
        }
        
        if(rbpeFahrenheit.isSelected()){
            rbeFahrenheit.setSelected(true);
            return;
        }
        
        if(rbpeKelvin.isSelected()){
            rbeKelvin.setSelected(true);
            return;
        }            
    }
    
    private void rdmControlEntradaSelected(){
        if(rbeCentigrados.isSelected()){
            rbpeCentigrados.setSelected(true);
            return;
        }
        
        if(rbeFahrenheit.isSelected()){
            rbpeFahrenheit.setSelected(true);
            return;
        }
        
        if(rbeKelvin.isSelected()){
            rbpeKelvin.setSelected(true);
            return;
        }
    }
    
    private void rdmControlSalidaSelected(){
        if(rbsCentigrados.isSelected()){
            cbSalida.setSelectedItem(rbsCentigrados.getText());
            return;
        }
        
        if(rbsFahrenheit.isSelected()){
            cbSalida.setSelectedItem(rbsFahrenheit.getText());
            return;
        }
        
        if(rbsKelvin.isSelected()){
            cbSalida.setSelectedItem(rbsKelvin.getText());
            return;
        }
    }
    
    private void cbControlSalidaSelected(){
        String cbSelected = cbSalida.getSelectedItem().toString();
        
        if(cbSelected.equals(rbsCentigrados.getText())){
            rbsCentigrados.setSelected(true);
            return;
        }
        
        if(cbSelected.equals(rbsFahrenheit.getText())){
            rbsFahrenheit.setSelected(true);
            return;
        }
        
        if(cbSelected.equals(rbsKelvin.getText())){
            rbsKelvin.setSelected(true);
            return;
        }
    }
    
    private void calcularConversion(){ 
        String cbSelected = cbSalida.getSelectedItem().toString().toLowerCase();
        Double numero;
        if(!txtTemperatura.getText().isEmpty()){
            numero = Double.valueOf(txtTemperatura.getText().replaceAll(",","."));
        }else{
            JOptionPane.showMessageDialog(ConvertidorTemperatura.this, "No debe dejar vacio el campo a calcular", "Error!", JOptionPane.ERROR_MESSAGE);
            txtTemperatura.requestFocus();
            return;
        }
        
        //calculate celsius to kelvin || kelvin to celsius
        if(rbpeCentigrados.isSelected() && cbSelected.equals("kelvin")){
           lbResultado.setText(celsius.convertCelsiusKelvin(numero) + " K.");
           return;
        }else if(rbpeKelvin.isSelected() && cbSelected.equals("centigrados")){
           lbResultado.setText(kelvin.convertKelvinCelsius(numero)+ " °C.");
           return;
        }
        
        //calculate celsius to fahrenheit || fahrenheit to celsius
        if(rbpeCentigrados.isSelected() && cbSelected.equals("fahrenheit")){
           lbResultado.setText(celsius.convertCelsiusFahrenheit(numero) + " °F");
           return;
        }else if(rbpeFahrenheit.isSelected() && cbSelected.equals("centigrados")){
            lbResultado.setText(fahrenheit.convertFahrenheitCelsius(numero) + " °C.");
            return;
        }
        
        //calculate fahrenheit to kelvin || kelvin to fahrenheit
        if(rbpeFahrenheit.isSelected() && cbSelected.equals("kelvin")){
           lbResultado.setText(fahrenheit.convertFahrenheitKelvin(numero) + " K.");
           return;
        }else if(rbpeKelvin.isSelected() && cbSelected.equals("fahrenheit")){
            lbResultado.setText(kelvin.convertKelvinFahrenheit(numero) + " °F");
            return;
        }
        
        //Show error message if they're equals
        showMessageError();
    }
            
    private void showMessageError(){       
        if(rbpeCentigrados.getText().equals(cbSalida.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(ConvertidorTemperatura.this, "Debe seleccionar una entrada y una salida distintas", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(rbpeFahrenheit.getText().equals(cbSalida.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(ConvertidorTemperatura.this, "Debe seleccionar una entrada y una salida distintas", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
                
        if(rbpeKelvin.getText().equals(cbSalida.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(ConvertidorTemperatura.this, "Debe seleccionar una entrada y una salida distintas", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
