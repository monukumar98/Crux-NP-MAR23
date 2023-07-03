package Lec28;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Student s = new Student();
		System.out.println(s);
		s.name = "Kaju";
		s.age = 12;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "kamlesh";
		s1.age = 18;
		s1.Intro_yourSelf();
       s1.SayHey("Raju");
       System.out.println(Student.count);
	}

}
