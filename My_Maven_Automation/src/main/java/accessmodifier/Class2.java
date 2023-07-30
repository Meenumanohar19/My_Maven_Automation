package accessmodifier;

public class Class2 extends Class1{
	public static void sub()
	{
		int c=10;
		int d=5;
		System.out.println(c-d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Class2.sub();
     Class1.add();
    //System.out.println(Class1.name);
	}

}
