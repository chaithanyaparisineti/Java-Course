package ExceptionHandling;
//ArrayIndexOutOfBoundsException
public class TestEH4 {
	public static void main(String[] args) {
		System.out.println("Main method Started");
	int[]arr= {10,20,30,40,50};
try {
	System.out.println(arr[10]);
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("invalid Array index");
}
System.out.println("Main method Ended");
	}

}
