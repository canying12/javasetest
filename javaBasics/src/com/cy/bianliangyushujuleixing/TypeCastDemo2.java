package com.cy.bianliangyushujuleixing;
/*
强制转换：
	目标类型 变量名 = (目标类型) (被转换的数据);
	不建议强制转换，因为会有精度的损失。
*/
public class TypeCastDemo2 {
	public static void main(String[] args) {
		int a = 3;
		byte b = 4;
		int c = a + b;
		//byte d = a + b;
		byte d = (byte) (a + b);
		System.out.println(d);
	}
}
