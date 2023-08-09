package exception;

public class ExceptionHandling {
	
	public void display()
	{
		int a=4;
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling obj=new ExceptionHandling();
		obj.display();
	}

}
