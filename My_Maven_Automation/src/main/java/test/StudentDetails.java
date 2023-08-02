package test;

public class StudentDetails {
	
	String name;
	int rollNum;
	static String college="LBSITW";
	
	public StudentDetails(String name,int rollNum)
	{
		this.name=name;
		this.rollNum=rollNum;
		
	}
	
	public void display()
	{
		System.out.print(name+"\t");
		System.out.print(rollNum);
		System.out.println(college);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj1=new StudentDetails("Meenu",35);
		StudentDetails obj2=new StudentDetails("Meera",36);
		obj1.display();
		obj2.display();

	}

}
