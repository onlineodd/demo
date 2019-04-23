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
		//没有使用构造
//		Person tp=new Person();
//		tp.name="特朗普";
//		tp.age=40;
//		tp.sex="男";
		//使用了构造方法
		Person tp=new Person("特朗普", 39, "男");
		System.out.println(tp.toString());
	}
}
