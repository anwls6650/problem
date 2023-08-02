package problem;

import java.util.Scanner;

public class Ex9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
	
		
		   int totalCost = 0;
	        for (int i = 0; i < N; i++) {
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            totalCost +=(long) a * b;
	        }

	        if (totalCost == X) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
		
	
	

}
