
package Frame;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public final class Frame_Icon extends JFrame {
     private ImageIcon icon;
     private Container c;
      Frame_Icon()
      {
        initialize();       
      }
     public void initialize()
     {
//changing icon import javax.swing.ImageIcon;

icon=new ImageIcon(getClass().getResource("hstu.png"));
       this.setIconImage(icon.getImage());
       
//changing background color import java.awt.Container;
       c=this.getContentPane();
       c.setBackground(Color.blue);
       
    /*  
       //import java.awt.Image;
ImageIcon icone = new ImageIcon(getClass().getResource("hstu.png"));
Image image = icone.getImage();
  setIconImage(image);*/
     }
        public static void main(String[] args) {
        Frame_Icon frame= new Frame_Icon();
        
        frame.setVisible(true);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setBounds(200,400,600,300);
        frame.setTitle("Tanver Ahmed Likhon");
        frame.setResizable(true);

    }
}
