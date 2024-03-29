package loop.quiz;

/*
  * 1부터 100까지의 수 중에서 3의 배수만 출력하세요.
 * */

public class Quiz_05 {

	public static void main(String[] args) {

//		for(int i = 1; i<=100; i++) { 
//			if (i % 3 != 0) { 
//				continue;
//			}
//			System.out.println( "3의 배수는" + i + "입니다."); 
//		}
		
		for (int i = 1; i <= 100; i++) {
		    if (i % 3 == 0) {
		        System.out.println("3의 배수는 " + i + "입니다.");
		    }
		}
		
		
		
	}
}
