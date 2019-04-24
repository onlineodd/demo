package demo;

public class CustomHero 
{
   public int heroexp;
   public int grade;
public CustomHero(int heroexp) //含有一个参数的构造函数
   {
	super();
	this.heroexp = heroexp;
	this.grade=0;//初始化等级
	int Exp=0;//初始化
	if (heroexp>814420) {
		System.out.println("英雄经验值已满！");
	}else {
	for (int i=1; i<=30; i++) {
			Exp+= (30*(Math.pow(i,3)+5*i)-80);
			 if(Exp>=heroexp){
			 if(Exp>heroexp)
			{
					grade=i-1;
					break;
			}
			else {
					grade=i;
					break;	
					}
			}else {
				Exp=0;//重置经验值
				continue;
			}
			 
			}

	System.out.println("英雄等级："+grade+"英雄经验值:"+heroexp);
		}
			
		
	}
		
	public static void main(String []args)
	{
		CustomHero  n = new CustomHero ();
		CustomHero  n1 = new CustomHero (820000);
		CustomHero  n2 = new CustomHero (472420);
		CustomHero  n3 = new CustomHero (500);
		CustomHero  n4 = new CustomHero (49219);
		CustomHero  n5 = new CustomHero (814410);
		
	}
	public CustomHero() {
		super();
		this.heroexp=0;
		// TODO Auto-generated constructor stub
	}
	
	
}
