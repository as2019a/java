package som.inc.loop;

public class DoWhileEx1 {

	public static void main(String[] args) {
		int grade = 7;
		/*while(grade <= 6) {
			System.out.println("학교에 간다");
			grade++;
		}*/
		
		do {
			System.out.println("학교에 간다");
			grade++;
		}while(grade <= 6);

	}

}
