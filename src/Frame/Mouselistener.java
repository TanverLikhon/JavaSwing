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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mouselistener extends JFrame {

    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel userlabel, vowel, a, e, i, o, u;
    private JTextField j, k;
    private JTextArea ta,ta1,ta2;
    private JScrollPane s;

    int vowelc = 0, ac = 0, ec = 0, ic = 0, oc = 0, uc = 0;

    Mouselistener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 900, 700);
        this.setTitle("Mouse Listener + Mouse Motion Listener + Focus Listener:)");
        this.setResizable(true);

        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial",
                Font.ITALIC + Font.BOLD, 12);

        j = new JTextField();
        j.setBounds(100, 10, 100, 50);
        c.add(j);

        ta = new JTextArea();
        //ta.setBounds(100,25,300,100);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        //c.add(ta);

        s = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        s.setBounds(100, 100, 300, 100);
        c.add(s);

        ta1 = new JTextArea();
        ta1.setBounds(100,220,300,100);
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
       c.add(ta1);
       
        k = new JTextField();
        k.setBounds(100, 350, 200, 200);
        c.add(k);
       
       btn1=new JButton("CLICK");
       btn1.setBounds(500,20,100,50);
       c.add(btn1);
       
        ta2 = new JTextArea();
        ta2.setBounds(500,80,300,100);
        ta2.setLineWrap(true);
        ta2.setWrapStyleWord(true);
       c.add(ta2);
       
       btn1.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent fe) {
                ta2.append("Focus Gained\n");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                ta2.append("Focus Lost\n");
 
        }
       
       
       
       });
       
       j.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
 ta.append("Mouse Clicked\n");            }

            @Override
            public void mousePressed(MouseEvent me) {
                ta.append("Mouse Pressed\n");            }

            @Override
            public void mouseReleased(MouseEvent me) {
                ta.append("Mouse Released\n");            }

            @Override
            public void mouseEntered(MouseEvent me) {
                ta.append("Mouse Entered\n");            }

            @Override
            public void mouseExited(MouseEvent me) {
                ta.append("Mouse Exited\n");            }
  
       
       });

       
       
       ta1.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent me) {
k.setText("Mouse Dragged X= "+me.getX()+" Y= "+me.getY());  
            }

            @Override
            public void mouseMoved(MouseEvent me) {
k.setText("Mouse Moved X= "+me.getX()+" Y= "+me.getY());            }
       
       
       });
       
       
       
}

    
    

    public static void main(String[] args) {
        Mouselistener fr = new Mouselistener();
        fr.setVisible(true);

    }
}
