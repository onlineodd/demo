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
			String a=String.valueOf(i);//ת�����ַ���
			int len=a.length();//��ȡ�ַ�������
			int result=0;
			for(int j=0;j<len;j++)
			{//����λ����ÿһλ��ȡ����
				int fn=Integer.parseInt(a.charAt(j)+""); //ȡ������λ��
				result+=Math.pow(fn,len);
			}
			if(result==i){
				System.out.println(i);
	
			}
		}
	}
	
}
