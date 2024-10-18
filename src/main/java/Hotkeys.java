import com.melloware.jintellitype.JIntellitype;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Hotkeys {

    public static void registerHotkeysForMouseClick() {
        // Регистрация горячей клавиши Shift
        JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_SHIFT, 0);

        // Регистрация горячей клавиши "D"
        JIntellitype.getInstance().registerHotKey(2, 0, 'D');

        // Обработчик горячих клавиш
        JIntellitype.getInstance().addHotKeyListener(markCode -> {
            try {
                Robot robot = new Robot();

                if (markCode == 1) {
                    // Эмулируем клик при нажатии Shift
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                } else if (markCode == 2) {
                    // Эмулируем клик при нажатии "D"
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
            } catch (AWTException e) {
                e.printStackTrace();
            }
        });
    }
}
