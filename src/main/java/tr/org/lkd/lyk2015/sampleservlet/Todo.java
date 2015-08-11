package tr.org.lkd.lyk2015.sampleservlet;

import java.util.Calendar;

public class Todo {

	private Long id;
	private String name;
	private String desc;
	private Calendar dueDate;
	private boolean done;
	
	public Todo() {
	}

	public Todo(String name, String desc, Calendar dueDate) {
		this.name = name;
		this.desc = desc;
		this.dueDate = dueDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Calendar getDueDate() {
		return dueDate;
	}

	public void setDueDate(Calendar dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", desc=" + desc + ", dueDate=" + dueDate + ", done=" + done + "]";
	}


}
