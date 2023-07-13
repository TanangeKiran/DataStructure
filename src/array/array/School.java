package array.array;

public class School {		
	
	public static int totalStudents(Student[] array){		
		int count=array.length;
		return count;
	}
	
	
	public static void main(String args[]){
		
		//instantiating the student class to create the multiple objects of the class
		Student student=new Student(1, "Vishal", "A", "First");
		Student student2=new Student(2,"Kiran","B","Second");
		Student student3=new Student(3,"Irfan","C","Third");
		Student student4=new Student(4,"Sharad","D","Fourth");
		
		//Object type array created
		Student[] array;
		//declaring the length of array 
		array=new Student[4];
		
		//declaring the elements of an array
		array[0]=student;
		array[1]=student2;
		array[2]=student3;
		array[3]=student4;
		
		// adding the objects in the array by using for loop
		for(int i=0;i<array.length;i++){
			//printing the elements of an array(objects of the student class)
			System.out.println( array[i]);
			
		}
		
		//getting the total students from the totalStudents method 
		int totalStudent=totalStudents(array);
		
		System.out.println("Total Students are "+ totalStudent);
		
	}

}
