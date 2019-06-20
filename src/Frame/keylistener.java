//listenerdemo3
package Frame;
/*3Steps
 1.Implement the listener interface line18
 2.Override all the methods line 58
 3.Add the listener with the components
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
public class keylistener extends JFrame {

    private Container c;
    private JButton redbutton, bluebutton, greenbutton, btn4, btn5;
    private JLabel image, userlabel, userlabel2;
    private JTextField tf;
    private JTextArea ta;

    keylistener() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 600, 450);
        this.setTitle("#### KeyListenerDemo####");
        this.setResizable(true);

        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBounds(10, 110, 300, 300);
        c.add(ta);

        tf.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
                ta.append("Key Typed :" + ke.getKeyChar() + "\n");

            }

            @Override
            public void keyPressed(KeyEvent ke) {
                ta.append("Key Pressed :" + ke.getKeyChar() + "\n");

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                ta.append("Key Released :" + ke.getKeyChar() + "\n");
            }

        });

    }
    public static void main(String[] args) {
        keylistener fr = new keylistener();
        fr.setVisible(true);
    }
}
//tanver ahmed likhon