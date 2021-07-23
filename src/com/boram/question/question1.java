package com.boram.question;

import java.util.Random;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		/*
		 * 
		 * 랜덤한 어느 수 하나와 자신이 정한 수 중에서 더 큰 수는?
		 * 
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int ran1 = (int)(Math.random()*20) + 1;
		
		System.out.println("값을 입력하세요 : ");
		int num1 = sc.nextInt();
		String result1 = (ran1 > num1)? "임의의 값이 더 크다" : (ran1 == num1)? "정답입니다." : "입력값이 더 크다";
		System.out.println(result1);

		
		System.out.println("값을 입력하세요 : ");
		int num2 = sc.nextInt();
		String result2 = (ran1 > num2)? "임의의 값이 더 크다" : (ran1 == num2)? "정답입니다." : "지정한 값이 더 크다";
		System.out.println(result2);

		
		System.out.println("값을 입력하세요 : ");
		int num3 = sc.nextInt();
		String result3 = (ran1 > num3)? "임의의 값이 더 크다" : (ran1 == num3)? "정답입니다." : "지정한 값이 더 크다";
		System.out.println(result3);

		System.out.println("답은 " + ran1 + "입니다.");
		
		
		
		/*
		 * 지정한 값을 입력하세요 : 10 
		 * 임의의 값이 더 크다 
		 * 지정한 값을 입력하세요 : 15 
		 * 지정한 값이 더 크다 
		 * 지정한 값을 입력하세요 : 13
		 * 정답입니다. 
		 * 임의의 값은 13입니다.
		 */
		
		
	}

}
