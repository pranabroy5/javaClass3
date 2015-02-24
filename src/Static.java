
public class Static {

	int a=12;  // can't be use on static method
	static int b=14;  //static variable can be used on static method
	  static void method1() //only static method can be use on main  (static--) function--if the method on same class
	{
	System.out.println("method1");	
	}
	  //This line does not mean anything
	  //This line does not mean anything
	  //This line does not mean anything
	static void  method2()
	{
		
		String s="hello";
		System.out.println(s+" pranab");
			
	}
	
	public static void main(String[] args) {
		
		//1 st commit
				
method2();
method1();
System.out.println(b);

Static1 S=new Static1();
S.method2();
System.out.println( S.method3());
System.out.println( S.method4());
int x=6+S.method3(); 
System.out.println(x);
System.out.println(S.method5());
S.method();
Static3 V=S.method();
System.out.println(V.welcome());
Static4 S1=new Static4();
S1.div();
S1.add5();



	}

}
