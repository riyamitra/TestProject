package first;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import demo.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentlist = new ArrayList<Student>();
		Gson gson = new Gson();

		Student student = new Student();
		student.setName("Riya");
		student.setAge(22);
		student.setId(123);
		Student student1 = new Student("Feriz", 2, 27);


System.out.println(gson.toJson(student));
System.out.println(gson.toJson(student1));
System.out.println(gson.toJson(studentlist));

	}

}
