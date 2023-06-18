package GUI.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


         button = new JButton("Submit");
        button.addActionListener(this);

         textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));

        this.add(button);
        this.add(textField);

        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button){
        System.out.println("Welcome" + textField.getText());
    }
    }
}
