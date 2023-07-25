package test;

public class MethOver {
	
		public static void add(int a,int b)
		{
			System.out.println(a+b);
		}
		public static void add(float c,float d)
		{
			System.out.println(c+d);
		}
		public static void add(char ch,String s)
		{
			System.out.println(ch);
			System.out.println(s);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethOver.add(35,45);
		MethOver.add(3.5f,4.5f);
		MethOver.add('U',"Welcome");

	}

}
