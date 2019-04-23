package demo;

public class OuterClass 
{
	private String name;
	private Integer age;
	//内部类，定义在类中
	public class InnerClass
	{
		//内部类的构造方法
		public InnerClass ()
		{//内部类可以使用外部类的属性
			name="盗圣温涛";
			age=20;
			
		}
		//内部类的方法
		
		public void display()
		{
			System.out.println("名字是："+name+"  年龄："+age);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//先初始化内部类
		OuterClass outerClass=new OuterClass();
		//再实例内部类
		OuterClass.InnerClass innerClass=outerClass.new InnerClass();
		innerClass.display();
	}
	

}
