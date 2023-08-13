package collection;

import java.util.ArrayList;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList al=new ArrayList();// non generic ArrayList
	al.add("Meenu");
	al.add(5);
	al.add(2.56);
	al.add('M');
	System.out.println(al);
	
	ArrayList<String>  bl  =new ArrayList<String>(); // Generic ArrayList
	bl.add("Meera");
	bl.add("Nimmy");
	bl.add("Meenu");
	bl.add("Lekshmi");
	System.out.println(bl);
	

	}

}
