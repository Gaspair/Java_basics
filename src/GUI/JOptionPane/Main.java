package GUI.JOptionPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Here is more  useless info","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Really ?","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Your computer has a virus","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Call tech support NOW OR ELSE","title",JOptionPane.ERROR_MESSAGE);

//    int answer = JOptionPane.showConfirmDialog(null,"bro do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
//   String name =  JOptionPane.showInputDialog("What is your name?");

        String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};

        ImageIcon icon = new ImageIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Java_basics\\src\\GUI\\JOptionPane\\smile.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        JOptionPane.showOptionDialog(null, "You are awesome", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }


}

