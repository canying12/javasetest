package com.cy.changyongapi;

import java.util.Scanner;

/*
 * 字符串反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 * 
 * 分析：
 * 		A:键盘录入一个字符串
 * 		B:写方法实现字符串的反转
 * 			a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
 * 			b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
 * 		C:调用方法
 * 		D:输出结果
 */
public class StringTest6 {

	public static void main(String[] args) {
		// 键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		// 写方法实现字符串的反转
		// 调用方法
		String result = reverse(s);
		System.out.println("result:" + result);
	}
	/*
	 * 把字符串倒着遍历，得到的每一个字符拼接成字符串。
	 * 
	 * 两个明确：
	 * 		返回值类型：String
	 * 		参数列表：String s
	 */
	
	/*
	public static String reverse(String s) {
		String ss = "";
		
		for(int x=s.length()-1; x>=0; x--) {
			ss += s.charAt(x);
		}
		
		return ss;
	}
	*/
	// 把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
	private static String reverse(String s) {
		// 把字符串转换为字符数组
		char[] ch = s.toCharArray();

		for (int start = 0, end = ch.length - 1; start <= end; start++, end--) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
		}
		String ss = new String(ch);
		return ss;
	}

}
