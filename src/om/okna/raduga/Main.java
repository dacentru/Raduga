package om.okna.raduga;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import static om.okna.raduga.Customers.accessCustomers;
import static om.okna.raduga.Options.debugMode;
import static om.okna.raduga.Options.maxAccessLevel;
import static om.okna.raduga.Raduga.iconImage;
import static om.okna.raduga.SQLHandler.selectDataFromTable;

/**
 *
 * @author Виктор
 */
public class Main extends javax.swing.JFrame {
    
    static int userAccess;
    static boolean accessMain;
    
    String[] registryQuery={"id","client","object","contract","nomination","size","contact_inside","contact_outside","date_start","date_end","date_confirmation","price","note","payment","debt"};
    
    public Main(){
        initComponents();
        setActive(true);
        
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        UIManager.put("OptionPane.cancelButtonText", "Отмена");
        UIManager.put("OptionPane.okButtonText", "Готово");
    }
    
    private void setActive(boolean b){
        accessMain=b;
    }
    
    public static void sendMessage(String s) {
        JOptionPane.showMessageDialog(null, s, "Предупреждение.", JOptionPane.INFORMATION_MESSAGE);
    }

    private String getTextFromCell(JTable t){
        String r = "";
        try{
            r = tableModel(t).getValueAt(t.getSelectedRow(), t.getSelectedColumn()).toString();
        }catch(Exception e){
            if(debugMode)Loger.out("Ошибка: "+e);
        }
        if(debugMode)Loger.out("Данные выбранной ячейки: "+r);
        return r;
    }
    
    public static DefaultTableModel tableModel(JTable t){
        return (DefaultTableModel) t.getModel();
    }

    public int getSelectidId() {
        JTable t = customersTable;
        try{
            if (debugMode)Loger.out("Удаляется заказчик с ID = "+tableModel(t).getValueAt(t.getSelectedRow(), 0));
            return tableModel(t).getValueAt(t.getSelectedRow(), 0).hashCode();
        }catch(Exception e) {
            if (debugMode)Loger.out("Ошибка: " + e);
            return 0;
        }
    }
    
    static void removeRow(JTable t){
        DefaultTableModel m=(DefaultTableModel) t.getModel();
        new SQLHandler().removeData((int) t.getValueAt(t.getSelectedRow(), 0));
    }

    static void clearTable(JTable t) {
        while (tableModel(t).getRowCount() > 0) {
            tableModel(t).removeRow(0);
        }
    }
    
    void refreshTable(JTable t){
        clearTable(t);
        String[][] data;
        if(t.equals(customersTable)){
            data=selectDataFromTable(registryQuery,"registry");
            for(String[] s:data){
                tableModel(customersTable).addRow(s);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registryTabbedPane = new javax.swing.JTabbedPane();
        mulePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        courierTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        brandLabel1 = new javax.swing.JLabel();
        customersPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        brandLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        choiceTextField = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        userMenu = new javax.swing.JMenu();
        adduserMenuItem = new javax.swing.JMenuItem();
        usereditMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        startsillMenuItem = new javax.swing.JMenuItem();
        optionsMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Радуга");
        setIconImage(iconImage.getImage());
        setLocationByPlatform(true);

        registryTabbedPane.setToolTipText("");
        registryTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registryTabbedPaneMouseClicked(evt);
            }
        });

        courierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Дата", "Пункт назначения", "Задача", "Оплата", "Имя", "Одобрено"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(courierTable);
        if (courierTable.getColumnModel().getColumnCount() > 0) {
            courierTable.getColumnModel().getColumn(0).setResizable(false);
            courierTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            courierTable.getColumnModel().getColumn(1).setResizable(false);
            courierTable.getColumnModel().getColumn(1).setPreferredWidth(10);
            courierTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            courierTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            courierTable.getColumnModel().getColumn(4).setResizable(false);
            courierTable.getColumnModel().getColumn(5).setResizable(false);
            courierTable.getColumnModel().getColumn(6).setResizable(false);
            courierTable.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        jButton1.setText("Удалить");

        jButton2.setText("Добавить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        brandLabel1.setText("www.okna-om.com");

        javax.swing.GroupLayout mulePanelLayout = new javax.swing.GroupLayout(mulePanel);
        mulePanel.setLayout(mulePanelLayout);
        mulePanelLayout.setHorizontalGroup(
            mulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                    .addGroup(mulePanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(brandLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        mulePanelLayout.setVerticalGroup(
            mulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(brandLabel1))
                .addContainerGap())
        );

        registryTabbedPane.addTab("Курьер", mulePanel);

        customersPanel.setPreferredSize(new java.awt.Dimension(1000, 430));

        customersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        customersTable.getTableHeader().setReorderingAllowed(false);
        customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customersTable);
        if (customersTable.getColumnModel().getColumnCount() > 0) {
            customersTable.getColumnModel().getColumn(0).setResizable(false);
            customersTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            customersTable.getColumnModel().getColumn(1).setMinWidth(140);
            customersTable.getColumnModel().getColumn(2).setMinWidth(140);
            customersTable.getColumnModel().getColumn(3).setMinWidth(60);
            customersTable.getColumnModel().getColumn(4).setMinWidth(80);
            customersTable.getColumnModel().getColumn(6).setMinWidth(60);
            customersTable.getColumnModel().getColumn(7).setMinWidth(60);
        }

        brandLabel.setText("www.okna-om.com");

        addButton.setText("Добавить");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        choiceTextField.setEditable(false);

        removeButton.setText("Удалить");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customersPanelLayout = new javax.swing.GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(choiceTextField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customersPanelLayout.createSequentialGroup()
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(brandLabel)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)))
                .addContainerGap())
        );
        customersPanelLayout.setVerticalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(addButton)
                    .addComponent(brandLabel))
                .addContainerGap())
        );

        registryTabbedPane.addTab("Заказчики", customersPanel);

        fileMenu.setText("Файл");

        exitMenuItem.setText("Выход");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        userMenu.setText("Пользователи");

        adduserMenuItem.setText("Добавить");
        adduserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserMenuItemActionPerformed(evt);
            }
        });
        userMenu.add(adduserMenuItem);

        usereditMenuItem.setText("Редактировать");
        usereditMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usereditMenuItemActionPerformed(evt);
            }
        });
        userMenu.add(usereditMenuItem);

        jMenuBar1.add(userMenu);

        jMenu4.setText("Дополнительно");

        startsillMenuItem.setText("Калькулятор подоконников");
        startsillMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startsillMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(startsillMenuItem);

        optionsMenuItem.setText("Параметры");
        optionsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(optionsMenuItem);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Справка");

        aboutMenuItem.setText("О программе");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(aboutMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registryTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registryTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adduserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserMenuItemActionPerformed
        if(userAccess >= maxAccessLevel){
            new UserEdit(0).setVisible(true);
        }else{
            sendMessage("У вас нет прав на добавление пользователей");
        }
    }//GEN-LAST:event_adduserMenuItemActionPerformed

    private void usereditMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usereditMenuItemActionPerformed
        if(userAccess >= maxAccessLevel){
            new ChoiseUser().setVisible(true);
        }else{
            sendMessage("У вас нет прав на редактирование пользователей");
        }
    }//GEN-LAST:event_usereditMenuItemActionPerformed

    private void optionsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsMenuItemActionPerformed
        new Options().setVisible(true);
    }//GEN-LAST:event_optionsMenuItemActionPerformed

    private void startsillMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startsillMenuItemActionPerformed
        new SillFrame().setVisible(true);
    }//GEN-LAST:event_startsillMenuItemActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        new PasswordFrame().setVisible(true);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new Customers(false).setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
        choiceTextField.setText(getTextFromCell(customersTable));
        if(debugMode)Loger.out(accessCustomers);
        if(evt.getClickCount()>=2)
            if(accessCustomers){
                sendMessage("Форма для изменения параметров уже открыта.");
            }else{
                try{
                    new Customers(true).setVisible(true);
                }catch(Exception e){
                    Loger.out(e);
                }
            }
    }//GEN-LAST:event_customersTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Route().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void registryTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registryTabbedPaneMouseClicked
        if(customersPanel.isShowing())refreshTable(customersTable);
        if(mulePanel.isShowing())Loger.out("Получаем таблицу курьера(неработает пока)");
    }//GEN-LAST:event_registryTabbedPaneMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addButton;
    private javax.swing.JMenuItem adduserMenuItem;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JLabel brandLabel1;
    private javax.swing.JTextField choiceTextField;
    private javax.swing.JTable courierTable;
    private javax.swing.JPanel customersPanel;
    public static javax.swing.JTable customersTable;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mulePanel;
    private javax.swing.JMenuItem optionsMenuItem;
    private javax.swing.JTabbedPane registryTabbedPane;
    private javax.swing.JButton removeButton;
    private javax.swing.JMenuItem startsillMenuItem;
    private javax.swing.JMenu userMenu;
    private javax.swing.JMenuItem usereditMenuItem;
    // End of variables declaration//GEN-END:variables
}
