package interfacePackage;

public class SampleClass implements SampleInter{

	public void add()
	{
		System.out.println(a+b);
	}
	
	public void display()
	{
		System.out.println("Interface method - HEllo");
	}
	
	public void print()
	{
		System.out.println("Class Method - Good Morning");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass obj=new SampleClass();
		SampleInter obj2=new SampleClass(); // Interface do not have constructor. obj of interface--> interfacename objectname=new ClassName();
		obj2.add();
		obj2.display();
		obj.print();
		System.out.println(a);
	}

}
