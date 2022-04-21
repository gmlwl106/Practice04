package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액: ");
		int money = sc.nextInt();
		
		for(int i=0; i<wonArray.length; i++) {
			if(money >= wonArray[i]) { //입력된 금액이 wonArray[i]보다 큰지 검사
				System.out.println(wonArray[i] + "원:" + money/wonArray[i] + "개"); //갯수 출력
				money = money % wonArray[i]; //wonArray[i]로 나눈 나머지를 money 변수에 입력
			} else {
				System.out.println(wonArray[i] + "원:0개"); //wonArray[i]보다 작으면 0개로 출력
			}
		}
		
		sc.close();
	}
}
