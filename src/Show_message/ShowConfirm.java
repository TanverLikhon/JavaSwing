
package Show_message;

import javax.swing.JOptionPane;

public class ShowConfirm {
    public static void main(String[] args) {
        int choice=JOptionPane.showConfirmDialog(null,"Do you want to quit?","BIGGBOSS6795",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION)
            System.exit(0);
        else System.out.println("You have clicked No");
    }
  
}
