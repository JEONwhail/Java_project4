package loop.quiz;

/*
 * 반복문을 사용해서 
 * 11부터 20까지 합을 구하고 출력하세요
 * */

public class Quiz_02 {

	public static void main(String[] args) {

		int num = 11; 
		int sum = 0;

		while (num <= 20) {
			sum = sum + num;
			num++; 
		}
		System.out.println("11부터 20까지의 합은 " + sum + "입니다.");
	}
}
