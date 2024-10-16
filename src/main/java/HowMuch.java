import javax.swing.*;
import java.awt.*;

public class HowMuch extends BaseWindow {
    public HowMuch() {
        super(770, 20, 988, 1000);
    }

    @Override
    protected void addButtons(JPanel panel) {
        createButton("vs 1", new Color(255, 117, 24),
                "ranges/1.vs 1.PNG", 0, 0, 1, 1, panel);
        createButton("vs 2", Color.orange,
                "ranges/2.vs 2.PNG", 1, 0, 1, 1, panel);
        createButton("vs 3", Color.orange,
                "ranges/3.vs 3.PNG", 2, 0, 1, 1, panel);
        createButton("vs 4", Color.orange,
                "ranges/4.vs 4.PNG", 3, 0, 1, 1, panel);
        createButton("vs 5", Color.orange,
                "ranges/5.vs 5.PNG", 4, 0, 1, 1, panel);
        createButton("vs 6", Color.orange,
                "ranges/6.vs 6.PNG", 5, 0, 1, 1, panel);
        createButton("vs 8", new Color(255, 117, 24),
                "ranges/7.vs 8.PNG", 6, 0, 1, 1, panel);
        createButton("vs 10", Color.red,
                "ranges/8.vs 10.PNG", 7, 0, 1, 1, panel);
        createButton("vs 12", Color.red,
                "ranges/9.vs 12.PNG", 8, 0, 1, 1, panel);
        createButton("vs 13", Color.red,
                "ranges/10.vs 13.PNG", 9, 0, 1, 1, panel);
        createButton("vs 15", new Color(198, 224, 180),
                "ranges/11.vs 15.PNG", 10, 0, 1, 1, panel);
        createButton("vs 16", new Color(198, 224, 180),
                "ranges/12.vs 16.PNG", 11, 0, 1, 1, panel);
        createButton("vs 20", new Color(198, 224, 255),
                "ranges/13.vs 20.PNG", 12, 0, 1, 1, panel);
        createButton("vs 23", new Color(198, 224, 255),
                "ranges/14.vs 23.PNG", 13, 0, 1, 1, panel);
        createButton("vs 25", new Color(198, 224, 255),
                "ranges/15.vs 25.PNG", 14, 0, 1, 1, panel);
        createButton("vs 30", (new Color(255, 117, 24)),
                "ranges/16.vs 30.PNG", 15, 0, 1, 1, panel);
        createButton("vs 40", Color.red,
                "ranges/17.vs 40.PNG", 16, 0, 1, 1, panel);
        createButton("vs 42", Color.red,
                "ranges/18.vs 42.PNG", 17, 0, 1, 1, panel);
        createButton("vs 50", Color.red,
                "ranges/19.vs 50.PNG", 18, 0, 1, 1, panel);
        createButton("vs 67", new Color(198, 224, 255),
                "ranges/20.vs 67.PNG", 19, 0, 1, 1, panel);
        createButton("100", new Color(198, 224, 180),
                "ranges/21.vs 100.PNG", 20, 0, 1, 1, panel);
        createButton("agg", new Color(255, 117, 24),
                "ranges/agg.PNG", 21, 0, 1, 1, panel);
    }
}
