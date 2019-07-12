package com.cy.javaarray;
/*
 * 需求：定义两个数组，分别输出数组名及元素。然后分别给数组中的元素赋值，分别再次输出数组名及元素。
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		// 定义两个数组
		int[] arr = new int[2];
		int[] arr2 = new int[3];

		// 分别输出数组名及元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		// 然后分别给数组中的元素赋值
		arr[1] = 100;

		arr2[0] = 200;
		arr2[2] = 300;

		// 再次输出数组名及元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

	}

}
