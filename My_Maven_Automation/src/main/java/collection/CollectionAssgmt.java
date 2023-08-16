package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionAssgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList bl=new ArrayList(); 
		ArrayList al=new ArrayList();// non generic ArrayList
		
		bl.add("Good Morning");
		bl.add(10);
		bl.add(31.56);
		bl.add('*');
		bl.add("Meenu");
		System.out.println("bl :" +bl);
		
		//1.add() - inserts the specified element in this Collection
		al.add("Good Morning");
		al.add(5);
		al.add(99.56);
		al.add('*');
		al.add("HappyBirthday");
		System.out.println("al :"+al);
		
		//2.remove() - will remove the specified element from the collection  
		al.remove("Good Morning");
		System.out.println("After removing  : "+al);  
		
		//3.addAll() - will add all the elements in one list to the other
		bl.addAll(al);
		System.out.println("After addAll() : "+bl);
		
		
		//4.get()- is used to get the element present in this list at a given specific index
		System.out.println("The data in 2nd index is "+al.get(2));
		
		//5.size()-  returns the total count of the elements present in this collection.
		System.out.println("Size is: "+al.size()); 
		
		//6.contains - returns Boolean value 'true' if this collection contains all the specified element else it returns false.
		boolean b=al.contains("Happy");
		System.out.println(b); 
		
		//removeAll()
		bl.removeAll(bl); //removeAl()
		System.out.println(bl);
		
		Iterator itr=al.iterator();  
		
		  while(itr.hasNext())
		 {
		  System.out.println(itr.next());
		  }
		  itr.remove();  
		  System.out.println("Iterator Interface: ");
		  System.out.println(al);
		

	}

}
