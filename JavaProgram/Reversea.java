package JavaProgram;

public class Reversea
{
	public static void main(String arg[])
	{
	int n=234;
	int rem,rev=0;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		
	}
	System.out.println("reverse no is "+rev);
	}

}
