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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;;
public class ListenerDemo3 extends JFrame implements ActionListener {

    private Container c;
    private JButton redbutton, bluebutton, greenbutton, btn4, btn5;    
    ListenerDemo3()
    {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,500,350);
        this.setTitle("#### ListenerDemo####");
        this.setResizable(true);
        
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        bluebutton=new JButton ("BLUE");
        bluebutton.setBounds(20,20,100,50);
        c.add(bluebutton);
        
        redbutton=new JButton ("RED");
        redbutton.setBounds(20,80,100,50);
        c.add(redbutton);
                
        greenbutton=new JButton ("GREEN");
        greenbutton.setBounds(20,140,100,50);
        c.add(greenbutton);
           bluebutton.addActionListener(this);
           redbutton.addActionListener(this);
           greenbutton.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bluebutton)
            c.setBackground(Color.BLUE);
        else if(e.getSource()==redbutton)
            c.setBackground(Color.RED);
        else 
            c.setBackground(Color.GREEN);
    }   
    public static void main(String[] args) {
        ListenerDemo3 fr=new ListenerDemo3();
        fr.setVisible(true);
    }  
}
//tanver ahmed likhon