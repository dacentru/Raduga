/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

/**
 *
 * @author Виктор
 */
public class Options extends javax.swing.JFrame {

    URL url;
    InputStream stream;

    static int maxAccessLevel = 3;
    
    static boolean server=false;         //true=bsd.moscow false=217.15.54.238
    static boolean debugMode = true;
    static boolean sillMode = false;
    static boolean demoMode = false;
    static boolean addFrameSwitch = false;
    static boolean changeFrameSwitch = false;

    static String loadURL = "http://bsd.moscow/raduga/";
    static String USER = "raduga";
    static String PASS = "12345678";
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = getServer(server);//"jdbc:mysql://217.15.54.238/raduga";
    
    public Options() {
        initComponents();
        getSettings();
    }
    
    static String[] getSettingsArray() {
        String a[] = {
            String.valueOf(debugMode),
            String.valueOf(maxAccessLevel),
            loadURL,
            USER,
            PASS,
            JDBC_DRIVER,
            DB_URL
        };
        Loger.out("Получаем массив настроек: " + Arrays.toString(a));
        return a;
    }
    
    static String getServer(boolean b){
        if(b)return "jdbc:mysql://bsd.moscow/raduga";
        return "jdbc:mysql://217.15.54.238/raduga";
    }

//    static void setSettingsArray(String s){
//        String s[];
//        
//        debugMode=Boolean.valueOf(s[0]);
//        maxAccessLevel=Integer.valueOf(s[1]);
//        loadURL=s[2];
//        USER=s[3];
//        PASS=s[4];
//        DB_URL=s[5];
//    }

    void getSettings(){
        loadURLTextField.setText(loadURL.toString());
        dbURLTextField.setText(DB_URL);
        dbUserTextField.setText(USER);
        dbPasswordField.setText(PASS);
        if(debugMode){
            debugCheckBox.setSelected(true);
        }else{
            debugCheckBox.setSelected(false);
        }
    }
    
    private void saveOptions() {
        loadURL=loadURLTextField.getText();
        DB_URL=dbURLTextField.getText();
        USER=dbUserTextField.getText();
        PASS=String.valueOf(dbPasswordField.getPassword());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        debugCheckBox = new javax.swing.JCheckBox();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadURLTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dbURLTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dbUserTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dbPasswordField = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Настройки");
        setLocationByPlatform(true);

        debugCheckBox.setText("Режим отладки");
        debugCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debugCheckBoxActionPerformed(evt);
            }
        });

        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Сохранить");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Адрес обновлений:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("База данных:"));

        jLabel2.setText("Адрес:");

        jLabel4.setText("Пользователь:");

        jLabel5.setText("Пароль:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dbURLTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(dbUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dbURLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadURLTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debugCheckBox)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadURLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(debugCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void debugCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debugCheckBoxActionPerformed
        if(debugCheckBox.isSelected()){
            Options.debugMode=true;
            if(debugMode)Loger.out("Включен режим Debug.");
        }else{
            Options.debugMode=false;
            if(debugMode)Loger.out("Режим Debug выключен.");
        }
    }//GEN-LAST:event_debugCheckBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveOptions();
        if(sillMode)Loader.writeFile("options.properties", Arrays.toString(Options.getSettingsArray()));
        cancelButton.doClick();
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPasswordField dbPasswordField;
    private javax.swing.JTextField dbURLTextField;
    private javax.swing.JTextField dbUserTextField;
    private javax.swing.JCheckBox debugCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loadURLTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
