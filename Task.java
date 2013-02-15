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
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
	SimpleDateFormat dateFormatSlash = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	
	public Task(String taskName, String taskNo, 
			String startDate, String finishDate, 
			String actualStartDate, String actualFinishDate){
		super();		
		
		this.taskName = taskName;
		this.taskNo = taskNo;
		String startingDate = startDate;
		try {
			this.startDate = dateFormat.parse(startingDate);
		} catch (ParseException e) {
		}
		String finishingDate = finishDate;
		try {
			this.finishDate = dateFormat.parse(finishingDate);
		} catch (ParseException e) {
		}
		String actualStartingDate = actualStartDate;
		try {
			this.actualStartDate = dateFormat.parse(actualStartingDate);
		} catch (ParseException e) {
	    }
		String actualFinishingDate = actualFinishDate;
		try {
			this.actualFinishDate = dateFormat.parse(actualFinishingDate);
		} catch (ParseException e) {
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
		
		String startingDate = startDate;
		try {
			this.startDate = dateFormat.parse(startingDate);
		} catch (ParseException e) {
		}	
		try {
			this.startDate = dateFormatSlash.parse(startingDate);
		} catch (ParseException e) {
		}	
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		
		String finishingDate = finishDate;
		try {
			this.finishDate = dateFormat.parse(finishingDate);
		} catch (ParseException e) {
		}
		try {
			this.finishDate = dateFormatSlash.parse(finishingDate);
		} catch (ParseException e) {
		}	
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(String actualStartDate) {
		
		String actualStartingDate = actualStartDate;
		try {
			this.actualStartDate = dateFormat.parse(actualStartingDate);
		} catch (ParseException e) {
	    }
		try {
			this.actualStartDate = dateFormatSlash.parse(actualStartingDate);
		} catch (ParseException e) {
		}	
	}

	public Date getActualFinishDate() {
		return actualFinishDate;
	}

	public void setActualFinishDate(String actualFinishDate) {
		
		String actualFinishingDate = actualFinishDate;
		try {
			this.actualFinishDate = dateFormat.parse(actualFinishingDate);
		} catch (ParseException e) {
	    }
		try {
			this.actualFinishDate = dateFormatSlash.parse(actualFinishingDate);
		} catch (ParseException e) {
		}	
	}
}
