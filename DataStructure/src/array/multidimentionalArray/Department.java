package array.multidimentionalArray;


import java.util.ArrayList;
import java.util.List;

public class Department {	
	
	
	public static void main(String args[]){
		List<String[]> emp=new ArrayList();
		String[] employee1=new String[]{"vishal","hase","rajapur"};
		String[] employee2=new String[]{"kiran","tanange","miraj"};
		String[] employee3=new String[]{"irfan","momin","Pune"};
		
		emp.add(employee1);
		emp.add(employee2);
		emp.add(employee3);
		
		String[][] multiArray=new String[][]{			
		};
		
		for(int i=0;i<multiArray.length;i++){
			for(int j=0;j<multiArray[i].length;j++){
				multiArray[i][j]=;
			}
		}
		
		
		System.out.println(multiArray[0][0]);
	}

}
