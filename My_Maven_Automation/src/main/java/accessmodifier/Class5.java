package accessmodifier;

public class Class5 {
	
	private static char ch='T'; // Private access modifier
	
	static void show() //default access modifier
    { 
        System.out.println("Hello World!"); 
    }
	
	protected static String print(String name)
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class5 obj=new Class5();
		//obj.display();  
		
		Class5.show();
		System.out.println(Class5.ch);
		System.out.println(Class5.print("Meenu"));

	}

}
