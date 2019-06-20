/*JLabel*/
package Frame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
public final class Jlabel extends JFrame {
    private ImageIcon icon,img,img1;
    private Container c;
    private Font f;
    private JLabel UserLabel,newlabel,imglabel,imgt;
    Jlabel()
    {
        initialize();
    }
    public void initialize()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        icon=new ImageIcon (getClass().getResource("hstu.png"));
        this.setIconImage(icon.getImage());
        
        f=new Font("Arial",Font.BOLD,14);
        
        
        UserLabel= new JLabel();
        UserLabel.setText("Tanver Ahmed Likhon ");
        UserLabel.setBounds(50,20,250,50);
        UserLabel.setForeground(Color.red);
        UserLabel.setOpaque(true);
        UserLabel.setBackground(Color.yellow);
        UserLabel.setFont(f);
        c.add(UserLabel);
   

        
        newlabel=new JLabel();
        newlabel.setText("Chesta koreo code korte parena");
        newlabel.setBounds(50,60,300,50);
        newlabel.setToolTipText("Build by Tanver");
        newlabel.setFont(f);
        c.add(newlabel);
        
        
        img=new ImageIcon(getClass().getResource("hstu.png"));
        imglabel=new JLabel(img);
        imglabel.setBounds(50,80,img.getIconWidth(),
                img.getIconHeight());
        c.add(imglabel);
        
        
System.out.println("By usinging getText  "+newlabel.getText());
System.out.println("By usinging getToolTipText  "
        +newlabel.getToolTipText());
         
         ///title and image combined
     img1= new ImageIcon(getClass().getResource("mylogo.png"));
     
     imgt=new JLabel("HSTU",img1,JLabel.RIGHT);
     imgt.setBounds(700,200,500,200);
     c.add(imgt);
         
       
    }
    public static void main(String[] args) {
        Jlabel frame=new Jlabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,1000,800);
        frame.setTitle("JLABEL");
        frame.setResizable(true);
        
    }
}
/*Tanver Ahmed Likhon*/