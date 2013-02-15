package start;

import java.awt.*;
import java.awt.Window.Type;

import javax.swing.*;

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
		JLabel lblNewLabel = new JLabel("THIS IS WBT LOL");
		lblNewLabel.setBounds(0, 0, 356, 438);
		getContentPane().add(lblNewLabel);
	}

}
