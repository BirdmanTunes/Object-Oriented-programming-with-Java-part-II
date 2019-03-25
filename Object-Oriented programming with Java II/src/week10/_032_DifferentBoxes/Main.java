package week10._032_DifferentBoxes;

import week10._032_DifferentBoxes.boxes.BlackHoleBox;
import week10._032_DifferentBoxes.boxes.MaxWeightBox;
import week10._032_DifferentBoxes.boxes.OneThingBox;

public class Main {
	
	public static void main(String[] args) {
        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
	}

}
