package Frame;
/*
flow layout: there will buttons in a row
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Grid_Layout extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel userlabel, vowel, a, e, i, o, u;
    private GridLayout br1,br2;
    Grid_Layout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 900, 700);
        this.setTitle("Grid Layout :)");
        this.setResizable(true);
        br1= new GridLayout(2,2);
  //parameter row and column 
        c = new Container();
        c = this.getContentPane();
        c.setLayout(br1);     
        btn1=new JButton("1 ");
        btn2=new JButton("2 ");
        btn3=new JButton("3 ");
        btn4=new JButton("4 ");
  
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
  
}
    public static void main(String[] args) {
        Grid_Layout fr = new Grid_Layout();
        fr.setVisible(true);
    }
}
