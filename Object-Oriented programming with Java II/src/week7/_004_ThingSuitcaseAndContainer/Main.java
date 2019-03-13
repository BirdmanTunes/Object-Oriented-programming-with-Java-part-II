package week7._004_ThingSuitcaseAndContainer;

public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
        	Thing brick = new Thing("Brick", 1 + i);
        	Suitcase brickCase = new Suitcase(101);
        	brickCase.addThing(brick);
        	container.addSuitcase(brickCase);
        }
    }
}