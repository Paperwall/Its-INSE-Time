package start;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyledDocument;

public class WorkBreakdownTree extends JFrame{  
	

	private static final long serialVersionUID = 1L;

	public WorkBreakdownTree() {
		super();
		setType(Type.POPUP);
		setTitle("Work Breakdown Tree");
		
		setResizable(false);
		setSize(new Dimension(360, 462));
		setPreferredSize(new Dimension(400, 300));
		getContentPane().setBackground(SystemColor.desktop);
		getContentPane().setLayout(null); 
		
		JTextPane wbtContent = new JTextPane();
		wbtContent.setText("some text");
		wbtContent.setBounds(0, 0, 250, 400);
		getContentPane().add(wbtContent);
		
	}
}
