/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JAddNewServer.java
 *
 * Created on Aug 12, 2009, 3:31:00 PM
 */

package interfacebeans;
import javax.swing.*;
import java.util.*;
import utilities.Server;
import bayes.DoCGI;
import utilities.DisplayText;

import java.awt.MouseInfo;
import bayes.ApplicationConstants;
/**
 *
 * @author apple
 */
public class JAddNewServer extends javax.swing.JDialog {
    public  static final boolean modal      = true;
    public  static final JFrame parent      =  null;
    private static   JAddNewServer instance = new  JAddNewServer();
    private Server   server                 =  new Server("");
    private List <Server>  exsistingServers =  new Vector<Server>();

    private JAddNewServer() {
           super(parent, modal);
           initComponents();
    }

   public static  JAddNewServer getInstance(){

        if (instance == null ){instance = new JAddNewServer();}
        return instance;
    }
      public static  JAddNewServer showDialog(){
        return showDialog (new Vector<Server>());
    }
      public static  JAddNewServer showDialog( List <Server>  curServers){
        JAddNewServer anInstance =   JAddNewServer.getInstance();

        anInstance.reset();
        anInstance.setLocation(MouseInfo.getPointerInfo().getLocation());
        anInstance.setExsistingServers(curServers);
        anInstance.setVisible(true);

        return anInstance;
    }
      private void reset(){
        Server tmp = new Server("");
        getServerNameTextField().setText(tmp.getName());
        getPortTextField()      .setValue(tmp.getPort());

        setServer(null);


      }

      private void close(){

        this.setVisible(false);
      }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        portTextField = new javax.swing.JFormattedTextField();
        serverNameTextField = new javax.swing.JFormattedTextField();
        serverLabel = new javax.swing.JLabel();
        serverLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Server"); // NOI18N
        setName("Form"); // NOI18N

        portTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0"))));
        portTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        portTextField.setName("portTextField"); // NOI18N
        portTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                portTextFieldPropertyChange(evt);
            }
        });

        serverNameTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        serverNameTextField.setName("serverNameTextField"); // NOI18N

        serverLabel.setText("Server");
        serverLabel.setName("serverLabel"); // NOI18N

        serverLabel1.setText("Port");
        serverLabel1.setName("serverLabel1"); // NOI18N

        closeButton.setText("Close");
        closeButton.setName("closeButton"); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.setName("addButton"); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(closeButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(addButton))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(serverLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(serverLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(portTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(serverNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(26, 26, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {serverLabel, serverLabel1}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.linkSize(new java.awt.Component[] {portTextField, serverNameTextField}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(serverNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(serverLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(portTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(serverLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(closeButton)
                    .add(addButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed

        close();
    }//GEN-LAST:event_closeButtonActionPerformed
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name =  getServerNameTextField().getText().trim();
        int port    = ( (Number)(getPortTextField().getValue())).intValue();
        Server srv  =   new Server(name);
        srv.setPort(port);

        boolean isDuplicate  = getExsistingServers().contains(srv);
        if (isDuplicate){
            String error = String.format(   "Server %s\n" +
                                            "already has been set.\n" +
                                            "No dupicate servers are allowed.", srv);
            DisplayText.popupErrorMessage(error);
            return;
        }



        String url  =   srv.getSystemURL();///launch.jnlp";
        boolean isConnected  = false;
        try{
            isConnected =  DoCGI.connectToURL(url);
        }
        catch( Exception exp){
            exp.printStackTrace();
            isConnected = false;
        }
        
        if (isConnected) {
            setServer(srv);
            close();
        }
        else{
          String error = String.format("Can not establish connection to URL\n" +
                                          "%s\n" +
                                          "Server is not added.\n"  ,   url );


            DisplayText.popupErrorMessage(error);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void portTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_portTextFieldPropertyChange
        if (evt.getPropertyName().equals("value")){
            int aport =  ((Number) getPortTextField().getValue()).intValue();

            // don't allow value of 80
            if (aport == 80){
                utilities.DisplayText.popupMessage( "Port number 80 is reserved for \n" +
                                                    "regular http server requests.\n" +
                                                    "Please assign different value.");
                aport =8080;
                getPortTextField().setValue(aport);
            }

        }
    }//GEN-LAST:event_portTextFieldPropertyChange

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JAddNewServer dialog =  JAddNewServer.showDialog();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JFormattedTextField portTextField;
    private javax.swing.JLabel serverLabel;
    private javax.swing.JLabel serverLabel1;
    private javax.swing.JFormattedTextField serverNameTextField;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getAddButton() {
        return addButton;
    }
    public javax.swing.JButton getCloseButton() {
        return closeButton;
    }
    public javax.swing.JFormattedTextField getPortTextField() {
        return portTextField;
    }
    public javax.swing.JLabel getServerLabel() {
        return serverLabel;
    }
    public javax.swing.JLabel getServerLabel1() {
        return serverLabel1;
    }
    public javax.swing.JFormattedTextField getServerNameTextField() {
        return serverNameTextField;
    }

    public Server                   getServer() {
        return server;
    }
    public void                     setServer(Server server) {
        this.server = server;
    }

    public List<Server>             getExsistingServers() {
        return exsistingServers;
    }
    public void                     setExsistingServers(List<Server> exsistingServers) {
        this.exsistingServers = exsistingServers;
    }

}
