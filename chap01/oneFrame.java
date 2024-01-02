package chap01;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class oneFrame {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Вечеринка у Тима");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    JLabel label = new JLabel("Вечеринка у Тима");
    JButton button1 = new JButton("Ваша ставка");
    JButton button2 = new JButton("Сбросить");

    panel.add(label);
    panel.add(button1);
    panel.add(button2);
    frame.add(panel);

    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
          JOptionPane.showMessageDialog(null, "Вы проиграли");
        } else {
          JOptionPane.showMessageDialog(null, "Вы выиграли");
        }
      }
    });

    frame.pack();
    frame.setVisible(true);

    }

  }



