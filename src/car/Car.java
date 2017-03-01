package car;

public class Car {
	
	private int power;
	private int weight;
	private Odometer odometer;
	
	public static final int ORIGINAL_PRICE = 20000;
	
	public double getAvgFuelConsumption() {
		if (weight < 1000) {
			return power / 100;
		}
		return power / 100 + 30;
	}
	
	public double getValueInEuro() {
		if (odometer.getMiles() > 100000) {
			return ORIGINAL_PRICE * 0.9;
		}
		return ORIGINAL_PRICE * 0.9 + (100000 - odometer.getMiles())/100;
	}
}
