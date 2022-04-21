package com.javaex.practice04;

public class Ex08 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) { //lotto 배열에 난수 생성
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<=i; j++) { //중복이 있는지 검사
				while(lotto[i] == lotto[j]) {
					lotto[j] = (int)(Math.random()*45)+1; //중복시 난수 재생성
					break;
				}
			}
			
			System.out.print(lotto[i] + "\t"); //lotto 배열 출력
		}
		
	}
}
