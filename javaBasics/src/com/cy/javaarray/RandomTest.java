package com.cy.javaarray;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏案例
 *		系统产生一个1-100之间的随机数，请猜出这个数据是多少。
 * 分析：
 * 		A:系统产生一个随机数1-100之间的。
 * 			int number = r.nextInt(100) + 1;
 * 		B:键盘录入我们要猜的数据
 * 			用Scanner实现
 *		C:比较这两个数据(用if语句)
 *			大了：给出提示大了
 *			小了：给出提示小了
 *			猜中了：给出提示，恭喜你，猜中了
 *		D:多次猜数据，而我们不知道要猜多少次，怎么办呢?
 *			while(true) {循环的内容}
 */
public class RandomTest {

	public static void main(String[] args) {
		// 系统产生一个随机数1-100之间的。
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜的数字（1-100）：");
			int guessNumber = sc.nextInt();
			// 比较这两个数据(用if语句)
			if(guessNumber > number) {
				System.out.println("你猜的"+guessNumber+"大了");
			}else if (guessNumber < number) {
				System.out.println("你猜的"+guessNumber+"小了");
			}else {
				System.out.println("恭喜您，猜中了");
				break;
			}
		}
	}

}
