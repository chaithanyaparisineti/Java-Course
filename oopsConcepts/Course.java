package oopsConcepts;
class course1{
	void duration() {
		System.out.println("6 months");
	}
}
class javaCourse extends course1{
	@Override
	void duration() {
		System.out.println("3 months");
	}
}
class pythonCourse extends course1{
	@Override
	void duration() {
		System.out.println("2 months");
	}
}
class sqlCourse extends course1{
	@Override
	void duration() {
		System.out.println("1 months");
	}
}
public class Course {
	public static void main(String[] args) {
		course1 c1=new course1();
		javaCourse j1=new javaCourse();
		pythonCourse p1=new pythonCourse();
		sqlCourse s1=new sqlCourse();
		c1.duration();
		j1.duration();
		p1.duration();
		s1.duration();

	}

}
