package loop.quiz;

/*
 * for문을 사용해 1부터 100까지 더하는 코드를 작성하세요.
 * 단 중간에, 합이 500이 넘어가면 중단합니다.
 * for문이 종료되기전 num과 sum의 값을 출력하세요.
 * 결과는 i 는 32 sum은 528
 * */
public class Quiz_06 {

	public static void main(String[] args) {
		int sum = 0;
		int i; 

		for (i = 1; i <= 100; i++) {
			sum = sum + i; 
			if (sum >= 500) { 
				break;
			}
		}
		
		System.out.println(i);
		System.out.println(sum);
		System.out.println(i + sum);
		System.out.println(i - sum);
		System.out.println(i * sum);
		System.out.println(i / sum); //?
		System.out.println(i % sum);
		System.out.println(i += sum);
		System.out.println(i -= sum);
		System.out.println(i *= sum);
		System.out.println(i /= sum); //?
		System.out.println(i %= sum);
	}

}