package com.cy.yunsuanfuyubiaodashi;

import java.util.Scanner;

/*
 * 为了提高程序的灵活性，我们就把数据改进为键盘录入。
 * 如何实现键盘录入呢?目前我们只能使用JDK提供的类Scanner。
 * 这个使用的步骤，目前大家记住就可以了。
 * 
 * 使用步骤：
 * 		A:导包
 * 			import java.util.Scanner;
 * 			类中的顺序：package > import > class
 * 		B:创建对象
 * 			Scanner sc = new Scanner(System.in);
 * 		C:接收数据
 * 			int i = sc.nextInt();
 */
public class ScannerDemo {

	public static void main(String[] args) {
		// 创建键盘录入数据的对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();

		// 输出数据
		System.out.println("i =" + i);
	}

}
