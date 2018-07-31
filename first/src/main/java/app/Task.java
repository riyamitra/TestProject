package app;

import java.util.Date;

public class Task {
	private Integer id;
	private String task_name;
	private Date create_at;
	private Date update_at;
	private Boolean is_completed;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(Integer id, String task_name, Date create_at, Date update_at, Boolean is_completed) {
		super();
		this.id = id;
		this.task_name = task_name;
		this.create_at = create_at;
		this.update_at = update_at;
		this.is_completed = is_completed;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	public Boolean getIs_completed() {
		return is_completed;
	}
	public void setIs_completed(Boolean is_completed) {
		this.is_completed = is_completed;
	}
	
	
}
