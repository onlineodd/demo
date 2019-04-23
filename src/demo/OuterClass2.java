package demo;

public class OuterClass2 
{
	private String name;
	private int age;
	private static String sex="男";
	
	//静态内部类
	static class InnerClass
	{
		
		public static String staticName="Peter";
	
		public void display()
		{
			//不能够调用非静态的属性方法
			System.out.println("staticName"+staticName+",OuterClass sex:"+sex);
		}
	}
	
	public void display()
	{
		System.out.println(InnerClass.staticName);
		//new OuterClass2().InnerClass().display();
	}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OuterClass2 outerClass2=new OuterClass2();
		outerClass2.display();
	}

}
