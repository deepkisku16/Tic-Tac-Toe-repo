import javax.swing.*;
import java.awt.*;

public class MainGame {
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
//    JPanel panel2 = new JPanel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    ImageIcon image = new ImageIcon("C:\\Users\\Deep Kisku\\Desktop\\tic tac toe.png");

    MainGame() {
        button1.addActionListener(e -> button1.setEnabled(false));
        button2.addActionListener(e -> button2.setEnabled(false));
        button3.addActionListener(e -> button3.setEnabled(false));
        button4.addActionListener(e -> button4.setEnabled(false));
        button5.addActionListener(e -> button5.setEnabled(false));
        button6.addActionListener(e -> button6.setEnabled(false));
        button7.addActionListener(e -> button7.setEnabled(false));
        button8.addActionListener(e -> button8.setEnabled(false));
        button9.addActionListener(e -> button9.setEnabled(false));

        panel1.setLayout(new GridLayout(3, 3));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);
        frame.setTitle("Tic-Tac-Toe");
        frame.setIconImage(image.getImage());
        frame.add(panel1, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}