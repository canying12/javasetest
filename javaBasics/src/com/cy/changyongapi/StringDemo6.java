package com.cy.changyongapi;
/*
 * 去除字符串两端空格	
 *		String trim()
 * 按照指定符号分割字符串	
 *		String[] split(String str)
 */
public class StringDemo6 {

	public static void main(String[] args) {
		//创建字符串对象
		String s1 = "helloworld";
		String s2 = "  helloworld  ";
		String s3 = "  hello  world  ";
		System.out.println("---"+s1+"---");
		System.out.println("---"+s1.trim()+"---");
		System.out.println("---"+s2+"---");
		System.out.println("---"+s2.trim()+"---");
		System.out.println("---"+s3+"---");
		System.out.println("---"+s3.trim()+"---");
		System.out.println("-------------------");
		
		//String[] split(String str)
		//创建字符串对象
		String s4 = "aa,bb,cc";
		String[] strArray = s4.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

}
