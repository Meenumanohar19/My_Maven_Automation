package threesuper;

public class ChildOne extends ParentOne {
	
	public ChildOne()
	{
		super("Meenu");
		System.out.println("This is a subclass/Child Class Constructor");
	}
	public void display()
	{
		System.out.println(super.ch);
		super.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne obj=new ChildOne();
		obj.display();

	}

}
