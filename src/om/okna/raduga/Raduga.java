package om.okna.raduga;

import javax.swing.ImageIcon;

public class Raduga {
    
    static ImageIcon image = new ImageIcon(Raduga.class.getResource("/favicon.png"));
    
    public static void main(String[] args) {
        
        new Options();
        new LogerFrame().setVisible(true);
        new UserFrame().setVisible(true);
        }
}
