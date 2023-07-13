package array.multidimentionalArray;

public class Employee {
	
	String name;
	String lastName;
	String address;
	
	public Employee(String name, String lastName,String address){
		this.address=address;
		this.lastName=lastName;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
