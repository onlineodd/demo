package demo;

public class OuterClass 
{
	private String name;
	private Integer age;
	//�ڲ��࣬����������
	public class InnerClass
	{
		//�ڲ���Ĺ��췽��
		public InnerClass ()
		{//�ڲ������ʹ���ⲿ�������
			name="��ʥ����";
			age=20;
			
		}
		//�ڲ���ķ���
		
		public void display()
		{
			System.out.println("�����ǣ�"+name+"  ���䣺"+age);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//�ȳ�ʼ���ڲ���
		OuterClass outerClass=new OuterClass();
		//��ʵ���ڲ���
		OuterClass.InnerClass innerClass=outerClass.new InnerClass();
		innerClass.display();
	}
	

}
