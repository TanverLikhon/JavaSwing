package Frame;
/*
flow layout: there will buttons in a row
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Flow_Layout extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel userlabel, vowel, a, e, i, o, u;
    private FlowLayout br1,br2;
    Flow_Layout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 900, 700);
        this.setTitle("Flow Layout :)");
        this.setResizable(true);
        br1= new FlowLayout(FlowLayout.LEFT);
        //by default centre 
//box layout br1= new BoxLayout(BoxLayout.X_AXIS);
//either row or column
        br1.setHgap(20);//button gap
        br1.setVgap(20);//button gap
        c = new Container();
        c = this.getContentPane();
        c.setLayout(br1);     
        btn1=new JButton("1 ");
        btn2=new JButton("2 ");
        btn3=new JButton("3 ");
        btn4=new JButton("4 ");
        btn5=new JButton("5 ");
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
      
}
    public static void main(String[] args) {
        Flow_Layout fr = new Flow_Layout();
        fr.setVisible(true);
    }
}
