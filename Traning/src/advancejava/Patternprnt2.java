package advancejava;

public class Patternprnt2 {

	public static void main(String[] args) {

		int n = 6, row, col;
		for (row = 0; row <=n; row++) {
			for (col = 0; col <= n / 2; col++) {

				if ((col == 0 || col == n / 2) && row != 0 || row == 0 || row == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	}
}
