package AccessModifiers2;
import AccessModifiers1.TestAccessDemo1;
public class TestAccessDemo3 extends TestAccessDemo1{

	public static void main(String[] args) {
		TestAccessDemo1 t1=new TestAccessDemo1();
		//Accessing public data members outside the package.
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
    System.out.println("*******************************");
    TestAccessDemo3 t3=new TestAccessDemo3();
	    //Accessing default data members outside the package.
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();	
		
//Note:we can access only public dataMembers and we cannot access
		//private,default dataMembers in another package and class.
//by creating object for class we can access protected dataMembers.
	}

}
