package supersample;

public class SuperChild extends SuperParent {
public void display()
{
	System.out.println("Super Child Class");
	System.out.println(super.ch);
	super.print();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(super.ch); we cannot call static variables
		SuperChild obj=new SuperChild();
		obj.display();
		//obj.print();

	}

}
