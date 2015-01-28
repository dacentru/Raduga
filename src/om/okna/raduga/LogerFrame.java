package om.okna.raduga;

/**
 *
 * @author Виктор
 */
public class LogerFrame extends javax.swing.JFrame {
    
    public LogerFrame() {
        initComponents();
    }
    
    static void out(String s){
        LogTextArea.setText(LogTextArea.getText() + "\n" + s);
    }
    
    static void out(Object o){
        out(o.toString());
    }
    
    static void out(int i){
        out(String.valueOf(i));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LogTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Loger");

        LogTextArea.setBackground(new java.awt.Color(0, 0, 0));
        LogTextArea.setColumns(20);
        LogTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LogTextArea.setForeground(new java.awt.Color(51, 255, 51));
        LogTextArea.setRows(5);
        jScrollPane1.setViewportView(LogTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea LogTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
