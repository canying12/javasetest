package com.cy.yunsuanfuyubiaodashi;

import java.util.Scanner;

/**
 * 键盘录入两个数据，并对这两个数据求和，输出其结果 键盘录入： A:导包 B:创建对象 C:接收数据
 *
 */
public class ScannerTest {

	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();
		
		//两个数进行求和
		int sum = a + b;
		System.out.println("sum=" + sum);
		
		// 判断两个数是否相等
		boolean flag = (a == b) ? true : false;
		System.out.println("flag =" + flag);

		// 请三个数中的最大值
		int temp = (a > b) ? a : b;
		int max = (temp > c) ? temp : c;
		System.out.println("max =" + max);
	}

}
