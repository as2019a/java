package com.inc.assignment;

import java.util.Scanner;

public class Assignment1 {
	Scanner scanner = new Scanner(System.in);
	String[] pages = new String[5];
	
	//과제1-1 전체읽기기능 추가
	//과제1-2 전체삭제기능 추가
	void run() {
		while(true) {
			int choice = getChoice();
			if(choice == 0) {
				return;
			}else if(choice == 1) {
				System.out.println("보고싶은 페이지를 입력해 주세요");
				int page = scanner.nextInt();
				scanner.nextLine();
				view(page);
			}else if(choice == 2) {
				System.out.println("저장할 메모를 입력해 주세요");
				String msg = scanner.nextLine();
				write(msg);
			}else if(choice == 3) {
				System.out.println("삭제할 페이지를 입력해 주세요");
				int page = scanner.nextInt();
				scanner.nextLine();
				delete(page);
			}else if(choice == 4) {
				System.out.println("수정할 페이지를 입력해 주세요");
				int page = scanner.nextInt();
				scanner.nextLine();
				view(page);
				System.out.println("수정할 내용을 입력해 주세요(취소:x)");
				String msg = scanner.nextLine();
				if(msg.equals("x")) {
					continue;
				}
				update(page, msg);
			}else if(choice == 5) {
				System.out.println("전체읽기");
				fullRead();
				//veiwAll();
			}else if(choice == 6) {
				System.out.println("전체삭제");
				deleteAll();
			}
		}
	}
	
	void update(int page, String msg) {
		pages[page-1] = msg;
	}
	
	void delete(int page) {
		pages[page-1] = null;
	}
	
	void view(int page) {
		//pages에서 page에 해당하는 인덱스의 문자열 출력
		//단, page검증
		if(page < 1 || page > 5) {
			System.out.println("1~5사이의 값을 입력해 주세요");
		}else {
			System.out.println(pages[page-1]);
		}
	}
	
	void write(String msg) {
		//pages에서 인덱스에 null이 들어있을 경우 해당 인덱스에 msg저장
		//단, 모든페이지가 꽉 차있을 경우 마지막페이지에 msg저장
		for(int i = 0; i < pages.length; i++) {
			if(pages[i] == null) {
				pages[i] = msg;
				return;
			}
		}
		pages[pages.length-1] = msg;
		
	
	} 
	//(int page)는 파라미터로 받아오는 역할하는 부분
	//5.전체읽기
	void fullRead() {
		for(int i = 0; i < 5; i++) {
			System.out.println(pages[i]);
		}
		
	}
	
	//6.전체삭제
	void deleteAll() {
		for(int i = 0; i < 5; i++) {
			pages[i] = null;
		}
	}
	
	

	int getChoice() {
		System.out.println("원하시는 기능을 선택해 주세요");
		System.out.println("0.종료");
		System.out.println("1.다이어리 읽기");
		System.out.println("2.다이어리 쓰기");
		System.out.println("3.다이어리 삭제");
		System.out.println("4.다이어리 수정");
		System.out.println("5.다이어리 전체읽기");
		System.out.println("6.다이어리 전체삭제");
		int choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}
	
	public static void main(String[] args) {
		Assignment1 diary = new Assignment1();
		diary.run();
	}
	
}
 





