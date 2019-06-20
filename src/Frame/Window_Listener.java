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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window_Listener extends JFrame {

    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel userlabel, vowel, a, e, i, o, u;
    private JTextField j, k;
    private JTextArea ta,ta1,ta2;
    private JScrollPane s;

    int vowelc = 0, ac = 0, ec = 0, ic = 0, oc = 0, uc = 0;

    Window_Listener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 900, 700);
        this.setTitle("Mouse Listener + Mouse Motion Listener + Focus Listener:)");
        this.setResizable(true);

        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        this.addWindowListener(new WindowListener(){

            @Override
            public void windowOpened(WindowEvent we) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent we) {
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent we) {
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                System.out.println("windowDeactivated");
            }
        
        
        });
       
}

    
    

    public static void main(String[] args) {
        Window_Listener fr = new Window_Listener();
        fr.setVisible(true);

    }
}
