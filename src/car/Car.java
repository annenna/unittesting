package car;

public class Car {
	
	private int power;
	private int weight;
	
	public double getAvgFuelConsumption() {
		if (weight < 1000) {
			return power / 100;
		}
		return power / 100 + 30;
	}
	
	
}
