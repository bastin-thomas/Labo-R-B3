/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import JMailLib.UtilityLib;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author student
 */
public class OpenMail extends javax.swing.JFrame {
    private Message message;
    /**
     * Creates new form OpenMail
     */
    public OpenMail(Message m) throws MessagingException, IOException {        
        initComponents();
        message = m;
        
        if(message == null){this.dispose();}
        
        List<String> File = new ArrayList<String>();
        
        String msg = UtilityLib.getTextFromMessage(message, File);
        
        From.setText(UtilityLib.convertAddress(message.getFrom()));
        To.setText(UtilityLib.convertAddress(message.getRecipients(javax.mail.Message.RecipientType.TO)));
        Cc.setText(UtilityLib.convertAddress(message.getRecipients(javax.mail.Message.RecipientType.CC)));
        Subject.setText(message.getSubject());
        this.setTitle(message.getSubject());
        
        Message.setText(msg);
        
        if(File.size() != 0){
            DefaultComboBoxModel aModel= new DefaultComboBoxModel();
            Iterator i = File.iterator();
            while(i.hasNext()){
                String s = (String) i.next();
                aModel.addElement(s);
            }
            jComboBox1.setModel(aModel);
            
            Save.setEnabled(true);
            jComboBox1.setEnabled(true);
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

        jScrollPane6 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        From = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Subject = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Cc = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        To = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        Message = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        More = new javax.swing.JButton();

        jScrollPane6.setViewportView(jEditorPane1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("From :");

        jLabel2.setText("To :");

        jLabel3.setText("Cc :");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        From.setEditable(false);
        From.setFocusCycleRoot(false);
        From.setFocusable(false);
        jScrollPane1.setViewportView(From);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Subject.setEditable(false);
        Subject.setFocusCycleRoot(false);
        Subject.setFocusable(false);
        jScrollPane3.setViewportView(Subject);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Cc.setEditable(false);
        Cc.setFocusCycleRoot(false);
        Cc.setFocusable(false);
        jScrollPane4.setViewportView(Cc);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        To.setEditable(false);
        To.setFocusCycleRoot(false);
        To.setFocusable(false);
        jScrollPane5.setViewportView(To);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Message.setEditable(false);
        Message.setColumns(20);
        Message.setLineWrap(true);
        Message.setRows(5);
        Message.setWrapStyleWord(true);
        Message.setFocusable(false);
        jScrollPane8.setViewportView(Message);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Attachement" }));
        jComboBox1.setEnabled(false);

        jLabel4.setText("Attatchement :");

        Save.setText("Enregistrer");
        Save.setEnabled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        More.setText("MoreInfo");
        More.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, 515, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(More)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Save)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save)
                    .addComponent(More, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        int r = -1;
        
        String Name = (String) jComboBox1.getSelectedItem();
        String extension = Name;
        
        String[] se = extension.split("\\.");
        extension = se[se.length-1];
        
        
        //Creation d'un file Chooser avec un Filtre + Nom Auto
        JFileChooser fc = new JFileChooser((FileSystemView.getFileSystemView().getHomeDirectory() + "/Bureau/"));
        fc.setMultiSelectionEnabled(false);
        
        //Permet de mettre un nom par défaut
        fc.setSelectedFile(new File(se[0]));
        
        //Reset des Filtres
        fc.resetChoosableFileFilters();
        
        //Creation d'un filtre sur base de l'extension existante
        FileNameExtensionFilter filter = new FileNameExtensionFilter(extension, extension);
        fc.setFileFilter(filter);
        fc.showSaveDialog(this);
        
        //File Path to Save
        String Path = fc.getSelectedFile().getAbsolutePath() + "." + filter.getExtensions()[0];
        
        Save.setEnabled(false);
        Save.setText("Downlaoding...");
        
        if(JFileChooser.APPROVE_OPTION == 0){
            try {
                //Redirection du fichier sélectionner du message Correspondant, au path demander.
                UtilityLib.saveFileTo(Path,(String) jComboBox1.getSelectedItem(), message);
            } catch (MessagingException | IOException ex) {
                JOptionPane.showMessageDialog(this, "Erreur: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        Save.setEnabled(true);
        Save.setText("Enregistrer");
        System.out.println("Enregistrement Réussi: " + Path);
    }//GEN-LAST:event_SaveActionPerformed

    private void MoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoreActionPerformed
        OpenMoreInfoMail window;
        try {
            window = new OpenMoreInfoMail(this, true, message);
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(this, "Erreur: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        window.setVisible(true);
    }//GEN-LAST:event_MoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Cc;
    private javax.swing.JTextPane From;
    private javax.swing.JTextArea Message;
    private javax.swing.JButton More;
    private javax.swing.JButton Save;
    private javax.swing.JTextPane Subject;
    private javax.swing.JTextPane To;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
