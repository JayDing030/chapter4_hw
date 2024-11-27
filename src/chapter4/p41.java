package chapter4;

public class p41 {
	public static void main(String[] args) {
		Car_p41 car1 = new Car_p41(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
interface iVehicle_p41{
	void vShow();
}
interface iMaterial{
	void mShow();
}
class Car_p41 implements iVehicle_p41,iMaterial{
	private int num;
	private double gas;
	
	public Car_p41(int n,double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	
	public void vShow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量"+gas);
	}
	public void mShow() {
		System.out.println("車號的材質是鐵");
	}
}