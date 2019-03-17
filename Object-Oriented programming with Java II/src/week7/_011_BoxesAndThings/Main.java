package week7._011_BoxesAndThings;


public class Main {
	
    public static void main(String[] args) {
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );
        
        box.add(box);
        
        System.out.println("");
        System.out.println("A box inside itself:");
        System.out.println( box );
        
        Box box2 = new Box(10);
        
        box2.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box2.add( new Book("Robert Martin", "Clean Code", 1) );
        box2.add( new Book("Kent Beck", "Test Driven Development", 0.7) );
        
        System.out.println(box2);
        
        //you can only add one box into another box
//        box.add(box2);
//        System.out.println(box);
    }
}
