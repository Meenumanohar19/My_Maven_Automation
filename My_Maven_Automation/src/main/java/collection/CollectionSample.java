package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList al=new ArrayList();// non generic ArrayList
	ArrayList bl=new ArrayList(); 
	
	al.add("Meenu");
	al.add(5);
	al.add(2.56);
	al.add('M');
	System.out.println(al);
	
	bl.add("Good Morning");
	bl.add(10);
	bl.add(31.56);
	bl.add('*');
	bl.add("Meenu");
	
	/*ArrayList<String>  bl  =new ArrayList<String>(); // Generic ArrayList
	bl.add("Meera");
	bl.add("Nimmy");
	bl.add("Meenu");
	bl.add("Lekshmi");
	System.out.println(bl);*/
	
	bl.remove(1); // remove()- to remove an element from a particular index
	System.out.println(bl);
	
	bl.addAll(al); //addAll()
	System.out.println("After addAll() : "+bl);
	
	bl.removeAll(bl); //removeAl()
	System.out.println(bl);
	
	//al.get(2); //get()
	System.out.println(al.get(2));
	
	//size()
	System.out.println(al.size());
	
	//contains()
	boolean b=al.contains("Meenu");
	System.out.println(b);
	
	boolean c=al.contains("Hari");
	System.out.println(c);
	
	//Iterator Interface
	Iterator itr=al.iterator();  
	
	  while(itr.hasNext())
	 {
	  System.out.println(itr.next());
	  }
	  itr.remove();  //remove() - here, the element from last index is removed.
	  System.out.println(al);

	}

}
