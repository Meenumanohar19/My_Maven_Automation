package exception;

public class ThrowsException {
	

	public static void div(int a, int b) throws ArithmeticException {  
		try
		{
        int div = a/b;  
        System.out.println(div); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException.div(25, 0);
		//System.out.println("After handling");

	}

}
