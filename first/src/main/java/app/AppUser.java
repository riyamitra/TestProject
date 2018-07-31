package app;

import java.util.List;

public class AppUser {
	private Integer user_id;
	private String username;
	private String password;
	private UserProfile userProfile;
	private List<Task>task;
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUser(Integer user_id, String username, String password) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
	}

	public AppUser(Integer user_id, String username, String password, UserProfile userProfile) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.userProfile = userProfile;
	}
	
	

	

	public AppUser(Integer user_id, String username, String password, UserProfile userProfile, List<Task> task) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.userProfile = userProfile;
		this.task = task;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	

}
