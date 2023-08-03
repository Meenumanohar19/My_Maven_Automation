package polymorphism;

public class HwChild extends HwParent{
	
	public void StudDetails(String name,char div)
	{
		//super.StudDetails("Jeena", 'B');
		System.out.println("Output of Child class:");
		System.out.print(name+"\t");
		System.out.print(div+"\t");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HwChild obj=new HwChild();
		obj.StudDetails("Meenu", 'A');
}
}
/*Here the object of a child class is created, and the method inside the child class is called. 
The method in the parent class is overridden by the child class. 
the body inside the child class is executed.*/
