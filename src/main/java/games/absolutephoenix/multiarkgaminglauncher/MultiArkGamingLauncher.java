package games.absolutephoenix.multiarkgaminglauncher;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MultiArkGamingLauncher {
    public static JFrame test = new JFrame();

    public static void main(String[] args){
        test.setTitle("This is a test");
        test.setDefaultCloseOperation(EXIT_ON_CLOSE);
        test.setLayout(null);
        test.setResizable(true);
        test.setMinimumSize(new Dimension(800, 600));
        test.setPreferredSize(new Dimension(800, 600));
        test.pack();
        test.setLocationRelativeTo(null);
        test.setVisible(true);
    }
}
