package supersample;

public class SuperConstructChild extends SuperConstructParent {
	
	public SuperConstructChild()
	{
		super(2,3);
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructChild obj=new SuperConstructChild();

	}

}
