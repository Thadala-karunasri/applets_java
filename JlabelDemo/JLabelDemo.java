import java.awt.*;
import javax.swing.*;
import java.applet.*; // Import Applet class for non-Swing applet
import java.net.URL; // Import URL for loading image

/* 
<applet code="JLabelDemo" width=250 height=150> 
</applet> 
*/
public class JLabelDemo extends Applet { // Change JApplet to Applet
    public void start() { // Override start() instead of init()
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        public void run() {
                            makeGUI();
                        }
                    });
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    private void makeGUI() {
        // Create an icon.
        URL imageURL = getClass().getResource("france.png"); // Get the image URL
        if (imageURL == null) {
            System.err.println("Resource not found: france.gif");
            return;
        }
        ImageIcon ii = new ImageIcon(imageURL); // Load image from URL

        // Create a label.
        JLabel jl = new JLabel("France", ii, JLabel.CENTER);

        // Add the label to the content pane.
        add(jl);
    }
}
