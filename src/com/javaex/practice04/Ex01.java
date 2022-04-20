package com.javaex.practice04;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		/* 오류발생! int[5]로 설정되면 0부터 4까지 5개의 방이 생기고 6번째 방은 생기지않음
		 * intArray[5]가 존재하지 않기 때문에 출력 오류가 생긴다
		for(int i = 0; i <= intArray.length; i++) {
			result = result + intArray[i];
		}
		*/
		
		for(int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		
		System.out.println(result);
	}
}