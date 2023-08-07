package encapsulationOne;

import encapsulation.SampleOne;

public class SampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     SampleOne obj=new SampleOne();  // aggregation- obj of previous class is created in current class to call the previous class' methods
     
     obj.setter("Meenu", 30);  //setter method is called
     
     obj.getter();//getter is called
	}

}

//Encapsulation is achieved through Aggregation.Public data is considered in aggregation.