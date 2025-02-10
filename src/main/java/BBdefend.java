import javax.swing.*;
import java.awt.*;

public class BBdefend extends BaseWindow {
    public BBdefend() {
        super(786, 20, 988, 1020);
    }

    @Override
    protected void addButtons(JPanel panel) {
        createButton("BB 6", new Color(255, 0, 0),
                "Ranges/1.BB vs 6%.JPG", 0, 0, 1, 1, panel);
        createButton("8", new Color(255, 51, 153),
                "Ranges/2.BB vs 8%.JPG", 1, 0, 2, 2, panel);
        createButton("10", new Color(255, 51, 153),
                "Ranges/3.BB vs 10%.JPG", 2, 0, 2, 2, panel);
        createButton("12", new Color(255, 51, 153),
                "Ranges/4.BB vs 12%.JPG", 3, 0, 2, 2, panel);
        createButton("13", Color.ORANGE,
                "Ranges/5.BB vs 13%.JPG", 4, 0, 2, 2, panel);
        createButton("15", Color.ORANGE,
                "Ranges/6.BB vs 15%.JPG", 5, 0, 2, 2, panel);
        createButton("16", Color.ORANGE,
                "Ranges/7.BB vs 16%.JPG", 6, 0, 2, 2, panel);
        createButton("20", new Color(198, 224, 180),
                "Ranges/8.BB vs 20%.JPG", 7, 0, 2, 2, panel);
        createButton("23", new Color(198, 224, 180),
                "Ranges/9.BB vs 23%.JPG", 8, 0, 2, 2, panel);
        createButton("25", new Color(198, 224, 180),
                "Ranges/10.BB vs 25%.JPG", 9, 0, 2, 2, panel);
        createButton("30", new Color(198, 224, 180),
                "Ranges/11.BB vs 30%.JPG", 10, 0, 2, 2, panel);
        createButton("40", Color.green,
                "Ranges/12.BB vs 40%.JPG", 11, 0, 2, 2, panel);
        createButton("42", Color.green,
                "Ranges/13.BB vs 42%.JPG", 12, 0, 2, 2, panel);
        createButton("50",new Color(0, 204, 102),
                "Ranges/14.BB vs 50%.JPG", 13, 0, 2, 2, panel);
        createButton("67", new Color(0, 204, 102),
                "Ranges/15.BB vs 67%.JPG", 14, 0, 2, 2, panel);
        createButton("BvB 10", new Color(255, 51, 153),
                "Ranges/16.BvB vs 10%.JPG", 15, 0, 1, 1, panel);
        createButton("16", Color.orange,
                "Ranges/17.BvB vs 16%.JPG", 16, 0, 2, 2, panel);
        createButton("20", new Color(198, 224, 180),
                "Ranges/18.BvB vs 20%.JPG", 17, 0, 2, 2, panel);
        createButton("25", new Color(198, 224, 180),
                "Ranges/19.BvB vs 25%.JPG", 18, 0, 2, 2, panel);
        createButton("30", new Color(198, 224, 180),
                "Ranges/20.BvB vs 30%.JPG", 19, 0, 2, 2, panel);
        createButton("40", Color.green,
                "Ranges/21.BvB vs 40%.JPG", 20, 0, 2, 2, panel);
        createButton("42", Color.green,
                "Ranges/22.BvB vs 42%.JPG", 21, 0, 2, 2, panel);
        createButton("50", new Color(0, 204, 102),
                "Ranges/23.BvB vs 50%.JPG", 22, 0, 2, 2, panel);
        createButton("67", new Color(150, 255, 102),
                "Ranges/24.BvB vs 67%.JPG", 23, 0, 2, 2, panel);
        createButton("2", Color.RED,
                "Ranges/1.vs 4B 2%.PNG", 24, 0, 2, 2, panel);
        createButton("2,6", Color.RED,
                "Ranges/2.vs 4B 2,6%.png", 25, 0, 2, 2, panel);
        createButton("3", Color.RED,
                "Ranges/3.vs 4B 3%.PNG", 26, 0, 0, 0, panel);
        createButton("4", Color.ORANGE,
                "Ranges/4.vs 4B 4%.PNG", 27, 0, 2, 2, panel);
        createButton("5", Color.ORANGE,
                "Ranges/5.vs 4B 5%.PNG", 28, 0, 2, 2, panel);
        createButton("6", Color.ORANGE,
                "Ranges/6.vs 4B 6%.PNG", 29, 0, 2, 2, panel);
        createButton("7", new Color(255, 117, 24),
                "Ranges/7.vs 4B 7%.PNG", 30, 0, 2, 2, panel);
        createButton("8", new Color(198, 224, 180),
                "Ranges/8.vs 4B 8%.PNG", 31, 0, 2, 2, panel);
        createButton("9", new Color(198, 224, 180),
                "Ranges/9.vs 4B 9%.PNG", 32, 0, 2, 2, panel);
        createButton("10", new Color(198, 224, 180),
                "Ranges/10.vs 4B 10%.PNG", 33, 0, 2, 2, panel);
    }
}
