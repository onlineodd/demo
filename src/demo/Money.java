package demo;

public class Money 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a,b,c;
		
		//a*x+b*y+c*z=100
		//a+b+c=100
		//x=100 y=0 z=0
		//a=2c b=2a b=4c
		int count=0;
		for(a=0;a<=100;a++)
		{
			for(b=0;b<50;b++)
			{
				for(c=0;c<100;c++)
				{
				if((a+b+c==100)&&(a*1+b*2+c*0.5==100))
						{
					count++;
					System.out.println("公鸡数："+a+" 母鸡数："+b+" 小鸡数："+c);
					System.out.println(count);
						}
				}
					
			}
		}
		
	}

}
