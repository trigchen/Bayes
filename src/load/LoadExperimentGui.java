/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoadExperimentGui.java
 *
 * Created on Oct 30, 2009, 10:31:50 AM
 */

package load;
import bayes.ApplicationPreferences;
import interfacebeans.FileNameInputVerifier;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import bayes.DirectoryManager;
import utilities.DisplayText;
/**
 *
 * @author apple
 */
public class LoadExperimentGui extends javax.swing.JDialog {
    private static  LoadExperimentGui instance;
    private File savedWorkDir               =   null;
    private boolean canceled                =   false;



    public static LoadExperimentGui getInstance(){
        if (instance == null){
            instance = new LoadExperimentGui();
        }
        return instance;

    }
    /** Creates new form LoadExperimentGui */
    private LoadExperimentGui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    private LoadExperimentGui() {

        this(new JFrame(),true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        savedExperimentFC = new javax.swing.JFileChooser();
        pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        saveDirTextField = new javax.swing.JTextField();
        loadButton = new javax.swing.JButton();
        changeDirButton = new javax.swing.JButton();
        workDirComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        setButton = new javax.swing.JButton();
        destinationWorkingDirTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        currentWorkingDirTextField = new javax.swing.JTextField();

        savedExperimentFC.setApproveButtonText("Set"); // NOI18N
        savedExperimentFC.setDialogTitle("Choose saved experiment"); // NOI18N
        savedExperimentFC.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Import Working Directory"); // NOI18N

        jLabel1.setText("Load to WorkDir"); // NOI18N

        saveDirTextField.setBackground(new java.awt.Color(204, 204, 204));
        saveDirTextField.setEditable(false);
        saveDirTextField.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nPath to the previously saved working directory. <br>\nThis directory must have binary  \"dir.info\" file present. <br>\nThe  \"dir.info\" file contains working directory information.<br>\nIf  \"dir.info\"  file is not present, directory loading will fail. <br>\n\n\n\n\n</font></p><html>"); // NOI18N
        saveDirTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray));

        loadButton.setText("Load"); // NOI18N
        loadButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nStart loading working directory. This button <br>\nis diabed if no working  directory to be loaded<br> \nis specified.\n\n\n\n\n</font></p><html>"); // NOI18N
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        changeDirButton.setText("Cancel"); // NOI18N
        changeDirButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nCancel loading working directory. <br>\n\n\n</font></p><html>"); // NOI18N
        changeDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDirButtonActionPerformed(evt);
            }
        });

        workDirComboBox.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nThis is a list of current working  directories.<br>\nYou can load previously saved analysis into <br> \nany of these directories, however, the present content <br>\nof the specified directory will be deleted.<br>\n\n\n</font></p><html>"); // NOI18N
        workDirComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                workDirComboBoxItemStateChanged(evt);
            }
        });

        jLabel3.setText("Load from WorkDir"); // NOI18N

        setButton.setText("Set"); // NOI18N
        setButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nNavigate and set a path to a working directory you <br>\nwish to load. Only a directory can be selected,<br>\nfiles are hidden. <br>\n\n\n\n</font></p><html>"); // NOI18N
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        destinationWorkingDirTextField.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nPath to the working directory into which<br>\npreviously stored analysis will be loaded.\n\n\n\n</font></p><html>"); // NOI18N
        destinationWorkingDirTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(192, 192, 192), new java.awt.Color(64, 64, 64), java.awt.Color.lightGray, new java.awt.Color(64, 64, 64)));
        destinationWorkingDirTextField.setInputVerifier(new FileNameInputVerifier());

        jLabel2.setText("Current WorkDir"); // NOI18N

        currentWorkingDirTextField.setBackground(new java.awt.Color(204, 204, 204));
        currentWorkingDirTextField.setEditable(false);
        currentWorkingDirTextField.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nCurrent working directory.<br>\nThis is displayed for information<br>\npurposes only.\n\n\n\n</font></p><html>"); // NOI18N
        currentWorkingDirTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(192, 192, 192), new java.awt.Color(64, 64, 64), java.awt.Color.lightGray, new java.awt.Color(64, 64, 64)));

        org.jdesktop.layout.GroupLayout paneLayout = new org.jdesktop.layout.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(paneLayout.createSequentialGroup()
                .addContainerGap()
                .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, paneLayout.createSequentialGroup()
                        .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(currentWorkingDirTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .add(destinationWorkingDirTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, saveDirTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(setButton)
                            .add(workDirComboBox, 0, 94, Short.MAX_VALUE)))
                    .add(paneLayout.createSequentialGroup()
                        .add(changeDirButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(loadButton)
                        .add(33, 33, 33)))
                .add(34, 34, 34))
        );

        paneLayout.linkSize(new java.awt.Component[] {jLabel1, jLabel2, jLabel3}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(paneLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .add(saveDirTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(setButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(destinationWorkingDirTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(workDirComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(paneLayout.createSequentialGroup()
                        .add(currentWorkingDirTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(paneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(changeDirButton)
                            .add(loadButton)))
                    .add(jLabel2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        paneLayout.linkSize(new java.awt.Component[] {jLabel1, jLabel2, jLabel3}, org.jdesktop.layout.GroupLayout.VERTICAL);

        paneLayout.linkSize(new java.awt.Component[] {currentWorkingDirTextField, destinationWorkingDirTextField, saveDirTextField, setButton, workDirComboBox}, org.jdesktop.layout.GroupLayout.VERTICAL);

        getContentPane().add(pane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        load();
        close();
}//GEN-LAST:event_loadButtonActionPerformed
    private void changeDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDirButtonActionPerformed

        close();
}//GEN-LAST:event_changeDirButtonActionPerformed
    private void workDirComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_workDirComboBoxItemStateChanged
       Object obj = workDirComboBox.getSelectedItem();
       if (obj == null) {return;}
        String dirname = obj .toString();
        getDestinationWorkingDirTextField().setText(dirname);

}//GEN-LAST:event_workDirComboBoxItemStateChanged
    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        setPath();
}//GEN-LAST:event_setButtonActionPerformed
    public void setPath(){

    try{
        
        savedWorkDir                =   null;
        getSaveDirTextField().setText( "");
        getLoadButton().setEnabled(false);


        JFileChooser fc                 =   savedExperimentFC;
        int returnVal                   = fc.showOpenDialog(this);



         if (returnVal == JFileChooser.APPROVE_OPTION) {

             File dir                       =      fc.getSelectedFile ();
             boolean isSerializationFile    =      DirectoryManager.isSerializationFilePresent(dir  );

             if (isSerializationFile == false){
                String errorMessage = String.format(
                         "Serialization file: %s is missing\n" +
                         "from directory %s. \n" +
                         "This may lead to failure in loading \n"+
                         "saved experiment.\n",
                         DirectoryManager.getSerializationFileName (),
                         dir.getPath());
                DisplayText.popupWarningMessage(errorMessage);
             }


            // record saved work directory
            savedWorkDir     =   fc.getSelectedFile ();
            getSaveDirTextField().setText( savedWorkDir.getPath());
            getLoadButton().setEnabled(true);


            // remember the start directory in file chooser
            File startDir       =    savedWorkDir.getParentFile();
            savedExperimentFC.setCurrentDirectory(startDir);
              
         }
        else{
                setCanceled(true);
         }
     }finally{
       
     }

    }
    public void load(){

       LoadExperiment le    = new LoadExperiment();
       String dstName       =   getDestinationWorkingDirTextField().getText();
 
       le.sourceExp         =   savedWorkDir ;
       le.destinExp         =   DirectoryManager.getExperimentDir(dstName);
       le.loadSingleExperiment();

    }




    public static void close(){
         LoadExperimentGui inst =  getInstance();

         inst.setVisible(false);
         inst.dispose();


    }
    public static  LoadExperimentGui showDialog( ){
        Point p = MouseInfo.getPointerInfo().getLocation();

        return showDialog (p.x, p.y);
    }
    public static LoadExperimentGui  showDialog(   int x, int y){
          LoadExperimentGui  inst = getInstance();
          
         inst.setCanceled(false);
         inst.setLocation(x, y);
         inst.updatePriorToShowing();
         inst.setPath();
         if (inst.isCanceled() == false){
             inst.setVisible(true);
         }
        
         
         return inst;
    }
    public void updatePriorToShowing(){
        List <String> workDirs = ApplicationPreferences.getWorkDirs();

        getWorkDirComboBox().removeAllItems();
        for (String wd : workDirs) {getWorkDirComboBox().addItem(wd);}

        String curWd           =  ApplicationPreferences.getCurrentWorkDir();
        getWorkDirComboBox().setSelectedItem(curWd);


        getCurrentWorkingDirTextField().setText(curWd);
        getDestinationWorkingDirTextField().setText(curWd);
        getSaveDirTextField().setText("");
        getLoadButton().setEnabled(false);

    

    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // LoadExperimentGui dialog = new LoadExperimentGui(new javax.swing.JFrame(), true);
                //dialog.setVisible(true);
                showDialog();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeDirButton;
    private javax.swing.JTextField currentWorkingDirTextField;
    private javax.swing.JTextField destinationWorkingDirTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel pane;
    private javax.swing.JTextField saveDirTextField;
    private javax.swing.JFileChooser savedExperimentFC;
    private javax.swing.JButton setButton;
    private javax.swing.JComboBox workDirComboBox;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getChangeDirButton() {
        return changeDirButton;
    }
    public javax.swing.JButton getLoadButton() {
        return loadButton;
    }
    public javax.swing.JTextField getSaveDirTextField() {
        return saveDirTextField;
    }
    public javax.swing.JButton getSetButton() {
        return setButton;
    }
    public javax.swing.JComboBox getWorkDirComboBox() {
        return workDirComboBox;
    }
    public javax.swing.JTextField getCurrentWorkingDirTextField() {
        return currentWorkingDirTextField;
    }
    public javax.swing.JTextField getDestinationWorkingDirTextField() {
        return destinationWorkingDirTextField;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }




}
