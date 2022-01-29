package technoServe;

public class Static {

	int a = 10;
	static int y = 100;

	static class Staticinner {

		static void display() {
			System.out.println(y);
		}
	}

	public static void main(String[] args) {

		// Static.Staticinner s1 = new Static.Staticinner();
		Static.Staticinner.display();
	}

}