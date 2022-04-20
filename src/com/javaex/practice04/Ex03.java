package com.javaex.practice04;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
	}
}
/* 결과
20
6
10

intA의 주소가 intB에 복사가 되었기 때문에 같은 배열을 공유하고 있어서 intB의 값을 변경하면 intA도 변경된 값으로 출력된다.
*/