package demo;
import static java.lang.Math.abs;
public class StaticTest 
{		static int s1=100;//static是共有的，存在方法区。
        int s=10;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Cat cat=null;
			for (int i = 0; i <5; i++)
			{
				cat=new Cat();
				new Dogy();
			}
			System.out.println(cat.counter);
			System.out.println(Dogy.counter);
			
			System.out.println(Math.abs(-100));
			System.out.println(abs(-200));
		}
	public static void testStatic(){
		s1=1000;
		//s=10;
		//this.s=100;
	}
	public void test(){
		s=200;
		s1=2000;
	}
	

}
class Cat
	{
		public int counter=0;
		public Cat(){
			counter++;
		}
	}
class Dogy{
	public static int counter=0;
	public  Dogy() {
		// TODO Auto-generated constructor stub
		counter++;
	}
	
}