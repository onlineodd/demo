package demo;

public class People {
	private String name;
	private int age;
	private String sex;
	private int hight;
	private int heavy;
	
	public static void main(String [] args)
	{
		People people=new People("ндлн",19,"дп",170,60);	
		System.out.println(people.toString());
	}

	public People(String name, int age, String sex, int hight, int heavy) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hight = hight;
		this.heavy = heavy;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", sex=" + sex + ", hight=" + hight + ", heavy=" + heavy + "]";
	}
	
}

