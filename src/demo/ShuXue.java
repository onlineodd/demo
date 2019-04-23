package demo;
public class ShuXue
{
	public  double Sx(int a,int b)//·½·¨
	{
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ShuXue shuXue=new ShuXue();
		System.out.println(shuXue.Sx(6, 8));		
	}

}
