package abstractSample;

public class AbsSampleHw extends AbstractHw {
	
	public void add()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsSampleHw obj=new AbsSampleHw();
		obj.add();
		obj.view();

	}

}
