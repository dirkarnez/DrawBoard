import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame f = new JFrame();
                DrawPanel p = new DrawPanel(10f);

                p.setPreferredSize(new Dimension(300, 200));;

                f.setContentPane(p);
                f.pack();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });
    }
}