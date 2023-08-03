package accessmodifier;

public class SampleOne {

	public static void print()
	{
		System.out.println("This is a sample method");
	}
	
	public void view()
	{
		System.out.println("This is an instance method");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleOne.print();
		SampleOne obj=new SampleOne();
		obj.view();

	}

}
