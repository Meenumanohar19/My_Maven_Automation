package accessmodifier;

public class SampleTwo {
	
	public static void display()
	{
		System.out.println("This is 2nd sample");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleTwo.display();
		SampleOne obj1=new SampleOne(); // aggregation (public elements are accessed)
		obj1.view();

	}

}
/*instance method from sampleOne class is called in SampleTwo by aggregation.
object of SampleOne is created in SampleTwo.*/