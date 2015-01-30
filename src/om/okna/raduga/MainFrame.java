package om.okna.raduga;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static om.okna.raduga.Raduga.image;

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
        setIconImage(image.getImage());
        new ReedArraySQL();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MainTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        choiceTextField = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Радуга");
        setLocationByPlatform(true);

        MainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Заказчик", "Адрес", "Договор №", "Работы", "Обьем", "Контакт исп.", "Контакт зак.", "Начало", "Окончание", "Подтверждение", "Цена", "Оплата", "Долг", "Примечание"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MainTable.getTableHeader().setReorderingAllowed(false);
        MainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MainTable);
        if (MainTable.getColumnModel().getColumnCount() > 0) {
            MainTable.getColumnModel().getColumn(0).setResizable(false);
            MainTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            MainTable.getColumnModel().getColumn(1).setMinWidth(140);
            MainTable.getColumnModel().getColumn(2).setMinWidth(140);
            MainTable.getColumnModel().getColumn(3).setMinWidth(60);
            MainTable.getColumnModel().getColumn(4).setMinWidth(80);
            MainTable.getColumnModel().getColumn(6).setMinWidth(60);
            MainTable.getColumnModel().getColumn(7).setMinWidth(60);
        }

        refreshButton.setText("Обновить");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Изменить");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Добавить");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        removeButton.setText("Удалить");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("www.okna-om.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choiceTextField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(removeButton)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        clearTable();
        new ReedArraySQL();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
        if(MainTable.getSelectedRow()>=0){
            try {
                new ChangeFrame().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            sendMessage("Выберите строку в таблице");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new AddFrame().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainTableMouseClicked
        choiceTextField.setText(getTextFromCell());
        if(evt.getClickCount()>=2) jButton3.doClick();
    }//GEN-LAST:event_MainTableMouseClicked

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        new PasswordFrame().setVisible(true);
    }//GEN-LAST:event_removeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable MainTable;
    private javax.swing.JTextField choiceTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton refreshButton;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables

    public static void sendMessage(String s) {
        JOptionPane.showMessageDialog(null, s, "Предупреждение.", JOptionPane.INFORMATION_MESSAGE);
    }

    private String getTextFromCell() {
        DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
        String res = "";
        try{
            res = model.getValueAt(MainTable.getSelectedRow(), MainTable.getSelectedColumn()).toString();
        }catch(Exception e){
            LogerFrame.out("Ошибка: "+e);
        }
        LogerFrame.out("Данные выбранной ячейки: "+res);
        return res;
    }

    public static int getSelectidId() {
        String msg = "Удаляется заказчик с ID = ";
        DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
        try{
            LogerFrame.out(msg + model.getValueAt(MainTable.getSelectedRow(), 0));
            return model.getValueAt(MainTable.getSelectedRow(), 0).hashCode();
        }catch(Exception e){
            LogerFrame.out("Ошибка: "+e);
            return 0;
        }
    }

    private void clearTable() {
        DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
}
