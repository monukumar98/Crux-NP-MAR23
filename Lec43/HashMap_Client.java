package Lec43;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Riya", 90);
		map.put("Nitish", 77);
		map.put("Akash", 67);
		map.put("Puneet", 177);
		map.put("Zaid", 76);
		map.put("Omika", 88);
		map.put("Puneet", 77);
		System.out.println(map.containsKey("Omika"));
		System.out.println(map.get("Puneet"));
		System.out.println(map);
	}

}
