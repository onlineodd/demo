package demo;

public class DowhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=8;
		do {
			y-=x;
			x++;
		} while (y--<0);
		System.out.println(y);
	}

}
