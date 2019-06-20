///JCheckBox
package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CheckBox extends JFrame{
    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private Cursor cursor;
    private ImageIcon img1, img2;
    private JLabel image, userlabel, userlabel2;
    private JTextField j, k;
    private JTextArea ta;
    private JCheckBox cb1,cb2,cb3;
    private ButtonGroup grp;
    ///image nilei ImageIcon lagbe
    CheckBox() {
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.ITALIC + Font.BOLD, 12);
        
        grp=new ButtonGroup();
        cb1=new JCheckBox();
        cb1.setText("C++ Programming");
        cb1.setBounds(20,20,200,50);
        cb1.setBackground(Color.yellow);
        cb1.setFont(f);
        c.add(cb1);
        grp.add(cb1);
        
        cb2=new JCheckBox("JAVA");
        //cb2=new JCheckBox("JAVA",true);//another way
        //internally selected thakbe
       // cb2.setText("C++ Programming");
        cb2.setBounds(20,80,200,50);
        c.add(cb2);
        grp.add(cb2);
        
        userlabel=new JLabel();
        userlabel.setText("You haven't selected "
                + "anything(from actionlistener)");
        userlabel.setBounds(20,135,300,50);
        c.add(userlabel);
        
        userlabel2=new JLabel();
        userlabel2.setText("You haven't selected "
                + "anything(from itemlistener)");
        userlabel2.setBounds(20,180,300,100);
        c.add(userlabel2);
        
         Handler handler=new Handler();
        cb1.addActionListener(handler);
        cb2.addActionListener(handler);
        
        //Action listener can be performed by
        //itemListener also
        Handler1 handler1=new Handler1();
        cb1.addItemListener(handler1);
        cb2.addItemListener(handler1);   
    }
 class Handler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // e.getSource()==cb1 etao applicable
        if(cb1.isSelected())
            userlabel2.setText("You have selected C++");
        else userlabel2.setText("You haven't selected JAVA");         
    }
    }
  class Handler1 implements ItemListener{
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        // e.getSource()==cb1 etao applicable
        if(cb1.isSelected())
            userlabel.setText("You have selected C++");
        else userlabel.setText("You haven't selected JAVA");         
    }  
    }
    public static void main(String[] args) {
        CheckBox fr = new CheckBox();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200, 50, 500, 700);
        fr.setTitle("Check Box:)");
        fr.setResizable(true);
    }
}
//Tanver Ahmed Likhon
