package demo;

public class Leef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Leef().increase().increase().increase().increase().increase().print();
	}

	private int i;

	Leef increase() {
		i++;
		return this;
	}

	public void print() {
		System.out.println(i);
	}
}
