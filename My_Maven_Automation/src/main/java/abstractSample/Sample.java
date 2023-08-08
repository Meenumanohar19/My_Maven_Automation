package abstractSample;

public class Sample extends AbstractSample{

	public void print()  //definition of abstract method
	{
		System.out.println("This is an abstract method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		obj.print();
		obj.display();

	}

}
