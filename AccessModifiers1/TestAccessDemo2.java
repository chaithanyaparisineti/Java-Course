package AccessModifiers1;

public class TestAccessDemo2 {

	public static void main(String[] args) {
		TestAccessDemo1 t1=new TestAccessDemo1();
				//Accessing public data members outside the class
				System.out.println(t1.a2);
				System.out.println(t1.name2);
				t1.method2();
			System.out.println("*******************************");
			    //Accessing default data members outside the class
				System.out.println(t1.a3);
				System.out.println(t1.name3);
				t1.method3();
		    System.out.println("*******************************");
			    //Accessing default data members outside the class
				System.out.println(t1.a4);
				System.out.println(t1.name4);
				t1.method4();	
//note:we cannot access private data members in another class.
				
			}
	}

