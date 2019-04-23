package demo;

public class CustomHero1 
{
		public int heroexp;
		public int grade;
		
	public CustomHero1() {
			super();
			this.heroexp=0;
			// TODO Auto-generated constructor stub
		}
	
	public CustomHero1(int grade) {
		super();
		this.grade = grade;//通过等级计算经验值
		if(grade>30){
			System.out.println("英雄等级经验值已满！");	
		}
		if (grade<=30) {
			heroexp+=((30*(Math.pow(grade, 3)+5*grade))-80);
		System.out.println("英雄等级="+grade+"  经验值="+heroexp);
		}
		
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CustomHero1	n=new CustomHero1(25);
		CustomHero1	n1=new CustomHero1(30);
		CustomHero1	n2=new CustomHero1(10);		
		CustomHero1	n3=new CustomHero1(19);
		CustomHero1	n4=new CustomHero1(11);
		CustomHero1	n5=new CustomHero1(50);
	}

}
