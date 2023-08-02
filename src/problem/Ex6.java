package problem;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex6 {

	 public static void main(String[] args)  {
		 
		  Scanner scanner = new Scanner(System.in);

	        BigInteger A = scanner.nextBigInteger();
	        BigInteger B = scanner.nextBigInteger();
	        BigInteger C = scanner.nextBigInteger();

	        BigInteger sum = A.add(B).add(C);
	        System.out.println(sum);
		 
		
	}
}

