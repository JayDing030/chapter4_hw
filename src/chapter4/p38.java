package chapter4;

public class p38 {
	public static void main(String[] args) {
		iVehicle[] ivc;
		ivc = new iVehicle[2];
		
		ivc[0] = new Car_p38(1234,20.5);
		ivc[1] = new Plane_p38(232);
		for(int i = 0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}
interface iVehicle{
	int weight = 1000;
	void show();
}

class Car_p38 implements iVehicle{
	private int num;
	private double gas;
	
	public Car_p38(int n,double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量"+gas);
	}
}

class Plane_p38 implements iVehicle{
	private int flight;
	public Plane_p38(int f) {
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
	}
}