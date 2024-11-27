package chapter4;

public class p6 {
	public static void main(String[] args) {
		RacingCar_p6 rccar1 = new RacingCar_p6(1234,20.5,5);
	}
}

class Car_p6{
	private int num;
	private double gas;
	public Car_p6()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Car_p6(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
}

class RacingCar_p6 extends Car_p6{
	private int serialnumber;
	public RacingCar_p6() {
		serialnumber=0;
		System.out.println("生產了賽車");
	}
	public RacingCar_p6(int n,double g,int s_n) {
		super(n,g);
		serialnumber=s_n;
		System.out.println("生產了編號設為"+serialnumber+"的賽車");
	}
	void setCourse(int s_n) {
		serialnumber=s_n;
		System.out.println("將賽車編號設為"+serialnumber);
	}
}