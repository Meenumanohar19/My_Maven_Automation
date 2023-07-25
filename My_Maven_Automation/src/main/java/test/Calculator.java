package test;

public class Calculator {
	
		public static void add(int a, int b)
		{
			float result1 = a+b;
			System.out.println("Addition:" + result1);
		}
	
		public static void sub(int c, int d)
		{
			float result2 = c-d;
			System.out.println("Subtraction:" + result2);
		}
	
		public static void mul(int e, int f)
		{
			float result3 = e*f;
			System.out.println("Multiplication:" + result3);
		}
	
		public static void div(int g, int h)
		{
			float result4 = g/h;
			System.out.println("Division:" + result4);
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator.add(21,33);
		Calculator.sub(50,45);
		Calculator.mul(15,2);
		Calculator.div(25,3);

	}

}
