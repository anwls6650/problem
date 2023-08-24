package problem;


import java.util.Arrays;
import java.util.Comparator;



class Solution1 {
	

	    public String solution(int[] numbers) {
	   
	        String[] strNumbers = new String[numbers.length];
	        for (int i = 0; i < numbers.length; i++) {
	            strNumbers[i] = Integer.toString(numbers[i]);
	        }
	       
	        
	        
	        Comparator<String> customComparator = new Comparator<String>() {
	            
				// x<y는 음수, x=y 0, x>y양수 
	            public int compare(String s1, String s2) {
	                return (s1 + s2).compareTo(s2 + s1);
	            }
	            
	         
	        };
	       
	        Arrays.sort(strNumbers, customComparator);

	     
	        StringBuilder answer = new StringBuilder();
	        for (String str : strNumbers) {
	            answer.append(str);
	        }

	        return answer.toString();
	    }
	    
	    public static void main(String[] args) {
	        Solution1 solution1 = new Solution1();

	        int[] numbers1 = {6, 11, 0,10};
	        System.out.println(solution1.solution(numbers1)); 

	        int[] numbers2 = {3, 30, 5, 34, 9, 1};
	        System.out.println(solution1.solution(numbers2)); 
	    
	    }
}


	
	


