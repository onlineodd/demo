package demo;

public class Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dog();
	}
	//先静态代码块
	//动态代码块
	//构造方法代码块

	public Dog() {//构造方法
		super();
		System.out.println("构造代码块");
		// TODO Auto-generated constructor stub
	}

	static {//静态代码
		System.out.println("静态代码块1");
	}
	static {
		System.out.println("静态代码块2");
	}
	static {
		System.out.println("静态代码块3");
	}
	{//动态代码
		System.out.println("实类代码4");
	}
	{
		System.out.println("实例代码块5");
	}
}
