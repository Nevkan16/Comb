import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImagePopupListener extends MouseAdapter {
    private final String imagePath;
    private final String combinedImagePath;
    private final int mouseButtonMask;
    private JDialog popup;

    public ImagePopupListener(String imagePath, int mouseButtonMask, String combinedImagePath) {
        this.imagePath = imagePath;
        this.mouseButtonMask = mouseButtonMask;
        this.combinedImagePath = combinedImagePath;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int button = e.getButton();
        int modifiers = e.getModifiersEx();

        if ((button == MouseEvent.BUTTON1 && mouseButtonMask == MouseEvent.BUTTON1) ||
                (button == MouseEvent.BUTTON3 && mouseButtonMask == MouseEvent.BUTTON3) ||
                (button == MouseEvent.BUTTON2 && mouseButtonMask == MouseEvent.BUTTON2) ||
                ((modifiers & MouseEvent.BUTTON1_DOWN_MASK) != 0 &&
                        (modifiers & MouseEvent.BUTTON3_DOWN_MASK) != 0 &&
                        mouseButtonMask == (MouseEvent.BUTTON1_DOWN_MASK | MouseEvent.BUTTON3_DOWN_MASK))) {

            popup = new JDialog();
            popup.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ImageIcon image = new ImageIcon(mouseButtonMask == (MouseEvent.BUTTON1_DOWN_MASK | MouseEvent.BUTTON3_DOWN_MASK) ? combinedImagePath : imagePath);
            JLabel label = new JLabel(image);

            popup.add(label);
            popup.pack();
            popup.setLocationRelativeTo(null);
            popup.setVisible(true);
            popup.setAlwaysOnTop(true);
            popup.setResizable(false);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (popup != null) {
            popup.dispose();
        }
    }
}
