package start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.Color;

public class InputInterface extends JFrame {

	private static final long serialVersionUID = 1L;
	
	static DynamicModelObject model = new DynamicModelObject();
	private AboutWindow about = new AboutWindow();
	private WorkBreakdownTree wbt = new WorkBreakdownTree();
	
		private JTable table;
		
		
		public InputInterface() {
			super();
			setIconImage(Toolkit.getDefaultToolkit().getImage(InputInterface.class.getResource("/start/SurgeBOX.png")));
			setTitle("Surge.BOX");
			
			setResizable(false);
			setSize(new Dimension(800, 600));
			setPreferredSize(new Dimension(800, 600));
			getContentPane().setBackground(new Color(72, 61, 139));
			getContentPane().setLayout(null);
			
			table = new JTable(model);
			
			
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(192, 0, 602, 526);
			getContentPane().add(scrollPane);
			
			JButton btnAddButton = new JButton(new AddAction());
			btnAddButton.setToolTipText("Add a new task to the table");
			btnAddButton.setBounds(430, 537, 172, 23);
			getContentPane().add(btnAddButton);
			
			JButton btnRemoveButton = new JButton(new RemoveAction());
			btnRemoveButton.setToolTipText("Remove selected task from table");
			btnRemoveButton.setBounds(612, 537, 172, 23);
			getContentPane().add(btnRemoveButton);
			
			JButton btnWBTButton = new JButton("Work Breakdown Tree");
			btnWBTButton.setToolTipText("Generate a Work Breakdown Tree from the table");
			btnWBTButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					wbt.setVisible(true);
				}
			});
			btnWBTButton.setBounds(10, 11, 172, 23);
			getContentPane().add(btnWBTButton);

			
			JButton btnGanttButton = new JButton("Gantt Chart");
			btnGanttButton.setToolTipText("Generate a Gantt Chart from the table");
			btnGanttButton.setBounds(10, 45, 172, 23);
			getContentPane().add(btnGanttButton);
			
			JButton btnPertButton = new JButton("Pert Chart");
			btnPertButton.setToolTipText("Generate a Pert Chart from the table");
			btnPertButton.setBounds(10, 79, 172, 23);
			getContentPane().add(btnPertButton);
			
			JButton btnAboutButton = new JButton("About");
			btnAboutButton.setToolTipText("About Surge.BOX");
			btnAboutButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					about.setVisible(true);
				}
			});
			btnAboutButton.setBounds(10, 537, 172, 23);
			getContentPane().add(btnAboutButton);
			
			JButton btnHelpButton = new JButton("Help");
			btnHelpButton.setToolTipText("Help");
			btnHelpButton.setBounds(10, 503, 172, 23);
			getContentPane().add(btnHelpButton);
		
			

			
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
	            super("Add New Task");
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
	            super("Remove Task");
	        }

	        public void actionPerformed(ActionEvent e) {
	            int[] selection = table.getSelectedRows();

	            for(int i = selection.length - 1; i >= 0; i--){
	                model.removeTask(selection[i]);
	            }
	        }
	    }
}

