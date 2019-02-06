package com.inc.ladder;

public class ExcludableLadderGame extends LadderGame {
	int excludedDay = -1;
	
	void exclude() {
		System.out.println("제외할 날짜를 선택해 주세요\n(월 ~ 금, 없으면 x)");
		char day = scanner.nextLine().charAt(0);
		if(day == 'x') {
			return;
		}
		
		excludedDay = dayToInt(day);
	}
	
	//실습
	//dayToInt를 선언하시오( ex)월 -> 0 ) //메서드 선언 //
	int dayToInt(char day) {
		switch(day) {
		case '월' : return 0;			
		case '화' : return 1;			
		case '수' : return 2;			
		case '목' : return 3;			
		case '금' : return 4;					
	}
	return -1;
	}
	
	@Override
	public void run() {
		exclude();
		createDays();
		for(int day : days) {
			if(day == excludedDay) {
				continue;
			}
			System.out.println("이름을 입력해 주세요");
			String name = scanner.nextLine();
			char charDay = intToDay(day);
			System.out.printf("%s, %c/n", name, charDay);
		}
	}

	public static void main(String[] args) {
		ExcludableLadderGame elg = new ExcludableLadderGame();
		elg.run();

	}

}
