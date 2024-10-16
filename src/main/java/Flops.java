import javax.swing.*;
import java.awt.*;

public class Flops extends BaseWindow {
    public Flops() {
        super(976, 40, 0, 1000);
    }

    @Override
    protected void addButtons(JPanel panel) {
        createButton("AA5", new Color(255, 51, 153),
                "flops3/1.1_AA5.png", "flops3/2.1_AA5.png", "flops3/3.1_AA5.png",
                0, 0, panel);
        createButton("AK3", new Color(255, 51, 150),
                "flops3/1.2_AK3.png", "flops3/2.2_AK3.png", "flops3/3.2_AK3.png",
                1, 0, panel);
        createButton("AQJ", new Color(255, 49, 153),
                "flops3/1.3_AQJ.png", "flops3/2.3_AQJ.png", "flops3/3.3_AQJ.png",
                2, 0, panel);
        createButton("AJJ", new Color(255, 51, 153),
                "flops3/1.4_AJJ.png", "flops3/2.4_AJJ.png", "flops3/3.4_AJJ.png",
                3, 0, panel);
        createButton("AT7", new Color(255, 51, 153),
                "flops3/1.5_AT7.png", "flops3/2.5_AT7.png", "flops3/3.5_AT7.png",
                4, 0, panel);
        createButton("A98", new Color(255, 51, 153),
                "flops3/1.6_As98s.png", "flops3/2.6_As98s.png", "flops3/3.6_As98s.png",
                5, 0, panel);
        createButton("A75m", new Color(255, 51, 153),
                "flops3/1.7_A75m.png", "flops3/2.7_A75m.png", "flops3/3.7_A75m.png",
                6, 0, panel);
        createButton("A75", new Color(255, 51, 153),
                "flops3/1.8_A75.png", "flops3/2.8_A75.png", "flops3/3.8_A75.png",
                7, 0, panel);
        createButton("KK5", Color.orange,
                "flops3/1.9_KK5.png", "flops3/2.9_KK5.png", "flops3/3.9_KK5.png",
                8, 0, panel);
        createButton("KQJ", Color.orange,
                "flops3/1.10_KQJ.png", "flops3/2.10_KQJ.png", "flops3/3.10_KQJ.png",
                9, 0, panel);
        createButton("KQ7", Color.orange,
                "flops3/1.11_KQ7.png", "flops3/2.11_KQ7.png", "flops3/3.11_KQ7.png",
                10, 0, panel);
        createButton("KT8", Color.orange,
                "flops3/1.12_KT8.png", "flops3/2.12_KT8.png", "flops3/3.12_KT8.png",
                11, 0, panel);
        createButton("K74", Color.orange,
                "flops3/1.13_Ks7s4.png", "flops3/2.13_Ks7s4.png", "flops3/3.13_Ks7s4.png",
                12, 0, panel);
        createButton("QJ6", new Color(255, 153, 204),
                "flops3/1.14_QJs6s.png", "flops3/2.14_QJs6s.png", "flops3/3.14_QJs6s.png",
                13, 0, panel);
        createButton("QT3", new Color(255, 153, 204),
                "flops3/1.15_QT3.png", "flops3/2.15_QT3.png", "flops3/3.15_QT3.png",
                14, 0, panel);
        createButton("Q99", new Color(255, 153, 204),
                "flops3/1.16_Qs9s9.png", "flops3/2.16_Qs9s9.png", "flops3/3.16_Qs9s9.png",
                15, 0, panel);
        createButton("Q98", new Color(255, 153, 204),
                "flops3/1.17_Q98.png", "flops3/2.17_Q98.png", "flops3/3.17_Q98.png",
                16, 0, panel);
        createButton("Q74", new Color(255, 153, 204),
                "flops3/1.18_Qs74s.png", "flops3/2.18_Qs74s.png", "flops3/3.18_Qs74s.png",
                17, 0, panel);
        createButton("JJ3", new Color(102, 153, 255),
                "flops3/1.19_JJ3.png", "flops3/2.19_JJ3.png", "flops3/3.19_JJ3.png",
                18, 0, panel);
        createButton("JT2", new Color(102, 153, 255),
                "flops3/1.20_JT2.png", "flops3/2.20_JT2.png", "flops3/3.20_JT2.png",
                19, 0, panel);
        createButton("J94", new Color(102, 153, 255),
                "flops3/1.21_J9s4s.png", "flops3/2.21_J9s4s.png", "flops3/3.21_J9s4s.png",
                20, 0, panel);
        createButton("J74", new Color(102, 153, 255),
                "flops3/1.22_Js74s.png", "flops3/2.22_Js74s.png", "flops3/3.22_Js74s.png",
                21, 0, panel);
        createButton("J63m", new Color(102, 153, 255),
                "flops3/1.23_J63m.png", "flops3/2.23_J63m.png", "flops3/3.23_J63m.png",
                22, 0, panel);
        createButton("T95", new Color(252, 213, 180),
                "flops3/1.24_T95.png", "flops3/2.24_T95.png", "flops3/3.24_T95.png",
                23, 0, panel);
        createButton("T42", new Color(252, 213, 180),
                "flops3/1.25_T42.png", "flops3/2.25_T42.png", "flops3/3.25_T42.png",
                24, 0, panel);
        createButton("T33", new Color(252, 213, 180),
                "flops3/1.26_Ts3s3.png", "flops3/2.26_Ts3s3.png", "flops3/3.26_Ts3s3.png",
                25, 0, panel);
        createButton("987", Color.green,
                "flops3/1.27_9s8s7.png", "flops3/2.27_9s8s7.png", "flops3/3.27_9s8s7.png",
                26, 0, panel);
        createButton("974", Color.green,
                "flops3/1.28_9s74s.png", "flops3/2.28_9s74s.png", "flops3/3.28_9s74s.png",
                27, 0, panel);
        createButton("955", Color.green,
                "flops3/1.29_9s5s5.png", "flops3/2.29_9s5s5.png", "flops3/3.29_9s5s5.png",
                28, 0, panel);
        createButton("832", new Color(0, 176, 240),
                "flops3/1.30_8s3s2.png", "flops3/2.30_8s3s2.png", "flops3/3.30_8s3s2.png",
                29, 0, panel);
        createButton("766", new Color(240, 176, 240),
                "flops3/1.31_766.png", "flops3/2.31_766.png", "flops3/3.31_766.png",
                30, 0, panel);
        createButton("754", new Color(240, 176, 240),
                "flops3/1.32_7s5s4.png", "flops3/2.32_7s5s4.png", "flops3/3.32_7s5s4.png",
                31, 0, panel);
        createButton("662", new Color(240, 240, 178),
                "flops3/1.33_662.png", "flops3/2.33_662.png", "flops3/3.33_662.png",
                32, 0, panel);
        createButton("432", new Color(240, 150, 100),
                "flops3/1.34_432.png", "flops3/2.34_432.png", "flops3/3.34_432.png",
                33, 0, panel);

        createButton(".", Color.BLACK,
                "flops3/5.1_AA5.png", "flops3/4.1_AA5.png", "flops3/6.1_AA5.png",
                0, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.2_AK3.png", "flops3/4.2_AK3.png", "flops3/6.2_AK3.png",
                1, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.3_AQJ.png", "flops3/4.3_AQJ.png", "flops3/6.3_AQJ.png",
                2, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.4_AJJ.png", "flops3/4.4_AJJ.png", "flops3/6.4_AJJ.png",
                3, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.5_AT7.png", "flops3/4.5_AT7.png", "flops3/6.5_AT7.png",
                4, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.6_As98s.png", "flops3/4.6_As98s.png", "flops3/6.6_As98s.png",
                5, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.7_A75m.png", "flops3/4.7_A75m.png", "flops3/6.7_A75m.png",
                6, 1, panel);
        createButton(".",Color.BLACK,
                "flops3/5.8_A75.png", "flops3/4.8_A75.png", "flops3/6.8_A75.png",
                7, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.9_KK5.png", "flops3/4.9_KK5.png", "flops3/6.9_KK5.png",
                8, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.10_KQJ.png", "flops3/4.10_KQJ.png", "flops3/6.10_KQJ.png",
                9, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.11_KQ7.png", "flops3/4.11_KQ7.png", "flops3/6.11_KQ7.png",
                10, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.12_KT8.png", "flops3/4.12_KT8.png", "flops3/6.12_KT8.png",
                11, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.13_Ks7s4.png", "flops3/4.13_Ks7s4.png", "flops3/6.13_Ks7s4.png",
                12, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.14_QJs6s.png", "flops3/4.14_QJs6s.png", "flops3/6.14_QJs6s.png",
                13, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.15_QT3.png", "flops3/4.15_QT3.png", "flops3/6.15_QT3.png",
                14, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.16_Qs9s9.png", "flops3/4.16_Qs9s9.png", "flops3/6.16_Qs9s9.png",
                15, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.17_Q98.png", "flops3/4.17_Q98.png", "flops3/6.17_Q98.png",
                16, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.18_Qs74s.png", "flops3/4.18_Qs74s.png", "flops3/6.18_Qs74s.png",
                17, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.19_JJ3.png", "flops3/4.19_JJ3.png", "flops3/6.19_JJ3.png",
                18, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.20_JT2.png", "flops3/4.20_JT2.png", "flops3/6.20_JT2.png",
                19, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.21_J9s4s.png", "flops3/4.21_J9s4s.png", "flops3/6.21_J9s4s.png",
                20, 1, panel);
        createButton(".",Color.BLACK,
                "flops3/5.22_Js74s.png", "flops3/4.22_Js74s.png", "flops3/6.22_Js74s.png",
                21, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.23_J63m.png", "flops3/4.23_J63m.png", "flops3/6.23_J63m.png",
                22, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.24_T95.png", "flops3/4.24_T95.png", "flops3/6.24_T95.png",
                23, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.25_T42.png", "flops3/4.25_T42.png", "flops3/6.25_T42.png",
                24, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.26_Ts3s3.png", "flops3/4.26_Ts3s3.png", "flops3/6.26_Ts3s3.png",
                25, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.27_9s8s7.png", "flops3/4.27_9s8s7.png", "flops3/6.27_9s8s7.png",
                26, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.28_9s74s.png", "flops3/4.28_9s74s.png", "flops3/6.28_9s74s.png",
                27, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.29_9s5s5.png", "flops3/4.29_9s5s5.png", "flops3/6.29_9s5s5.png",
                28, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.30_8s3s2.png", "flops3/4.30_8s3s2.png", "flops3/6.30_8s3s2.png",
                29, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.31_766.png", "flops3/4.31_766.png", "flops3/6.31_766.png",
                30, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.32_7s5s4.png", "flops3/4.32_7s5s4.png", "flops3/6.32_7s5s4.png",
                31, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.33_662.png", "flops3/4.33_662.png", "flops3/6.33_662.png",
                32, 1, panel);
        createButton(".", Color.BLACK,
                "flops3/5.34_432.png", "flops3/4.34_432.png", "flops3/6.34_432.png",
                33, 1, panel);
    }
}
