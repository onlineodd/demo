package demo;

public class Sjx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int j;
		for(int i=0;i<5;i++)//i������
		{
			for(j=5-i;j>=0;j--)//j���ƿո���
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-j;k++)//k����ͼ�εĸ���
			{
			System.out.print("*");
			}
			System.out.println("");
		}
	}

}
