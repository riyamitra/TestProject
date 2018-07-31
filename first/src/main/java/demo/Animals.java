package demo;

public class Animals {
	private String name;
	private String type;
	private Integer age;
	private Integer lifeSpan;
	private Boolean pet;
	private Shelter shelter;
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animals(String name, String type, Integer age, Integer lifeSpan, Boolean pet, Shelter shelter) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.lifeSpan = lifeSpan;
		this.pet = pet;
		this.shelter = shelter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(Integer lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public Boolean getPet() {
		return pet;
	}
	public void setPet(Boolean pet) {
		this.pet = pet;
	}
	public Shelter getShelter() {
		return shelter;
	}
	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}
	
	
}