package demo;


import java.util.Arrays;

public class Maopao 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []a={32,43,23,13,5,7};
		int temp=0,j = 0;
		for(int i=0;i<a.length-1;i++){
			for( j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
						
				}
				
			}
			
			
			
		}
		System.out.println(Arrays.toString(a));
		
	}

}
