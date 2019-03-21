package week9._020_SensorsAndTemperature;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	
	private List<Sensor> sensorArray;
	private List<Integer> readings = new ArrayList<Integer>();
	
	public AverageSensor() {
		sensorArray = new ArrayList<Sensor>();
	}
	
	public void addSensor(Sensor additional) {
		sensorArray.add(additional);
	}
	
	public List<Integer> readings() {
		return readings;
	}

	@Override
	public boolean isOn() {
		int every = 0;
		for (Sensor each: sensorArray) {
			if (each.isOn()) {
				every++;
			}
		}
		return every == sensorArray.size();
	}

	@Override
	public void on() {
		for (Sensor each: sensorArray) {
			each.on();
		}
	}

	@Override
	public void off() {
		for (Sensor each: sensorArray) {
			each.off();
		}
	}

	@Override
	public int measure() {
		if (!this.isOn() || sensorArray.size() == 0) {
			throw new IllegalArgumentException("One or all of the sensors are off");
		}
		int every = 0;
		for (Sensor each: sensorArray) {
			every += each.measure();
		}
		readings.add(every/sensorArray.size());
		
		return (int) every / sensorArray.size();
	}

}
