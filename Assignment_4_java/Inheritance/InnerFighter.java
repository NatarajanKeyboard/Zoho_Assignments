package Inheritance;

class Fighter {

    public boolean isVulnerable()
    {
        return false;
    }
    
    public int getDamagePoints(Fighter fighter)
    {
        return 0;
    }
}
class Warrior extends Fighter
{
    @Override
    public int getDamagePoints(Fighter Wizard)
    {
        return Wizard.isVulnerable()?10:6;
    }
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}
class Wizard extends Fighter
{
    static private boolean spell=false;

    public void prepareSpell()
    {
        spell=true;
    }

    @Override
    public int getDamagePoints(Fighter Warrior)
    {
        return Warrior.isVulnerable()?12:3;
    }
    @Override
    public boolean isVulnerable()
    {
        return !spell;
    }
    @Override
    public String toString() {
        return "Fighter is Wizard";
    }


}

public class InnerFighter
{
    public static void main(String[] args) {
        Warrior warrior = new Warrior();                    // creating the warrior
        System.out.println(warrior.toString());             // showing the warrior
        System.out.println(warrior.isVulnerable());         // showing warrior is always not vulnerable

        Wizard wizard=new Wizard();                         // creating wizard
        System.out.println(warrior.toString());             // Showing the wizard
        System.out.println(wizard.isVulnerable());          // initially wizard is vulnerable

        System.out.println(warrior.getDamagePoints(wizard));// warrior get to know points of wizard after his attack

        wizard.prepareSpell();                              // wizard prepared a spell
        System.out.println(wizard.isVulnerable());          // now wizard became not vulnerable

        System.out.println(wizard.getDamagePoints(warrior));// wizard get to know points of warrior after his attack

    }
}