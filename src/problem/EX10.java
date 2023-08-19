package problem;

import java.util.Scanner;

public class EX10 {
	
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		String s = "";
		
		if( 4 <= N || N<=1000) {
			
			for( int i = 4; i >= N; i+=4 ) {
				
				s+="long";
			}
		}
		
		s+= "long int";
		
		System.out.println(s);
	
		
	    }
}
