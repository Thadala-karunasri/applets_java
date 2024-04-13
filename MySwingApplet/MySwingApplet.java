import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* This HTML can be used to launch the applet:
<object code="MySwingApplet.class" width=220 height=90>
</object>
*/

public class MySwingApplet extends JApplet {
    JButton jbtnAlpha;
    JButton jbtnBeta;
    JLabel jlab;

    // Initialize the applet.
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    makeGUI(); // initialize the GUI
                }
            });
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    // Set up and initialize the GUI.
    private void makeGUI() {
        // Set the applet to use flow layout.
        setLayout(new FlowLayout());

        // Make two buttons.
        jbtnAlpha = new JButton("Alpha");
        jbtnBeta = new JButton("Beta");

        // Add action listener for Alpha.
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Alpha was pressed.");
            }
        });

        // Add action listener for Beta.
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Beta was pressed.");
            }
        });

        // Create a text-based label.
        jlab = new JLabel("Press a button.");

        // Add the buttons to the content pane.
        add(jbtnAlpha);
        add(jbtnBeta);

        // Add the label to the content pane.
        add(jlab);
    }
}
