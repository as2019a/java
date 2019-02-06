package som.inc.loop;

public class WhileEx1 {

	public static void main(String[] args) {
		
		boolean isStudent = true;
		/*while(isStudent) {
			System.out.println("학교에 간다");
			System.out.println("집으로 돌아온다");
			if(Math.random() < 0.1) {
				isStudent = false;	
			}
		}*/
		
		int grade = 1;
		while(grade <= 6) {
			System.out.println("학교에 간다");
			System.out.println("집으로 돌아온다");
			//grade를 1 증가시키는 코드
			grade = grade + 1;
			System.out.println(grade);
			
		}
		
	}

}
