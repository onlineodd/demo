package demo;

public class Rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		int c = 0;
		for(int i=3;i<=12;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		System.out.println("共有兔子"+(c)*2+"只");
	}

}
