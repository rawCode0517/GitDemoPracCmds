package conceptsJava;

public class Constructors {

	Constructors()
	{
		this("check1234");
		System.out.println("laja laguchi");
	}
	
	Constructors(int x)
	{
		System.out.println(x);
		System.out.println("kan karibi");
	}
	
	Constructors(String g)
	{
		System.out.println(g);
	}
	
	public static void main(String[] args) {
		Constructors ks = new Constructors();
		}
}
