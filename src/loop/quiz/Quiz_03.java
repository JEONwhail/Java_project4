package loop.quiz;

/*
 * 정수형 변수 n을 선언하고 값을 대입하세요.
 * n의 크기만큼 *별을 출력하세요.
 * n=5 -> *****
 * */

public class Quiz_03 {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}
}
