package demo;

import java.util.Random;

public class Arry 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] s=new String[4];
		s[0]="黑桃";
		s[1]="红桃";
		s[2]="梅花";
		s[3]="方块";
		String [] h=new String[13];
		h[0]="A";
		h[1]="2";
		h[2]="3";
		h[3]="4";
		h[4]="5";
		h[5]="6";
		h[6]="7";
		h[7]="8";
		h[8]="9";
		h[9]="10";
		h[10]="J";
		h[11]="Q";
		h[12]="K";
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<h.length;j++)
			{
				System.out.print(s[i]+h[j]);
			}
			System.out.println("");
		}
		System.out.println("*************随机生成4张牌**************");
		Random ran=new Random();//生成随机数
		for(int m=0;m<s.length;m++)
		{
			System.out.println(s[m]+""+h[ran.nextInt(13)]);
		}
	}

}
