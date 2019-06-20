///JButton
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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ButtonDemo extends JFrame {
    private Container c;
    private JTextField j,k;
    private Font f;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private Cursor cursor;
    private ImageIcon img1,img2;
    ///image nilei ImageIcon lagbe
    ButtonDemo()
    {
        c= new Container();
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN); 
        cursor=new Cursor(Cursor.HAND_CURSOR);
        f=new Font("Arial",
                Font.ITALIC+Font.BOLD,12);
        btn1=new JButton("Submit");
        btn1.setBounds(50,20,250,50);
        btn1.setBackground(Color.GREEN);
        btn1.setForeground(Color.BLACK);
        btn1.setFont(f);
        btn1.setCursor(cursor);
        c.add(btn1);
        
      cursor=new Cursor(Cursor.HAND_CURSOR);
        btn2=new JButton("Cancel");
        btn2.setBounds(310,20,250,50);
        btn2.setBackground(Color.RED);
        btn2.setForeground(Color.BLACK);
        btn2.setCursor(cursor);
        btn2.setFont(f);

        c.add(btn2);
        
        //button image
        img1=new ImageIcon(getClass().getResource("login.png"));
        img2=new ImageIcon(getClass().getResource("logout.png"));
        
        btn3=new JButton(img1);
        btn3.setBounds(50,80,250,50);
        btn3.setCursor(cursor);
        c.add(btn3);
        
      cursor=new Cursor(Cursor.HAND_CURSOR);
        btn4=new JButton(img2);
        btn4.setBounds(310,80,250,50);
        btn4.setCursor(cursor);
        c.add(btn4);
        
        
       ///action listener
        //it will clear text by pressing clear button
        
        f=new Font("Arial",
                Font.ITALIC+Font.BOLD,12);
        j=new JTextField();
        j.setFont(f);
        j.setBackground(Color.WHITE);
        j.setForeground(Color.BLUE);
        j.setBounds(50,140,250,50);
        j.setHorizontalAlignment
        (JTextField.CENTER);
        c.add(j);
        
        cursor=new Cursor(Cursor.HAND_CURSOR);
        btn5=new JButton("Clear");
        btn5.setBounds(310,140,250,50);
        btn5.setBackground(Color.RED);
        btn5.setForeground(Color.BLACK);
        btn5.setCursor(cursor);
        btn5.setFont(f);
        c.add(btn5);
        
        btn5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
           j.setText("");
        }
        });
    }
  
    public static void main(String[] args) {
        ButtonDemo frame=new ButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,1000,800);
        frame.setTitle("Button demo :)");
        frame.setResizable(true);
    }
 
}
//Tanver Ahmed Likhon