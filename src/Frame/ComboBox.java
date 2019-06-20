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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComboBox extends JFrame{

    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private Cursor cursor;
    private String proLang[]={"C","C++","JAVA","Python"};
    private JLabel image, userlabel, userlabel2;
    private JTextField j, k;
    private JTextArea ta;
    private JCheckBox cb1,cb2,cb3;
    private ButtonGroup grp;
    private JComboBox box1,box2;
    ///image nilei ImageIcon lagbe
    ComboBox() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 500, 700);
        this.setTitle("COMBOS Box:)");
        this.setResizable(true);
        
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",
                Font.ITALIC + Font.BOLD, 12);
        box1=new JComboBox(proLang);
        box1.setBounds(20,50,100,50);
        box1.setSelectedIndex(3);//selected index 3
        box1.addItem("php");
        box1.removeItem("JAVA");
       //box1.removeAllItems();
       // box1.removeItemAt(3);//pass Index
        c.add(box1);
        System.out.println("Total Item ="+box1.getItemCount());
         
        btn1=new JButton ("Submit");
        btn1.setBounds(20,110,100,50);
        c.add(btn1);
        
        userlabel=new JLabel("You have selected nothing :(");
        userlabel.setBounds(130,50,200,50);
        c.add(userlabel);
        
        //editable combobox
        box2=new JComboBox(proLang);
        box2.setBounds(20,210,100,50);
        box2.setEditable(true);
        box2.setSelectedItem("C++");
        c.add(box2);
        
        btn1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            String str=box1.getSelectedItem().toString();
            userlabel.setText("You have selected "+str);
           
        }
        });
        
    }
 
    public static void main(String[] args) {
        ComboBox fr = new ComboBox();
        fr.setVisible(true);
        
    }

}
//Tanver Ahmed Likhon
