import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

abstract class BaseWindow extends JFrame {
    protected int windowWidth;
    protected int windowHeight;
    protected int windowX;
    protected int windowY;

    public BaseWindow(int width, int height, int x, int y) {
        this.windowWidth = width;
        this.windowHeight = height;
        this.windowX = x;
        this.windowY = y;
        this.initUI();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private void initUI() {
        this.setResizable(false);
        this.setUndecorated(true);
        this.setSize(windowWidth, windowHeight);
        this.setLocation(windowX, windowY);

        JPanel buttonPanel = createButtonPanel();
        add(buttonPanel, BorderLayout.NORTH);

        JPanel panel = createMainPanel();
        this.add(panel);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBackground(Color.BLACK);
        addWindowDraggingListeners(buttonPanel);
        return buttonPanel;
    }

    private JPanel createMainPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(0, 0, 0));
        addWindowDraggingListeners(panel);

        addButtons(panel);

        return panel;
    }

    protected abstract void addButtons(JPanel panel);

    private void addWindowDraggingListeners(JPanel panel) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                mouseX = evt.getX();
                mouseY = evt.getY();
            }
        });
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                int x = evt.getXOnScreen() - mouseX;
                int y = evt.getYOnScreen() - mouseY;
                setLocation(x, y);
            }
        });
    }

    private int mouseX;
    private int mouseY;

    protected void createButton(String text, Color color, String imagePath1, String imagePath2, String imagePath3, int gridx, int gridy, int left, int right, JPanel panel) {
        Font myFont = new Font("Arial", Font.BOLD, 12);
        JButton button = new JButton(text);
        button.setFont(myFont);
        button.setForeground(color);
        button.setBackground(Color.BLACK);
        button.setMargin(new Insets(0, left, 0, right));

        if (imagePath1 != null) {
            button.addMouseListener(new ImagePopupListener(imagePath1, MouseEvent.BUTTON1, imagePath3));
        }
        if (imagePath2 != null) {
            button.addMouseListener(new ImagePopupListener(imagePath2, MouseEvent.BUTTON3, imagePath3));
        }
        if (imagePath3 != null) {
            button.addMouseListener(new ImagePopupListener(imagePath3, MouseEvent.BUTTON1_DOWN_MASK | MouseEvent.BUTTON3_DOWN_MASK, imagePath3));
        }

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 0, 0);
        panel.add(button, gbc);
    }

    protected void createButton(String text, Color color, String imagePath1, String imagePath2, String imagePath3, int gridx, int gridy, JPanel panel) {
        createButton(text, color, imagePath1, imagePath2, imagePath3, gridx, gridy, 0, 0, panel);
    }

    public void createButton(String text, Color color, String imagePath1, int gridx, int gridy, int left, int right, JPanel panel) {
        createButton(text, color, imagePath1, null, null, gridx, gridy, left, right, panel);
    }
}
