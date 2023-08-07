package encapsulationOne;

import encapsulation.EncapSampleOne;

public class EncapSampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapSampleOne obj=new EncapSampleOne();//Aggregation
		
		obj.setter("Amaze", 2345);
		obj.getter();

	}

}
