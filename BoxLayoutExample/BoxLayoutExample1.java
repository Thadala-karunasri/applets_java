package BoxLayoutExample;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample1 extends JFrame {
    Button buttons[];

    public BoxLayoutExample1() {
        buttons = new Button[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            getContentPane().add(buttons[i]);
        }
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        BoxLayoutExample1 b = new BoxLayoutExample1();
    }
}

// Example of BoxLayout class with X-AXIS:
class BoxLayoutExample2 extends JFrame {
    Button buttons[];

    public BoxLayoutExample2() {
        buttons = new Button[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            getContentPane().add(buttons[i]);
        }
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        BoxLayoutExample2 b = new BoxLayoutExample2();
    }
}
