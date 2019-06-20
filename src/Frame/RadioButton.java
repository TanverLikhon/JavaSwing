
package Frame;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class RadioButton extends JFrame {
    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private Cursor cursor;
    private ImageIcon img1, img2;
    private JLabel image, userlabel, userlabel2;
    private JTextField j, k;
    private JTextArea ta;
    private JRadioButton a,b;
    private ButtonGroup grp;
    RadioButton()
    {
         c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
         f = new Font("Tahoma",Font.BOLD, 15);
        grp=new ButtonGroup ();
        
        a=new JRadioButton("Male");
        a.setBounds(50,50,100,50);
        a.setBackground(Color.BLUE);
        a.setFont(f);
        a.setSelected(true);
        //by default button a will be selected
        c.add(a);
        grp.add(a);
        
        
        b=new JRadioButton("Female");
        b.setBounds(160,50,100,50);
        b.setBackground(Color.BLUE);
        b.setFont(f);
        //b.setEnabled(false);//is used to disable a button
        c.add(b);
        grp.add(b);
        
        ta = new JTextArea();
        ta.setBounds(50, 110, 300, 300);

        ta.setBackground(Color.YELLOW);
        ta.setForeground(Color.BLUE);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);
        c.add(ta);
        
        Handler handler=new Handler();
        a.addActionListener(handler);
        b.addActionListener(handler);
        
    }
    class Handler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str;
        if(e.getSource()==a)
            str="You have entered Male";
        else str="You Have entered Female";
        ta.setText(str);
            
    }
    
    }
    public static void main(String[] args) {
        RadioButton fr = new RadioButton();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100,50,500,500);
        fr.setTitle("Radio Button");
        fr.setResizable(true);
        
    }
    
}
