package Frame;
/*
Card_Layout: there will be some buttons in same place
like cards
*/
import java.awt.Color;
import java.awt.Container;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Card_Layout extends JFrame implements ActionListener {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private CardLayout br1,br2;
    Card_Layout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 900, 700);
        this.setTitle("Card_Layout :)");
        this.setResizable(true);
        br1= new CardLayout();
  //parameter row and column 
        c = new Container();
        c = this.getContentPane();
//vertical and horizontal gap can be passed
        c.setLayout(br1);     
        btn1=new JButton("1 ");
        btn2=new JButton("2 ");
        btn3=new JButton("3 ");
    
  
        c.add(btn1,"first");
        c.add(btn2,"second");
        c.add(btn3,"third");
         
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
  
}
      @Override
    public void actionPerformed(ActionEvent ae) {
br1.next(c);
//br1.previous(c);
//br1.show(c,"third");//to show only third button
        }
    public static void main(String[] args) {
        Card_Layout fr = new Card_Layout();
        fr.setVisible(true);
    }

    

}
