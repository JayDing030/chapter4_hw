package chapter4;

public class p14 {
	public static void main(String[] args) {
		Car_p14 car1 = new RacingCar_p14();
		car1.setCar(1234,20.5);
		car1.show();
	}
}

class Car_p14 {
	protected int num;
	protected double gas;
	public Car_p14() {
		num=0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車後設為"+num+",汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量"+gas);
	}
}

class RacingCar_p14 extends Car_p14{
	private int serialnum;
	public RacingCar_p14() {
		serialnum=0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c) {
		serialnum=c;
		System.out.println("將賽車編號設為"+serialnum);
	}
	public void show() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+serialnum);
	}
}