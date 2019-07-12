package com.cy.bianliangyushujuleixing;
/*	
变量定义注意事项：
	1:变量未赋值,不能直接使用
	2:变量只在它所属的范围内有效
		变量属于它所在的那对大括号
	3:一行上可以定义多个变量,但是不建议
*/
public class VariableDemo2 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		System.out.println(a);

		int b;
		b = 20; // 变量在使用前赋值都是可以的
		System.out.println(b);

		{
			int c = 100;
			System.out.println(c);
		}
		//System.out.println(c);

		/*
		 * int aa,bb,cc; aa = 10; bb = 20; cc = 30;
		 */

		/*
		 * int aa = 10; int bb = 20; int cc = 30;
		 */

		int aa = 10, bb = 20, cc = 30;
	}
}
