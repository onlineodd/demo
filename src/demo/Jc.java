package demo;

public class Jc 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Jc jc=new Jc();
		int x=jc.jcr(10);
		System.out.println(x);
	} 
	//µÝ¹éµ÷ÓÃ
	public int jcr(int n)
	{
		if(n==1||n==0)
		{
		return 1;
		}else
			return n*jcr(n-1);
	}
}
