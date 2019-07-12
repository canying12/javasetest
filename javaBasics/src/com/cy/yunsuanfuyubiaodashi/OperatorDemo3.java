package com.cy.yunsuanfuyubiaodashi;

/*
 * 整数的加法。
 * 字符参与加法操作。拿字符在计算机中底层存储对应的数据值来参与运算的。
 * 		'0'		48
 * 		'a'		97
 * 		'A'		65
 * 字符串参与加法操作。
 * 		这里的+其实不是加法，而是字符串连接符。
 */
public class OperatorDemo3 {

	public static void main(String[] args) {
		// 整数加法
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println("------------------");

		// 字符参与加法操作
		char c = '0';
		char c2 = 'a';
		System.out.println(a + c);
		System.out.println(a + c2);
		System.out.println("------------------");

		// 字符串参与加法操作
		System.out.println("hello" + a);
		System.out.println("hello" + a + b); // "hello"+10,然后再和b进行拼接
		System.out.println(a + b + "hello");

	}

}
