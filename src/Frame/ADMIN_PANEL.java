///ADMIN_PANEL
package Frame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ADMIN_PANEL extends JFrame {
    private Container c;
    private JTextField j,k;
    private Font f;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private Cursor cursor;
    private ImageIcon img1,img2;
    private JLabel userlabel,passlabel;
    private JPasswordField pf;
    ///image nilei ImageIcon lagbe
    ADMIN_PANEL()
    {        
        this.setVisible(true);
        this.setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,420,350);
        this.setTitle("#### ADMIN_PANEL####");
        this.setResizable(true);
        
        c= new Container();
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray); 
        cursor=new Cursor(Cursor.HAND_CURSOR);
        f=new Font("Arial",Font.ITALIC+Font.BOLD,14);
        
        userlabel=new JLabel();
        userlabel.setText("Username :");
        userlabel.setBounds(50,20,250,50);
        userlabel.setFont(f);
        c.add(userlabel);
        j=new JTextField();
        
        j.setBackground(Color.WHITE);
        j.setForeground(Color.BLUE);
        j.setBounds(50,60,200,30);
        j.setHorizontalAlignment(JTextField.RIGHT);
        c.add(j);
        
        passlabel=new JLabel();
        passlabel.setText("Password :");
        passlabel.setBounds(50,90,250,50);
        passlabel.setFont(f);
        c.add(passlabel);
  
        ///creating Password Field
        pf=new JPasswordField();
        pf.setBounds(50,125,200,30);
        pf.setHorizontalAlignment(JTextField.RIGHT);
        pf.setBackground(Color.WHITE);
        pf.setEchoChar('*');
        pf.setFont(f);
        c.add(pf);
        
        img1=new ImageIcon(getClass().getResource("login.png"));
        img2=new ImageIcon(getClass().getResource("reset.png"));
        
        btn3=new JButton(img1);
        btn3.setBounds(50,165,100,40);
        btn3.setCursor(cursor);
        c.add(btn3);
        
        cursor=new Cursor(Cursor.HAND_CURSOR);
        btn4=new JButton(img2);
        btn4.setBounds(155,165,100,40);
        btn4.setCursor(cursor);
        c.add(btn4);
        
        btn4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
           pf.setText("");
           j.setText("");
        }
        });
        btn3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
          String userName=j.getText();
          String passWord=pf.getText();
          if(userName.equals("tanverlikhon")&&"6795".equals(passWord))
          {
              dispose();
          JOptionPane.showMessageDialog(null,"You are logged in ");
          
          Admin_Panel_Page1 fr= new Admin_Panel_Page1();
          fr.setVisible(true);
          
          
          }
          else JOptionPane.showMessageDialog(null,"Wrong Password");            
        }

           
        });
    }
    public static void main(String[] args) {
        ADMIN_PANEL frame=new ADMIN_PANEL();       
    }
}
//Tanver Ahmed Likhon