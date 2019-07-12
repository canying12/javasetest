package com.cy.bianliangyushujuleixing;

/*+:是一个运算符，做加法运算的。
	我们在做运算的时候，一般要求参与运算的数据类型必须一致。
	类型转换：
		隐式转换
		强制转换
	
		隐式转换	
		byte,short,char -- int -- long -- float -- double*/
public class TypeCastDemo {
	public static void main(String[] args) {
		// 直接输出了运算的结果
		System.out.println(3 + 4);

		// 定义两个int类型的变量
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);

		// 定义一个byte类型,定义一个int类型
		byte bb = 2;
		int cc = 5;
		System.out.println(bb + cc);

		// 我能不能不直接输出，用一个变量接受呢?
		// 用变量接受，这个变量应该有类型
		// 可能损失精度
		// byte dd = bb + cc;
		int dd = bb + cc;
		System.out.println(dd);
	}
}
