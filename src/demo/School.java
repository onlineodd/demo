package demo;

public class School {
	public String name;//校名
	public int history;//校历
	public String colloeg;//学院
	public String professional;//专业
	public int teacher;//老师
	public int students;//学生

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school=new School();
		school.name="浙江水利水电学院";
		school.history=100;
		school.colloeg="信息工程与艺术设计学院";
		school.professional="软件工程";
		school.teacher=180;
		school.students=3000;
		System.out.println(school.toString());

	}

	@Override
	public String toString() {
		return "School [name=" + name + ", history=" + history + ", colloeg=" + colloeg + ", professional="
				+ professional + ", teacher=" + teacher + ", students=" + students + "]";
	}

}
