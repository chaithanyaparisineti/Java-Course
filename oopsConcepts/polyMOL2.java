package oopsConcepts;
public class polyMOL2 {
	 void main(String[] args) {
	add (10,20);
	add (10,20,30);
	add (10,20,30,40);
	add (10,20,30,40,50);
	add (10,20,30,40,50,60);
	add (10,20,30,40,50,60,70);
	add (10,20,30,40,50,60,70,80);
	}
// variable argument.
	 void add(int... a) {
		int sum=0;
		for(int a1:a) {
			sum=sum+a1;
		}
		System.out.println("sum:"+sum);
		
	 }

	 
}
