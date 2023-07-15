package Lec30;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		//System.out.println(st.pop());
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.size());
		st.Display();
		st.push(40);
		st.push(50);
		st.push(60);

	}

}
