import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Framet extends JFrame {
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JTextArea textArea = new JTextArea(20, 30);
    JScrollPane scrollPanel = new JScrollPane(textArea);

    static JLabel label = new JLabel();
    JButton ok = new JButton("OK");

    public Framet() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        textArea.setLineWrap(true);

        Cepuha.setLable();

        panel1.add(panel2);

        this.add(BorderLayout.CENTER, panel1);

        ok.addActionListener(new OkListener());

        textArea.setBorder(BorderFactory.createTitledBorder(label.getText()));
        panel2.add(scrollPanel);
        panel2.add(ok);

        this.setVisible(true);
    }

    class OkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Cepuha.i++;
            Cepuha.getInformation();
            if (Cepuha.i == (6 * Cepuha.userCount)) {
                textArea.setText(Cepuha.finish());
            } else {
                Cepuha.setLable();
                textArea.setBorder(BorderFactory.createTitledBorder(label.getText()));
                //textArea.setCaretPosition(0);
            }
        }
    }
}
