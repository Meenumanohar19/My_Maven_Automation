package finalpack;

public class FinalParent { // if a class is made as final, inheritance is not possible. it cannot be extended , if made final
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	//If you make any method as final, you cannot override it.
	 
	/* public final void print()
	 {
		 System.out.println("Good Night Friends");
	 }*/

}
