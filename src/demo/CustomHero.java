package demo;

public class CustomHero 
{
   public int heroexp;
   public int grade;
public CustomHero(int heroexp) //����һ�������Ĺ��캯��
   {
	super();
	this.heroexp = heroexp;
	this.grade=0;//��ʼ���ȼ�
	int Exp=0;//��ʼ��
	if (heroexp>814420) {
		System.out.println("Ӣ�۾���ֵ������");
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
				Exp=0;//���þ���ֵ
				continue;
			}
			 
			}

	System.out.println("Ӣ�۵ȼ���"+grade+"Ӣ�۾���ֵ:"+heroexp);
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
