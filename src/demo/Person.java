package demo;

public class Person {
	String name;
	Integer age;
	public Person(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	String sex;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public static void main(String []args)
	{
		//û��ʹ�ù���
//		Person tp=new Person();
//		tp.name="������";
//		tp.age=40;
//		tp.sex="��";
		//ʹ���˹��췽��
		Person tp=new Person("������", 39, "��");
		System.out.println(tp.toString());
	}
}
