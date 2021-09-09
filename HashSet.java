import java.util.*;
import java.io.*;

class AddingElementsToHashSet {

	public static void main(String[] args)
	{    
		HashSet<String> hs = new HashSet<String>();

		
		hs.add("Kanak");
		hs.add("Developement");
		
        HashSet<Integer> sc = new HashSet<Integer>();

        sc.add(123);
        sc.add(21000);
		
		
        System.out.println("Name Department : " + hs);
        System.out.println("ID Salary : " + sc);
	}
}
