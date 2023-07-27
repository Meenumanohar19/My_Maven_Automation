package inheritance;

public class Scooter extends Vehicle{
	
	public void scooterPrice() 
	{
		vehPrice = vehPrice + (vehPrice * 2);
	    System.out.println("The price of scooter is: Rs." + vehPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter obj=new Scooter();
		obj.showPrice();
		obj.scooterPrice();

	}

}
