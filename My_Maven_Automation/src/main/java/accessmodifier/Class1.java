package accessmodifier;

public class Class1 {
	
	private static String name="Meenu";
	public static void add()
	{
		int a=1;
		int b=3;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Class1.add();
    System.out.println(Class1.name);
	}

}
