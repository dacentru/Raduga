/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

/**
 *
 * @author Виктор
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Clock extends JFrame
{
  private JLabel m_time;
  private Thread m_thr;
  public Clock()
  {
     m_time = new JLabel();
     m_time.setHorizontalAlignment(SwingConstants.CENTER);
     m_time.setFont(new Font("Default", Font.BOLD+Font.ITALIC, 24));
     getContentPane().add(m_time);
     setBounds(0,0,300,100);
     m_thr = new Thread() {
       public void run() 
       {
         while(true) {
           setTime();
           try {
             Thread.sleep(500);
           }
           catch(Exception e) {}
         }
       }
     };
     m_thr.start();
  }
  public void setTime()
  {
     SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
     m_time.setText(df.format(Calendar.getInstance().getTime()));
  }
  public static void main(String[] args)
  {
     Clock cl = new Clock();
     cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     cl.setVisible(true);
  }
}
