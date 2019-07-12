package com.cy.yunsuanfuyubiaodashi;
/*
 * 赋值运算符：
 * 		A:基本	=
 * 		B:扩展	+=,-=,*=,...
 * 
 * +=:
 * 		a+=20;
 * 		相当于
 * 		a = (a的数据类型)(a + 20);
 */
public class OperatorDemo5 {

	public static void main(String[] args) {
		// 把10赋值给int类型的变量a
		int a = 10;

		// += 把左边和右边的数据进行运算，最后赋值给左边。左边的只能是变量
		a += 10;// 相当于a = a + 10
		System.out.println("a:" + a);
		System.out.println("----------------------");

		short s = 10;
		// s += 20; // 相当于 s = s + 20;
		s = (short) (s + 20);
		System.out.println("s:" + s);
	}

}
