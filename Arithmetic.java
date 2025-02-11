      //arthimatic operator
import java.util.Scanner; 
class arithmetic{
	public static void main(String[] args)
	{
		int a , b;
		System.out.println("enter two number");
		Scanner obj=new Scanner(System.in);
		   a=obj.nextInt();
		   b=obj.nextInt();
		System.out.println("addition:-" + (a+b));
		System.out.println("subs:-" + (a-b));
		System.out.println("multipl:-" + (a*b));
		System.out.println("devision:-" + (a/b));
	}
} 