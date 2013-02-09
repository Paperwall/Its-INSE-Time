package start;



import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class DynamicModelObject extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final List tasks = new ArrayList();
	
	private final String[] columnHeaders = {"Task",
			"Task No.",
            "Start Date",
            "Finish Date",
            "Actual Start Date",
            "Actual Finish Date"};
	
	public DynamicModelObject() {
		super();
		
		tasks.add(new Task("","", null, null, null, null));
		tasks.add(new Task("","", null, null, null, null));
		tasks.add(new Task("","", null, null, null, null));
	}

	public int getColumnCount() {
		return columnHeaders.length;
	}

	public int getRowCount() {
		return tasks.size();
	}
	
	public String getColumnName(int columnIndex) {
		return columnHeaders[columnIndex];
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:
			return tasks.get(rowIndex).getTaskName();
		case 1:
			return tasks.get(rowIndex).getTaskNo();
		case 2:
			return tasks.get(rowIndex).getStartDate();
		case 3:
			return tasks.get(rowIndex).getFinishDate();
		case 4:
			return tasks.get(rowIndex).getActualStartDate();
		case 5:
			return tasks.get(rowIndex).getActualFinishDate();
		default:
			return null;
		}
	}
	
	public void addTask(Task task) {
		tasks.add(task);
		
		fireTableRowsInserted(tasks.size() -1, tasks.size() -1);
	}
	
	public void removeFriend(int rowIndex) {
		tasks.remove(rowIndex);
		
		fireTableRowsDeleted(rowIndex, rowIndex);
	}

}
