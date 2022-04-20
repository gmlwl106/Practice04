package com.javaex.practice04;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int count=0; //3의배수의 개수 변수
		int sum=0; //3의배수의 합 변수
		
		for(int i=0; i<data.length; i++) { //배열 검사
			
			if(data[i] % 3 == 0) { //3의 배수 검사
				sum += data[i];
				count++;
			}
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
	}
}
