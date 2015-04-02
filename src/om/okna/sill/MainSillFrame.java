package om.okna.sill;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Виктор
 */
public class MainSillFrame extends javax.swing.JFrame {

    static ImageIcon image = new ImageIcon(MainSillFrame.class.getResource("/favicon.png"));
    
    public MainSillFrame() {
        setLocationRelativeTo(null);
        setIconImage(image.getImage());
        initComponents();
    }
    
    int windowCalculate(String s){
        return convertInt(s) + 300;
    }
    
    int convertInt(String s){
        return Integer.parseInt(s);
    }
    
    void addLine(){
        DefaultTableModel model = (DefaultTableModel) ValueTable.getModel();
        if (RadioButtonPodokonnik.isSelected()){
            model.addRow(new Object[] {convertInt(WidthField.getText()), convertInt(AmountField.getText())});
        } else {
            model.addRow(new Object[] {windowCalculate(WidthField.getText()), convertInt(AmountField.getText())});
        }
    }
    
    void sendMessage(String s){
        JOptionPane.showMessageDialog(null, s, "Предупреждение.", JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        TabbedPane = new javax.swing.JTabbedPane();
        DesignPanel = new javax.swing.JPanel();
        WidthField = new javax.swing.JTextField();
        ScrollPane = new javax.swing.JScrollPane();
        ValueTable = new javax.swing.JTable();
        CalculateButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        CleanButton = new javax.swing.JButton();
        AmountField = new javax.swing.JTextField();
        WidthLabel = new javax.swing.JLabel();
        AmountLabel = new javax.swing.JLabel();
        RadioButtonOkno = new javax.swing.JRadioButton();
        RadioButtonPodokonnik = new javax.swing.JRadioButton();
        ResultsPanel = new javax.swing.JPanel();
        SegmentsScrollPane = new javax.swing.JScrollPane();
        SegmentsTextPane = new javax.swing.JTextPane();
        ResultsLabel = new javax.swing.JLabel();
        ResultsField = new javax.swing.JTextField();
        ResultsCleanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Калькулятор подоконников");
        setResizable(false);

        WidthField.setText("0");
        WidthField.setToolTipText("");
        WidthField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WidthFieldMouseClicked(evt);
            }
        });
        WidthField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                WidthFieldFocusLost(evt);
            }
        });
        WidthField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WidthFieldKeyPressed(evt);
            }
        });

        ValueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Размер", "Количество"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPane.setViewportView(ValueTable);

        CalculateButton.setText("Расчитать");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Добавить");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        CleanButton.setText("Очистить");
        CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanButtonActionPerformed(evt);
            }
        });

        AmountField.setText("0");
        AmountField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmountFieldMouseClicked(evt);
            }
        });
        AmountField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AmountFieldFocusLost(evt);
            }
        });
        AmountField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AmountFieldKeyPressed(evt);
            }
        });

        WidthLabel.setText("Размер:");

        AmountLabel.setText("Количество:");

        buttonGroup.add(RadioButtonOkno);
        RadioButtonOkno.setText("Окно");
        RadioButtonOkno.setToolTipText("Добавляются значения  в таблицу: размер окна + 300 мм.");

        buttonGroup.add(RadioButtonPodokonnik);
        RadioButtonPodokonnik.setSelected(true);
        RadioButtonPodokonnik.setText("Подоконник");
        RadioButtonPodokonnik.setToolTipText("Точное значение подоконника.");

        javax.swing.GroupLayout DesignPanelLayout = new javax.swing.GroupLayout(DesignPanel);
        DesignPanel.setLayout(DesignPanelLayout);
        DesignPanelLayout.setHorizontalGroup(
            DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesignPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(DesignPanelLayout.createSequentialGroup()
                        .addGroup(DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WidthField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WidthLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonOkno)
                            .addComponent(RadioButtonPodokonnik)))
                    .addGroup(DesignPanelLayout.createSequentialGroup()
                        .addComponent(CleanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalculateButton)))
                .addContainerGap())
        );
        DesignPanelLayout.setVerticalGroup(
            DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesignPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WidthLabel)
                    .addComponent(AmountLabel)
                    .addComponent(RadioButtonOkno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WidthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButtonPodokonnik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CleanButton)
                    .addComponent(CalculateButton)
                    .addComponent(AddButton))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Конструкции", DesignPanel);

        SegmentsTextPane.setEditable(false);
        SegmentsScrollPane.setViewportView(SegmentsTextPane);

        ResultsLabel.setText("Хлыстов подоконника:");

        ResultsField.setEditable(false);

        ResultsCleanButton.setText("Очистить");
        ResultsCleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultsCleanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultsPanelLayout = new javax.swing.GroupLayout(ResultsPanel);
        ResultsPanel.setLayout(ResultsPanelLayout);
        ResultsPanelLayout.setHorizontalGroup(
            ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SegmentsScrollPane)
                    .addGroup(ResultsPanelLayout.createSequentialGroup()
                        .addComponent(ResultsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResultsField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(ResultsCleanButton)))
                .addContainerGap())
        );
        ResultsPanelLayout.setVerticalGroup(
            ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ResultsLabel)
                        .addComponent(ResultsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ResultsCleanButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SegmentsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPane.addTab("Результаты", ResultsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ValueTable.getModel();
        if (model.getRowCount() == 0){
            sendMessage("В таблице отсутствуют значения.");
        } else {
            ResultsCleanButton.doClick();
            new CalculateThrade().start();
        }
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if (convertInt(WidthField.getText()) <= 100){
            sendMessage("Ширина подоконника не может быть меньше 100мм");
        } else if (convertInt(WidthField.getText()) >= 6000){
            sendMessage("Ширина окна не может быть больше 6м");
        } else if (convertInt(AmountField.getText()) <= 0){
            sendMessage("Количество подоконников не может быть менее одного");
        } else if (convertInt(AmountField.getText()) >= 500){
            sendMessage("Количество подоконников более 500 не предусмотрено программой");
        } else {
            addLine();
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ValueTable.getModel();
        while (model.getRowCount() > 0)  model.removeRow(0);
    }//GEN-LAST:event_CleanButtonActionPerformed

    private void ResultsCleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultsCleanButtonActionPerformed
        SegmentsTextPane.setText(null);
        ResultsField.setText(null);
    }//GEN-LAST:event_ResultsCleanButtonActionPerformed

    private void WidthFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WidthFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            AmountField.setText(null);
            AmountField.requestFocusInWindow();
        }
    }//GEN-LAST:event_WidthFieldKeyPressed

    private void WidthFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WidthFieldMouseClicked
        WidthField.setText(null);
    }//GEN-LAST:event_WidthFieldMouseClicked

    private void AmountFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmountFieldMouseClicked
        AmountField.setText(null);
    }//GEN-LAST:event_AmountFieldMouseClicked

    private void AmountFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AmountFieldFocusLost
        if ("".equals(AmountField.getText())){
            AmountField.setText("0");
        }
    }//GEN-LAST:event_AmountFieldFocusLost

    private void WidthFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WidthFieldFocusLost
        if ("".equals(WidthField.getText())){
            WidthField.setText("0");
        }
    }//GEN-LAST:event_WidthFieldFocusLost

    private void AmountFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            AddButton.doClick();
            AmountField.setText("0");
            WidthField.setText(null);
            WidthField.requestFocusInWindow();
        }
    }//GEN-LAST:event_AmountFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AmountField;
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JButton CleanButton;
    private javax.swing.JPanel DesignPanel;
    private javax.swing.JRadioButton RadioButtonOkno;
    private javax.swing.JRadioButton RadioButtonPodokonnik;
    private javax.swing.JButton ResultsCleanButton;
    static javax.swing.JTextField ResultsField;
    private javax.swing.JLabel ResultsLabel;
    private javax.swing.JPanel ResultsPanel;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JScrollPane SegmentsScrollPane;
    static javax.swing.JTextPane SegmentsTextPane;
    private javax.swing.JTabbedPane TabbedPane;
    static javax.swing.JTable ValueTable;
    private javax.swing.JTextField WidthField;
    private javax.swing.JLabel WidthLabel;
    private javax.swing.ButtonGroup buttonGroup;
    // End of variables declaration//GEN-END:variables
}
