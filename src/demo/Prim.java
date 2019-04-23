package demo;

public class Prim 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count=0;
	      for(int i=2;i<201;i++) 
	      {
            
	           int sum=0;
	         
	           for(int j =2;j<i;j++)
	           {
	              if(i%j==0)
	              {
	                  sum = 1;
	                  break;
	              }
	           } 
	           
	           if(sum==0)
	           {
	        	   count++;
	            System.out.println(i);
	           }
	            
	      }
	     System.out.println("共有"+count+"个素数");
	}
	 
}

