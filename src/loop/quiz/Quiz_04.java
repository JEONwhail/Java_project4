package loop.quiz;

/*
 * 1부터 100까지의 수 중에서 2의 배수만 출력하세요.
 * */

public class Quiz_04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i); 
				
			}
		}

		
	}
}
