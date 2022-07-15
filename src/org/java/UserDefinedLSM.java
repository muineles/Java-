package org.java;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserDefinedLSM { // child
public static void main(String[] args) {
		//Emp.detail 1
	UDListSetMap ud1 = new UDListSetMap(01,"Janani", 35000, 7358801320l);
		//Emp.detail 2
	UDListSetMap ud2 = new UDListSetMap(13,"Rekha", 35000, 9443654597l);
		//Emp.detail 3
	UDListSetMap ud3 = new UDListSetMap(11,"Kumar", 30000, 9942452283l);
		//create Set
	Set<UDListSetMap> li = new LinkedHashSet<UDListSetMap>();
	//add values in Set
	li.add(ud1);
	li.add(ud2);
	li.add(ud3);
	
		//to fetch or get particular emp.detail from list
			//UDListSetMap emp1 = li.get(1);
			
		//to print all val from particular emp from list
		//System.out.println(emp1.getId());
		//System.out.println(emp1.getName());
		//System.out.println(emp1.getSalary());
		//System.out.println(emp1.getPhone());
		
		System.out.println("************************");

		//to print all the emp detail from Set
		//Set doesn't allows dupicate
		//enhanced for loop
		for (UDListSetMap UD : li) {
					
			System.out.println(UD.getId());
			System.out.println(UD.getName());
			System.out.println(UD.getSalary());
			System.out.println(UD.getPhone());
		}
			
			}		}
