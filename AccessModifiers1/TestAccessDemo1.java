package AccessModifiers1;

public class TestAccessDemo1 {
	static {
		System.out.println("Static method called");
	}
	static{
		System.out.println("instace method called");
	}
	//private DataMembers
	private int a1=12;
	private String name1="chaithanya";
	private void method1() {
		System.out.println("method1 called");
	}
	//public DataMembers
	public int a2=15;
	public String name2="Noor";
	public void method2() {
		System.out.println("method2 called");
	}
	//Default data members
	 int a3=10;
	String name3="Ram";
	void method3() {
		System.out.println("method3 called");
	}
	//protected data members
		protected int a4=11;
	    protected String name4="sita";
		protected void method4() {
			System.out.println("method4 called");
		}
		
	//constructor
	public TestAccessDemo1(){
		System.out.println("no arg constructor called");
	}
	public static void main(String[] args) {
		TestAccessDemo1 t1=new TestAccessDemo1();
		//Accessing private data members
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();
	System.out.println("*******************************");
		//Accessing public data members
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
	System.out.println("*******************************");
	    //Accessing default data members
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();
    System.out.println("*******************************");
	    //Accessing default data members
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();
	

	}

}
