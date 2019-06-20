
package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame {
    private Container c;
    private JTextField j,k;
    private Font f;
    JTextFieldDemo()
    {
        c= new Container();
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",Font.ITALIC+Font.BOLD,12);
        j=new JTextField("biggboss");
        j.setFont(f);
        j.setBackground(Color.RED);
        j.setForeground(Color.BLUE);
        j.setBounds(50,20,250,50);
        j.setHorizontalAlignment(JTextField.CENTER);
        c.add(j);
        
        k=new JTextField();
        k.setBounds(50,80,250,50);
        k.setHorizontalAlignment(JTextField.RIGHT);
        c.add(k);
        
        ///Action listener
        k.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
           String s=k.getText();
           if(!s.isEmpty())
           JOptionPane.showMessageDialog(null,s);
           else JOptionPane.showMessageDialog(null,"you entered nothing");
        }
        
        
        });
    }
    public static void main(String[] args) {
        JTextFieldDemo frame=new JTextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,1000,800);
        frame.setTitle("JFeildText :)");
        frame.setResizable(true);
    }
 
}
