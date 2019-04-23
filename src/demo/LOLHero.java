package demo;

public class LOLHero 
{
	private int heroexp;//经验
	private int  herograde;//等级
	private int heroaggressivity;//攻击力
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
		System.out.println("英雄击打后怪物剩余的生命值="+h.Beat());
	}
	@Override
	public String toString() {
		return "LOLHero [heroexp=" + heroexp + ", herograde=" + herograde + ", heroaggressivity=" + heroaggressivity
				+ "]";
	}
}

