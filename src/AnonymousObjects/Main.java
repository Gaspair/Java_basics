package AnonymousObjects;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ArrayList<JLabel> decl = new ArrayList<JLabel>();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
