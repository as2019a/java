package som.inc.loop;

public class ForEx3 {

	public static void main(String[] args) {
			for(int j = 0; j < 5; j++) {
				for(int i = 0; i < 5; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("--------------------------");
			//실습 : 10 X 8 별찍기
			for(int j = 0; j < 8; j++) {
				for(int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("---------------------------");
			//*
			//**
			//***
			//****
			//*****
			
			for(int i = 0; i < 5; i++) {
		  	for(int j= 0; j <= i; j++) {
		  		System.out.printf("*");
		  	}
		  	System.out.println();
		  }
		  System.out.println("---------------------------");
		  
		  //*****
		  //****
		  //***
		  //**
		  //*
		  
		  for(int i = 0; i < 5; i++) {
		  	for(int j= 0; j < 5-i; j++) {
		  		System.out.printf("*");
		  	}
		  	System.out.println();
		  } 
			
	}


}

