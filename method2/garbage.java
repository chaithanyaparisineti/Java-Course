package method2;

public class garbage {
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		garbage a =new garbage();
		garbage b =new garbage();
		garbage c =new garbage();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a=null;
		System.out.println(a);
		System.out.println(b);


		b=c;
		System.gc();
		
}
	
}