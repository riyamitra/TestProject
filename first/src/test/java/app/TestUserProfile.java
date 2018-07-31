package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

public class TestUserProfile {
	public static void main(String[] args) {
		Set<Address> address = new HashSet<Address>();
		List<String> email1 = new ArrayList<String>();
		List<String> email2 = new ArrayList<String>();
		List<Task> task = new ArrayList<Task>();

		// this is the place where i create and add address
		Address home_address = new Address("Flat no 204", "devinagar", "bangalore", "Tatanagar", "Karnataka", "india", "560092");
		Address office_address = new Address("Istar SKill develpment pvt ltd", "makam plaza", "bangalore", "Malleswaram", "Karnataka", "india", "560055");
		address.add(home_address);
		address.add(office_address);
		
		
		//this is where i create email 
		
		email1.add("feroz@istarindia.com");
		email1.add("hhh@istarindia.com");
		
		email2.add("ululu@falaba.com");
		email2.add("ululu@falaba.com");
		
		//this is where i will create task
		
		CourseTask courseTask = new CourseTask("Automata", "This is course regarding finite state machine", 1);
		LearningTask learningTask = new LearningTask(1, "My first class","Here  i will learn about finite state machine");
		learningTask.setCreate_at(new Date());
		learningTask.setUpdate_at(new Date());
		learningTask.setTask_name("Learn");
		learningTask.setId(1);
		learningTask.setIs_completed(false);
		
		courseTask.setCreate_at(new Date());
		courseTask.setUpdate_at(new Date());
		courseTask.setTask_name("Course");
		courseTask.setId(2);
		courseTask.setIs_completed(false);
		
		task.add(learningTask);
		task.add(courseTask);
		
		UserProfile userProfile = new UserProfile(1, "Kamini devi","female", "12345678", address, email1);
		AppUser appUser = new AppUser(1, "kam196", "test123", userProfile, task);
		
		UserProfile userProfile2 = new UserProfile(2, "Sunita devi","female", "12354678", address, email2);
		AppUser appUser2 = new AppUser(2, "sun456", "pass123", userProfile2, task);
		
		
	
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(appUser));
		System.out.println(gson.toJson(appUser2));
		
		
		
	}
}
