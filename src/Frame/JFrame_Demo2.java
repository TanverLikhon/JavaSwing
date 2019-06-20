
package Frame;

import javax.swing.JFrame;

public class JFrame_Demo2 extends JFrame {
      JFrame_Demo2()
      {
                  
        setBounds(200,400,600,300);
        setTitle("Tanver Ahmed Likhon");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

      }
    
        public static void main(String[] args) {
        JFrame_Demo2 frame= new JFrame_Demo2();

    }
}
