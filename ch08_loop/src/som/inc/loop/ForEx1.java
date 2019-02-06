package som.inc.loop;

public class ForEx1 {

	public static void main(String[] args) {
		/*int grade = 1;
		while(grade <= 6) {
			System.out.println("학교에 간다");
			grade++;
		}*/
		
		for(int grade = 1;grade <= 6;grade++) {
			System.out.println("학교에 간다");
		}
		
		//5단 출력
		/*int num = 1;
		while(num <= 9) {
			System.out.printf("5 X %d = %d\n", num , num*5);
			num++;
		}*/
		//while -> for
		/*for(int num = 1;num <= 9;num++) {
			System.out.printf("5 X %d = %d\n", num ,num*5);
		}*/
		
		int num = 1;
		for(;num <=9;) {
			System.out.printf("5 X %d = %d\n", num ,num*5);
			num++;
		}
		
	}

}
