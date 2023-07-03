package Lec28;

public class Person {
	private int age = 20;
	private String name = "Kamlesh";

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		try {
			if (age < 0) {
				throw new Exception("rajat bklol age -ve nhi hota hai");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("In finally block");
		}

	}
//
//	public void setAge(int age) throws Exception {
//		
//		if (age < 0) {
//			throw new Exception("rajat bklol age -ve nhi hota hai");
//		}
//		this.age = age;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void SetAge(int age) {
//		this.age = age;
//
//	}
//
//	public void SetName(String name) {
//		this.name = name;
//
//	}
//
//	public int Getage() {
//		return age;
//	}
//
//	public String GetName() {
//		return name;
//	}
}
