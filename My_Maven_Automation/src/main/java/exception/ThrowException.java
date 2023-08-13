package exception;

public class ThrowException {
	
	public static void testThrow(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible"); 
			//throws the exception to the contructor of the Exception class explicitly
			
		}
		else
		{
			System.out.println("Eligible for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rest of the code");
		ThrowException.testThrow(16);
		

	}

}
