package problem;


public class Ex3 {
	
//	[알고리즘] 문제 #2. 최소 공배수의 합
//	양의 정수의 배열 arr이 주어질 때 모든 원소들이 둘 씩 짝지어 생기는 최소공배수를 합한 값을 리턴하는 solution 함수를 작성해주세요.
//
//	🚩 [제한사항]
//
//	- arr 내 원소들은 중복되지 않습니다.
//	- arr 배열의 길이는 최소 3입니다.
//	- 입출력 예 : [ 1 , 2 , 3 ] → ( {1 | 2} → 2 + { 1 | 3 } → 3 + { 2 | 3 } → 6 ) = 11
	
	
	public static int LCM(int [] arr) {
		
		 
		int lcmSum = 0;
		int n = arr.length;
		// 입력한 값 더하는 식
		for(int i = 0; i < n -1; i++ ) {
			for(int j = i + 1; j < n; j++) {
				int lcm = getLCM(arr[i], arr[j]);
				lcmSum +=lcm;
			}
		}
		return lcmSum;
	}
	// 최소공배수 구하는 식
	 public static int getLCM(int a, int b) {
	        int max = Math.max(a, b);
	        int lcm = max;

	        while (true) {
	            if (lcm % a == 0 && lcm % b == 0) {
	                return lcm;
	            }
	            lcm += max;
	        }
	    }
	 
	 // 입력한 값에 대한 최소 공배수 합 출력
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        int result = LCM(arr);
	        System.out.println(result);
	    }



}
