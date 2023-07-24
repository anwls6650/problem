package problem;

public class Ex4 {

	public static int decimal(int a) {
		int sumPrime = 0;

		// 소수의 합 계
		for (int num = 2; num <= a; num++) {
			if (isPrime(num)) {
				sumPrime += num;
			}
		}
		return sumPrime;
	}

	// 소수 판별
	public static boolean isPrime(int num) {

		// - 소수란 1과 자기 자신으로만 나눠지는 수 입니다. ( 1인 소수가 아닙니다. )
		if (num < 2) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// a 의 소수의 합 출력
	public static void main(String[] args) {
		int a = 15;
		int result = decimal(a);
		System.out.println(result);
	}

}
