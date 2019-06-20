///jtextfield and JPasswordField
package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldDemo2 extends JFrame {
    private Container c;
    private JTextField j,k;
    private Font f;
    private JPasswordField pf;
    JTextFieldDemo2()
    {
        c= new Container();
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",
                Font.ITALIC+Font.BOLD,12);
        j=new JTextField("biggboss");
        j.setFont(f);
        j.setBackground(Color.RED);
        j.setForeground(Color.BLUE);
        j.setBounds(50,20,250,50);
        j.setHorizontalAlignment
        (JTextField.CENTER);
        c.add(j);
        
        k=new JTextField();
        k.setBounds(50,80,250,50);
        k.setHorizontalAlignment
        (JTextField.RIGHT);
        c.add(k);
        ///creating Password Field
        pf=new JPasswordField();
        pf.setBounds(50,150,250,50);
        pf.setHorizontalAlignment
        (JTextField.RIGHT);
        pf.setBackground(Color.RED);
        pf.setEchoChar('#');
        pf.setFont(f);
        //passowrd e # sign hobe
        c.add(pf);
        
        ///Action listener
        Handler handler=new Handler();
        j.addActionListener(handler);
        k.addActionListener(handler);

    }
  class Handler implements ActionListener{
         public void actionPerformed(ActionEvent e)
         { String s;
             if(e.getSource()==j)
            s=j.getText();
             else s=k.getText();
           if(!s.isEmpty())
           JOptionPane.showMessageDialog(null,s);
           else JOptionPane.showMessageDialog
        (null,"you entered nothing"); 
         }
                 
     }
    public static void main(String[] args) {
        JTextFieldDemo2 frame=new JTextFieldDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,1000,800);
        frame.setTitle("JFeildText :)");
        frame.setResizable(true);
    }
 
}
//Tanver Ahmed Likhon