import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClosingPage implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton restart_button = new JButton("   Restart Game   ");
    JLabel label = new JLabel();
    ImageIcon image = new ImageIcon("C:\\Users\\Deep Kisku\\Desktop\\tic_tac_toe.png");
    ImageIcon picture = new ImageIcon("C:\\Users\\Deep Kisku\\Desktop\\tic_tac_toe.png");

    ClosingPage(String str) {
        label.setIcon(picture);
        if(str.equals("X") || str.equals("O")) {
            label.setText(str + " have won!!");
        }
        else {
            label.setText("Draw Game");
        }
        label.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 40));
        label.setSize(250, 250);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);

        restart_button.addActionListener(this);
        restart_button.setFocusable(false);
        restart_button.setBorder(BorderFactory.createEtchedBorder());

        panel1.add(label);
        panel1.setBackground(Color.CYAN);
        panel2.add(restart_button);
        panel2.setBackground(Color.CYAN);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(0, 30));
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setTitle("Tic-Tac-Toe");
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == restart_button) {
            frame.dispose();
            new MainGame();
        }
    }
}
