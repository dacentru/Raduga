package om.okna.raduga;

import javax.swing.ImageIcon;
import static om.okna.raduga.Options.debugMode;
import static om.okna.raduga.Options.demoMode;
import static om.okna.raduga.Options.sillMode;

public class Raduga{
    
    static ImageIcon iconImage = new ImageIcon(Raduga.class.getResource("/favicon.png"));
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (debugMode) {
                    new Loger().setVisible(true);
                }
                if (sillMode) {
                    new SillFrame().setVisible(true);
                } else if (demoMode) {
                    new Main().setVisible(true);
                } else {
                    new UserLogin().setVisible(true);
                }
            }
        });
    }
    
    public static void newThrade(){
        
    }
}
