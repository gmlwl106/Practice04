package com.javaex.practice04;

public class Ex06 {
	public static void main(String[] args) {
		
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		
		for(int i=0; i<c.length; i++) { //c배열 출력
			System.out.print(c[i]);
		}
		System.out.println();
		
		for(int i=0; i<c.length; i++) { //c배열 출력
			if(c[i] == ' ') { //c배열 안의 공백을 검사해서 콤마로 변경
				c[i] = ',';
			}
			System.out.print(c[i]);
		}
	}
}
