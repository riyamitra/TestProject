package demo;

public class Shelter {
	private String name;
	private Integer capacity;
	private String Address;
	public Shelter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shelter(String name, Integer capacity, String address) {
		super();
		this.name = name;
		this.capacity = capacity;
		Address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

}
