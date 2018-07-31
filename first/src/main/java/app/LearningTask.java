package app;

public class LearningTask extends Task{
	private Integer learning_id;
	private String title;
	private String body;
	public LearningTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LearningTask(Integer learning_id, String title, String body) {
		super();
		this.learning_id = learning_id;
		this.title = title;
		this.body = body;
	}
	public Integer getLearning_id() {
		return learning_id;
	}
	public void setLearning_id(Integer learning_id) {
		this.learning_id = learning_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
}
