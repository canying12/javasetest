package com.cy.yunsuanfuyubiaodashi;
/*
 * 三元运算符：
 * 
 * 格式：
 * 		(关系表达式)?表达式1:表达式2;
 * 执行流程:
 * 		A:计算关系表达式的值，看是true还是false
 * 		B:如果是true,表达式1就是运算结果
 * 		      如果是false,表达式2就是运算结果
 */
public class OperatorDemo7 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int c = (a > b) ? a : b;
		System.out.println("c:" + c);
	}

}
