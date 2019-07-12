package com.cy.yunsuanfuyubiaodashi;
/*
 * 运算符：对常量和变量进行操作的符号
 * 表达式：用运算符连接起来的符合java语法的式子。不同类型的运算符连接起来的式子是不同的表达式。
 * 		举例：定义两个int类型的变量a,b,
 * 			a + b
 * 
 * 运算符分类：
 * 		算术运算符，赋值运算符，关系运算符，逻辑运算符，三元运算符。
 * 
 * 算术运算符：
 * 		+，-，*，/的基本使用
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// 定义两个变量
		int a = 3;
		int b = 4;

		System.out.println("a + b =" + (a + b));
		System.out.println("a - b =" + (a - b));
		System.out.println("a * b =" + a * b);
		System.out.println("a / b =" + a / b);

		// 整数相除只能得到整数，要想得到小数，就必须有浮点数参与运算
		System.out.println(3 / 4.0);
		System.out.println(3.0 / 4);
	}
}
