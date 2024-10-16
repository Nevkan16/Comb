import com.melloware.jintellitype.JIntellitype;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Hotkeys {

    public static void registerCtrlMForMouseClick() {
        JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_CONTROL, 'M');

        JIntellitype.getInstance().addHotKeyListener(markCode -> {
            if (markCode == 1) {
                try {
                    Robot robot = new Robot();
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
