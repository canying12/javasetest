package com.cy.yunsuanfuyubiaodashi;

/**
 * ++,--运算符：对变量做加1或者减1的操作。 ++或者--既可以放在变量的后面，也可以放在变量的前面。
 * 单独使用的时候，++或者--无论是放在变量的前面还是后面，结果是一样的。 
 * 	参与操作的时候：
 * 		如果++或者--在变量的后面，先拿变量参与操作，后变量做++或者-- 
 * 		如果++或者--在变量的前面，先变量做++或者--，后拿变量参与操作
 *
 */
public class OperatorDemo4 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a:" + a);

		// 单独使用
		 a++;
		 ++a;
		 System.out.println("a:" + a);

		// 参与操作使用
		// int b = a++;
		int b = ++a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);

	}

}
