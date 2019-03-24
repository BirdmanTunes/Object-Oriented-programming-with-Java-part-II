package week10._027_TheFinnishRingingCentre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
	
	private Map<Bird, List<String>> birdToPlace;
	
	public RingingCentre() {
		birdToPlace = new HashMap<Bird, List<String>>();
	}
	
	public void observe(Bird bird, String place) {
		if (!birdToPlace.containsKey(bird)) {
			birdToPlace.put(bird, new ArrayList<String>());
			birdToPlace.get(bird).add(place);
		} else {
			birdToPlace.get(bird).add(place);
		}
			
	}
	
	public void observations(Bird bird) {
		
		if (!birdToPlace.containsKey(bird)) {
			System.out.println(bird + " observations: " + 0);
		} else {
			System.out.println(bird + " observations: " + (birdToPlace.get(bird).size()));
			for (String place : birdToPlace.get(bird)) {
				System.out.println(place);
			}
		}
	}
}
