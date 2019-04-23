package demo;

public class LambdaIntroduceDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Thread(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
			System.out.println("I'm here!!!");	
			}
		}).start();
		new Thread(()->System.out.println("I'm here!!!")).start();
		new Thread(()->
		{
			System.out.println("Here");
			System.out.println("Here2");
			
		}).start();
	}

}
