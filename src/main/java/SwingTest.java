import javax.swing.*;
import java.awt.event.ActionEvent;

public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("my Test");
        JButton jButton = new JButton("my button");
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button pressed");
            }
        });
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
