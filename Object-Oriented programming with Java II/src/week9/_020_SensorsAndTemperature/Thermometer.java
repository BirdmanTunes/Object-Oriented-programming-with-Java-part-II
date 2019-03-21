package week9._020_SensorsAndTemperature;

import java.util.Random;

public class Thermometer implements Sensor{
	
	Random rand = new Random();
	
	private boolean deviceOn;
			
	public Thermometer() {
		deviceOn=false;
	}

	@Override
	public boolean isOn() {
		return deviceOn;
	}

	@Override
	public void on() {
		deviceOn=true;
	}

	@Override
	public void off() {
		deviceOn=true;
		
	}

	@Override
	public int measure() {
		int temp = -30 + rand.nextInt(61);
		if (!deviceOn) {
			throw new IllegalArgumentException("Thermometer must be on!");
		}
		return temp;
	}

}
