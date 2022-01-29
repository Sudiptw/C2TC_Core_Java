package trainee;

public class Boss extends Employee {

	public Boss() {
		// TODO Auto-generated constructor stub
	}

	public Boss(String name, String id, int rollno) {
		super(name, id, rollno);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Boss s1 = new Boss("sudipt", "sud123", 48);
		System.out.println(s1);

	}

}
