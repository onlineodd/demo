package demo;

public class OuterClass2 
{
	private String name;
	private int age;
	private static String sex="��";
	
	//��̬�ڲ���
	static class InnerClass
	{
		
		public static String staticName="Peter";
	
		public void display()
		{
			//���ܹ����÷Ǿ�̬�����Է���
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
