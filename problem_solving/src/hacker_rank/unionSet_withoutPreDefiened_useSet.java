package hacker_rank;

import java.util.HashSet;

public class unionSet_withoutPreDefiened_useSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {1,2,3,4};
		int b[]= {1,2,3,5};
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : a) {
               set.add(i);
		}

		for(int j:b) {
			set.add(j);
		}
		System.out.println(set);
	}

}
