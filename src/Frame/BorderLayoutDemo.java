package Frame;
/*
border layout has 5 parts north,south,east,west and 
center by default
*/
import java.awt.BorderLayout;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BorderLayoutDemo extends JFrame {

    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel userlabel, vowel, a, e, i, o, u;
    private JTextField j, k;
    private JTextArea ta,ta1,ta2;
    private BorderLayout br1,br2;

    BorderLayoutDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 900, 700);
        this.setTitle("Border Layout :)");
        this.setResizable(true);
        br1= new BorderLayout();
//by default there will be no button gap
// br1=new BorderLayout(20,20);//button gap parameter
        br1.setHgap(20);//button gap
        br1.setVgap(20);//button gap
        c = new Container();
        c = this.getContentPane();
        c.setLayout(br1);
        //c.setBackground(Color.CYAN);
        
        btn1=new JButton("1 ");
        btn2=new JButton("2 ");
        btn3=new JButton("3 ");
        btn4=new JButton("4 ");
        btn5=new JButton("5 ");
        
        
        c.add(btn1,BorderLayout.NORTH);
        c.add(btn2,BorderLayout.SOUTH);
        c.add(btn3,BorderLayout.EAST);
        c.add(btn4,BorderLayout.WEST);
        c.add(btn5,BorderLayout.CENTER);
        
        
       
}

    
    

    public static void main(String[] args) {
        BorderLayoutDemo fr = new BorderLayoutDemo();
        fr.setVisible(true);

    }
}
