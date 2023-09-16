import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShippingContainerGUI extends JPanel {
    private static final int BOX_SIZE = 50;
    private static final int CONTAINER_WIDTH = 400;
    private static final int CONTAINER_HEIGHT = 400;

    private String[][][] container = new String[40][8][8];
    private int counter = 0;

    public ShippingContainerGUI() {
        setPreferredSize(new Dimension(CONTAINER_WIDTH, CONTAINER_HEIGHT));

        // Add a button to add a box to the container
        JButton addButton = new JButton("Add Box");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBoxToContainer();
                repaint(); // Redraw the container with the new box
            }
        });

        // Add the button to the GUI
        add(addButton);
    }

    private void addBoxToContainer() {
        if (counter < 40 * 8 * 8) {
            int i = counter / (8 * 8);
            int j = (counter / 8) % 8;
            int k = counter % 8;

            container[i][j][k] = "box " + (counter + 1);
            counter++;
        } else {
            JOptionPane.showMessageDialog(this, "Container is full!");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 0;
        int y = 0;

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    String boxLabel = container[i][j][k];
                    if (boxLabel != null) {
                        g.setColor(Color.BLUE);
                        g.fillRect(x, y, BOX_SIZE, BOX_SIZE);
                        g.setColor(Color.BLACK);
                        g.drawRect(x, y, BOX_SIZE, BOX_SIZE);
                        g.drawString(boxLabel, x + 5, y + 20);
                    }
                    x += BOX_SIZE;
                }
                x = 0;
                y += BOX_SIZE;
            }
            y = 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Shipping Container");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new ShippingContainerGUI());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}


