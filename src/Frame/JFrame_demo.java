
package Frame;
import javax.swing.JFrame;
public class JFrame_demo {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.setSize(400,300);
    //frame.setLocationRelativeTo(null);
       // frame.setLocation(200,400);
      frame.setBounds(200,400,600,300);
        frame.setTitle("Tanver Ahmed Likhon");
        frame.setResizable(true);
    }
}
