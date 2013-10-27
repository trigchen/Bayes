/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JSeekAndLoadWorkDirJDialog.java
 *
 * Created on Oct 20, 2011, 11:10:08 AM
 */
package load.gui;

import bayes.DirectoryManager;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import load.LoadExperiment;

/**
 *
 * @author apple
 */
public class JSeekAndLoadWorkDirJDialog extends javax.swing.JDialog {
    private static  JSeekAndLoadWorkDirJDialog instance;
    private boolean canceled                    =   false;
    private File searchDir                      =   null;
    private TreeSet<File> workDirsToLoad        =   new TreeSet<File>();
    private TreeSet<File> foundWorkDirs =   new TreeSet<File>();


    public static JSeekAndLoadWorkDirJDialog getInstance(){
        if (instance == null){
            instance = new JSeekAndLoadWorkDirJDialog();
        }
        return instance;

    }
    /** Creates new form JSeekAndLoadWorkDirJDialog */
    private JSeekAndLoadWorkDirJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    private JSeekAndLoadWorkDirJDialog() {

        this(new JFrame(),true);
    }
    public static void close(){
         JSeekAndLoadWorkDirJDialog inst =  getInstance();

         inst.setVisible(false);
         inst.dispose();


    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        savedExperimentFC = new javax.swing.JFileChooser();
        centerPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableWorkDirPoolJlist = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        workDirJListToLoad = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        removeSelectedLoadDirsButton = new javax.swing.JButton();
        removeAllWorkDirsToLoad = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        addWorkDirButton = new javax.swing.JButton();
        addAllDirectories = new javax.swing.JButton();
        exitButtonPane = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        topPane = new javax.swing.JPanel();
        searchDirectoryPathTextField = new javax.swing.JTextField();
        setSearchDirectoryButton = new javax.swing.JButton();

        savedExperimentFC.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        savedExperimentFC.setName("savedExperimentFC"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seek and Import WorkDirs"); // NOI18N
        setName("Form"); // NOI18N

        centerPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), null, null));
        centerPane.setName("centerPane"); // NOI18N
        centerPane.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), null, null), "Found Working Directories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Grande 14", 1, 12))); // NOI18N
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        availableWorkDirPoolJlist.setModel(new DefaultListModel());
        availableWorkDirPoolJlist.setName("availableWorkDirPoolJlist"); // NOI18N
        jScrollPane1.setViewportView(availableWorkDirPoolJlist);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        centerPane.add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), null, null), "Working Directories To Import", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Grande 14 12", 1, 12))); // NOI18N
        jScrollPane2.setName("jScrollPane2"); // NOI18N

        workDirJListToLoad.setModel(new DefaultListModel());
        workDirJListToLoad.setName("workDirJListToLoad"); // NOI18N
        jScrollPane2.setViewportView(workDirJListToLoad);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        centerPane.add(jScrollPane2, gridBagConstraints);

        jPanel2.setName("jPanel2"); // NOI18N

        removeSelectedLoadDirsButton.setText("Remove Selected "); // NOI18N
        removeSelectedLoadDirsButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nRemove selected items from a list <br>\nof working directories to be imported.<br>\n\n</html>"); // NOI18N
        removeSelectedLoadDirsButton.setName("removeSelectedLoadDirsButton"); // NOI18N
        removeSelectedLoadDirsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSelectedLoadDirsButtonActionPerformed(evt);
            }
        });

        removeAllWorkDirsToLoad.setText("Remove All"); // NOI18N
        removeAllWorkDirsToLoad.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nClear the list of working directories to be imported.<br>\n</html>"); // NOI18N
        removeAllWorkDirsToLoad.setName("removeAllWorkDirsToLoad"); // NOI18N
        removeAllWorkDirsToLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllWorkDirsToLoadActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(removeSelectedLoadDirsButton)
                .add(5, 5, 5)
                .add(removeAllWorkDirsToLoad))
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {removeAllWorkDirsToLoad, removeSelectedLoadDirsButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(removeSelectedLoadDirsButton)
                    .add(removeAllWorkDirsToLoad))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        centerPane.add(jPanel2, gridBagConstraints);

        jPanel3.setName("jPanel3"); // NOI18N

        addWorkDirButton.setText(">>"); // NOI18N
        addWorkDirButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nAdd selected found directories to a list of <br>\nworking directories to be imported.<br>\n\n</html>"); // NOI18N
        addWorkDirButton.setName("addWorkDirButton"); // NOI18N
        addWorkDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWorkDirButtonActionPerformed(evt);
            }
        });

        addAllDirectories.setText("all >>"); // NOI18N
        addAllDirectories.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nAdd all found directories to a list <br>\nof working directories to be imported.<br>\n\n</html>"); // NOI18N
        addAllDirectories.setName("addAllDirectories"); // NOI18N
        addAllDirectories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAllDirectoriesActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, addWorkDirButton, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, addAllDirectories, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, Short.MAX_VALUE))
                .add(8, 8, 8))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(77, 77, 77)
                .add(addWorkDirButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addAllDirectories)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        centerPane.add(jPanel3, gridBagConstraints);

        getContentPane().add(centerPane, java.awt.BorderLayout.CENTER);

        exitButtonPane.setName("exitButtonPane"); // NOI18N
        exitButtonPane.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 2));

        cancelButton.setText("Cancel"); // NOI18N
        cancelButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nCancel import of working directories.<br>\n\n</html>"); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        exitButtonPane.add(cancelButton);

        loadButton.setText("Import"); // NOI18N
        loadButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nImport all working directories.<br>\n\n</html>"); // NOI18N
        loadButton.setName("loadButton"); // NOI18N
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        exitButtonPane.add(loadButton);

        getContentPane().add(exitButtonPane, java.awt.BorderLayout.SOUTH);

        topPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, null), "Search Directory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)); // NOI18N
        topPane.setName("topPane"); // NOI18N
        topPane.setOpaque(false);
        topPane.setLayout(new java.awt.GridBagLayout());

        searchDirectoryPathTextField.setEditable(false);
        searchDirectoryPathTextField.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        searchDirectoryPathTextField.setName("searchDirectoryPathTextField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        topPane.add(searchDirectoryPathTextField, gridBagConstraints);

        setSearchDirectoryButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        setSearchDirectoryButton.setText("Set"); // NOI18N
        setSearchDirectoryButton.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\n\nSet a directory within which search <br>\nfor working directories will be performed.<br>\n\n  \n\n</html>\n\n"); // NOI18N
        setSearchDirectoryButton.setName("setSearchDirectoryButton"); // NOI18N
        setSearchDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSearchDirectoryButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 7, 5, 7);
        topPane.add(setSearchDirectoryButton, gridBagConstraints);

        getContentPane().add(topPane, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void setSearchDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSearchDirectoryButtonActionPerformed
    setPathAndUpdateGUI();
}//GEN-LAST:event_setSearchDirectoryButtonActionPerformed
private void addWorkDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWorkDirButtonActionPerformed
    addSelectedWorkingDirectoriesToLoadDirList();
}//GEN-LAST:event_addWorkDirButtonActionPerformed
private void addAllDirectoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAllDirectoriesActionPerformed
 addAllWorkingDirectoriesToLoadDirList();
}//GEN-LAST:event_addAllDirectoriesActionPerformed
private void removeAllWorkDirsToLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllWorkDirsToLoadActionPerformed
   workDirsToLoad.clear();
   updateLoadWorkDirJList();
}//GEN-LAST:event_removeAllWorkDirsToLoadActionPerformed
private void removeSelectedLoadDirsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSelectedLoadDirsButtonActionPerformed
    removeWorkingDirectoriesFromLoadDirList();
}//GEN-LAST:event_removeSelectedLoadDirsButtonActionPerformed
private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    close();
}//GEN-LAST:event_cancelButtonActionPerformed
private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
    loadWorkDirs();
    close();   
}//GEN-LAST:event_loadButtonActionPerformed

    
   public static  JSeekAndLoadWorkDirJDialog showDialog( ){
        Point p = MouseInfo.getPointerInfo().getLocation();

        return showDialog (p.x, p.y);
    }
   public static JSeekAndLoadWorkDirJDialog  showDialog(   int x, int y){
         JSeekAndLoadWorkDirJDialog inst = getInstance();
          
         inst.setCanceled(false);
         inst.setLocation(x, y);
         inst.getWorkDirsToLoad().clear();
         //inst.setPathAndUpdateGUI();
         inst.updateGui();
         inst.setVisible(true);
         
         return inst;
    }
   
   public void loadWorkDirs(){
       LoadExperiment le    = new LoadExperiment();
 
       le.srcWorkDirs.addAll( workDirsToLoad);
       le.dstRoot        =   DirectoryManager.getBayesDir();
       le.loadMultipleExperiments();
   
   }
   public void setPathAndUpdateGUI(){
           setPath();
           updateGui();
        
    }
   public void setPath(){

    try{
      
        
        JFileChooser fc                 =  savedExperimentFC;
        int returnVal                   = fc.showOpenDialog(this);



         if (returnVal == JFileChooser.APPROVE_OPTION) {
           
             File dir                           =      fc.getSelectedFile ();
             searchDir                          =   dir;
             
             searchWorkDirectotries(dir);

             
            // remember the start directory in file chooser
            savedExperimentFC.setCurrentDirectory(dir);
              
         }
        else{
                setCanceled(true);
         }
     }finally{
       
     }

    }
   public void searchWorkDirectotries(File searchDir){
      foundWorkDirs.clear();
       if (searchDir != null && searchDir.exists() && searchDir.isDirectory()){
           File files [] = searchDir.listFiles();
           for (File curDir : files) {
               if (curDir.isFile()){continue;}
               boolean isSerializationFile    =  DirectoryManager.isSerializationFilePresent(curDir  );
               if (isSerializationFile){
                    foundWorkDirs.add(curDir);
               }
           }    
       }
   
   
   }
   public void addWorlDir(File dir){
         workDirsToLoad.add(dir);
   
   }
   private void addSelectedWorkingDirectoriesToLoadDirList(){
         Collection<File> dirsToAdd = getSelectedProposedWorkDirsFromGuiList();
         addWorkingDirectoriesToLoadDirList(dirsToAdd);
   }
   private void addAllWorkingDirectoriesToLoadDirList(){
         Collection<File> dirsToAdd =   getAllProposedWorkDirsFromGuiList();    
         addWorkingDirectoriesToLoadDirList(dirsToAdd);
   }
   public void addWorkingDirectoriesToLoadDirList(Collection <File> dirsToAdd){
         System.out.println("Adding working directories to load");
         System.out.println("*********************************");
         for (File dirToAdd : dirsToAdd) {
            boolean success = workDirsToLoad.add(dirToAdd);
            
            if (success == false){
                String msg = String.format("Failed to add  %s ", dirToAdd.getPath());
                System.out.println(msg);
            }
       }
        updateLoadWorkDirJList(); 
   }
   public void removeWorkingDirectoriesFromLoadDirList(){
        Collection<File> dirsToRemove= getSelectedLoadWorkDirsFromGuiList();
         removeWorkingDirectoriesFromLoadDirList( dirsToRemove);
   }
     public void removeWorkingDirectoriesFromLoadDirList( Collection<File> dirsToRemove){
        for (File dirToRemove : dirsToRemove) {
           workDirsToLoad.remove(dirToRemove);
       }
        updateLoadWorkDirJList(); 
   }
   public void updateGui(){
      updateFoundDirJList();
      updateSearchDirectoryPathDisplay();
      updateLoadWorkDirJList();
      
    }
   public void updateFoundDirJList(){
         DefaultListModel model =   getProposedworkDirJListModel(); 
         model.clear();
        // Initialize the list with items
          for (File dir : foundWorkDirs) {
                 model.addElement(dir);
          }
    
   }
   public void updateLoadWorkDirJList(){
        updateLoadWorkDirJList(false);
    
   }
   public void updateLoadWorkDirJList(boolean keepPrevious){
         DefaultListModel model =    getWorkDirJListModel(); 
         if (keepPrevious == false){
             model.clear();
         }
        // Initialize the list with items
          for (File dir :workDirsToLoad) {
              if (model.contains(dir) == false){
                   model.addElement(dir);
              }
                
          }
    
   }
   public void updateSearchDirectoryPathDisplay(){
        if (searchDir != null){
            searchDirectoryPathTextField.setText(searchDir.getPath());
        }
        else{
            searchDirectoryPathTextField.setText("");
        }
 
   }
   public  DefaultListModel getProposedworkDirJListModel(){
       return (DefaultListModel)availableWorkDirPoolJlist.getModel();
   }
   public  DefaultListModel getWorkDirJListModel(){
       return (DefaultListModel)workDirJListToLoad.getModel();
   }
   public Collection<File> getSelectedProposedWorkDirsFromGuiList(){
       Set<File> out = new TreeSet<File>();
       try{
           Object [] obj = availableWorkDirPoolJlist.getSelectedValues();
            for (Object object : obj) {
                File curDir = (File) object;
                out.add(curDir);
            }
       }
        catch (Exception e){e.printStackTrace();}
        finally{return out; }   
   }
   public Collection<File> getAllProposedWorkDirsFromGuiList(){
      Set<File> out = new TreeSet<File>();
       try{
           DefaultListModel model = getProposedworkDirJListModel();
            for (Object object :   model.toArray()) {
                File curDir = (File) object;
                out.add(curDir);
            }
       }
        catch (Exception e){e.printStackTrace();}
        finally{return out; }   
   }
   public Collection<File> getSelectedLoadWorkDirsFromGuiList(){
       Set<File> out = new TreeSet<File>();
       try{
           Object [] obj = workDirJListToLoad.getSelectedValues();
            for (Object object : obj) {
                File curDir = (File) object;
                out.add(curDir);
            }
       }
        catch (Exception e){e.printStackTrace();}
        finally{return out; }   
   }
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
            java.util.logging.Logger.getLogger(JSeekAndLoadWorkDirJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSeekAndLoadWorkDirJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSeekAndLoadWorkDirJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSeekAndLoadWorkDirJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
               JSeekAndLoadWorkDirJDialog  leg   = JSeekAndLoadWorkDirJDialog.showDialog();
              
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAllDirectories;
    private javax.swing.JButton addWorkDirButton;
    private javax.swing.JList availableWorkDirPoolJlist;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel centerPane;
    private javax.swing.JPanel exitButtonPane;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton removeAllWorkDirsToLoad;
    private javax.swing.JButton removeSelectedLoadDirsButton;
    private javax.swing.JFileChooser savedExperimentFC;
    private javax.swing.JTextField searchDirectoryPathTextField;
    private javax.swing.JButton setSearchDirectoryButton;
    private javax.swing.JPanel topPane;
    private javax.swing.JList workDirJListToLoad;
    // End of variables declaration//GEN-END:variables
        
    public boolean isCanceled() {
        return canceled;
    }
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public File getSearchDir() {
        return searchDir;
    }
    public void setSearchDir(File searchDir) {
        this.searchDir = searchDir;
    }

    public TreeSet<File> getWorkDirsToLoad() {
        return workDirsToLoad;
    }
    public void setWorkDirsToLoad(TreeSet<File> workDirsToLoad) {
        this.workDirsToLoad = workDirsToLoad;
    }

    public TreeSet<File> getAllFoundWorkDirs() {
        return foundWorkDirs;
    }
    public void setAllFoundWorkDirs(TreeSet<File> workDirsToLoadProposed) {
        this.foundWorkDirs = workDirsToLoadProposed;
    }
    
}
