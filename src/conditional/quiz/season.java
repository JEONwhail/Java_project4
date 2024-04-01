package conditional.quiz;

public class season {

	public static void main(String[] args) {
	
		int month = 13;
		
		if(month >= 3 && month <= 5) {
		  System.out.println("봄봄");
		}else if(month >= 6 && month <= 8) {
			System.out.println("summer");
		}else if(month >= 9 && month <= 11) {
			System.out.println("autu");
		}else if(month==12||month==1||month==2) {
			System.out.println("win");
		}else 
			System.out.println("땡");
	}
	
}
	
