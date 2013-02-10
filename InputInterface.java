package start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.JButton;

public class InputInterface extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private DynamicModelObject model = new DynamicModelObject();
	
		private JTable table;
		
		
		public InputInterface() {
			super();
			setTitle("No Kit! No!");
			
			setResizable(false);
			setSize(new Dimension(800, 600));
			setPreferredSize(new Dimension(800, 600));
			getContentPane().setBackground(SystemColor.desktop);
			getContentPane().setLayout(null);
			
			table = new JTable(model);
			
			
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(192, 0, 602, 526);
			getContentPane().add(scrollPane);
			
			JButton btnAddButton = new JButton(new AddAction());
			btnAddButton.setBounds(695, 537, 89, 23);
			getContentPane().add(btnAddButton);
			
			JButton btnRemoveButton = new JButton(new RemoveAction());
			btnRemoveButton.setBounds(596, 537, 89, 23);
			getContentPane().add(btnRemoveButton);
			
			JButton btnNewButton = new JButton("Work Breakdown Tree");
			btnNewButton.setBounds(10, 11, 172, 23);
			getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Gantt Chart");
			btnNewButton_1.setBounds(10, 45, 172, 23);
			getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Pert Chart");
			btnNewButton_2.setBounds(10, 79, 172, 23);
			getContentPane().add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("About\r\n");
			btnNewButton_3.setBounds(10, 537, 172, 23);
			getContentPane().add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("Help");
			btnNewButton_4.setToolTipText("About");
			btnNewButton_4.setBounds(10, 503, 172, 23);
			getContentPane().add(btnNewButton_4);
		
			

			
		}
		
		public static void main(String[] args) {
	        new InputInterface().setVisible(true);
	    }
		
	    private class AddAction extends AbstractAction {
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			private AddAction() {
	            super("Add new task");
	        }

	        public void actionPerformed(ActionEvent e) {
	            model.addTask(new Task("","", "null", "null", "null", "null"));
	        }
	    }

	    private class RemoveAction extends AbstractAction {
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			private RemoveAction() {
	            super("Remove");
	        }

	        public void actionPerformed(ActionEvent e) {
	            int[] selection = table.getSelectedRows();

	            for(int i = selection.length - 1; i >= 0; i--){
	                model.removeTask(selection[i]);
	            }
	        }
	    }
}

