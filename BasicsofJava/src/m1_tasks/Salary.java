package m1_tasks;
import java.util.*;


public class Salary {
	HashMap<String,Integer> empList=new HashMap<>();
	public int totalSalary()
	{	
		int total=0;
		for(int i:empList.values()) 
			total=total+i;
		return total;
			
		
		
	}
	public String getSalary(String designation) 
	{
		if(empList.containsKey(designation))
			return "Source is"+empList.get(designation);
	else 
		return "No designation match";
		
		
	}
	
	public void updateSalary(String designation, int newSalary) {
	
		empList.put(designation, newSalary);
		
	}
	

	

	
	

}
