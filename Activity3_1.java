
package JavaActivity3;


import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing array
		ArrayList<String> MyList = new ArrayList<String>();
		
		MyList.add("Dinesh");
		MyList.add("Ramesh");
		MyList.add("Krishna");
		MyList.add("Anil");
		MyList.add("Raghu");
        System.out.println("Print All the Objects:");
    	
        for(String s:MyList){
            System.out.println(s);
	
        }

        System.out.println("3rd element is : " + MyList.get(2));
        System.out.println ("Ramesh exist: " + MyList.contains("Ramesh"));
        System.out.println ("Size of the array lis is: "+ MyList.size());
        MyList.remove(3);
        System.out.println("Size of the array list is : "+ MyList.size());
        
	}

}
