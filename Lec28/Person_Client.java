package Lec28;

public class Person_Client {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Hello");
//		Person p = new Person();
//		System.out.println(p.name);
//		System.out.println(p.age);
//		Person p1 = new Person();
//		p1.name = "Kaju";
//		System.out.println(p1.name);
//		System.out.println(p.name);
		Person p2 = new Person("Hardik", 28);
		// p2.age=90;
		p2.setAge(-78);
		p2.setName("raj");
		System.out.println(p2.getAge());
		System.out.println(p2.getName());

	}

}
