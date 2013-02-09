package start;

import java.util.Date;

public class Task {
	private String taskName;
	private String taskNo;
	private Date startDate;
	private Date finishDate;
	private Date actualStartDate;
	private Date actualFinishDate;
	
	public Task(String taskName, String taskNo, 
			Date startDate, Date finishDate, 
			Date actualStartDate, Date actualFinishDate){
		super();
		
		this.taskName = taskName;
		this.taskNo = taskNo;
		this.setStartDate(startDate);
		this.setFinishDate(finishDate);
		this.setActualStartDate(actualStartDate);
		this.setActualFinishDate(actualFinishDate);
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getTaskNo() {
		return taskNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public Date getActualFinishDate() {
		return actualFinishDate;
	}

	public void setActualFinishDate(Date actualFinishDate) {
		this.actualFinishDate = actualFinishDate;
	}
}
