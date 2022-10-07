import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Tic-Tac-Toe");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    ImageIcon image = new ImageIcon("C:\\Users\\Deep Kisku\\Desktop\\tic_tac_toe.png");
    ImageIcon picture = new ImageIcon("C:\\Users\\Deep Kisku\\Desktop\\tic_tac_toe.png");
    JButton button = new JButton("    Start Game    ");
    StartPage() {
        label.setIcon(picture);
        label.setSize(250, 250);
        label.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 40));
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        button.setFocusable(false);
        button.addActionListener(this);
        button.setBorder(BorderFactory.createEtchedBorder());

        panel1.setBackground(Color.CYAN);
        panel1.add(label);
        panel2.setBackground(Color.CYAN);
        panel2.add(button);

        frame.setTitle("Tic-Tac-Toe");
        frame.setLayout(new BorderLayout(0, 40));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setResizable(false);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            frame.dispose();
            new MainGame();
        }
    }
}
