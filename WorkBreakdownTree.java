package start;

import java.awt.*;
import javax.swing.*;

public class WorkBreakdownTree {
	
	
	public WorkBreakdownTree() {
		super();
		
		JFrame wbtFrame = new JFrame("HelloWorldSwing");
        wbtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        wbtFrame.setResizable(false);
		wbtFrame.setSize(new Dimension(800, 600));
		wbtFrame.setPreferredSize(new Dimension(800, 600));


        JLabel label = new JLabel("Hello World");
        wbtFrame.getContentPane().add(label);

        //Display the window.
        wbtFrame.pack();
		
	}
}
