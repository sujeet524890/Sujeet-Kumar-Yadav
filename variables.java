                           /*variables */
class variables{ 
	int a=10; //instance variable
	static int b=20;//static variable
	public static void main(String[] args)
	{
		int c=30;//local variable
		final int D=48;//final variable
		variables v=new variables();
		System.out.println(v.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(D);

	}
}