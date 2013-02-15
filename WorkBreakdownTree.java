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
	}
	
	public void drawTextArea(){
		JTextArea wbtContent = new JTextArea();
		wbtContent.setBounds(0, 0, 250, 200);
		wbtContent.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(wbtContent);
        this.add(scrollPane, BorderLayout.CENTER);
        
        String fullString = "";
		for (int i = 0; i < InputInterface.model.getRowCount(); i++){
			String taskName = (String) InputInterface.model.getValueAt(i, 0);
			fullString = "\n" + taskName + fullString;
		    System.out.print(i + "row being printed"); //debug code
		}
		wbtContent.setText(reverse(fullString));
		getContentPane().add(wbtContent);
	}
	
	
	//method to reverse the string of the wbt to turn it into correct order
	public String reverse(String s) {
	    if (s.length() <= 1) { 
	        return s;
	    }
	    return reverse(s.substring(1, s.length())) + s.charAt(0);
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
