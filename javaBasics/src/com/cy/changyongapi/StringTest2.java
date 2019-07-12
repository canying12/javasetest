package com.cy.changyongapi;
/*
 * 遍历字符串(获取字符串中的每一个字符)
 */
public class StringTest2 {

	public static void main(String[] args) {
		// 创建一个字符串对象
		String s = "abcde";

		// 原始做法
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println("========");

		// 用for循环改进
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

}
