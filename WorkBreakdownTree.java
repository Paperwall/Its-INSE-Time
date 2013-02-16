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
		getContentPane().setBackground(new Color(72, 61, 139));
		getContentPane().setLayout(null); 
	}
	
	public void drawTextArea(){
		String taskName;
		JTextArea wbtContent = new JTextArea();
		wbtContent.setBounds(0, 0, 200, 100);
		wbtContent.setEditable(false);
        String fullString = "";
		for (int i = 0; i < InputInterface.model.getRowCount(); i++){
			taskName = (String) InputInterface.model.getValueAt(i, 0);
			fullString = "\n" + taskName + fullString;
		    System.out.print(i + " row being printed, "); //debug code
		}
		wbtContent.setText(reverse(fullString));
	    JScrollPane scrollPane = new JScrollPane(wbtContent);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(0, 0, 250, 435);
		getContentPane().add(scrollPane);
	}
	
	
	//method to reverse the string of the wbt to turn it into correct order
	public String reverse(String s) {
	    if (s.length() <= 1) { 
	        return s;
	    }
	    return reverse(s.substring(1, s.length())) + s.charAt(0);
	}
}
