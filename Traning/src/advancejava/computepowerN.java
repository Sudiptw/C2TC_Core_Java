package advancejava;

public class computepowerN {

	public static void main(String[] args) {
		System.out.println(power(2,3));
	}

	public static int power(int a, int n) {
		int ans = 1;
		for (int i = 0; i <= 30; i++) {
			if (checkBit(n, i))
				ans = ans * a;
			a = a * a;
		}
		return ans;
	}

	private static boolean checkBit(int n, int i) {

		return ((n >> i) & 1) != 0;
	}
}
