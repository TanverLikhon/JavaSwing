/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Show_message;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Show_Msg_dialog {
    public static void main(String[] args) {
        ImageIcon icon= new ImageIcon("rsz_cf.png");
        JOptionPane.showMessageDialog(null,"Wrong Password :(");
        
    JOptionPane.showMessageDialog(null,"Wrong Password :(","Warning",JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null,"Hello !","Codeforces",3,icon);
    }
}
