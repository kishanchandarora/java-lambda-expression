package work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {
        // window : object of JFram
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        // create button and add jframe
        JButton button = new JButton("Click Me!!");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Button Click");
//                JOptionPane.showMessageDialog(null, "Hey, Button Click!!");
//            }
//        });
        button.addActionListener(e -> {
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null, "Hey, Button Click!!");
        });

        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
