/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SetReference.java
 *
 * Created on Feb 23, 2009, 4:19:22 PM
 */

package fid;
import bayes.PackageManager;
import bayes.BayesManager;
import applications.model.*;
import java.awt.MouseInfo;
import bayes.Enums.UNITS;
import bayes.Enums.FID_CHART_MODE;
/**
 *
 * @author apple
 */
public class JSetReference extends javax.swing.JDialog
        implements    java.beans.PropertyChangeListener {
private JSetReference(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        BayesManager.pcs.addPropertyChangeListener(this);
    }
    private static final long serialVersionUID                  =   7526372295622516127L;
    double old_value                                            ;
    private float ref_freq_shift                                =   0;
    private static  JSetReference  instance                     =   null;
    private FidViewable viewer                                  =   FidViewer.getInstance();

    private static  JSetReference getInstance( ) {
      if(instance == null) {
         instance = new JSetReference(null, false);
      }

      return instance;
   }
    public static  JSetReference showDialog(FidViewable aviewer ){
        if (aviewer instanceof FidModelViewer ){
            return null;
        }
        getInstance().setViewer(aviewer);
        getInstance( ).updateFromViewer();
        getInstance( ).setLocation(MouseInfo.getPointerInfo().getLocation());
        getInstance( ).setVisible(true);

       return instance;
    }
    public static  JSetReference hideDialog( ){

        getInstance( ).setVisible(false);

       return instance;
    }
     public void updateFromViewer(){
        double f        =   getViewer().getChartPanel().getCursorAPosition();
        getOldFreqFormattedTextField().setValue(f);

   }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        curValue_lbl = new javax.swing.JLabel();
        oldF = new javax.swing.JFormattedTextField();
        newVaue_lbl = new javax.swing.JLabel();
        newF = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        setLeftButton = new javax.swing.JButton();
        setRightButton = new javax.swing.JButton();
        setCenterButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cancelButon = new javax.swing.JButton();
        set_button = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Reference Frequency"); // NOI18N
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(formListener);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));
        jPanel1.setName("jPanel1"); // NOI18N

        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 4, 15));

        curValue_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        curValue_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        curValue_lbl.setText("Current Value");
        curValue_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        curValue_lbl.setName("curValue_lbl"); // NOI18N
        jPanel2.add(curValue_lbl);

        oldF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        oldF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldF.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        oldF.setName("oldF"); // NOI18N
        jPanel2.add(oldF);

        newVaue_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        newVaue_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newVaue_lbl.setText("New Value");
        newVaue_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        newVaue_lbl.setName("newVaue_lbl"); // NOI18N
        jPanel2.add(newVaue_lbl);

        newF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        newF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.0####"))));
        newF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newF.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        newF.setName("newF"); // NOI18N
        newF.setValue(0);
        jPanel2.add(newF);

        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(3, 0));

        setLeftButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        setLeftButton.setText("Set Leftmost frequency to 0");
        setLeftButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        setLeftButton.setName("setLeftButton"); // NOI18N
        setLeftButton.addActionListener(formListener);
        jPanel3.add(setLeftButton);

        setRightButton.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        setRightButton.setText("Set Rightmost frequency to 0");
        setRightButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        setRightButton.setName("setRightButton"); // NOI18N
        setRightButton.addActionListener(formListener);
        jPanel3.add(setRightButton);

        setCenterButton.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        setCenterButton.setText("Set Center frequency to 0");
        setCenterButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        setCenterButton.setName("setCenterButton"); // NOI18N
        setCenterButton.addActionListener(formListener);
        jPanel3.add(setCenterButton);

        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        cancelButon.setFont(new java.awt.Font("Lucida Grande", 1, 16));
        cancelButon.setText("CANCEL");
        cancelButon.setName("cancelButon"); // NOI18N
        cancelButon.addActionListener(formListener);
        jPanel4.add(cancelButon);

        set_button.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        set_button.setText("SET");
        set_button.setName("set_button"); // NOI18N
        set_button.addActionListener(formListener);
        jPanel4.add(set_button);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 256, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 256, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {jPanel2, jPanel3, jPanel4}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(16, 16, 16)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(13, 13, 13)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.WindowListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == setLeftButton) {
                JSetReference.this.setLeftButtonActionPerformed(evt);
            }
            else if (evt.getSource() == setRightButton) {
                JSetReference.this.setRightButtonActionPerformed(evt);
            }
            else if (evt.getSource() == setCenterButton) {
                JSetReference.this.setCenterButtonActionPerformed(evt);
            }
            else if (evt.getSource() == cancelButon) {
                JSetReference.this.cancelButonActionPerformed(evt);
            }
            else if (evt.getSource() == set_button) {
                JSetReference.this.set_buttonActionPerformed(evt);
            }
        }

        public void windowActivated(java.awt.event.WindowEvent evt) {
        }

        public void windowClosed(java.awt.event.WindowEvent evt) {
        }

        public void windowClosing(java.awt.event.WindowEvent evt) {
            if (evt.getSource() == JSetReference.this) {
                JSetReference.this.formWindowClosing(evt);
            }
        }

        public void windowDeactivated(java.awt.event.WindowEvent evt) {
        }

        public void windowDeiconified(java.awt.event.WindowEvent evt) {
        }

        public void windowIconified(java.awt.event.WindowEvent evt) {
        }

        public void windowOpened(java.awt.event.WindowEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents


  public void propertyChange ( java.beans.PropertyChangeEvent evt ) {
        if( evt.getPropertyName().equals(BayesManager.CURSOR_A_IS_DRAWN) ) {
                Double val = (Double) evt.getNewValue();
                getOldFreqFormattedTextField().setValue(val);
        }
       



    }


    private void cancelButonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButonActionPerformed
      this.setVisible(false);
}//GEN-LAST:event_cancelButonActionPerformed
    private void set_buttonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_buttonActionPerformed
       
            close();
}//GEN-LAST:event_set_buttonActionPerformed
    private void formWindowClosing (java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing
    private void setLeftButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLeftButtonActionPerformed
      FID_CHART_MODE fidChartMode =   getViewer().getChartPanel().getChartMode();
      if (fidChartMode == FID_CHART_MODE.FID){ return;}

      double val =   getViewer().getChartPanel().getDataRangeForDomainAxis().getUpperBound();
      getOldFreqFormattedTextField().setValue(val);
      getNewFreqFormattedTextField().setValue (0);

      close();


}//GEN-LAST:event_setLeftButtonActionPerformed
    private void setRightButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setRightButtonActionPerformed
     FID_CHART_MODE fidChartMode =   getViewer().getChartPanel().getChartMode();
     if (fidChartMode == FID_CHART_MODE.FID){ return;}

     double val =   getViewer().getChartPanel().getDataRangeForDomainAxis().getLowerBound();
      getOldFreqFormattedTextField().setValue(val);
      getNewFreqFormattedTextField().setValue (0);

      close();
}//GEN-LAST:event_setRightButtonActionPerformed
    private void setCenterButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCenterButtonActionPerformed
      FID_CHART_MODE fidChartMode =   getViewer().getChartPanel().getChartMode();
      if (fidChartMode == FID_CHART_MODE.FID){ return;}
      
      float[] frequencies       =    viewer.getFidReader().getFrequencyInHertz ();
      if(frequencies.length < 2){return;}
      int centralPoint = frequencies.length/2;
      float curCenterFreq = frequencies[centralPoint];
      
      ref_freq_shift = 0 - curCenterFreq;

      getOldFreqFormattedTextField().setValue(curCenterFreq);
      getNewFreqFormattedTextField().setValue (0);

      shiftAndHide();
}//GEN-LAST:event_setCenterButtonActionPerformed


    public void close(){
        
        float oldf               =  ( (Number)getOldFreqFormattedTextField().getValue () ).floatValue ();
        float newf               =  ( (Number)getNewFreqFormattedTextField().getValue () ).floatValue ();
        
        Procpar procpar          =   viewer.getProcpar ();
        UNITS units              =   viewer.getUnits ();

        // make sure frequency shift is in hertz
        ref_freq_shift =  newf - oldf;
        if (units ==   UNITS.PPM){
            ref_freq_shift = Units.ppm2hertz (procpar,getRef_freq_shift());
        }


        shiftAndHide();
       
    }
  
     public void shiftAndHide(){
        shift();
        hidePopup();
    }

    public void hidePopup(){
         setVisible(false);
    }

    public void shift(){
        FidReader freader        =   viewer.getFidReader();

        // calculate and record new frequency shift
        float oldRef        =   freader.getReferenceFreqInHertz();
        float ref           =   oldRef - ref_freq_shift;
        viewer.getFidReader().setReferenceFreqInHertz(ref );

        // write new frequency shift to FFH file
         FidIO.storeToDisk(freader.getFidDescriptor(), viewer.getFidDescriptorFile());

        // clean BayesAnalyze and FidModel Files
         bayes.DirectoryManager.cleanFidModelAndBayesAnalyzeDirs();

         // clear resonances
         Resonance.getResonanceList().clear();

         // delete fid models from memory
         FidModelViewer.getInstance().unloadData();

         // update Axis
        getViewer().getFidPlotData().changeAxisWithReferenceFrequency(ref_freq_shift);

         // update plot
        getViewer().updatePlot();


        Model model =  PackageManager.getCurrentApplication();
        if (model != null && model instanceof FidModel){
           ((FidModel)model).fidReferenceFrequncyChange();
        }

        interfacebeans.JAllPriors.getInstance().updateReferenceFrequency(ref_freq_shift);
        setVisible(false);
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JSetReference dialog = new JSetReference(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelButon;
    private javax.swing.JLabel curValue_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFormattedTextField newF;
    private javax.swing.JLabel newVaue_lbl;
    private javax.swing.JFormattedTextField oldF;
    private javax.swing.JButton setCenterButton;
    private javax.swing.JButton setLeftButton;
    private javax.swing.JButton setRightButton;
    private javax.swing.JButton set_button;
    // End of variables declaration//GEN-END:variables
    
    public javax.swing.JButton getCancelButon () {
        return cancelButon;
    }
    public javax.swing.JFormattedTextField getNewFreqFormattedTextField () {
        return newF;
    }
    public javax.swing.JFormattedTextField getOldFreqFormattedTextField () {
        return oldF;
    }
    public javax.swing.JButton getSetButton () {
        return set_button;
    }


    public FidViewable getViewer () {
        return viewer;
    }
    public void setViewer ( FidViewable viewer ) {
        this.viewer = viewer;
    }
    public float getRef_freq_shift () {
        return ref_freq_shift;
    }
}
