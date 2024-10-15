package conceptsJava;

public class Test2 extends Test1
	{

	public static void main(String[] args) {
		
	Test1 t = new Test1();
	Test2 t2 = new Test2();
	Test1 t3 = new Test2();
	
	t.m1(10);
	//Test2 t4 = new Test1()// we cannot create object for test1 by taking test2 as refernce
	
	}
	
	
	
}
