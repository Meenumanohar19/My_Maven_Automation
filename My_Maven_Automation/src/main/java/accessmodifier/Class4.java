package accessmodifier;

import test.Calculator;

public class Class4 extends Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Class3.a);// a is Private variable of the parent class
		
		Class3.sub();
		Calculator.add(21,33); //a public method from another class that belongs to another package
		System.out.println(Class3.f);
		Class3.print();
		Class3.disp();
	}

}
