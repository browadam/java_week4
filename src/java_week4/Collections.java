package java_week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// 1. Create an instance of an ArrayList of String called employeeNames
		
		ArrayList<String>  employeeNames = new ArrayList<String> ();
			employeeNames.add("Kevin");
			employeeNames.add("Mike");
			employeeNames.add("Jonathan");
			employeeNames.add("Melissa");
			employeeNames.add("Annette");
			
		// 2. Create and instance of HashSet of Integer called ids	
			
		HashSet<Integer> ids = new HashSet<Integer>();
			ids.add(101);
			ids.add(102);
			ids.add(103);
			ids.add(104);
			ids.add(105);
			
		// 3. Create an instance of HashMap of Integer, String named employeeMap
			
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String> ();
		
		// 5. Create a variable  int i = 0; then iterate over ids using an enhanced for loop.  Inside the enhanced for loop use
		// empolyeeMap.put() to add a new entry to the map.  The entry should consist of a key that is the id in the enhanced loop's current iteration,
		// and a value that is the empolyeeNaem at position i of the employeeNames ArrayList.  Increment i so that each iteration grabs the next element
		// in the ArrayList.
		
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		printEmployeeMap(employeeMap);
		showEmployeeMap(employeeMap);
		
		System.out.println(printIdString(ids));
		
		StringBuilder nameBuilder = new StringBuilder();
		for(String name : employeeNames) {
			nameBuilder.append(name).append(" ");
		}
		System.out.println(nameBuilder.toString());

	}
	
	public static void printEmployeeMap(HashMap<Integer, String> employeeMap) {
		Set<Integer> employeeKeys = employeeMap.keySet();
		for (Integer key : employeeKeys) {
			System.out.println(key + " : " + employeeMap.get(key));
		}
	}
	
	public static void showEmployeeMap(HashMap<Integer, String> employeeMap) {
		for(Map.Entry<Integer, String> employee : employeeMap.entrySet()) {
			System.out.println(employee.getKey() + " : " + employee.getValue());
		}
	}
	
	public static String printIdString(HashSet<Integer> ids) {
		StringBuilder idsBuilder = new StringBuilder();
		for(Integer id : ids) {
			idsBuilder.append(id).append("-");
		} 
		return idsBuilder.toString();
	}

}
