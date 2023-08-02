package accessmodifier;

public class Class3 {
	
	private static int a=12;
	static float f=2.6f;
	int k=10;
	
	protected static void disp()
	{
	System.out.println("This is protected");
	}
	static void print()
	{
		System.out.println("HEllo");
	}
	
	public static void sub()
	{
		int i=1;
		int j=3;
		System.out.println(j-1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Class3.sub();
	  System.out.println(Class3.a);
	  Class3 obj=new Class3();
	  System.out.println(obj.k);
	  Class3.print();
	  Class3.disp();

	}
}


