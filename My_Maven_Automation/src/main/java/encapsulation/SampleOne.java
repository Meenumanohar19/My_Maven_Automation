package encapsulation;

public class SampleOne {
	
	private String name;
	private int age;
	
	public void setter(String name,int age)  //to set values
	{
		this.name=name;
		this.age=age;
		
	}
	public void getter()    //to view/get the values
	{
		System.out.println(name);
		age=age*10;
		System.out.println(age);
	}

}
