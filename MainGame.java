import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainGame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
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
    int count = 0;

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
        frame.setResizable(false);
        frame.setTitle("Tic-Tac-Toe");
        frame.setIconImage(image.getImage());
        frame.add(panel1, BorderLayout.CENTER);
        frame.setVisible(true);
    }


    void winningCombination() {
        if(button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) { /* when button1, button2 and button3 are marked X */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) { /* when button4, button5 and button6 are marked X */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) { /* when button2, button5 and button8 are marked X */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) { /* when button1, button4, and button7 are marked X */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) { /* when button3, button6 and button9 are marked X */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) { /* when button7, button8 and button9 are makred X */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) { /* when button1, button5 and button9 are marked */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")) { /* when button3, button5 and button7 are marked X */
            frame.dispose();
            new ClosingPage("X");
        }
        else if(button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) { /* when button1, button2 and button3 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) { /* when button1, button4, and button7 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) { /* when button4, button5, and button6 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) { /* when button2, button5, and button8 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) { /* when button3, button6 and button9 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) { /* when button7, button8 and button9 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) { /* when button1, button5 and button9 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")) { /* when button3, button5 and button7 are marked O */
            frame.dispose();
            new ClosingPage("O");
        }
        else if(count > 8) {
            frame.dispose();
<<<<<<< HEAD
            new ClosingPage("");
=======
            new Closingpage("");
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            if(turn) {
                button1.setEnabled(false);
                button1.setText("O");
                button1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
<<<<<<< HEAD
                button1.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button1.setFocusable(false);
                turn = false;
            }
            else {
                button1.setEnabled(false);
                button1.setText("X");
<<<<<<< HEAD
                button1.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button1.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button1.setFocusable(false);
                turn = true;
            }
            count += 1;
        }
        else if(e.getSource() == button2) {
            if(turn) {
                button2.setEnabled(false);
                button2.setText("O");
<<<<<<< HEAD
                button2.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button2.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button2.setFocusable(false);
                turn = false;
            }
            else {
                button2.setEnabled(false);
                button2.setText("X");
<<<<<<< HEAD
                button2.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button2.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button2.setFocusable(false);
                turn = true;
            }
            count += 1;
        }
        else if(e.getSource() == button3) {
            if(turn) {
                button3.setEnabled(false);
                button3.setText("O");
<<<<<<< HEAD
                button3.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button3.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button3.setFocusable(false);
                turn = false;
            }
            else {
                button3.setEnabled(false);
                button3.setText("X");
<<<<<<< HEAD
                button3.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button3.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button3.setFocusable(false);
                turn = true;
            }
            count += 1;
        }
        else if(e.getSource() == button4) {
            if(turn) {
                button4.setEnabled(false);
                button4.setText("O");
<<<<<<< HEAD
                button4.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button4.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button4.setFocusable(false);
                turn = false;
            }
            else {
                button4.setEnabled(false);
                button4.setText("X");
<<<<<<< HEAD
                button4.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button4.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button4.setFocusable(false);
                turn = true;
            }
            count += 1;
<<<<<<< HEAD
=======

>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
        }
        else if(e.getSource() == button5) {
            if(turn) {
                button5.setEnabled(false);
                button5.setText("O");
<<<<<<< HEAD
                button5.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button5.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button5.setFocusable(false);
                turn = false;
            }
            else {
                button5.setEnabled(false);
                button5.setText("X");
<<<<<<< HEAD
                button5.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button5.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button5.setFocusable(false);
                turn = true;
            }
            count += 1;
        }
        else if(e.getSource() == button6) {
            if(turn) {
                button6.setEnabled(false);
                button6.setText("O");
<<<<<<< HEAD
                button6.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button6.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button6.setFocusable(false);
                turn = false;
            }
            else {
                button6.setEnabled(false);
                button6.setText("X");
<<<<<<< HEAD
                button6.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button6.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button6.setFocusable(false);
                turn = true;
            }
            count += 1;
        }
        else if(e.getSource() == button7) {
            if(turn) {
                button7.setEnabled(false);
                button7.setText("O");
<<<<<<< HEAD
                button7.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button7.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button7.setFocusable(false);
                turn = false;
            }
            else {
                button7.setEnabled(false);
                button7.setText("X");
<<<<<<< HEAD
                button7.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button7.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button7.setFocusable(false);
                turn = true;
            }
            count += 1;
        }
        else if(e.getSource() == button8) {
            if(turn) {
                button8.setEnabled(false);
                button8.setText("O");
<<<<<<< HEAD
                button8.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button8.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button8.setFocusable(false);
                turn = false;
            }
            else {
                button8.setEnabled(false);
                button8.setText("X");
<<<<<<< HEAD
                button8.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button8.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button8.setFocusable(false);
                turn = true;
            }
            count += 1;
        }
        else if(e.getSource() == button9) {
            if(turn) {
                button9.setEnabled(false);
                button9.setText("O");
<<<<<<< HEAD
                button9.setBackground(Color.GREEN);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button9.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button9.setFocusable(false);
                turn = false;
            }
            else {
                button9.setEnabled(false);
                button9.setText("X");
<<<<<<< HEAD
                button9.setBackground(Color.BLUE);
=======
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
                button9.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 70));
                button9.setFocusable(false);
                turn = true;
            }
<<<<<<< HEAD
            count += 1;
=======
            count += 1
>>>>>>> 429f5c6a96ee7c309a2a4ad28f1a5cdf9f2d12d8
        }
        winningCombination();
    }
}
