package demo;

public class LOLHero 
{
	private int heroexp;//����
	private int  herograde;//�ȼ�
	private int heroaggressivity;//������
	public int Beat()
	{
		LolMonster s=new LolMonster(3);
		int d= s.getMonsterlife();
		return d-heroaggressivity;
	}
	public LOLHero(int heroexp, int herograde, int heroaggressivity) {
		super();
		this.heroexp = heroexp;
		this.herograde = herograde;
		this.heroaggressivity = heroaggressivity;
	}
	public static void main(String []args)
	{
		LOLHero h=new LOLHero(4420, 5, 700);
		System.out.println(h.toString());
		System.out.println("Ӣ�ۻ�������ʣ�������ֵ="+h.Beat());
	}
	@Override
	public String toString() {
		return "LOLHero [heroexp=" + heroexp + ", herograde=" + herograde + ", heroaggressivity=" + heroaggressivity
				+ "]";
	}
}

