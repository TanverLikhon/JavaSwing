
package Show_message;
import javax.swing.JOptionPane;
        
public class Input_msg {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter your name: ");
        //JOptionPane.showOptionDialog(null, name+"welcome to java swing ");
        JOptionPane.showMessageDialog(null,name+"Welcome to java Swing :)");
    
       String f_name=JOptionPane.showInputDialog(null,"Enter your first name :","Your Info ",JOptionPane.QUESTION_MESSAGE);
       String l_name=JOptionPane.showInputDialog(null,"Enter your last name :","your info",JOptionPane.QUESTION_MESSAGE);
       JOptionPane.showMessageDialog(null,f_name+l_name+"Welcome :)");
       
    
    
    
    
    }
}
