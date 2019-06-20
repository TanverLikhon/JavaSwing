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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Admin_Panel_Page1 extends JFrame {
    private Container c;
    private JTextField j,k;
    private Font f;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private Cursor cursor;
    private ImageIcon img1,img2;
    private JLabel userlabel,passlabel;
    private JTextArea ta;
    private JScrollPane p;
    ///image nilei ImageIcon lagbe
    Admin_Panel_Page1()
    {        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //ei line ta dile only ei page close hobe ager ta na
        this.setBounds(100,50,420,350);
        this.setTitle("#### ADMIN_PANEL page 01####");
        this.setResizable(true);
        
        c= new Container();
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray); 
        cursor=new Cursor(Cursor.HAND_CURSOR);
        f=new Font("Arial",Font.ITALIC+Font.BOLD,14);
        
        userlabel=new JLabel();
        userlabel.setText("Tanver Ahmed Likhon :)");
        userlabel.setBounds(50,20,250,20);
        userlabel.setFont(f);
        c.add(userlabel);
        
       ta=new JTextArea();
      // ta.setBounds(50,45,250,200);
       ta.setBackground(Color.YELLOW);
       ta.setForeground(Color.BLUE);
       ta.setLineWrap(true);
       ta.setWrapStyleWord(true);
       ta.setFont(f);
       //c.add(ta);
       
       //adding scroll line;
       /* to do this we don't need line 
       set bouns and c.add(ta) on text area, it will be set on
       scroll pane
       */
      // p=new JScrollPane(ta);
       /* only horizontal scroll will be shown when needed;
       no vertical scroll bar will be shown
       */
       p=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
               JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       /*
       we can use AS_NEEDED instead of ALWAYS
       */
       p.setBounds(50,45,250,200);
       c.add(p);
       
        
        
    }
    public static void main(String[] args) {
        Admin_Panel_Page1 frame=new Admin_Panel_Page1();       
    }
}
//Tanver Ahmed Likhon