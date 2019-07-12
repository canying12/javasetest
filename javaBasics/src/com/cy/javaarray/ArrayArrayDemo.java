package com.cy.javaarray;
/*
 * 二维数组：就是元素为一维数组的数组。
 * 
 * 定义格式：
 * 		A:数据类型[][] 数组名;
 * 		B:数据类型 数组名[][];	不推荐
 * 		C:数据类型[] 数组名[];	不推荐
 * 
 * 如何初始化呢?
 * 		A:动态初始化
 * 			数据类型[][] 数组名 = new 数据类型[m][n];
 * 			m表示这个二维数组有多少个一维数组
 * 			n表示每一个一维数组的元素有多少个
 * 		B:静态初始化
 * 	      数据类型[][] 数组名 = new 数据类型[][]{{元素...},{元素...},{元素...},...};
 * 			简化格式：
 * 			数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
 */
public class ArrayArrayDemo {

	public static void main(String[] args) {
		// 数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(arr); // [[I@104c575
		System.out.println(arr.length); // 二维数组中的一维数组的个数
		System.out.println(arr[0]);// [I@3fa5ac
		System.out.println(arr[0].length);
		System.out.println(arr[1]);// [I@95cfbe
		System.out.println(arr[2]);// [I@179dce4

		// 我如何获取到一个二维数组的元素呢?
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);

	}

}
