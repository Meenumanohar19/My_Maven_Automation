package finalpack;

public class FinalChild extends FinalParent{
	
	final int k=5;  // variable k is declared as final.
	
	public void add(int a,int b) // if we use final in a method, then it cannot be overrided with other method.
	{
		System.out.println(a-b);
		//k=10; // k is defined as final. Hence we cannot change it
	}
	
	//If you make any method as final, you cannot override it.
	/*public void print() 
	{
	System.out.println("Sleep well");
	}*/  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalChild obj=new FinalChild();
		obj.add(10, 11);
		//obj.sub(30, 10);

	}

}
