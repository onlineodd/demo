package demo;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+D整行删除
		Scanner a = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String s = a.nextLine();
		System.out.println("姓名：" + s);
	}

}
