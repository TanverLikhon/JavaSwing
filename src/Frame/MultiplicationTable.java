//Multiplication Table
package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame {

    private Container c;
    private Font f;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private Cursor cursor;
    private ImageIcon img1, img2;
    private JLabel image, userlabel, userlabel2;
    private JTextField j, k;
    private JTextArea ta;

    ///image nilei ImageIcon lagbe
    MultiplicationTable() {
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        f = new Font("Arial",
                Font.ITALIC + Font.BOLD, 12);
        img1 = new ImageIcon(getClass().getResource("mylogo.png"));
        img2 = new ImageIcon(getClass().getResource("reset.png"));
        image = new JLabel(img1);
        image.setBounds(15, 10, 431, 132);
        c.add(image);

        userlabel = new JLabel();
        userlabel.setText("Multiplication Table ");
        userlabel.setBounds(150, 145, 200, 20);
        c.add(userlabel);
        f = new Font("Tahoma",
                Font.BOLD, 15);
        userlabel2 = new JLabel();
        userlabel2.setText("Enter a number : ");
        userlabel2.setBounds(20, 170, 150, 20);
        userlabel2.setFont(f);
        userlabel2.setForeground(Color.BLUE);
        c.add(userlabel2);

        j = new JTextField();
        //  j.setBackground(Color.BLUE);
        j.setBounds(200, 170, 150, 30);
        c.add(j);

        btn1 = new JButton(img2);
        btn1.setBounds(200, 210, 100, 40);
        btn1.setCursor(cursor);
        c.add(btn1);

        ta = new JTextArea();
        ta.setBounds(20, 260, 400, 400);

        ta.setBackground(Color.YELLOW);
        ta.setForeground(Color.BLUE);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);
        c.add(ta);

        j.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = j.getText();
                if (str.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You have entered no number :(");
                } else {

                    int n = Integer.parseInt(j.getText());
                    System.out.println("  " + n);
                    for (int i = 1; i < 11; i++) {
                        int res = i * n;
                        String ns, is, ress;
                        ns = String.valueOf(n);
                        is = String.valueOf(i);
                        ress = String.valueOf(res);
                        ta.append(ns + " x " + is + " = " + ress + "\n");

                    }
                }
            }

        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j.setText("");
                ta.setText("");
            }
        });
    }

    public static void main(String[] args) {
        MultiplicationTable fr = new MultiplicationTable();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200, 50, 500, 700);
        fr.setTitle("Multiplication Table :)");
        fr.setResizable(true);
    }

}
//Tanver Ahmed Likhon
