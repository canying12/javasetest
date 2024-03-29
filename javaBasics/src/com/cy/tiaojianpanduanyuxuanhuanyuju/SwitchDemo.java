package com.cy.tiaojianpanduanyuxuanhuanyuju;

import java.util.Scanner;

/*
 * switch语句格式：
 * switch(表达式) {
 * 		case 值1:
 * 			语句体1;
 * 			break;
 * 		case 值2:
 * 			语句体2;
 * 			break;
 * 		...
 * 		default:
 * 			语句体n+1;
 * 			break;
 * }
 * 格式解释：
 * 		表达式:byte,short,int,char
 * 			JDK5以后可以是枚举
 * 			JDK7以后可以是字符串
 * 		case:就是要和表达式进行比较的值
 * 		break:表示中断,结束的意思。
 * 		default:表示所有的情况都不匹配的时候，就执行语句体n+1。和if语句的else相似。
 * 执行流程：
 * 		A:计算出表达式的值
 * 		B:拿计算出来的值和case后面的值依次比较，一旦有对应的值，就执行该处的语句，在执行过程中，遇到 break，就结束。
 * 		C:如果所有的case都不匹配，就会执行default控制的语句，然后结束。
 * 需求：
 * 		根据键盘录入的数值1，2，3，…7输出对应的星期一，星期二，星期三…星期日。
 */
public class SwitchDemo {

	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入一个数字(1-7)：");
		int weekday = sc.nextInt();

		// switch语句实现选择
		switch (weekday) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("你输入的数字有误");
			break;
		}

	}

}
