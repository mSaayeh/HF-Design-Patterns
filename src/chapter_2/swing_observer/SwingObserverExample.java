package chapter_2.swing_observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Send newsletters");
        button.addActionListener(new OptimisticListener());
        button.addActionListener(new PessimisticListener());

        frame.add(button);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.requestFocus();
    }

    class OptimisticListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("What great news!!");
        }
    }

    class PessimisticListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ooh noo!!");
        }
    }
}
