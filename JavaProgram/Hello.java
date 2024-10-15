 
package JavaProgram;

public class Hello 
{
	static int x=10;
	static 
	{
		System.out.println(x);
		m1();
	}
	public static void m1()
	{
		System.out.println(x); 
		System.out.println(y);
	}
	public static void main(String[] args)
	{
		System.out.println("Hiiii");
		m1();
	}
	static 
	{
		System.out.println("Hello");
	}
	static  int y=20;
}
