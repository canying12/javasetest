package com.cy.javaarray;
/*
 * 静态初始化的格式：
 * 		数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};
 * 
 * 		简化格式：
 * 			数据类型[] 数组名 = {元素1,元素2,...};
 * 
 * 		举例：
 * 			int[] arr = new int[]{1,2,3};
 * 
 * 		简化后：
 * 			int[] arr = {1,2,3};
 */
public class ArrayDemo2 {

	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 1, 2, 3 };

		// 输出数组名和元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}