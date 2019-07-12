package com.cy.yunsuanfuyubiaodashi;
/*
 * 关系运算符：
 * 		==,!=,>,>=,<,<=
 * 		关系运算符的结果是boolean类型。
 * 
 * 注意：
 * 		千万不要把==写成=
 */
public class OperatorDemo6 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-----------------");
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("-----------------");
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("-----------------");
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-----------------");

		int x = 3;
		int y = 4;
		// System.out.println(x == y);
		// System.out.println(x = y);// 把y赋值给x，把x的值输出
		boolean bb = (x == y);
		// 报错
		// boolean cc = (x = y);
		int cc = (x = y);
		
		/*
		 * 逻辑运算符：用于连接关系表达式。
		 * &,|,^,!
		 * &&,||
		 * 
		 * 与：&	有false则false
		 * 或：|	有true则true
		 * 异或：^ 相同则false,不同则true。(男女朋友)
		 * 非：!	true则false,false则true
		 */
		System.out.println((a > b) & (a > c));// false & false
		System.out.println((a < b) & (a > c)); // true & false
		System.out.println((a > b) & (a < c)); // false & true
		System.out.println((a < b) & (a < c)); // true & true
		System.out.println("---------------");
		System.out.println((a > b) | (a > c));// false | false
		System.out.println((a < b) | (a > c)); // true | false
		System.out.println((a > b) | (a < c)); // false | true
		System.out.println((a < b) | (a < c)); // true | true
		System.out.println("---------------");
		System.out.println((a > b) ^ (a > c));// false ^ false
		System.out.println((a < b) ^ (a > c)); // true ^ false
		System.out.println((a > b) ^ (a < c)); // false ^ true
		System.out.println((a < b) ^ (a < c)); // true ^ true
		System.out.println("---------------");
		System.out.println((a > b)); // false
		System.out.println(!(a > b)); // !false
		System.out.println(!!(a > b)); // !!false
		
		/*
		 * &&和&的结果一样
		 * ||和|的结果一样
		 * 
		 * &&和&的区别：
		 * 		&&如果左边是false，右边不执行。
		 * 		&无论左边是true还是false，右边都会执行。
		 */
		System.out.println((a > b) && (a > c));// false && false
		System.out.println((a < b) && (a > c)); // true && false
		System.out.println((a > b) && (a < c)); // false && true
		System.out.println((a < b) && (a < c)); // true && true
		System.out.println("---------------");
		System.out.println((a > b) || (a > c));// false || false
		System.out.println((a < b) || (a > c)); // true || false
		System.out.println((a > b) || (a < c)); // false || true
		System.out.println((a < b) || (a < c)); // true || true
		System.out.println("---------------");


		// System.out.println((x++ > 4) & (y++ > 5)); // false & false
		System.out.println((x++ > 4) && (y++ > 5)); // false && false
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}

}
