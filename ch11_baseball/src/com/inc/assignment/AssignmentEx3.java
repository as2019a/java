package com.inc.assignment;

import java.util.Random;
import java.util.Scanner;

public class AssignmentEx3 {

		//프로그램을 구상해서 구현해보세요.
		//ex)묵찌빠
		
  private static final int ROW        = 10;
  private static final int COL        = 10;
  private static final int MINE_CNT   = 10;
  private static final String MINE    = " * ";
  private static final String NONE    = " x ";
  private String mineArr[][]          = null;

  public static <MineSweeper> void main(String[] args) {

      MineSweeper mineCraft = new MineSweeper();

      ((AssignmentEx3) mineCraft).setInit();

      ((AssignmentEx3) mineCraft).setMine(MINE_CNT);

      ((AssignmentEx3) mineCraft).printMine();
  }

  // 생성자
  public void MineSweeper(){
      mineArr = new String[ROW][COL];
  }

  // 초기화 데이터 주입
  private void setInit(){
      for(int i=0; i<ROW; i++){
          for (int j=0; j<COL; j++){
              mineArr[i][j] = NONE;
          }
      }
  }

  // 랜덤 값으로 지뢰 주입
  private void setMine(int mineCnt){
      Random ran = new Random();

      while (mineCnt-- > 0){
          int row = ran.nextInt(ROW);
          int col = ran.nextInt(COL);

          // 랜덤한 배열 주소에 이미 지뢰가 있는 경우, 루프를 한번더 돌려서 랜덤위치 재생성
          if(mineArr[row][col].equals(MINE)){
              mineCnt++;
          }
          // 값이 비어 있는 경우 지뢰를 추가한다
          if(mineArr[row][col].equals(NONE)){
              mineArr[row][col] = MINE;
          }
      }
  }

  // 지뢰 존재여부 판단
  private boolean isExistMine(int row, int col){
      // ArrayIndexOutOfBoundsException 예방
      if(row < 0 || row >= ROW || col < 0 || col >= COL){
          return false;
      }

      return mineArr[row][col].equals(MINE);
  }

  // 해당 배열 기준 자기 자신을 제외한 8칸에서 지뢰를 찾은 후 카운팅 한다.
  private int getMineNumber(int row, int col){
      int mineCnt = 0;
      if(isExistMine(row-1, col-1))mineCnt++;
      if(isExistMine(row-1, col))mineCnt++;
      if(isExistMine(row-1, col+1))mineCnt++;
      if(isExistMine(row, col-1))mineCnt++;
      if(isExistMine(row, col+1))mineCnt++;
      if(isExistMine(row+1, col-1))mineCnt++;
      if(isExistMine(row+1, col))mineCnt++;
      if(isExistMine(row+1, col+1))mineCnt++;

      return mineCnt;
  }

  // 지뢰 근처에 지뢰 개수 숫자 주입
  private void setNumber(int row, int col){
      if(mineArr[row][col].equals(NONE) && getMineNumber(row,col)!=0){
          mineArr[row][col] = " "+getMineNumber(row,col)+" ";
      }
  }

  // 지뢰찾기 배열 출력
  private void printMine(){
      for(int i=0; i<ROW; i++){
          for (int j=0; j<COL; j++){
              setNumber(i, j);
              System.out.print(mineArr[i][j]);
          }
          System.out.println();
      }
  }


   //http:soulduse.tistory.com/57 [프로그래밍좀비]		
		
	

}
