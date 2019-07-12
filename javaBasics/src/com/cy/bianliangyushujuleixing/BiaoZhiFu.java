package com.cy.bianliangyushujuleixing;
/*
标识符：就是给包,类,方法,变量起名字的符号。
组成规则：
	A:unicode字符
		数字字符,英文大小写,汉字(不建议使用汉字)
	B:下划线_
	C:美元符$
注意事项
	A:不能以数字开头
	B:不能是java中的关键字
常见命名规则：
	A:基本要求
		见名知意
	B:常见的命名
		a:包(其实就是文件夹,用于对类进行管理)
			全部小写,多级包用.隔开
			举例：com，com.cy
		b:类
			一个单词首字母大写
				举例：Student,Car
			多个单词每个单词的首字母大写
				举例：HelloWorld
		c:方法和变量
			一个单词首字母小写
				举例：age,show()
			多个单词从第二个单词开始每个单词的首字母大写
				举例：maxAge,getAge()
*/
public class BiaoZhiFu {
	public static void main(String[] args) {
		// 定义变量
		// 数据类型 变量名 = 初始化值;
		int a = 10;

		// 正确
		int b2 = 20;
		// 错误
		// int 2b = 30;

		// 不能是java中的关键字
		// 错误
		// int public = 40;
	}
}
