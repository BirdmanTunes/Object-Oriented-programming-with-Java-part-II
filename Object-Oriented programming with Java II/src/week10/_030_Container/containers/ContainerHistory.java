package week10._030_Container.containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
	
	private ArrayList<Double> historic;
	
	public ContainerHistory() {
		historic =  new ArrayList<Double>();
	}

	public void add(double situation) {
		historic.add(situation);
	}
	
	public void reset() {
		historic.clear();
	}
	
	public double maxValue() {
		if (historic.size() == 0) {
			return 0;
		}
		return Collections.max(historic);
	}
	
	public double minValue() {
		if (historic.size() == 0) {
			return 0;
		}
		return Collections.min(historic);
	}
	
	public double average() {
		if (historic.size() == 0) {
			return 0;
		}
		double sum = 0;
		for(int i = 0; i < historic.size(); i++)
		    sum += historic.get(i);
		return sum / historic.size();
	}
	
    public double greatestFluctuation() {
        if (historic.size() == 0) {
            return 0;
        }
        
        double maxFluctuation = 0;
        
        for (int i = 1; i < historic.size(); i++) {
            double diff = Math.abs(historic.get(i) - historic.get(i - 1));
            
            if (diff > maxFluctuation) {
                maxFluctuation = diff;
            }
        }
        
        return maxFluctuation;
    }
    
    public double variance() {
        if (historic.size() == 0) {
            return 0;
        }
        double variance = 0;
        
        for (Double each : historic) {
            variance += Math.pow((each - average()), 2);
        }
        return variance / (historic.size() - 1);
    }
	
	@Override
	public String toString() {
		return historic.toString();
	}

}
