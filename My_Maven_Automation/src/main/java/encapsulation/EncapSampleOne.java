package encapsulation;

public class EncapSampleOne {
	
	private String carName;
	private int regNum;
	
	public void setter(String carName,int regNum) 
	{
		this.carName=carName;
		this.regNum=regNum;
	}
	
	public void getter()
	{
	System.out.println("The name of Car is " +carName);
	System.out.println("Registration number is " +regNum);
	}

}
