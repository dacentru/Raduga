package om.okna.raduga;

import java.util.Arrays;

public class AddFrame extends javax.swing.JFrame {

    public AddFrame() {
        initComponents();
        this.setSize(335, 485);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        objectTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contractTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nominationTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sizeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contact_insideTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        date_startTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contact_outsideTextField = new javax.swing.JTextField();
        date_endTextField = new javax.swing.JTextField();
        date_confirmationTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        paymentTextField = new javax.swing.JTextField();
        debtTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        noteTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Форма добавления заказичка");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(330, 449));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(clientTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, -1));

        jLabel1.setText("Заказчик/Подрядчик:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(objectTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, -1));

        jLabel2.setText("Адрес обьекта:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setText("Договор №:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(contractTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, -1));

        jLabel4.setText("Наименование работ:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(nominationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 310, -1));

        jButton1.setText("Отмена");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        jButton2.setText("Добавить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        jLabel5.setText("Обьем работ:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));
        getContentPane().add(sizeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, -1));

        jLabel6.setText("Контакт исполнителя:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        getContentPane().add(contact_insideTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, -1));

        jLabel7.setText("Дата начала:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        getContentPane().add(date_startTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 90, -1));

        jLabel8.setText("Контакт заказчика:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));
        getContentPane().add(contact_outsideTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, -1));
        getContentPane().add(date_endTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 90, -1));
        getContentPane().add(date_confirmationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, -1));

        jLabel9.setText("Оплачено:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel10.setText("Подтверждение:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));
        getContentPane().add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, -1));

        jLabel11.setText("Цена:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel12.setText("www.okna-om.com");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel13.setText("Дата окончания:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));
        getContentPane().add(paymentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 90, -1));
        getContentPane().add(debtTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 90, -1));

        jLabel14.setText("Задолжность:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel15.setText("Примечание:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        getContentPane().add(noteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] data = {
            "",
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
        new SQLHandler().newClient(data);
        MainFrame.refreshButton.doClick();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientTextField;
    private javax.swing.JTextField contact_insideTextField;
    private javax.swing.JTextField contact_outsideTextField;
    private javax.swing.JTextField contractTextField;
    private javax.swing.JTextField date_confirmationTextField;
    private javax.swing.JTextField date_endTextField;
    private javax.swing.JTextField date_startTextField;
    private javax.swing.JTextField debtTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nominationTextField;
    private javax.swing.JTextField noteTextField;
    private javax.swing.JTextField objectTextField;
    private javax.swing.JTextField paymentTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField sizeTextField;
    // End of variables declaration//GEN-END:variables
}
