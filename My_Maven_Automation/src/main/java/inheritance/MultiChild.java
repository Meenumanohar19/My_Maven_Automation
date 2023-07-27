package inheritance;

public class MultiChild extends MultiParent {
	
	public void div()
	{
		System.out.println(i/j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj=new MultiChild();
		obj.div();
		obj.multiply();
		obj.add();
	}

}
