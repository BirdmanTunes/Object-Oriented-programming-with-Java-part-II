package week9._020_SensorsAndTemperature;

public class ConstantSensor implements Sensor {
	
	private int measure;
	private boolean deviceOn;

	public ConstantSensor(int measure) {
		this.measure=measure;
		this.deviceOn=true;
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
		deviceOn=false;
	}

	@Override
	public int measure() {
		return measure;
	}

}
