package chapter4;

public class p9 {
	public static void main(String[] args) {
		RacingCar_p9 rccar1 = new RacingCar_p9();
		rccar1.newshow();
	}
}
class Car_p9{
	protected int num;
	protected double gas;
	public Car_p9()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	} 
}

class RacingCar_p9 extends Car_p9{
	private int serialnum;
	public RacingCar_p9() {
		serialnum=0;
		System.out.println("生產了賽車");
	}
	void setCourse(int s_n) {
		serialnum=s_n;
		System.out.println("將賽車編號設為"+serialnum);
	}
	public void newshow() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+serialnum);
		
	}
}