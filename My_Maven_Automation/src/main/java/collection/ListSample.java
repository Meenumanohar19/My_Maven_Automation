package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list1=new ArrayList<Integer>();
		 List<Integer> list2=new ArrayList<Integer>(); 
		 
		 list1.add(5);
		 list1.add(10);
		 list1.add(15);
		 list1.add(20);
		 list1.add(25);
		 System.out.println("List 1 :" +list1);
		 
		 list2.add(2);
		 list2.add(4);
		 list2.add(6);
		 list2.add(8);
		 list2.add(10);
		 System.out.println("List 2 :" +list2);
		 
		 list2.addAll(list1);
		 System.out.println("After addAll() :"+list2);
		 
		 System.out.println("Size :"+list1.size());
		 
		 System.out.println("Vaue in a 3rd index of list2 :"+list2.get(3));
		 
		 list1.remove(1);
		 System.out.println("Value at 1st index of list one removed:"+ list1);
		 
		 boolean b=list2.contains(6);
			System.out.println(b); 
			
			list2.removeAll(list2); //removeAl()
			System.out.println(list2);
		 
			Iterator itr=list1.iterator();  
			
			  while(itr.hasNext())
			 {
			  System.out.println(itr.next());
			  }
			  //itr.remove();  
			  System.out.println("Iterator Interface: ");
			  System.out.println(list1);
			
		 
		 

	}

}
