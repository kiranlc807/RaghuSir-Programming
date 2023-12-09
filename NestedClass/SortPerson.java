package NestedClass;

import java.util.*;

public class SortPerson {

	public static void main(String[] args) {
		// Nested Inner Class (Local Inner Class)
		class SortPersonByName implements Comparator<Person>{
			
			@Override
			public int compare(Person p1 , Person p2) {
				return p1.name.compareTo(p2.name)==0?1:-1;
			}
		}
		
		/** For Allow the Duplicate to TreeSet we need to avoid the 0
		*         return p1.name.compareTo(p2.name)==0?1:-1;
		*/
		
		Comparator c = new SortPersonByName();
		
		TreeSet<Person> t = new TreeSet<Person>(c);
		t.add(new Person(23,"Lakshmi"));
		t.add(new Person(22,"Kirana"));
		t.add(new Person(24,"Kanumesh"));
		t.add(new Person(25,"Kanumesh"));
		
		for(Person i : t)
			System.out.println(i);
		
		

	}

}
