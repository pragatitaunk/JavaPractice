package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
	
	public static void main(String args[]){
		List<TestComparable> list = new ArrayList<TestComparable>();
		list.add(new TestComparable(306,"Prags"));
		list.add(new TestComparable(7,"Aeeps"));
		list.add(new TestComparable(2,"Zeeps"));
		list.add(new TestComparable(27,"Ceeps"));
		list.add(new TestComparable(20,"Beeps"));
		Collections.sort((List<TestComparable>) list);
		for(TestComparable t:list){
			System.out.println(t.getAge() +t.getName());
		}
		TestComparable tc1 = new TestComparable(306,"Prags");
		TestComparable tc2 = new TestComparable(6,"Prags");
		System.out.println(tc1.compareTo(tc2));
		
		Collections.sort(list, new CompNameTest() );
		for(TestComparable t:list){
			System.out.println(t.getAge() +t.getName());
		}
		System.out.println("  ");
		Collections.sort(list, new CompAgeTest() );
		for(TestComparable t:list){
			System.out.println(t.getAge() +t.getName());
		}
	}
}
