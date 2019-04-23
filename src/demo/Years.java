package demo;

public class Years 
{//¼ÆËãÈòÄê

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count =0;
		for(int i=2000;i<=3000;i++)
		{
			if((i%4==0&&i%10!=0)||(i%400==0))
			{
				System.out.println(i);
				count++;
			}
		}
	}

}
