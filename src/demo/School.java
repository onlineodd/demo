package demo;

public class School {
	public String name;//У��
	public int history;//У��
	public String colloeg;//ѧԺ
	public String professional;//רҵ
	public int teacher;//��ʦ
	public int students;//ѧ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school=new School();
		school.name="�㽭ˮ��ˮ��ѧԺ";
		school.history=100;
		school.colloeg="��Ϣ�������������ѧԺ";
		school.professional="�������";
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
