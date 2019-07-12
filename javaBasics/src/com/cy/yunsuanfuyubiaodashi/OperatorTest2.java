package com.cy.yunsuanfuyubiaodashi;
/*
 * 获取三个整数中的最大值
 */
public class OperatorTest2 {

	public static void main(String[] args) {
		// 定义三个int类型的变量
		int a = 10;
		int b = 20;
		int c = 30;

		int temp = (a > b) ? a : b;
		int max = (temp > c) ? temp : c;
		System.out.println("max=" + max);
	}

}
