package demo;

public class Perfect
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum=0; 
		for(int i=0;i<=100;i++)//遍历100以内的所有数
		{
			if(i==1) continue;	//1不是完数 
			sum=1;
			for(int x=2;x<i;x++)
			{
				if(i%x==0)
				{
					sum+=x;
				}
				
			}
			if(sum==i)//判断是否为完数
				{
					System.out.println(i);
				}
		}
	}

}
