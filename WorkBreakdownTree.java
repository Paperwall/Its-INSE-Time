package start;

import java.awt.*;
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
		JTextPane wbtContent = new JTextPane();
		for (int i = 0; i < InputInterface.model.getRowCount(); i++){
		      String value = (String) InputInterface.model.getValueAt(i, 1);
		      wbtContent.setText(value);
		      System.out.print("row traversed!"); //debug code
		}
		wbtContent.setBounds(0, 0, 250, 400);
		getContentPane().add(wbtContent);
	}
}

/*
 * 		super();
		setType(Type.POPUP);
		setTitle("Work Breakdown Tree");
		
		setResizable(false);
		setSize(new Dimension(360, 462));
		setPreferredSize(new Dimension(400, 300));
		getContentPane().setBackground(SystemColor.desktop);
		getContentPane().setLayout(null); 
		
		 TablePrintDemo newContentPane = new TablePrintDemo();
	     newContentPane.setOpaque(true); //content panes must be opaque
	     setContentPane(newContentPane);
		//JTextPane wbtContent = new JTextPane();
		InputInterface.model.print();
		//wbtContent.setBounds(0, 0, 250, 400);
		 * 
		 * 
		 * 
		 * super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane();

        //Add the scroll pane to this panel.
        add(scrollPane);
		 */
