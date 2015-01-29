package om.okna.raduga;

import java.util.Arrays;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import static om.okna.raduga.MainFrame.MainTable;

public class ChangeFrame extends javax.swing.JFrame {
    
    public ChangeFrame() throws Exception{
        initComponents();
        setDataFromTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        clientTextField = new javax.swing.JTextField();
        objectTextField = new javax.swing.JTextField();
        contractTextField = new javax.swing.JTextField();
        nominationTextField = new javax.swing.JTextField();
        sizeTextField = new javax.swing.JTextField();
        contact_insideTextField = new javax.swing.JTextField();
        contact_outsideTextField = new javax.swing.JTextField();
        date_startTextField = new javax.swing.JTextField();
        date_endTextField = new javax.swing.JTextField();
        date_confirmationTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        noteTextField = new javax.swing.JTextField();
        paymentTextField = new javax.swing.JTextField();
        debtTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Форма");
        setLocationByPlatform(true);

        idLabel.setText("ID");

        idTextField.setEditable(false);
        idTextField.setText("0");

        saveButton.setText("Сохранить");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        clientTextField.setText("client");

        objectTextField.setText("object");

        contractTextField.setText("contract");

        nominationTextField.setText("nomination");

        sizeTextField.setText("size");

        contact_insideTextField.setText("contact_inside");

        contact_outsideTextField.setText("contact_outside");

        date_startTextField.setText("date_start");

        date_endTextField.setText("date_end");

        date_confirmationTextField.setText("date_confirmation");

        priceTextField.setText("price");

        noteTextField.setText("note");

        paymentTextField.setText("payment");

        debtTextField.setText("debt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(debtTextField)
                    .addComponent(clientTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 244, Short.MAX_VALUE)
                        .addComponent(saveButton))
                    .addComponent(objectTextField)
                    .addComponent(contractTextField)
                    .addComponent(nominationTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sizeTextField)
                    .addComponent(contact_insideTextField)
                    .addComponent(contact_outsideTextField)
                    .addComponent(date_startTextField)
                    .addComponent(date_endTextField)
                    .addComponent(date_confirmationTextField)
                    .addComponent(priceTextField)
                    .addComponent(noteTextField)
                    .addComponent(paymentTextField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(objectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contractTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nominationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contact_insideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contact_outsideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_startTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_endTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_confirmationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(debtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String[] data = {
            idTextField.getText(),
            clientTextField.getText(),
            objectTextField.getText(),
            contractTextField.getText(),
            nominationTextField.getText(),
            sizeTextField.getText(),
            contact_insideTextField.getText(),
            contact_outsideTextField.getText(),
            date_startTextField.getText(),
            date_endTextField.getText(),
            date_confirmationTextField.getText(),
            priceTextField.getText(),
            noteTextField.getText(),
            paymentTextField.getText(),
            debtTextField.getText()
        };
        LogerFrame.out(Arrays.toString(data));
        //new WriteDataSQL(data);
        new SQLHandler().updateData(data);
        MainFrame.jButton1.doClick();
        this.dispose();
        
    }//GEN-LAST:event_saveButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientTextField;
    private javax.swing.JTextField contact_insideTextField;
    private javax.swing.JTextField contact_outsideTextField;
    private javax.swing.JTextField contractTextField;
    private javax.swing.JTextField date_confirmationTextField;
    private javax.swing.JTextField date_endTextField;
    private javax.swing.JTextField date_startTextField;
    private javax.swing.JTextField debtTextField;
    private javax.swing.JLabel idLabel;
    public static javax.swing.JTextField idTextField;
    private javax.swing.JTextField nominationTextField;
    private javax.swing.JTextField noteTextField;
    private javax.swing.JTextField objectTextField;
    private javax.swing.JTextField paymentTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField sizeTextField;
    // End of variables declaration//GEN-END:variables

    private String getDataFromTable(int column){
        DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
        if(model.getValueAt(MainTable.getSelectedRow(), column) != null){
            LogerFrame.out(model.getValueAt(MainTable.getSelectedRow(), column));
            return model.getValueAt(MainTable.getSelectedRow(), column).toString();
        }else{
            return "";
        }
    }

    private void setDataFromTable() {
        idTextField.setText(getDataFromTable(0));
        clientTextField.setText(getDataFromTable(1));
        objectTextField.setText(getDataFromTable(2));
        contractTextField.setText(getDataFromTable(3));
        nominationTextField.setText(getDataFromTable(4));
        sizeTextField.setText(getDataFromTable(5));
        contact_insideTextField.setText(getDataFromTable(6));
        contact_outsideTextField.setText(getDataFromTable(7));
        date_startTextField.setText(getDataFromTable(8));
        date_endTextField.setText(getDataFromTable(9));
        date_confirmationTextField.setText(getDataFromTable(10));
        priceTextField.setText(getDataFromTable(11));
        noteTextField.setText(getDataFromTable(12));
        paymentTextField.setText(getDataFromTable(13));
        debtTextField.setText(getDataFromTable(14));
    }
}