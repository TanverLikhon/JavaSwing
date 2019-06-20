package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VowelCounter extends JFrame {

    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel userlabel, vowel, a, e, i, o, u;
    private JTextField j, k;
    private JTextArea ta;
    private JScrollPane s;

    int vowelc = 0, ac = 0, ec = 0, ic = 0, oc = 0, uc = 0;

    VowelCounter() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 500, 700);
        this.setTitle("Vowel Counter:)");
        this.setResizable(true);

        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial",
                Font.ITALIC + Font.BOLD, 12);
        userlabel = new JLabel();
        userlabel.setText("Write here :");
        userlabel.setBounds(10, 10, 250, 70);
        c.add(userlabel);

        ta = new JTextArea();
        //ta.setBounds(100,25,300,100);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        //c.add(ta);

        s = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        s.setBounds(100, 25, 300, 100);
        c.add(s);

        vowel = new JLabel();
        vowel.setBounds(100, 120, 150, 70);
        c.add(vowel);

        a = new JLabel();
        a.setBounds(100, 130, 150, 70);
        c.add(a);

        e = new JLabel();
        e.setBounds(100, 210, 150, 70);
        c.add(e);

        i = new JLabel();
        i.setBounds(100, 290, 150, 70);
        c.add(i);

        o = new JLabel();
        o.setBounds(100, 270, 150, 70);
        c.add(o);

        u = new JLabel();
        u.setBounds(100, 350, 150, 70);
        c.add(u);

ta.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getSource() == ta) {
                    if (ke.VK_A == ke.getKeyCode()) {
                        vowelc++;
                        ac++;
                    }

                    if (ke.VK_E == ke.getKeyCode()) {
                        vowelc++;
                        ec++;
                    }

                    if (ke.VK_I == ke.getKeyCode()) {
                        vowelc++;
                        ic++;
                    }

                    if (ke.VK_O == ke.getKeyCode()) {
                        vowelc++;
                        oc++;
                    }

                    if (ke.VK_U == ke.getKeyCode()) {
                        vowelc++;
                        uc++;
                    }

                }
         vowel.setText("Total Vowel = " + vowelc);
         a.setText("Total a = " + ac);
         e.setText("Total e = " + ec);
         i.setText("Total i = " + ic);
         o.setText("Total o = " + oc);
         u.setText("Total u = " + uc);
         
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
    
    }

    public static void main(String[] args) {
        VowelCounter fr = new VowelCounter();
        fr.setVisible(true);

    }
}
