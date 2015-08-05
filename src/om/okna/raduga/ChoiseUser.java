/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import javax.swing.JTable;
import static om.okna.raduga.Main.clearTable;
import static om.okna.raduga.Main.tableModel;
import static om.okna.raduga.Options.debugMode;
import static om.okna.raduga.SQLHandler.selectDataFromTable;

/**
 *
 * @author Виктор
 */
public class ChoiseUser extends javax.swing.JFrame {

    String field[]={"id","username","email","security"};
    
    public ChoiseUser() {
        initComponents();
        getUsers();
    }
    
    private void getUsers(){
        String[][] data=selectDataFromTable(field,"users");
        for (String[] s : data) {
            fillTable(s);
        }
    }
    
    private void fillTable(String[] s){
        tableModel(userListTable).addRow(s);
    }
    
    private int getIdFromRow(JTable t){
        int result=t.getValueAt(t.getSelectedRow(),0).hashCode();
        return result;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        сancelButton = new javax.swing.JToggleButton();
        removeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        сancelButton.setText("Отмена");
        сancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                сancelButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Удалить");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User", "eMail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(userListTable);
        if (userListTable.getColumnModel().getColumnCount() > 0) {
            userListTable.getColumnModel().getColumn(0).setMaxWidth(50);
            userListTable.getColumnModel().getColumn(1).setResizable(false);
            userListTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 172, Short.MAX_VALUE)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(сancelButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(сancelButton)
                    .addComponent(removeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        if(getIdFromRow(userListTable)<=0){
            Loger.out("ОШШИБКААААААААААА!1111111");
        }else{
            Loger.out("Удаляем пользователя с ID: "
                +getIdFromRow(userListTable));
        }
        clearTable(userListTable);
        getUsers();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void сancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_сancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_сancelButtonActionPerformed

    private void userListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListTableMouseClicked
        if(evt.getClickCount()>=2){
            String row=(String) tableModel(userListTable).getValueAt(userListTable.getSelectedRow(),0);
            new UserEdit(Integer.valueOf(row));
            this.dispose();
        }
    }//GEN-LAST:event_userListTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeButton;
    public static javax.swing.JTable userListTable;
    private javax.swing.JToggleButton сancelButton;
    // End of variables declaration//GEN-END:variables
}
