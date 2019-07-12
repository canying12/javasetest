package com.cy.javaarray;
/*
 * 数组：存储同一种数据类型的多个元素的容器。
 * 
 * 定义格式：
 * 		A:数据类型[] 数组名;
 * 		B:数据类型 数组名[];
 * 举例：
 * 		A:int[] a; 定义一个int类型的数组，数组名是a
 * 		B:int a[]; 定义一个int类型的变量，变量名是a数组
 * 
 * 数组初始化：
 * 		A:所谓初始化，就是为数组开辟内存空间，并为数组中的每个元素赋予初始值
 * 		B:我们有两种方式对数组进行初始化
 * 			a:动态初始化	只指定长度，由系统给出初始化值
 * 			b:静态初始化	给出初始化值，由系统决定长度
 * 
 * 动态初始化：
 * 		数据类型[] 数组名 = new 数据类型[数组长度];
 */
public class ArrayDemo {

	public static void main(String[] args) {
		//数据类型[] 数组名 = new 数据类型[数组长度];
		int[] arr = new int[3];
		/*
		 * 左边：
		 * 		int:说明数组中的元素的数据类型是int类型
		 * 		[]:说明这是一个数组
		 * 		arr:是数组的名称
		 * 右边：
		 * 		new:为数组分配内存空间
		 * 		int:说明数组中的元素的数据类型是int类型
		 * 		[]:说明这是一个数组
		 * 		3:数组的长度，其实就是数组中的元素个数
		 */

	}

}