package start; 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task {
	private String taskName;
	private String taskNo;
	private Date startDate;
	private Date finishDate;
	private Date actualStartDate;
	private Date actualFinishDate;
	
	public Task(String taskName, String taskNo, 
			String startDate, String finishDate, 
			String actualStartDate, String actualFinishDate){
		super();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		
		this.taskName = taskName;
		this.taskNo = taskNo;
		String startingDate = startDate;
		try {
			this.startDate = dateFormat.parse(startingDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String finishingDate = finishDate;
		try {
			this.finishDate = dateFormat.parse(finishingDate);
		} catch (ParseException e) {
				e.printStackTrace();
		}
		String actualStartingDate = actualStartDate;
		try {
			this.actualStartDate = dateFormat.parse(actualStartingDate);
		} catch (ParseException e) {
			e.printStackTrace();
	    }
		String actualFinishingDate = actualFinishDate;
		try {
			this.actualFinishDate = dateFormat.parse(actualFinishingDate);
		} catch (ParseException e) {
			e.printStackTrace();
	    }
		
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
	
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		
		String startingDate = startDate;
		try {
			this.startDate = dateFormat.parse(startingDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		
		String finishingDate = finishDate;
		try {
			this.finishDate = dateFormat.parse(finishingDate);
		} catch (ParseException e) {
				e.printStackTrace();
		}
		
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(String actualStartDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		
		String actualStartingDate = actualStartDate;
		try {
			this.actualStartDate = dateFormat.parse(actualStartingDate);
		} catch (ParseException e) {
			e.printStackTrace();
	    }
	}

	public Date getActualFinishDate() {
		return actualFinishDate;
	}

	public void setActualFinishDate(String actualFinishDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		
		String actualFinishingDate = actualFinishDate;
		try {
			this.actualFinishDate = dateFormat.parse(actualFinishingDate);
		} catch (ParseException e) {
			e.printStackTrace();
	    }
	}
}
