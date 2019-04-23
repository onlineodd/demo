package demo;

public class Cpu 
{
	private String  p;
	private String Cname;
	private String t;
	
	


	public Cpu(String p, String cname, String t) {
		super();
		this.p = p;
		Cname = cname;
		this.t = t;
		
		
	}
	@Override
	public String toString() {
		return "Cpu [p=" + p + ", Cnamme=" + Cname + ", t=" + t + "]";
		
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public String getCname() {
		return Cname;
	}



	public void setCname(String cname) {
		Cname = cname;
	}



	public String getT() {
		return t;
	}



	public void setT(String t) {
		this.t = t;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpu cpu=new Cpu("1.5GHz-1.8GHz ", "i7 ", "CPU Clock Speed");
		System.out.println(cpu.toString());
		
	}

}
