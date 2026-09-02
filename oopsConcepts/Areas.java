package oopsConcepts;
class Shape{
	//overloaded-1
	double area() {
		return 0;
	}
	//overloaded-2
	double area(double radius) {
		return Math.PI*radius*radius;
	}
	//overloaded-3
	double area(double length,double bredth) {
		return Math.PI*length*bredth;
	}
	//overloaded-4
	double area1(double side1,double side2) {
		return Math.PI*side1*side2;
	}
}
class circle extends Shape{
	@Override
	double area(double radius) {
		return Math.PI*radius*radius;
	}
}
	class rectangle extends Shape{
		@Override
		double area(double length,double bredth) {
			return Math.PI*length*bredth;
		}		
	}
	class Square extends Shape{
		@Override
		double area(double side1,double side2) {
			return Math.PI*side1*side2;
		}
	}
public class Areas {
	public static void main(String[] args) {
		circle c1=new circle();
		rectangle r1=new rectangle();
		Square s1=new Square();
		System.out.println("Area of circle:"+c1.area(5));
		System.out.println("Area of Rectangle :"+r1.area(10,5));	
		System.out.println("Area of square :"+s1.area(10,8));	
	}
}





