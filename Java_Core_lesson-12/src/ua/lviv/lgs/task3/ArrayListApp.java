package ua.lviv.lgs.task3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
	
	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		list1.add(12);
		list1.add("Yes");
		list1.add(0.22);
		list1.add(221123121);
		list1.add('e');
		list1.add("Good");
		list1.add(1);
		list1.add("wow");
		list1.add(2);
		list1.add("1/3");
		
		System.out.println(list1);
		
		list1.remove(2);
		System.out.println(list1);
		
		list1.remove(0);
		System.out.println(list1);
		
		list1.remove(6);
		System.out.println(list1);
		
		list1.remove(1);
		System.out.println(list1);
		
		
	}

}
