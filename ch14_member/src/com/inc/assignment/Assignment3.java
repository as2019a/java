package com.inc.assignment;

public class Assignment3 {
	//정올사이트 실력키우기 4개이상 풀기
	//http://www.jungol.co.kr
	
	
	//1.소수와 합성수
	void fill()
	  {
	      int x = 1;                    // 행 - 처음에는 1 
	      int y = 100 / 2 + 1;            // 열 - 초기값 중앙
	      int i;                        // 배열에 순서대로 채울 값 (for 문에 사용할 변수)
	      int end = 2 * 100;              // 배열에 채울 마지막 값
	 
	      for (i = 1; i <= end; i++) {  // 배열에 채울 값 1부터 end까지
          arr[x][y] = i;            // i를 배열의 현재 위치에 넣는다.
	          if (i % 2 == 0) {         // 만약 현재의 수가 n의 배수이면 아래로 이동
	              x++;                 
	          }
	           else {
	              x--, y--;             // 왼쪽 위로 이동
	              if (x < 1) x = 2;     // x가 0이면 n으로
	              if (y < 1) y = 100;     // y가 0이면 n으로
	         }
	      }
	  }
	   }
}
