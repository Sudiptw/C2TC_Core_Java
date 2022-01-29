package advancejava;

public class Dowhiletrin {
	public static void main(String[] args) {

		int n = 6;
		int row = 1;
		do {
			int col = row;
			while (col <= n) {
				System.out.print(" ");
				col++;
			}
			int col1 = 1;
			do {
				System.out.print("*");
				col1++;
			}while (col1 <=row);
			int col2 =1;
			do {
				System.out.print("*");
				col2++;
			}while (col2 < row);

			row++;
			System.out.println();
		}while (row <= n);
		
	}

}
