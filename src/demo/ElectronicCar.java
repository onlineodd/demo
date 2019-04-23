package demo;

public class ElectronicCar {
int ePower;
public void add(int power)
{
	ePower+=power;
}
public void reduce(int power)
{
	ePower-=power;
}
public void Show()
{
	System.out.println(ePower);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicCar el=new ElectronicCar();
		el.add(500);
		el.reduce(30);
		System.out.println(el.ePower);
	}

}
