package oopsConcepts;
  class Test1{
	  Test1(){
		System.out.println("Test1 constructor called");
	  }  
  }
	  class Test2 extends Test1{
		  Test2(){
			  System.out.println("Test2 constructor called");
		  }
	  }
	  class Test3 extends Test2{
		  Test3(){
			  System.out.println("Test3 constructor called");
		  }
	  }
  
public class DiamondProblem {
	public static void main(String[] args) {
		System.out.println("main method ended");
		Test3 t3=new Test3();
		System.out.println("main method ended");
	}
}
