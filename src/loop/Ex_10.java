package loop;

/*
 * 중첩반복문을 사용하여 구구단 만들기
 * */
public class Ex_10 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) { // 단
			for (int times = 1; times <=9; times++) { //곱하는 수
				System.out.println(dan + "X" + times + "=" + dan *times);
			}
			
			System.out.println();
				
		}
		
		
	}

}