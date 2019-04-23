package demo;

public class Narcissistic
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		int a,b,c;
//		for(int i=100;i<=500;i++)
//		{
//		a=i/100;
//		b=i%100/10;
//		c=i%10;
//		if(a*a*a+b*b*b+c*c*c==i)
//		{
//			System.out.println(i);
//		}
//		}
		for(int i=150;i<1500000;i++)
		{
			String a=String.valueOf(i);//转换成字符串
			int len=a.length();//获取字符串长度
			int result=0;
			for(int j=0;j<len;j++)
			{//根据位数把每一位提取出来
				int fn=Integer.parseInt(a.charAt(j)+""); //取出单个位数
				result+=Math.pow(fn,len);
			}
			if(result==i){
				System.out.println(i);
	
			}
		}
	}
	
}
