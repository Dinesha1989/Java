package JavaActivity3;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		System.out.println("Size of the Hashset is: "+ hs.size());
		
		System.out.println("Removing 40 from set: "+ hs.remove(40));
		
		if (hs.remove(60)) {		
			System.out.println("Removed 60 from set");	
		}
		else {
			System.out.println("60 is not present in the set");
		}
		
		System.out.println("50 contains in the set :"+ hs.contains(50));
		System.out.println("Updated has set is: "+ hs);
	}

}
