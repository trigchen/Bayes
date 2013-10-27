/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BayesPhaseNonlinear.java
 *
 * Created on Jan 15, 2009, 9:38:19 AM
 */

package applications.bayesPhase2;
import run.JRun;
import bayes.ParameterPrior;
import bayes.PackageManager;
import bayes.DirectoryManager;
import utilities.IO;
import utilities.PositiveFloatInputVerifier;
import javax.swing.*;
import java.io.*;
import bayes.JobDirections;
import bayes.WriteBayesParams;
import utilities.DisplayText;
import interfacebeans.*;
import bayes.BayesManager;
import bayes.Enums.*;
import image.ImageViewer;
import image.ImageDescriptor;
import applications.model.ImageModel;
import bayes.Reset;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import utilities.LoadPackage;
/**
 *
 * @author apple
 */
public class BayesPhaseNonlinear extends javax.swing.JPanel
                            implements  ImageModel, PropertyChangeListener, bayes.ApplicationConstants{

    

    /** Creates new form BayesPhaseNonlinear */
    public BayesPhaseNonlinear() {
        LoadPackage.loadPackage(this);
        PackageManager.setCurrentApplication(this);
        boolean isDeseralized = bayes.Serialize. deserializeCurrenExperiment();

        initComponents();

        BayesManager.pcs.addPropertyChangeListener(this);
        ImageViewer.getInstance().addPropertyChangeListener(this);

        if(isDeseralized){
            AllViewers.showImageViewer();
            JRun.fireJobIDChange();
        }
        else {AllViewers.showInstructions();}
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

        jSplitPane1 = new javax.swing.JSplitPane();
        tools = new javax.swing.JPanel();
        jRun = new run.JRun();
        jPanel1 = new javax.swing.JPanel();
        process_lbl = new javax.swing.JLabel();
        process_cb = new javax.swing.JComboBox(IMAGE_PROCESS.values());
        noiseStdDevLabel = new javax.swing.JLabel();
        stdDevField = new javax.swing.JFormattedTextField();
        jResetSave = new interfacebeans.JResetSave();
        jserver = new interfacebeans.JServer();
        graph_panel = AllViewers.getInstance();

        FormListener formListener = new FormListener();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setName("jSplitPane1"); // NOI18N
        jSplitPane1.setOneTouchExpandable(true);

        tools.setName("tools"); // NOI18N

        jRun.setName("jRun"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        process_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        process_lbl.setLabelFor(process_cb);
        process_lbl.setText("Process");
        process_lbl.setName("process_lbl"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(process_lbl, gridBagConstraints);

        process_cb.setSelectedItem(this.getProcess());
        process_cb.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nSelect how the data are to be phased.<br>\n<font color=\"red\" size = \"+1\"><bold>All</font></bold>, Each image is phased positive<br> \n<font color=\"red\" size = \"+1\"><bold>Common</font>, Each image has the phase of the currently displayed image<br> \n</html>\n\n"); // NOI18N
        process_cb.setName("process_cb"); // NOI18N
        process_cb.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(process_cb, gridBagConstraints);

        noiseStdDevLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        noiseStdDevLabel.setLabelFor(stdDevField);
        noiseStdDevLabel.setText("Noise SD");
        noiseStdDevLabel.setName("noiseStdDevLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(noiseStdDevLabel, gridBagConstraints);

        stdDevField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.#########"))));
        stdDevField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        stdDevField.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nSet noise standard deviation.\n</html>\n\n"); // NOI18N
        stdDevField.setInputVerifier(new PositiveFloatInputVerifier());
        stdDevField.setName("stdDevField"); // NOI18N
        stdDevField.setValue( getNoiseStandardDeviation ());
        stdDevField.addPropertyChangeListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(stdDevField, gridBagConstraints);

        jResetSave.setName("jResetSave"); // NOI18N

        jserver.setName("jserver"); // NOI18N

        org.jdesktop.layout.GroupLayout toolsLayout = new org.jdesktop.layout.GroupLayout(tools);
        tools.setLayout(toolsLayout);
        toolsLayout.setHorizontalGroup(
            toolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(toolsLayout.createSequentialGroup()
                .add(8, 8, 8)
                .add(jRun, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jserver, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 188, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jResetSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 136, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        toolsLayout.setVerticalGroup(
            toolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(toolsLayout.createSequentialGroup()
                .add(toolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .add(jResetSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jRun, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jserver, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        toolsLayout.linkSize(new java.awt.Component[] {jPanel1, jResetSave, jRun, jserver}, org.jdesktop.layout.GroupLayout.VERTICAL);

        jSplitPane1.setLeftComponent(tools);

        graph_panel.setName("graph_panel"); // NOI18N
        graph_panel.setLayout(new javax.swing.BoxLayout(graph_panel, javax.swing.BoxLayout.LINE_AXIS));
        jSplitPane1.setRightComponent(graph_panel);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.beans.PropertyChangeListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == process_cb) {
                BayesPhaseNonlinear.this.process_cbActionPerformed(evt);
            }
        }

        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            if (evt.getSource() == stdDevField) {
                BayesPhaseNonlinear.this.stdDevFieldPropertyChange(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void process_cbActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_process_cbActionPerformed
        setProcess ((IMAGE_PROCESS) process_cb.getSelectedItem ());

         clearPreviousRun();
}//GEN-LAST:event_process_cbActionPerformed
    private void stdDevFieldPropertyChange (java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_stdDevFieldPropertyChange
       if (evt.getPropertyName().equalsIgnoreCase("value") == false){return;}
       noiseStandardDeviation= (Double)getStdDevField ().getValue ();
       clearPreviousRun();
}//GEN-LAST:event_stdDevFieldPropertyChange

    public void              setPackageParameters(ObjectInputStream ois) throws Exception{
            IMAGE_PROCESS   imp               =   (IMAGE_PROCESS)ois.readObject();
            double     sdev                   =   (Double)ois.readObject();
            
            
            this.setProcess(imp);
            this.setNoiseStandardDeviation(sdev);


    }
    public void              savePackageParameters(ObjectOutputStream oos){

        try{

             oos.writeObject(this.getProcess());
             oos.writeObject(this.getNoiseStandardDeviation());
        }
        catch ( Exception exp){
             DirectoryManager.getSerializationFile().delete();
        }
    }
    public boolean           isReadyToRun() {
        // make sure data has been loaded
        File dir                    =   DirectoryManager.getBayesOtherAnalysisDir();
        File imageFile              =   ImageViewer.getInstance().getSelectedFile();
        
        //make sure images for analysis are cleared
        imagesForAnalysis.clear();
        
       // make sure that images has been selected
       if(imageFile == null  ){
           DisplayText.popupErrorMessage(
                "No image is selected.\nExit run..." );
          return false;
       }

     
       if(!imageFile.exists()){
           DisplayText.popupErrorMessage(
                "Image file doesnt exist.\n" +imageFile.getPath()+ "\nExit run..." );
          return false;
       }

     
       //make sure two files are selected
         List<File> imageFiles =   ImageViewer.getInstance().getSelectedFiles();
        
         int numberOfFiles = imageFiles.size();
         StringBuilder sb = new StringBuilder();
         if ( numberOfFiles != 2){
            
              sb.append("You should select one real and one imaginary image.");
              sb.append("\n");
              sb.append("Currently "+ numberOfFiles + " images are selected/");
              sb.append("\n");
              sb.append("Exit run...");
              DisplayText.popupErrorMessage(sb.toString());
              return false;
         }
         
         boolean realAndImagFound = isRealAndImagFilesPresent(imageFiles);
         if ( realAndImagFound == false){
            
              sb.append("You should select one real and one imaginary image.");
              sb.append("\n");
              
              sb.append("Real image name must contain \"real\".");
              sb.append("\n");
              sb.append("Imaginary image name must contain \"imag\".");
              sb.append("\n");
              sb.append("Exit run...");
              DisplayText.popupErrorMessage(sb.toString());
              return false;
         }
         
         
         
         // make sure a standard deviation was set
        double  sd = getNoiseStandardDeviation();
         {
            if (sd <= 0) {
               DisplayText.popupErrorMessage("Noise standard deviation is not set.\nExiting run.");
               return false;
            }
        }


       // write the parameter file
       boolean bl  =  WriteBayesParams.writeParamsFile(this, dir);
       if (bl == false){
            DisplayText.popupErrorMessage("Failed to write Bayes.params file.");
           return false;
       }



       //  write "job.directions" file
         PackageManager.setCurrentApplication(this);
         bl  =  JobDirections.writeFromProperties(JobDirections.BAYES_SUBMIT_IMAGE);
         if(bl == false){

            DisplayText.popupErrorMessage("Failed to write job.directions file.");

            return false;
         }

        return true;
    }
    public String            getProgramName() {
         return "BayesPhase2";
    }
    public String            getExtendedProgramName() { return "Bayes Phase Nonlinear" ;}
    public int               getNumberOfAbscissa() {
       return 1;
    }
    public int               getNumberOfDataColumns() {
         /*make sure default is 1. Otherwise extracted image pixel
          *in the absense of loaded model, won't display
          */
        return 1 ;
    }
    public int               getTotalNumberOfColumns(){return 2;}
    public int               getNumberOfPriors() {
        return getPriors().size();
    }
    public StringBuilder     getModelSpecificsForParamsFile(int PADLEN, String PADCHAR) {
            StringBuilder sb        =   new StringBuilder();
            ImageViewer imgViewer   =   ImageViewer.getInstance();
            ImageDescriptor id      =   imgViewer.getImageDescriptor();
            File realImage          =   imagesForAnalysis.get(0);
            File imagImage          =   imagesForAnalysis.get(1);


            sb.append( IO.pad("Package Parameters", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(7);
            sb.append(EOL);

            sb.append( IO.pad("Complex Image piexels in ro", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(id.getNumberOfReadouts());
            sb.append(EOL);

            sb.append( IO.pad("Complex Image piexels in pe", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(id.getNumberOfPhaseEncodes());
            sb.append(EOL);

            sb.append( IO.pad("Number of Slices", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(id.getNumberOfSlices());
            sb.append(EOL);

            sb.append( IO.pad("Array Dimension", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(id.getNumberOfElements());
            sb.append(EOL);


            sb.append( IO.pad("Cur Array Element", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(imgViewer.getCurrentElement());
            sb.append(EOL);

            sb.append( IO.pad("Current Slice", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(imgViewer.getCurrentSlice());
            sb.append(EOL);


            sb.append( IO.pad(" Noise Std Dev", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(getNoiseStandardDeviation());
            sb.append(EOL);

            sb.append( IO.pad("Output Image Dir", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(BayesManager.IMAGE_DIR_NAME);
            sb.append(EOL);

            sb.append( IO.pad("Input Real 4dfp File Name", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(BayesManager.IMAGE_DIR_NAME+ BayesManager.FILE_SEPARATOR + realImage.getName());
            sb.append(EOL);

            sb.append( IO.pad("Input Imag 4dfp File Name",-PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(BayesManager.IMAGE_DIR_NAME+ BayesManager.FILE_SEPARATOR +imagImage.getName());
            sb.append(EOL);

            sb.append( IO.pad("Process Images", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append(getProcess().toString());
            sb.append(EOL);

            sb.append( IO.pad("Write Imaginary", -PADLEN, PADCHAR ));
            sb.append(" = ") ;
            sb.append("Yes");
            sb.append(EOL);



         return sb;
    }
    public List<ParameterPrior>getPriors() {
        return new Vector<ParameterPrior>();
    }
    public String            getConstructorArg(){return null;}
    public String            getInstructions(){return PACKAGE_INTSRUCTIONS. BAYES_PHASE_NONLINEAR.getInstruction();}
    public boolean           isOutliers(){return false;}
    public void              reset(){

           JAllPriors .reset();
           setDefaults();
           clearPreviousRun();

            // show default viewer
            AllViewers.getInstance().showDefaultViewer();
    }

    public void              clearPreviousRun(){
        Reset.clearImageResutls();


         // reset job status
         jRun.reset();

    }
    public void              setDefaults(){
             setNoiseStandardDeviation(0f);
             getStdDevField ().setValue(getNoiseStandardDeviation());

             setProcess(IMAGE_PROCESS.All);
             getProcessComboBox().setSelectedItem(getProcess());
    }

    @Override
    public void             setActive(boolean enabled){

        AllViewers.getInstance().setActive(enabled);

        jserver.setActive(enabled);
        jRun.setEnabled(enabled);
        jResetSave.setActive(enabled);
        process_lbl.setEnabled(enabled);
        stdDevField.setEnabled(enabled);
        noiseStdDevLabel.setEnabled(enabled);
        process_cb.setEnabled(enabled);
    }
    @Override
    public void              propertyChange(java.beans.PropertyChangeEvent evt){

      if (evt.getPropertyName().equals(bayes.BayesManager.JRUN_JOB_START)){
          setActive(false);
      }

      else if (evt.getPropertyName().equals(bayes.BayesManager.JRUN_JOB_END)){
         setActive(true);
         ImageViewer.getInstance().updateImageList();
         AllViewers.showImageViewer();
      }
      else if (evt.getPropertyName().equals(bayes.BayesManager.JRUN_JOB_CANCELED)){
          setActive(true);
      }
    

   }
 
    @Override
     public Collection <File> getFilesToTar(){

        List<File> files            =   new  ArrayList<File>();
        File [] imageFiles          =   getImgAndIfhFiles();// dimension 4

        for (int i = 0; i < imageFiles.length; i++) {
            files.add (imageFiles[i]);
        }
         files.add(DirectoryManager.getBayesOtherAnalysisDir());

        return files;
    }

    public File           getRealImage(){
       File file                =   null;
       try{
           file                 =   imagesForAnalysis.get(0);
       }
       catch (Exception e){e.printStackTrace();}
       
       return file;
    }
    public File           getImagImage(){
       File file                =   null;
       try{
           file                 =   imagesForAnalysis.get(1);
       }
       catch (Exception e){e.printStackTrace();}
       
       return file;
    }
    public File []        getImgAndIfhFiles(){
        File [] files           =    new File [4];
        
        File   realImg          =    imagesForAnalysis.get(0);
        File   imagImg          =    getImagImage();
        File   realIfh          =    DirectoryManager.getIfhFileForImage( realImg );
        File   rimagIfh         =    DirectoryManager.getIfhFileForImage( imagImg );

        files[0]                =   realImg;
        files[1]                =   realIfh;
        files[2]                =   imagImg;
        files[3]                =   rimagIfh;

        return files;
    }
    
    public boolean isRealAndImagFilesPresent( List<File> imageFiles){
         boolean out                =   false;
         imagesForAnalysis.clear();
         try{
             File file1                 =   imageFiles.get(0);
             File file2                 =   imageFiles.get(1);


             boolean isFirstIsReal      =   isRealImage(file1.getName());
             boolean isSeconfIsImag     =   isImagImage(file2.getName());


             if (isFirstIsReal && isSeconfIsImag) {
                 imagesForAnalysis.add(0, file1 );
                 imagesForAnalysis.add(1, file2 );
             }
             else{
                  boolean isSecondIsReal     =   isRealImage(file2.getName());
                  boolean isFirstIsImag      =   isImagImage(file1.getName());
                  if (isSecondIsReal && isFirstIsImag) {
                    imagesForAnalysis.add(0, file2 );
                    imagesForAnalysis.add(1, file1 );
                }
             }
             
             if (imagesForAnalysis.size()== 2){out = true;}
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            return out;
         }
        
         
    }
    public boolean isRealImage(String filename){
        boolean out                 = false;
        Set<String> listOfNames = new HashSet();
        listOfNames.add("Real");
        listOfNames.add("real");
        listOfNames.add("REAL");
        
        for (String curName : listOfNames) {
            if (filename.contains(curName)){
                out = true;
                break;
            }
         }
        
        return out;
    }
    public boolean isImagImage(String filename){
        boolean out                 = false;
        Set<String> listOfNames = new HashSet();
        listOfNames.add("Imag");
        listOfNames.add("imag");
        listOfNames.add("IMAG");
        
        for (String curName : listOfNames) {
            if (filename.contains(curName)){
                out = true;
                break;
            }
         }
        
        return out;
    }
   
    
    public static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("Bayes Phase ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                DirectoryManager.shutDownDirectory();
            }
        });

        frame.add(new BayesPhaseNonlinear());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                createAndShowGUI();
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel graph_panel;
    private javax.swing.JPanel jPanel1;
    private interfacebeans.JResetSave jResetSave;
    private run.JRun jRun;
    private javax.swing.JSplitPane jSplitPane1;
    private interfacebeans.JServer jserver;
    private javax.swing.JLabel noiseStdDevLabel;
    private javax.swing.JComboBox process_cb;
    private javax.swing.JLabel process_lbl;
    private javax.swing.JFormattedTextField stdDevField;
    private javax.swing.JPanel tools;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JFormattedTextField getStdDevField () {
        return stdDevField;
    }
    public javax.swing.JComboBox getProcessComboBox() {
        return process_cb;
    }

    private IMAGE_PROCESS process               =   IMAGE_PROCESS.All;
    private double noiseStandardDeviation       =   0;
    private List <File> imagesForAnalysis         =   new ArrayList<File>();

   
    public IMAGE_PROCESS getProcess () {
        return process;
    }
    public double        getNoiseStandardDeviation () {
        return noiseStandardDeviation;
    }
    
    public void         setProcess ( IMAGE_PROCESS process ) {
        this.process = process;
    }
    public void         setNoiseStandardDeviation ( double standardDeviation ) {
        this.noiseStandardDeviation = standardDeviation;
    }
}
