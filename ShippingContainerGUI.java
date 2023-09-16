import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShippingContainerGUI extends JFrame {

    public static String[][][] container = new String[40][8][8];
    public static Box box = new Box(1, 5, 2, 5);

    public ShippingContainerGUI() {
        setTitle("Shipping Container");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel containerPanel = new JPanel(new GridLayout(40, 8, 1, 1));

        fillArray(container, box);

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    if (container[i][j][k] != null) {
                        JLabel boxLabel = new JLabel(container[i][j][k]);
                        boxLabel.setHorizontalAlignment(JLabel.CENTER);
                        containerPanel.add(boxLabel);
                    }
                }
            }
        }

        JScrollPane scrollPane = new JScrollPane(containerPanel);
        add(scrollPane);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetContainer();
                refreshContainer(containerPanel);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void fillArray(String[][][] container, Box box) {
        int counter = 0;
        long maxWeight = 59200;
        long temp = box.getWeight();

        if (maxWeight > temp) {
            for (int i = 0; i < 40 / box.getLength(); i++) {
                for (int j = 0; j < 8 / box.getHeight(); j++) {
                    for (int k = 0; k < 8 / box.getWidth(); k++) {
                        counter++;
                        container[i][j][k] = "box " + counter + " ";
                    }
                }
            }
        }
    }

    public static void resetContainer() {
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    container[i][j][k] = null;
                }
            }
        }
    }

    public static void refreshContainer(JPanel containerPanel) {
        containerPanel.removeAll();
        fillArray(container, box);

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    if (container[i][j][k] != null) {
                        JLabel boxLabel = new JLabel(container[i][j][k]);
                        boxLabel.setHorizontalAlignment(JLabel.CENTER);
                        containerPanel.add(boxLabel);
                    }
                }
            }
        }

        containerPanel.revalidate();
        containerPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShippingContainerGUI();
        });
    }
}

