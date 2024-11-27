package chapter4;

public class p26 {
	public static void main(String[] args) {
		Car_p26[] cars;
		cars = new Car_p26[2];
		cars[0]=new Car_p26();
		cars[1] = new RacingCar_p26();
		
		for(int i = 0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
	}
}
class Car_p26 {
	protected int num;
	protected double gas;
	public Car_p26() {
		num=0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}

class RacingCar_p26 extends Car_p26{
	private int serialnum;
	public RacingCar_p26() {
		serialnum=0;
		System.out.println("生產了賽車");
	}
}
