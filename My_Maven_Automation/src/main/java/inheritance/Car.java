package inheritance;

import accessmodifier.Class5;

public class Car extends Vehicle{
	
	public void carPrice()
	{
		vehPrice=vehPrice+(vehPrice*10);
		System.out.println("The price of car is: Rs." + vehPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Car();
		obj1.showPrice();
		obj1.carPrice();
		//Class5.show();
		//System.out.println(Class5.print("Meenu"));

	}

}
