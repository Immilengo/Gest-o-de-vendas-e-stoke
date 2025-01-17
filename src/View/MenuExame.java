/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IMMilengo
 */
public class MenuExame extends javax.swing.JFrame {

    /**
     * Creates new form MenuExame
     */
    public MenuExame() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelaexame = new javax.swing.JTable();
        Botaoexame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jprazo = new javax.swing.JSpinner();
        jselecionar = new javax.swing.JComboBox<>();
        bconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exame");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tabelaexame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Data de Cadstro", "Data do Prazo"
            }
        ));
        jScrollPane1.setViewportView(Tabelaexame);

        Botaoexame.setText("Verificar Prazo");
        Botaoexame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoexameActionPerformed(evt);
            }
        });

        jLabel1.setText("Produtos que expirarão em :");

        jselecionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Dias", "Meses", "Anos" }));

        bconsultar.setText("Ordem Alfabética");
        bconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bconsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jprazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jselecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botaoexame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jprazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jselecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botaoexame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bconsultar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoexameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoexameActionPerformed
        // TODO add your handling code here:
       String criterio=jselecionar.getSelectedItem().toString();
       int prazo=Integer.parseInt(jprazo.getValue().toString());
         String novo[]=new String[3];
         int datavalidade;
          int datactual;
        try(BufferedReader ler=new BufferedReader(new FileReader("Stoke.txt"))) {
            String linha;
            DefaultTableModel dtm=(DefaultTableModel) Tabelaexame.getModel();
            dtm.setRowCount(0);

            LocalDate dia=LocalDate.now();
           String data=dia.toString();
          // int dataactual;
           String partir[]=data.split("-");
            while((linha=ler.readLine())!=null){
              
            String dividir[]=linha.split(";");
            String divactual[]=dividir[5].split("-");
         
             if(criterio=="Dias"){    
           datavalidade=(Integer.parseInt(divactual[2])*365)+(Integer.parseInt(divactual[1])*31)+Integer.parseInt(divactual[0]);
           datactual=(Integer.parseInt(partir[0])*365)+(Integer.parseInt(partir[1])*31)+Integer.parseInt(partir[2]);
          
         
           novo[0]=dividir[0];
           novo[1]=dividir[4];
           novo[2]=dividir[5];  
           int d=datavalidade-datactual;
           
          
           if(d<=prazo){ dtm.addRow(novo); }
            }else if(criterio=="Meses"){
                datavalidade=(Integer.parseInt(divactual[2])*12)+(Integer.parseInt(divactual[1]));
                 datactual=(Integer.parseInt(partir[0])*12)+(Integer.parseInt(partir[1]));
                 
           novo[0]=dividir[0];
           novo[1]=dividir[4];
           novo[2]=dividir[5];  
           int d=datavalidade-datactual;
           
          
           if(d<=prazo){ dtm.addRow(novo);}
                 
                 
            }else if(criterio=="Anos"){
                datavalidade=Integer.parseInt(divactual[2]);
                 datactual=Integer.parseInt(partir[0]);
                  novo[0]=dividir[0];
           novo[1]=dividir[4];
           novo[2]=dividir[5];  
           int d=datavalidade-datactual;
           
          
           if(d<=prazo){ dtm.addRow(novo);}
                 
                 
            }else{
            JOptionPane.showMessageDialog(rootPane, "Seleciona um critério de Controle de Prazo de Validade");
            }
            
            }
            ler.close();
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(rootPane, "Erro");
        }
        
        
    }//GEN-LAST:event_BotaoexameActionPerformed

    private void bconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconsultarActionPerformed
        // TODO add your handling code here:
        ArrayList<String> lista=new ArrayList();
        try {
            BufferedReader ler=new BufferedReader(new FileReader("Historico.txt"));
            String linha;
            while((linha=ler.readLine())!=null){
            lista.add(linha);
            }
            Collections.sort(lista);
            for(String linhas:lista){
                System.out.println(linhas);
            }
            
            ler.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bconsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MenuExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuExame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botaoexame;
    private javax.swing.JTable Tabelaexame;
    private javax.swing.JButton bconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jprazo;
    private javax.swing.JComboBox<String> jselecionar;
    // End of variables declaration//GEN-END:variables
}
