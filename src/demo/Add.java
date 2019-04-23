package demo;

public class Add
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Add s=new Add();
		
		System.out.println(s.add(4, 5,99));
		System.out.println(s.reseat(4, 5,99));
	}
	public int  add(int a,int b, int...is )
	{
		int sum=0;
		for(int i:is)
		{
			
			sum+=i;
		}
		sum+=a+b;
		return sum;
	}
	public int reseat(int...ad){
		int sum=0;
		for(int h:ad)
		{
			sum-=h;
		}
	
		return sum;
	}
	

}
