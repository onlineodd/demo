package demo;

public class Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dog();
	}
	//�Ⱦ�̬�����
	//��̬�����
	//���췽�������

	public Dog() {//���췽��
		super();
		System.out.println("��������");
		// TODO Auto-generated constructor stub
	}

	static {//��̬����
		System.out.println("��̬�����1");
	}
	static {
		System.out.println("��̬�����2");
	}
	static {
		System.out.println("��̬�����3");
	}
	{//��̬����
		System.out.println("ʵ�����4");
	}
	{
		System.out.println("ʵ�������5");
	}
}
