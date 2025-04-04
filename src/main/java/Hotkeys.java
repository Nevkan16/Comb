import com.melloware.jintellitype.JIntellitype;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Hotkeys {

    public static void registerHotkeysForMouseClick() {
        JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_SHIFT, 0);

        JIntellitype.getInstance().registerHotKey(2, 0, 'D');

        JIntellitype.getInstance().registerHotKey(3, JIntellitype.MOD_SHIFT, 'A');
        JIntellitype.getInstance().registerHotKey(4, JIntellitype.MOD_SHIFT, 'C');

        JIntellitype.getInstance().addHotKeyListener(markCode -> {
            try {
                Robot robot = new Robot();

                if (markCode == 1) {
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                } else if (markCode == 2) {
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
                else if (markCode == 3) {
                    killChromeProcess();
                }
                else if (markCode == 4) {
                    robot.keyPress(KeyEvent.VK_BACK_SPACE);
                    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                }
            } catch (AWTException e) {
                e.printStackTrace();
            }
        });
    }

    private static void killChromeProcess() {
        try {
            Process process = Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
