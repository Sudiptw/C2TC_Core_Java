package advancejava;

import java.util.Scanner;

public class Arraymima {

	public static void main(String[] args) {
        int n=5;
        int[] ar=new int[n];
//		int[] ar = { 16, 2, 6, 8, 1 };
        Scanner sc= new Scanner(System.in);
        
        for (int k=0;k<n;k++) {
        	ar[k]=sc.nextInt();
        }

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int total = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max)
				max = ar[i];
			if (ar[i] < min)
				min = ar[i];
			total = total + ar[i];

		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("total5: "+total);
		System.out.println((total - max) + " " + (total - min));
	}
}
