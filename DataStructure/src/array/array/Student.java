package array.array;

public class Student {
	 
	int rollNo;
	String name;
	String division;
	String std;
	
	public Student(int rollNo,String name,String division,String std){
		this.rollNo=rollNo;
		this.name=name;
		this.division=division;
		this.std=std;
	};

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", division=" + division + ", std=" + std + "]";
	}
	
	
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	};
	
	
 
	
	

}
