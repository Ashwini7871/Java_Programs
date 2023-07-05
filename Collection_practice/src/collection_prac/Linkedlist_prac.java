package collection_prac;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist_prac l = new Linkedlist_prac();
		l.iterate_specific_element();//
	}

	private void iterate_specific_element() {
		// TODO Auto-generated method stub
		/*
		 * 3. Write a Java program to iterate through all elements in 
		 * a linked list starting at the specified position. 
		 */
	LinkedList ll = new LinkedList();
	ll.add("siva");
	ll.add("prabha");
	ll.add("praveen");
	ll.add("ashu");
	
	Iterator i = ll.listIterator(1);
	
	while(i.hasNext() ) {
		System.out.println(i.next());
	}
	
	
	
	
	}

}
