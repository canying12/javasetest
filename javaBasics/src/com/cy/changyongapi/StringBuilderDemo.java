package com.cy.changyongapi;
/*
 * StringBuilder:是一个可变的字符串。字符串缓冲区类。
 * 
 * String和StringBuilder的区别：
 * 		String的内容是固定的。
 * 		StringBuilder的内容是可变的。
 * 
 * 构造方法：
 * 		StringBuilder()
 * 
 * 成员方法：
 * 		public int capacity():返回当前容量
 * 		public int length():返回长度（字符数）
 * 
 * 		容量：理论值
 * 		长度：实际值
 */
/*
 * 添加功能
 *		public StringBuilder append(任意类型):添加数据，并返回自身对象
 * 反转功能
 *		public StringBuilder reverse()
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		//创建对象
		StringBuilder sb = new StringBuilder();
		System.out.println("sb:"+sb);
		System.out.println("sb.capacity():"+sb.capacity());
		System.out.println("sb.length():"+sb.length());
		
		//链式编程
		sb.append("hello").append("world").append(true).append(100);
		
		System.out.println("sb:"+sb);
		
		//public StringBuilder reverse()
		sb.reverse();
		System.out.println("sb:"+sb);
	}

}
