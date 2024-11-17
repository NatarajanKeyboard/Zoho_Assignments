package Method_Overloading;


class Character
{
    // Encapsulated
    private String characterClass;
    private int level;
    private int hitPoints;

    //Getters...
    public String getCharacterClass() {
        return characterClass;
    }
    public int getLevel() {
        return level;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    // Setters...
    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


}
class Destination
{
    // Encapsulated...
    private String name;
    private int inhabitants;

    // Getters...
    public String getName() {
        return name;
    }
    public int getInhabitants() {
        return inhabitants;
    }
    

    //Setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }


}
class TravelMethod
{
    static String WALKING="You're traveling to your destination by walking.";
    static String HORSEBACK="You're traveling to your destination on horseback.";
}

class GameMaster
{
    // Overloading the methods
    public void describe(Character character)
    {
        System.out.println("You're a level "+ character.getLevel() +" "+character.getCharacterClass()+" with "+ character.getHitPoints()+" hit points.\n");
    }
    public void describe(Destination destination)
    {
        System.out.println("You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.\n");
    }
    public void describe(String travelMethod)
    {
        System.out.println(travelMethod+"\n");
    }
    public void describe(Character character,Destination destination,String travelMethod)
    {
        System.out.println( "You're a level "+ character.getLevel() +" "+character.getCharacterClass()+" with "+ character.getHitPoints()+" hit points."+travelMethod+"You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.\n");
    }
    public void describe(Character character,Destination destination)
    {
        System.out.println( "You're a level "+ character.getLevel() +" "+character.getCharacterClass()+" with "+ character.getHitPoints()+" hit points."+TravelMethod.WALKING+"You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.\n");
    }

}

public class WizardsAndWarriors2 {
    public static void main(String[] args) {
        // Task 1
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        new GameMaster().describe(character);



        // Task 2
        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        new GameMaster().describe(destination);


        // Task 3
        new GameMaster().describe(TravelMethod.HORSEBACK);


        // Task 4
        new GameMaster().describe(character, destination, TravelMethod.HORSEBACK);

        // Task 5
        new GameMaster().describe(character, destination);
    }
}