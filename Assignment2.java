package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

	
class People implements Comparator<People>{
	String Name;
	int ages;
	
	
	
	public People() {
	
	}


	public People(String name, int ages) {
		Name = name;
		this.ages = ages;
	}

	@Override
	public int compare(People o1, People o2) {
		
		return o1.Name.compareTo(o2.Name);
	}
	
}
public class Assignment2 {
	public static void main(String[] args) {
		ArrayList<People> pList =new ArrayList<People>();
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter new person name or( type exit to stop ) ");
			String Name=sc.nextLine();
			if (Name.equalsIgnoreCase("exit")) {
				break;
			}
			
			System.out.println("Enter age for person");
			int ages=sc.nextInt();
			
			sc.nextLine();
			pList.add(new People(Name, ages));
		}
		
		Collections.sort(pList,new People());
		System.out.println("Sorted list of people is :");
		for (People people : pList) {
			System.out.println(people.Name);
		}
		
		
		
	}

	
	
	
}
