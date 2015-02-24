
public class Static1 {
	
	void method2()  //no return value
	{
		System.out.println("Access from another class");
	}
	
	
	int method3()  //return int value
	{
		int x=5;
		return x;
	}

	String method4()  //return int value
	{
	String x="yahoo";
		return x;
	}
	
	int method5()  //return int value
	{
	
		return 4+method3();
	}

	Static3 method()
	{
		return new Static3();
	}
	

}
