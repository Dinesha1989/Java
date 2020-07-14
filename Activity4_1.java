package JavaActivity4;

import java.util.*;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random ();
		
		
		System.out.println("Enetr numbers");
		
		while (scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		
		//System.out.println(nums[3]);
		
		int index = indexGen.nextInt(nums.length);
		
		System.out.println("index value is: "+ index);
		System.out.println("Generate number is: "+ nums[index]);
      scan.close();
      
	}

}
