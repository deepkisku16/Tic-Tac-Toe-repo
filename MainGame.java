import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainGame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
//    JPanel panel2 = new JPanel();
    JButton[] button = new JButton[9];
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
    static Random first_turn = new Random();
    static boolean turn = first_turn.nextBoolean();
    static String tstring;

    MainGame() {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

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

    void playing() {
        if(turn) {
            tstring = "O";
        }
        else {
            tstring = "X";
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            if(turn) {
                if(button1.getText() == "") {
                    button1.setEnabled(false);
                    button1.setText("O");
                    button1.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button1.getText() == "") {
                    button1.setEnabled(false);
                    button1.setText("X");
                    button1.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button2) {
            if(turn) {
                if(button2.getText() == "") {
                    button2.setEnabled(false);
                    button2.setText("O");
                    button2.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button2.getText() == "") {
                    button2.setEnabled(false);
                    button2.setText("X");
                    button2.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button3) {
            if(turn) {
                if(button3.getText() == "") {
                    button3.setEnabled(false);
                    button3.setText("O");
                    button3.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button3.getText() == "") {
                    button3.setEnabled(false);
                    button3.setText("X");
                    button3.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button4) {
            if(turn) {
                if(button4.getText() == "") {
                    button4.setEnabled(false);
                    button4.setText("O");
                    button4.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button4.getText() == "") {
                    button4.setEnabled(false);
                    button4.setText("X");
                    button4.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button5) {
            if(turn) {
                if(button5.getText() == "") {
                    button5.setEnabled(false);
                    button5.setText("O");
                    button5.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button5.getText() == "") {
                    button5.setEnabled(false);
                    button5.setText("X");
                    button5.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button6) {
            if(turn) {
                if(button6.getText() == "") {
                    button6.setEnabled(false);
                    button6.setText("O");
                    button6.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button6.getText() == "") {
                    button6.setEnabled(false);
                    button6.setText("X");
                    button6.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button7) {
            if(turn) {
                if(button7.getText() == "") {
                    button7.setEnabled(false);
                    button7.setText("O");
                    button7.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button7.getText() == "") {
                    button7.setEnabled(false);
                    button7.setText("X");
                    button7.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button8) {
            if(turn) {
                if(button8.getText() == "") {
                    button8.setEnabled(false);
                    button8.setText("O");
                    button8.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button8.getText() == "") {
                    button8.setEnabled(false);
                    button8.setText("X");
                    button8.setFocusable(false);
                    turn = true;
                }
            }
        }
        else if(e.getSource() == button9) {
            if(turn) {
                if(button9.getText() == "") {
                    button9.setEnabled(false);
                    button9.setText("O");
                    button9.setFocusable(false);
                    turn = false;
                }
            }
            else {
                if(button9.getText() == "") {
                    button9.setEnabled(false);
                    button9.setText("X");
                    button9.setFocusable(false);
                    turn = true;
                }
            }
        }
    }
}
