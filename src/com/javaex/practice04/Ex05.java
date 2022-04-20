package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] nums = new double[5]; //숫자 배열
		double sum = 0; //합계 변수
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextDouble(); //배열에 숫자 입력
		}
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i]; //배열에 입력된 숫자의 합계를 구함
		}
		
		System.out.println("평균은 " + sum/nums.length + " 입니다.");
		
		sc.close();
	}
}
