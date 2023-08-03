package polymorphism;

public class Child extends Parent {
	@Override   // annotation for override
	public void display()
	{   
		//super.display(); 
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child obj=new Child();
    obj.display();
    
   //Parent obj1=new Parent();
    //obj1.display();
	}

}
