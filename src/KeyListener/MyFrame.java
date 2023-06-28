package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon ;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);

        this.addKeyListener(this);

        icon = new ImageIcon("C:\\Users\\User\\Desktop\\Java_basics\\src\\KeyListener\\enemy.png");
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);

//        label.setBackground(Color.RED);
//        label.setOpaque(true);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
    }




    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("You released key char: " + e.getKeyChar());
//        System.out.println("You released key char: " + e.getKeyCode());

    }
}
