/**
 * A basic building block for an opponent 
 */

public class Creature {
    // INSTANCE VARIABLES aka "this"
    private String name;
    private int health = 100;
    private Treasure booty;

    /**
     * Creature constructor
     */
    public Creature(String cName){
        System.out.println(cName + " is born!");
        this.name = cName;
    }

    public Creature(String name, int health){
        this(name);
        this.health = health;
    }

    public Creature(String name, Treasure t){
        this(name); 
        booty = t;
    }
    
    /**
     * Overloaded constructor 
     */
    public Creature() {
        this.name = "Villager";
    }

    // ACCESSORS -- part of the concept of encapsulation 

    public String name() {
        return this.name;
    }

    public int health() {
        return this.health;
    }

    public Treasure getTreasure() {
        return this.booty;
    }

    // MUTATORS -- another part of encapsulation 

    public void name(String name){
        this.name = name; 
    }

    @Override
    public String toString(){
        return this.name + " - Health:" + this.health;
    }

}
