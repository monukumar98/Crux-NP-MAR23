package Lec28;

public class Student {
	String name;
	int age;
	static int count = 0;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {

		System.out.println(name + " Say Hey " + this.name);

	}

	public static void MentorName() {
		Student s = new Student();
		System.out.println(s.name);
	}

	static {
		System.out.println("In Static");

	}
	static {
		System.out.println("In Static1");
	}
	static {
		System.out.println("In Static2");
	}

}
