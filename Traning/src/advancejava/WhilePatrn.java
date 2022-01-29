package advancejava;

public class WhilePatrn {
	public static void main(String[] args) {

		int row = 1, n = 6;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;

		}
	}

}
