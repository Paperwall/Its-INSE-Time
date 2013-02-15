package start;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DynamicModelObject extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static List<Task> tasks = new ArrayList<Task>();
	
	private final String[] columnHeaders = {"Task",
			"Task No.",
            "Start Date",
            "Finish Date",
            "Actual Start Date",
            "Actual Finish Date"};
	
	public DynamicModelObject() {
		super();

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
			return ((Task) tasks.get(rowIndex)).getTaskName();
		case 1:
			return ((Task) tasks.get(rowIndex)).getTaskNo();
		case 2:
			return ((Task) tasks.get(rowIndex)).getStartDate();
		case 3:
			return ((Task) tasks.get(rowIndex)).getFinishDate();
		case 4:
			return ((Task) tasks.get(rowIndex)).getActualStartDate();
		case 5:
			return ((Task) tasks.get(rowIndex)).getActualFinishDate();
		default:
			return null;
		}
	}
	
	
	public Class getColumnClass(int columnIndex) {
		switch(columnIndex){
		case 0:
			return String.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		case 3:
			return String.class; 
		case 4:
			return String.class;
		case 5:
			return String.class;
		default:
			return Object.class;
		}
	}
	
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if(aValue != null){
			Task task = tasks.get(rowIndex);
			
			switch(columnIndex){
			    case 0:
			    	task.setTaskName((String)aValue);
			    	break;
			    case 1:
			    	task.setTaskNo((String)aValue);
			    	break;
			    case 2:
			    	task.setStartDate((String)aValue);
			    	break;
			    case 3:
			    	task.setFinishDate((String)aValue);
			    	break;
			    case 4:
			    	task.setActualStartDate((String)aValue);
			    	break;
			    case 5:
			    	task.setActualFinishDate((String)aValue);
			    	break;
			}
		}
	}
	
	public void addTask(Task task) {
		tasks.add(task);
		
		fireTableRowsInserted(tasks.size() -1, tasks.size() -1);
	}
	
	public void removeTask(int rowIndex) {
		tasks.remove(rowIndex);
		
		fireTableRowsDeleted(rowIndex, rowIndex);
	}

}
