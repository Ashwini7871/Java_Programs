package collection_prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collection_prac  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection_prac cc = new Collection_prac();
//		cc.arraylist_add();
//		cc.insert_array();//insert element
//		cc.remove_element();
//		cc.suffle_elements();
//		cc.increase_size_arraylist();
//		cc.reverse_element();
//		cc.compare_two_array();
//		cc.swap_two_elements();	
//		cc.join_two_arraylist();
//		cc.array_removeAll();
//		cc.retrive_element();//get()
//		cc.update_element();//set()
//		cc.search_element();//contains()
//		cc.copy_array_to_array();
//		cc.extract_to_arraylist();
//		cc.clone_arraylist_to_arraylist();//clone()
//		cc.is_empty_or_not();
//		cc.trim_arraylist();//pending
//		cc.print_element_using_loop();
//		cc.find_max_value_array();//max pending wrong
//		cc.find_min_value();
//      cc.convert_array_to_hashset();
//		cc.remove_duplicates();we use set
//		cc.convert_arraylist_to_array();
//		cc.remove_elements();
		cc.get_position();
		
		
	}

	

	private void get_position() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("ashu");
		System.out.println(a.indexOf("praveen"));
		
	}



	private void remove_elements() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("ashu");
	
		a.remove("praveen");
		System.out.println(a);
	}



	private void convert_arraylist_to_array() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("ashu");

		
//		System.out.println(a.toArray());
		Object [] arr = a.toArray();
		for (Object ob : arr) {
			System.out.println(ob);
		}
	}



	private void remove_duplicates() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(1);
		a.add(2);

		Set b = new LinkedHashSet(a);
//		System.out.println(b);//we use another method
		a.clear();
		a.addAll(b);
		System.out.println(a);
	}



	private void convert_array_to_hashset() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("ashu");
				
		HashSet h = new HashSet(a);
		System.out.println(h);
	}



	private void find_min_value() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add(80);
		a.add(90);
		a.add(100);
		a.add(99);
		a.add(85);
           System.out.println(Collections.min(a));
	}

	private void find_max_value_array() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add("80");
		a.add("90");
		a.add("100");
		a.add("99");
		a.add("85");
		System.out.println(Collections.max(a));
		
		/*Object max =Collections.max(a);
		System.out.println(max);*/
		
	}

	private void print_element_using_loop() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("mugilan");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

	private void trim_arraylist() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("mugilan");
		
		a.add(" ");
		a.trimToSize();
		System.out.println(a);
	}

	private void is_empty_or_not() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("mugilan");
//		a.removeAll(a);
		System.out.println(a.isEmpty());
	}

	private void clone_arraylist_to_arraylist() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("mugilan");
		
		ArrayList b = (ArrayList)a.clone();
		System.out.println(b);
	}

	private void extract_to_arraylist() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("sivaraj");
		a.add("mugilan");
		
//		ArrayList b= new ArrayList();
		List c = a.subList(0, 3);
		System.out.println(c);
	}

	private void copy_array_to_array() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
//		a.add("sabari");
//		a.add("sivaraj");
//		a.add("mugilan");
//		
		ArrayList b = new ArrayList();
		b.add("prabha");
		b.add("siva");
		b.add("praveena");

		Collections.copy(b, a);
//		System.out.println(a);
		System.out.println(b);
	}

	private void search_element() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("prabha");
		a.add("ashu");
		a.add("siva");
		
//		System.out.println(a.contains("praveen"));//or
		if(a.contains("praveena")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

	private void update_element() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("prabha");
		a.add("ashu");
		a.add("siva");
		
		a.set(0, "mugil");
		System.out.println(a);
	}

	private void retrive_element() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("siva");
		a.add("mugilan");

		System.out.println(a.get(3));
		
	}

	private void array_removeAll() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("siva");
		a.add("mugilan");
		
		ArrayList b = new ArrayList();
		b.add("prabha");
		b.add("siva");
		b.add("praveena");

		ArrayList c = new ArrayList();

		c.addAll(a);
		c.addAll(b);
		System.out.println(c);

		//remove element
		c.removeAll(a);
		System.out.println(c);
		
	}

	private void join_two_arraylist() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("siva");
		a.add("mugilan");
		
		ArrayList b = new ArrayList();
		b.add("prabha");
		b.add("siva");
		b.add("praveen");

		ArrayList c = new ArrayList();

		c.addAll(a);
		c.addAll(b);
		System.out.println(c);
	}

	private void swap_two_elements() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("siva");
		a.add("mugilan");
     System.out.println(a);
    Collections.swap(a,1, 3);//alt we use for each ..for print one by one
   System.out.println(a);
	}

	private void compare_two_array() {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("praveen");
		a.add("ashu");
		a.add("sabari");
		a.add("siva");
		a.add("mugilan");
		
		ArrayList b = new ArrayList();
		b.add("prabha");
		b.add("siva");
		b.add("praveen");
		
//		System.out.println(a.contains(b));//without third variable
		//its shows false bcz a has 5 length AND b has 3 so 5<3 ..false
		ArrayList c = new ArrayList();
		for(Object s:a) {
			c.add(b.contains(s));
		}
		System.out.println(c);
	}

	private void reverse_element() {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("prabha");
		l.add("mugil");
		l.add("ashu");
		l.add("sabari");
		System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
	}

	private void increase_size_arraylist() {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("prabha");
		l.add("mugil");
		l.add("ashu");
		l.add("sabari");
		System.out.println(l);
		System.out.println(l.size());
		
		
	}

	private void suffle_elements() {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("prabha");
		l.add("mugil");
		l.add("ashu");
		l.add("sabari");
		System.out.println(l);
		Collections.shuffle(l);
//		Collections.shuffle(l,);
		System.out.println(l);
      

	}

	private void remove_element() {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("prabha");
		l.add("mugil");
		l.add("ashu");
		l.add("sabari");
		l.remove(2);//it remove 2nd element
//		l.remove(l);//it remove 
		System.out.println(l);
         Collections.sort(l);//its output in alphabetic order
         System.out.println(l);
         
	}

	private void insert_array() {
		// TODO Auto-generated method stub
		
		List l = new ArrayList();
		l.add("sabari");
		l.add("praveen");
//		System.out.println(l);
		l.add(1, "ashu");
		System.out.println(l);
	}

	private void arraylist_add() {
		// TODO Auto-generated method stub
		
		List l = new ArrayList();
		l.add("prabha");
		l.add("mugil");
		l.add("ashu");
		l.add("sabari");
		System.out.println(l);
		
	}

}
