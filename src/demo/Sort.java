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
	//ð������
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
	//��������
	public void insrt(int a[])
	{
		//������ǰ�ţ���֤ǰ��Ķ�����С
		
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
	//ϣ������
	public void ranking(int a[])
	{ 
		//�ڲ�������֮ǰ��һ��Ԥ����С����������ǰ
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
	//��ȡС����
	public void jindan(int a[])
	{
	int len=a.length;//���ó���
	
	for(int i=0;i<len;i++)//���ѭ��
	{
		int min=i;//������Сֵ��λ��
		int temp;
		for(int j=i;j<len;j++)//�ڲ�ѭ��
		{
			if(a[j]<a[min])//�ҵ���С����
			{
				min=j;//����С�����������棨��ַ��
			}
			
		}//����λ�ý���
		temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
	System.out.print(Arrays.toString(a));
		
	}

	//����Сֵ
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


