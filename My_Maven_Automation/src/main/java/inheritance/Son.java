package inheritance;

public class Son extends Father {
	
	public void car()
    {
        System.out.println("Owns a Car");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj=new Son();
		obj.property();
		obj.car();

	}

}
