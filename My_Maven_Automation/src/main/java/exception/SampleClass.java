package exception;

public class SampleClass {
	
	public void test(int age) throws LicenseException
	{
	if(age<=18)
	{
		throw new LicenseException("Not Eligible");
	}
	else
	{
		System.out.println("Eligible for voting");
	}
	}
	public static void main(String args[])
	{
		SampleClass obj=new SampleClass();
		try {
			obj.test(15);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// printStackTrace() - used instead of printing statement
			
			
		}
	}

}
