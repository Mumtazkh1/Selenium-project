package Release21;

public class Ticket1 {
	
	int a = 10;
	int b = 20;
	int c = 30;
	
	void m1() {
		int z = a+b+c;
		System.out.println(z);
	}

	public static void main(String[] args) {
		
	Ticket1 ref = new Ticket1();
	ref.m1();

	}

}
