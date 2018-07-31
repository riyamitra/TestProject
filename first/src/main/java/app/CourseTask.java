package app;

import java.util.Date;

public class CourseTask  extends Task{
	private String course_name;
	private String course_description;
	private Integer course_id;
	
	
	public CourseTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CourseTask(String course_name, String course_description, Integer course_id) {
		super();
		this.course_name = course_name;
		this.course_description = course_description;
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	

}
