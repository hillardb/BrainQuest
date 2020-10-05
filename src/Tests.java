public class Tests {

    public static void main(String[] args) {

        // CREATE A CREATURE 
        System.out.print("\nShould announce a creature:");
        System.out.println();
        Creature a = new Creature("Hockey Player");
        System.out.println();

        // CHECK CREATURE'S HEALTH
        System.out.print("\nHealth should be set tot 100 by default:");
        System.out.println(); 
        System.out.println(a.health() == 100);
        System.out.println();

        // CHECK CREATURE'S TREASURE
        System.out.print("\nCreature should have no default treasure:");
        System.out.println();
        System.out.println(a.getTreasure() == null);
        System.out.println();

        // BUILD A TREASURE
        System.out.print("\nTreasure's name is Golden Hockeystick:");
        Treasure gh = new Treasure("Golden Hockeystick"); 
        System.out.println();
        System.out.println(gh.title().equals("Golden Hockeystick")); 
        System.out.println();

    }
    
}
