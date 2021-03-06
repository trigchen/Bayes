/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AsciiToImageDialog.java
 *
 * Created on Mar 10, 2009, 2:26:23 PM
 */

package load.gui;
import load.*;
import image.ImageDescriptor;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.File;
import utilities.DisplayText;
/**
 *
 * @author apple
 */
public class Ascii2ImageDialog extends javax.swing.JDialog {
    private static  Ascii2ImageDialog   instance                        =   null;
    private  Ascii2ImageConverter converter                             =   Ascii2ImageConverter.getInstance();
    private boolean canceled                                            =   false;
    private String errorMessage                                         =   null;
    private boolean rememberPreviousSettings                            =   false;
    private float widthInCm                                                   =   1;
    private float heightInCm = 1;
    private float thicknessInCm = 1;

    private Ascii2ImageDialog (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private static  Ascii2ImageDialog  getInstance( ) {
      if(instance == null) {
         instance = new Ascii2ImageDialog (null, true);
      }

      return instance;
   }
    public static   Ascii2ImageDialog  showDialog( Ascii2ImageConverter aconverter  ){
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       int x                =    screenSize.width/2- 200;
       int y                =    screenSize.height/2- 200;

       return showDialog( aconverter, x,y);

    }
    public static   Ascii2ImageDialog  showDialog( Ascii2ImageConverter aconverter,int x, int y ){
        //update settings
         getInstance( ).update(aconverter);


         // be default values are not active unless "set" button is pressed
          getInstance( ).setCanceled(true);

         // show Preferences
        getInstance( ).setLocation(new java.awt.Point(x,y));
        getInstance( ).setVisible(true);

       return instance;
    }
    public  Ascii2ImageDialog  hideDialog( ){
        setVisible(false);

       return instance;
    }
    /** Creates new form AsciiToImageDialog */

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        parsingOrderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dim1TextField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        dim2TextField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        dim3TextField = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        dim4TextField = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        dim1scaleTextField = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        dim2scaleTextField = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        dim3scaleTextField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        totalPointsTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        linesInFileTextField2 = new javax.swing.JFormattedTextField();
        setButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        fileStructurePanel = new javax.swing.JPanel();
        loopSlicesFirstRadioButton = new javax.swing.JRadioButton();
        loppElementsFirstRadioButton = new javax.swing.JRadioButton();
        fileStructurePanel1 = new javax.swing.JPanel();
        loadAbscissaCB = new javax.swing.JCheckBox();
        abscissaFileTextField = new javax.swing.JFormattedTextField();
        setAbscissaButton = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Image Parameters"); // NOI18N
        setModal(true);
        setResizable(false);
        addWindowListener(formListener);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Image Parameters"));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(9, 2, 8, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Width (pixels)");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1);

        dim1TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        dim1TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dim1TextField.setToolTipText("Number of data points along phase-encode direction."); // NOI18N
        dim1TextField.setInputVerifier(new utilities.PositiveIntegerInputVerifier());
        dim1TextField.setName("dim1TextField"); // NOI18N
        dim1TextField.setValue(new Integer(1));
        dim1TextField.addPropertyChangeListener(formListener);
        jPanel1.add(dim1TextField);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Height (pixels )");
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2);

        dim2TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        dim2TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dim2TextField.setToolTipText("Number of data points along readout direction."); // NOI18N
        dim2TextField.setInputVerifier(new utilities.PositiveIntegerInputVerifier());
        dim2TextField.setName("dim2TextField"); // NOI18N
        dim2TextField.setValue(new Integer(1));
        dim2TextField.addPropertyChangeListener(formListener);
        jPanel1.add(dim2TextField);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Number of slices");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);

        dim3TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        dim3TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dim3TextField.setToolTipText("Number of slices."); // NOI18N
        dim3TextField.setInputVerifier(new utilities.PositiveIntegerInputVerifier());
        dim3TextField.setName("dim3TextField"); // NOI18N
        dim3TextField.setValue(new Integer(1));
        dim3TextField.addPropertyChangeListener(formListener);
        jPanel1.add(dim3TextField);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Number of elements");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);

        dim4TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        dim4TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dim4TextField.setToolTipText("Number of elements."); // NOI18N
        dim4TextField.setInputVerifier(new utilities.PositiveIntegerInputVerifier());
        dim4TextField.setName("dim4TextField"); // NOI18N
        dim4TextField.setValue(new Integer(1));
        dim4TextField.addPropertyChangeListener(formListener);
        jPanel1.add(dim4TextField);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Width (cm )");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);

        dim1scaleTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        dim1scaleTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dim1scaleTextField.setToolTipText("Width in centimeters along phase-encode direction."); // NOI18N
        dim1scaleTextField.setInputVerifier(new utilities.PositiveFloatInputVerifier());
        dim1scaleTextField.setName("dim1scaleTextField"); // NOI18N
        dim1scaleTextField.addPropertyChangeListener(formListener);
        jPanel1.add(dim1scaleTextField);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Height (cm)");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);

        dim2scaleTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        dim2scaleTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dim2scaleTextField.setToolTipText("Width in centimeters along readout direction."); // NOI18N
        dim2scaleTextField.setInputVerifier(new utilities.PositiveFloatInputVerifier());
        dim2scaleTextField.setName("dim2scaleTextField"); // NOI18N
        dim2scaleTextField.addPropertyChangeListener(formListener);
        jPanel1.add(dim2scaleTextField);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Slice size (cm)");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);

        dim3scaleTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        dim3scaleTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dim3scaleTextField.setToolTipText("Width in centimeters for slices."); // NOI18N
        dim3scaleTextField.setInputVerifier(new utilities.PositiveFloatInputVerifier());
        dim3scaleTextField.setName("dim3scaleTextField"); // NOI18N
        dim3scaleTextField.addPropertyChangeListener(formListener);
        jPanel1.add(dim3scaleTextField);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Total number of pixels");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);

        totalPointsTextField1.setEditable(false);
        totalPointsTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        totalPointsTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPointsTextField1.setToolTipText("Total number of pixels in the images."); // NOI18N
        totalPointsTextField1.setName("totalPointsTextField1"); // NOI18N
        jPanel1.add(totalPointsTextField1);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Number of lines in the file");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);

        linesInFileTextField2.setEditable(false);
        linesInFileTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        linesInFileTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        linesInFileTextField2.setToolTipText("Number of lines in the ascii image file."); // NOI18N
        linesInFileTextField2.setName("linesInFileTextField2"); // NOI18N
        jPanel1.add(linesInFileTextField2);

        setButton.setText("LOAD");
        setButton.setName("setButton"); // NOI18N
        setButton.setOpaque(true);
        setButton.addActionListener(formListener);

        cancelButton.setText("CANCEL");
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.setOpaque(true);
        cancelButton.addActionListener(formListener);

        fileStructurePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null), "Text File Parsing Parameters"));
        fileStructurePanel.setName("fileStructurePanel"); // NOI18N

        parsingOrderButtonGroup.add(loopSlicesFirstRadioButton);
        loopSlicesFirstRadioButton.setText("The most outer loop corresponds to slice dimension");
        loopSlicesFirstRadioButton.setToolTipText("<html>The most outer loop corresponds to slice dimension<br>\nNext loop corresponds to element dimension.<br>\nNext loop corresponds to phase-encode dimension.<br>\nLast loop corresponds to readout dimension.\n</html>"); // NOI18N
        loopSlicesFirstRadioButton.setName("loopSlicesFirstRadioButton"); // NOI18N
        loopSlicesFirstRadioButton.addActionListener(formListener);

        parsingOrderButtonGroup.add(loppElementsFirstRadioButton);
        loppElementsFirstRadioButton.setText("The most outer loop corresponds to element dimension");
        loppElementsFirstRadioButton.setToolTipText("<html>The most outer loop corresponds to element dimension<br>\nNext loop corresponds to slice dimension.<br>\nNext loop corresponds to phase-encode dimension.<br>\nLast loop corresponds to readout dimension.\n</html>"); // NOI18N
        loppElementsFirstRadioButton.setName("loppElementsFirstRadioButton"); // NOI18N
        loppElementsFirstRadioButton.addActionListener(formListener);

        org.jdesktop.layout.GroupLayout fileStructurePanelLayout = new org.jdesktop.layout.GroupLayout(fileStructurePanel);
        fileStructurePanel.setLayout(fileStructurePanelLayout);
        fileStructurePanelLayout.setHorizontalGroup(
            fileStructurePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fileStructurePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(fileStructurePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(loopSlicesFirstRadioButton)
                    .add(loppElementsFirstRadioButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                .addContainerGap())
        );
        fileStructurePanelLayout.setVerticalGroup(
            fileStructurePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fileStructurePanelLayout.createSequentialGroup()
                .add(loppElementsFirstRadioButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(loopSlicesFirstRadioButton))
        );

        fileStructurePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null), "Abscissa"));
        fileStructurePanel1.setName("fileStructurePanel1"); // NOI18N
        fileStructurePanel1.setLayout(new javax.swing.BoxLayout(fileStructurePanel1, javax.swing.BoxLayout.LINE_AXIS));

        loadAbscissaCB.setText("Load "); // NOI18N
        loadAbscissaCB.setToolTipText("<html><p style=\"margin: 6px;\"><font size=\"4\">\nInclude constant term into model?\n</html>\n\n\n"); // NOI18N
        loadAbscissaCB.setFocusPainted(false);
        loadAbscissaCB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadAbscissaCB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loadAbscissaCB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bayes/resources/buttons/rb.gif"))); // NOI18N
        loadAbscissaCB.setMargin(new java.awt.Insets(0, 0, 0, 0));
        loadAbscissaCB.setName("loadAbscissaCB"); // NOI18N
        loadAbscissaCB.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/bayes/resources/buttons/rbp.gif"))); // NOI18N
        loadAbscissaCB.setRolloverEnabled(true);
        loadAbscissaCB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bayes/resources/buttons/rbr.gif"))); // NOI18N
        loadAbscissaCB.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/bayes/resources/buttons/rbrs.gif"))); // NOI18N
        loadAbscissaCB.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/bayes/resources/buttons/rbs.gif"))); // NOI18N
        loadAbscissaCB.addItemListener(formListener);
        fileStructurePanel1.add(loadAbscissaCB);

        abscissaFileTextField.setEditable(false);
        abscissaFileTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        abscissaFileTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        abscissaFileTextField.setToolTipText("Number of lines in the ascii image file."); // NOI18N
        abscissaFileTextField.setName("abscissaFileTextField"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, loadAbscissaCB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), abscissaFileTextField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        fileStructurePanel1.add(abscissaFileTextField);

        setAbscissaButton.setText("Set ");
        setAbscissaButton.setName("setAbscissaButton"); // NOI18N
        setAbscissaButton.setOpaque(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, loadAbscissaCB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), setAbscissaButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        setAbscissaButton.addActionListener(formListener);
        fileStructurePanel1.add(setAbscissaButton);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(cancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(setButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                        .add(fileStructurePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(fileStructurePanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {cancelButton, setButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.linkSize(new java.awt.Component[] {fileStructurePanel, fileStructurePanel1, jPanel1}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 324, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fileStructurePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fileStructurePanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(setButton)
                    .add(cancelButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {cancelButton, setButton}, org.jdesktop.layout.GroupLayout.VERTICAL);

        bindingGroup.bind();

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.ItemListener, java.awt.event.WindowListener, java.beans.PropertyChangeListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == setButton) {
                Ascii2ImageDialog.this.setButtonActionPerformed(evt);
            }
            else if (evt.getSource() == cancelButton) {
                Ascii2ImageDialog.this.cancelButtonActionPerformed(evt);
            }
            else if (evt.getSource() == loopSlicesFirstRadioButton) {
                Ascii2ImageDialog.this.loopSlicesFirstRadioButtonActionPerformed(evt);
            }
            else if (evt.getSource() == loppElementsFirstRadioButton) {
                Ascii2ImageDialog.this.loppElementsFirstRadioButtonActionPerformed(evt);
            }
            else if (evt.getSource() == setAbscissaButton) {
                Ascii2ImageDialog.this.setAbscissaButtonActionPerformed(evt);
            }
        }

        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            if (evt.getSource() == loadAbscissaCB) {
                Ascii2ImageDialog.this.loadAbscissaCBItemStateChanged(evt);
            }
        }

        public void windowActivated(java.awt.event.WindowEvent evt) {
        }

        public void windowClosed(java.awt.event.WindowEvent evt) {
        }

        public void windowClosing(java.awt.event.WindowEvent evt) {
            if (evt.getSource() == Ascii2ImageDialog.this) {
                Ascii2ImageDialog.this.formWindowClosing(evt);
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

        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            if (evt.getSource() == dim1TextField) {
                Ascii2ImageDialog.this.pointsChangedPropertyEven(evt);
            }
            else if (evt.getSource() == dim2TextField) {
                Ascii2ImageDialog.this.pointsChangedPropertyEven(evt);
            }
            else if (evt.getSource() == dim3TextField) {
                Ascii2ImageDialog.this.pointsChangedPropertyEven(evt);
            }
            else if (evt.getSource() == dim4TextField) {
                Ascii2ImageDialog.this.pointsChangedPropertyEven(evt);
            }
            else if (evt.getSource() == dim1scaleTextField) {
                Ascii2ImageDialog.this.dim1scaleTextFieldpointsChangedPropertyEven(evt);
            }
            else if (evt.getSource() == dim2scaleTextField) {
                Ascii2ImageDialog.this.dim2scaleTextFieldpointsChangedPropertyEven(evt);
            }
            else if (evt.getSource() == dim3scaleTextField) {
                Ascii2ImageDialog.this.dim3scaleTextFieldpointsChangedPropertyEven(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void update( Ascii2ImageConverter aconverter){
        //update settings
         setConverter(aconverter);



         // be default values are not active unless "set" button is pressed
         setCanceled(true);

         ImageDescriptor id     =   aconverter.getDescriptor();

         getDim1TextField ().setValue(id .getNumberOfPhaseEncodes());
         getDim2TextField ().setValue(id .getNumberOfReadouts());
         getDim3TextField ().setValue(id .getNumberOfSlices());
         getDim4TextField ().setValue(id .getNumberOfElements());

         //getDim1scaleTextField().setValue(id.getScaling1());
         //getDim2scaleTextField().setValue(id.getScaling2());
         //getDim3scaleTextField().setValue(id.getScaling3());

         getDim1scaleTextField().setValue(this.getWidthInCm());
         getDim2scaleTextField().setValue(this.getHeightInCm());
         getDim3scaleTextField().setValue(this.getThicknessInCm());

        boolean slicesFirst     =     aconverter.isSclicesFirst();
        getLoopSlicesFirstRadioButton () .setSelected(slicesFirst);
        getLoppElementsFirstRadioButton().setSelected(!slicesFirst);

         //load absciss
         getLoadAbscissaCheckBox().setSelected(aconverter.isLoadAbscissa());
         setLoadAbscissaFields(aconverter.getAbscissaFile());


         getInstance( ). getLinesInFileTextField ().setValue(aconverter.getNumberOfLinesInFile());

         getInstance( ).recalculate();

    }
    private void recalculate(){
         int total            = getGuiTotal();
         getTotalPointsTextField ().setValue(total);

         getTotalPointsTextField ().setForeground(java.awt.Color.RED);

        int lines            = getGuiFileNLines();
        if(lines == total){
                 getTotalPointsTextField ().setForeground(java.awt.Color.BLACK);
        }

    }

    private boolean isValidParameters(){
        setErrorMessage(null);
        int total               =   getGuiTotal();
        int lines               =   getGuiFileNLines();
        boolean isValid         =   true;
        if(lines != total){
                setErrorMessage(String.format("Total mumber of pixels (%d) must\n" + "be equal to a number of lines in\n" + "the ascii data file (%d)", total, lines));
                isValid         =   false;
        }


        return isValid;
    }



    private void setButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        int val             =   0;
        float fval          =   0;

        // check for validity
        boolean isValid = isValidParameters();
        if (isValid  == false){
            if (getErrorMessage() != null){
                DisplayText.popupErrorMessage(getErrorMessage());
            }
            return;
        }


        // dimension1
        val             = ((Number)getDim1TextField().getValue()).intValue();
        getConverter().getDescriptor( ).setNumberOfColumns(val);

        fval             = ((Number)getDim1scaleTextField().getValue()).floatValue();
        setWidthInCm( fval  );
        getConverter().getDescriptor( ).setScaling1(10*getWidthInCm()/ val );



        // dimension 2
        val             = ((Number)getDim2TextField().getValue()).intValue();
        getConverter().getDescriptor( ).setNumberOfRows(val);

        fval             = ((Number)getDim2scaleTextField().getValue()).floatValue();
        setHeightInCm(fval );
        getConverter().getDescriptor( ).setScaling2(10*getHeightInCm()/ val);


        // dimension3
        val             = ((Number)getDim3TextField().getValue()).intValue();
        getConverter().getDescriptor( ).setNumberOfSlices(val);


        fval             = ((Number)getDim3scaleTextField().getValue()).floatValue();
        setThicknessInCm(fval );
        getConverter().getDescriptor( ).setScaling3(10*getThicknessInCm()/ val);



        // dimension 4
        val             = ((Number)getDim4TextField().getValue()).intValue();
        getConverter().getDescriptor( ).setNumberOfElements(val);

      

        boolean slicesFirst =      getLoopSlicesFirstRadioButton ().isSelected();
        getConverter().setSclicesFirst(slicesFirst);

        setCanceled(false);
        hideDialog( );
}//GEN-LAST:event_setButtonActionPerformed
    private void pointsChangedPropertyEven (java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pointsChangedPropertyEven
        if(evt.getPropertyName().equalsIgnoreCase("value")){
                recalculate();
        }
    }//GEN-LAST:event_pointsChangedPropertyEven
    private void dim1scaleTextFieldpointsChangedPropertyEven (java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dim1scaleTextFieldpointsChangedPropertyEven
        // TODO add your handling code here:
}//GEN-LAST:event_dim1scaleTextFieldpointsChangedPropertyEven
    private void dim2scaleTextFieldpointsChangedPropertyEven (java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dim2scaleTextFieldpointsChangedPropertyEven
        // TODO add your handling code here:
}//GEN-LAST:event_dim2scaleTextFieldpointsChangedPropertyEven
    private void dim3scaleTextFieldpointsChangedPropertyEven (java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dim3scaleTextFieldpointsChangedPropertyEven
        // TODO add your handling code here:
}//GEN-LAST:event_dim3scaleTextFieldpointsChangedPropertyEven
    private void cancelButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
         hideDialog( );
}//GEN-LAST:event_cancelButtonActionPerformed
    private void formWindowClosing (java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
    private void loopSlicesFirstRadioButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loopSlicesFirstRadioButtonActionPerformed
}//GEN-LAST:event_loopSlicesFirstRadioButtonActionPerformed
    private void loppElementsFirstRadioButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loppElementsFirstRadioButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_loppElementsFirstRadioButtonActionPerformed
    private void setAbscissaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAbscissaButtonActionPerformed
        File startdir   = null;
        try{
           startdir  =  getConverter().getAsciiImageFile().getParentFile();
        } catch (Exception e){ e.printStackTrace();}

        File abscissafile  = DataLoader.assignAbscissaFile(startdir);
        setLoadAbscissaFields(abscissafile);
       
    }//GEN-LAST:event_setAbscissaButtonActionPerformed

    private void loadAbscissaCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_loadAbscissaCBItemStateChanged
       if (evt.getStateChange() == ItemEvent.SELECTED){
            getConverter().setLoadAbscissa(true);
       }
        else{
             getConverter().setLoadAbscissa(false);
        }

}//GEN-LAST:event_loadAbscissaCBItemStateChanged


    private void setLoadAbscissaFields(File abscissafile){
           if (abscissafile != null && abscissafile.exists()){
             getConverter().setAbscissaFile(abscissafile);
             getAbscissaFileTextField().setText(abscissafile.getName());
             getAbscissaFileTextField().setToolTipText(abscissafile.getPath());
        }
        else{
             getConverter().setAbscissaFile(null);
             getAbscissaFileTextField().setText("");
             getAbscissaFileTextField().setToolTipText("No abscissa file is currently set.");

        }
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ascii2ImageDialog dialog = new Ascii2ImageDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField abscissaFileTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JFormattedTextField dim1TextField;
    private javax.swing.JFormattedTextField dim1scaleTextField;
    private javax.swing.JFormattedTextField dim2TextField;
    private javax.swing.JFormattedTextField dim2scaleTextField;
    private javax.swing.JFormattedTextField dim3TextField;
    private javax.swing.JFormattedTextField dim3scaleTextField;
    private javax.swing.JFormattedTextField dim4TextField;
    private javax.swing.JPanel fileStructurePanel;
    private javax.swing.JPanel fileStructurePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField linesInFileTextField2;
    public javax.swing.JCheckBox loadAbscissaCB;
    private javax.swing.JRadioButton loopSlicesFirstRadioButton;
    private javax.swing.JRadioButton loppElementsFirstRadioButton;
    private javax.swing.ButtonGroup parsingOrderButtonGroup;
    private javax.swing.JButton setAbscissaButton;
    private javax.swing.JButton setButton;
    private javax.swing.JFormattedTextField totalPointsTextField1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JFormattedTextField getDim2TextField () {
        return dim2TextField;
    }
    public javax.swing.JFormattedTextField getDim3TextField () {
        return dim3TextField;
    }
    public javax.swing.JFormattedTextField getDim4TextField () {
        return dim4TextField;
    }
    public javax.swing.JFormattedTextField getDim1TextField () {
        return dim1TextField;
    }
    public javax.swing.JFormattedTextField getLinesInFileTextField () {
        return linesInFileTextField2;
    }
    public javax.swing.JFormattedTextField getTotalPointsTextField () {
        return totalPointsTextField1;
    }
    public javax.swing.JFormattedTextField getDim1scaleTextField () {
        return dim1scaleTextField;
    }
    public javax.swing.JFormattedTextField getDim2scaleTextField () {
        return dim2scaleTextField;
    }
    public javax.swing.JFormattedTextField getDim3scaleTextField () {
        return dim3scaleTextField;
    }
    public javax.swing.JRadioButton        getLoopSlicesFirstRadioButton () {
        return loopSlicesFirstRadioButton;
    }
    public javax.swing.JRadioButton        getLoppElementsFirstRadioButton () {
        return loppElementsFirstRadioButton;
    }
    public javax.swing.JCheckBox           getLoadAbscissaCheckBox() {
        return loadAbscissaCB;
    }
    public javax.swing.JFormattedTextField getAbscissaFileTextField() {
        return abscissaFileTextField;
    }


    public Ascii2ImageConverter getConverter () {
        return converter;
    }
    public void setConverter ( Ascii2ImageConverter converter ) {
        this.converter = converter;
    }

    public boolean isCanceled () {
        return canceled;
    }
    public void setCanceled ( boolean canceled ) {
        this.canceled = canceled;
    }

    public static boolean isDialogCanceled () {
        return getInstance().isCanceled();
    }



  
    private int getGuiDimension1(){
         int dim             = ((Number)getDim1TextField().getValue()).intValue();
         return dim;
    }
    private int getGuiDimension2(){
         int dim             = ((Number)getDim2TextField().getValue()).intValue();
         return dim;
    }
    private int getGuiDimension3(){
         int dim             = ((Number)getDim3TextField().getValue()).intValue();
         return dim;
    }
    private int getGuiDimension4(){
         int dim             = ((Number)getDim4TextField().getValue()).intValue();
         return dim;
    }
    private int getGuiTotal(){
         int dim1             =  getGuiDimension1();
         int dim2             =  getGuiDimension2();
         int dim3             =  getGuiDimension3();
         int dim4             =  getGuiDimension4();

         int total            = dim1*dim2*dim3*dim4;

         return total;

    }
    private int getGuiFileNLines(){
         int dim             = ((Number)getLinesInFileTextField ().getValue()).intValue();
         return dim;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isRememberPreviousSettings() {
        return rememberPreviousSettings;
    }
    public void setRememberPreviousSettings(boolean rememberPreviousSettings) {
        this.rememberPreviousSettings = rememberPreviousSettings;
    }

    public float  getWidthInCm() {
        return widthInCm;
    }
    public void setWidthInCm(float widthInCm) {
        this.widthInCm = widthInCm;
    }

    public float  getHeightInCm() {
        return heightInCm;
    }
    public void setHeightInCm(float heightInCm) {
        this.heightInCm = heightInCm;
    }

    public float  getThicknessInCm() {
        return thicknessInCm;
    }
    public void setThicknessInCm(float thicknessInCm) {
        this.thicknessInCm = thicknessInCm;
    }

   


}
