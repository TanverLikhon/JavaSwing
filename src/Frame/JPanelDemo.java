package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JPanelDemo extends JFrame {

    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel userlabel, vowel, a, e, i, o, u;
    private JTextField j, k;
    private JTextArea ta,ta1,ta2;
    private JScrollPane s;
    private JPanel jp1,jp2;
    

    JPanelDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 900, 700);
        this.setTitle("JPanel");
        this.setResizable(true);

        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        jp1=new JPanel();
        jp1.setBounds(20,20,400,400);
        jp1.setBackground(Color.yellow);
        c.add(jp1);
        
        
        jp2=new JPanel();
        jp2.setBounds(430,20,400,400);
        jp2.setBackground(Color.GREEN);
        c.add(jp2);
        
        btn1=new JButton("Panel button 1");
        btn1.setBounds(25,25,170,50);
        jp1.add(btn1);
 
}

    public static void main(String[] args) {
        JPanelDemo fr = new JPanelDemo();
        fr.setVisible(true);

    }
}
