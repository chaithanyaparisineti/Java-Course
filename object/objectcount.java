package object;

public class objectcount {
	 static	 int count=0;
	 {
		 count++;
	 }
	 
	
	public static void main(String[] args) {
		objectcount emp1=new objectcount();
		objectcount emp2=new objectcount();
		objectcount emp3=new objectcount();
		objectcount emp4=new objectcount();
		System.out.println(count);
			
}
}
