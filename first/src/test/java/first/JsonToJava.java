package first;

import com.google.gson.Gson;

import demo.Student;

public class JsonToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="{\"name\":\"Riya\",\"id\":123,\"age\":22}";
		Gson gson = new Gson();
		Student student = gson.fromJson(input, Student.class);
		
		System.out.println(student.getName());
	
	}

}
