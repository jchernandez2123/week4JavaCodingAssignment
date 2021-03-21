package week4JavaCodingAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class week4JavaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//part 1: 
ArrayList<String> employeeNames = new ArrayList<String>();// this creates the ArrayList

//part 2:
HashSet<Integer> ids= new HashSet<Integer>(); // This creates an instance of a HashSet

//Part 3:	
HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();// this creates an  instance of a HashMap of Integer and String

System.out.println("This is part 4: ");
System.out.println("These are the added employeeNames to the HashMap: ");
 //part 4 a: This adds  5 employeeNames
employeeNames.add("Brett Favre");                        
employeeNames.add("Barry Sanders");                       
employeeNames.add("Deion Sanders");
employeeNames.add("Charles Woodson");
employeeNames.add("Aaron Rodgers");

System.out.println(employeeNames);
//4 b: This adds 5 ids to HashSet
System.out.println("These are the added ids to the HashSet:  ");
ids.add(12);
ids.add(24);
ids.add(4);
ids.add(21);
ids.add(20);
		
System.out.println(ids);

//part 5:

System.out.println("This is Part 5: ");
int i = 0;// created a variable to increment it so that each iteration grabs the next element in the ArrayList
for (Integer id : ids)// this itereates over the ids using an enhance for loop 
{
     employeeMap.put(id,employeeNames.get(i));// used the employeeMap.put to add a new entry to the map
     i++;
}
printEmployeeIds(employeeMap);//this method prints the ids
printEmployeeNames(employeeMap);// this method prints the employee names


//Part 6:	
System.out.println("this is part 6 it gives the id and employee Names: ");
for(Integer key: employeeMap.keySet()) {// this will iterate over the employeeMap.keySet
	System.out.println("The Employee ID is : " + key + " For the Employee: " + employeeMap.get(key));// This will print out the employee names with their corresponding ids
	
}

//part 7:	
StringBuilder idsBuilder = new StringBuilder();// This Creates a StringBuilder called idsBuilder.



//part 8:	
System.out.println("This is part 8 and 9 this gives the ids a'-' to the numbers:");
for(Integer id: ids)//This Iterate over the ids HashSet
{
	idsBuilder.append(id).append("-");// this appends each id, followed by a dash “-“ to idsBuilder.
}

//part 9:	
System.out.println(idsBuilder.toString());//This will print the result of idsBuilder.toString() to the console.


//part 10: 	
StringBuilder namesBuilder= new StringBuilder();//This creates a StringBuilder called namesBuilder.


//part 11:

System.out.println("This is part 11 & 12 it appends each employeeName and gives it a space in eachone : ");
for(String employeeName : employeeNames) {//This Iterates over the employeeNames ArrayList 
	namesBuilder.append(employeeName);//This appends each name, followed by a space “ “ to the namesBuilder. 
	if (i != 6) {
		namesBuilder.append(" ");// this makes it so there is a space in between the names 
	}
}


//part 12:	Print the result of namesBuilder.toString() to the console.
System.out.print(namesBuilder.toString());


	}
	//Methods
		
	
	
	public static void printEmployeeIds(HashMap<Integer, String> employeeMap)// this is a method that iterates through employeMap.keySet part 5 of the assignment and prints the
	{
		for(Integer employeeId: employeeMap.keySet())
			System.out.println("These are the Employee Id: " + employeeId);
	}
    public static void printEmployeeNames(HashMap<Integer, String> employeeMap) {// this method prints the name of the employees this is used in part 5 as well 
    	for(String employeeNames : employeeMap.values()) {	
    	System.out.println("These are the Employee Names: " + employeeNames);
    }
  }
   
    }

