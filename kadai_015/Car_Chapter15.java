package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;

	public void gearChange(int afterGear) {
		
		if (afterGear < 1 || afterGear > 5) {
			speed = 10;
		} else {
			gear = afterGear;
			speed = gear * 10;
		}

	}

	public void run() {
		System.out.println("速度は、時速" + speed + "kmです");

	}
}
