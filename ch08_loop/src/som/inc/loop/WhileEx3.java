package som.inc.loop;

public class WhileEx3 {

	public static void main(String[] args) {
		/*int a = 1;
		int b = 1;
		while(a <= 5) {
			b = 1;
			while(b <= 5) {
				System.out.printf("%d, %d\n",a ,b);
				b++;
			}
			a++;
		}*/
		
		/*int dan = 2;
		while(dan <= 9) {
			int num = 1;
			while(num < 10) {
				System.out.printf("%d X %d = %d\t",dan ,num, num*dan);
				num++;
			}
			System.out.println();
			dan++;
		}*/
		//실습 : 반복문을 이용하여 구구단을 기획하시오
		int dan = 2;
		while(dan <= 9) {
			int num = 1;
			while(num < 10) {
				System.out.printf("%d X %d = %d\t",dan , num ,num*dan);
				num++;
			}
			System.out.println();
			dan++;
		}
	}
	

	

}
