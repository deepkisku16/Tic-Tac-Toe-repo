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
    ImageIcon image = new ImageIcon("C:\\Users\\Deep Kisku\\Desktop\\tic tac toe.png");

    ClosingPage(String str) {
        label.setText(str + " have won");
        label.setSize(250, 250);
//        label.setBounds(250, 250, 100, 100);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);

        restart_button.addActionListener(this);
        restart_button.setFocusable(false);
        restart_button.setBorder(BorderFactory.createEtchedBorder());

        panel1.add(label);
        panel2.add(restart_button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(40, 40));
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setTitle("Tic-Tac-Toe");
        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);
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
