package demo;

public class Student {
	private String name;
	private Integer id;
	private Integer age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Integer id, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
