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
		
		 String[] a=emp.get(0);
		 String ans=a[0];
		
		System.out.println(ans);
		
		String[][] multiArray=new String[3][3];
		
		for(int i=0;i<multiArray.length;i++){
			for(int j=0;j<multiArray[i].length;j++){
				multiArray[i][j]=emp.get(i)[j];				
			}
		}
		for(int i=0;i<multiArray.length;i++){
			for(int j=0;j<multiArray[i].length;j++){			
		
		System.out.println(multiArray[i][j]);}}
		//
//		
//		
	}

}
