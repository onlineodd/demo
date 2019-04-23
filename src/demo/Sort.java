package demo;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) 
	{
		int[] a = { 13,41,51,6,67,9,54,7};
		
		Sort a1= new Sort();
		//a1.Bubble(a);
		//a1.insrt(a);
		//a1.ranking(a);
		a1.jindan(a);
		//a1.zd(a);
	}
	//冒泡排序
	public void Bubble(int a[])
	{
		int len =a.length;
		int temp;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
	}
	//插入排序
	public void insrt(int a[])
	{
		//后面往前排，保证前面的都比我小
		
		int len=a.length;
		int temp = 0;
		for (int i = 0; i <len; i++) {
			temp=a[i];
			int j=i;
			for (; j > 0&&a[j-1]>temp; j--) {
				a[j]=a[j-1];
				
			}
			a[j]=temp;

		}
		System.out.println(Arrays.toString(a));
	}
	//希尔排序
	public void ranking(int a[])
	{ 
		//在插入排序之前做一个预处理，小的数尽量往前
		int len=a.length;
		int d=len/2;
		int temp;
		for(int i=d;i>0;i=i/2)
		{
			for(int j=0;j+i<len;j++)
			{
				if(a[j]>a[j+i])
				{
					temp=a[j];
					a[j]=a[j+i];
					a[j+i]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		insrt(a);
	}
	//简单取小排序
	public void jindan(int a[])
	{
	int len=a.length;//设置长度
	
	for(int i=0;i<len;i++)//外层循环
	{
		int min=i;//设置最小值的位置
		int temp;
		for(int j=i;j<len;j++)//内层循环
		{
			if(a[j]<a[min])//找到最小的数
			{
				min=j;//将最小的数索引保存（地址）
			}
			
		}//进行位置交换
		temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
	System.out.print(Arrays.toString(a));
		
	}

	//找最小值
	public void zd(int a[])
	{
		int len=a.length;
		int min=a[0];
		for (int i = 0; i < len; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

	}


