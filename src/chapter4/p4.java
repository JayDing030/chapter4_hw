package chapter4;

public class p4 {
	public static void main(String[] args) {
		RacingCar rccar1 = new RacingCar();
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		
	}
	
	
}
class Car{
	private int num;
	private double gas;
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
}

class RacingCar extends Car{
	private int serialnumber;
	public RacingCar() {
		serialnumber=0;
		System.out.println("生產了賽車");
	}
	void setCourse(int s_n) {
		serialnumber=s_n;
		System.out.println("將賽車編號設為"+serialnumber);
	}
}