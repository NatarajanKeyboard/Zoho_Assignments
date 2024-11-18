package Method_Overriding;

class Vehicle {
   
    // for Encapsulation of attribute purposes
    private String number_plate;
    private String color;
    private float weight_In_Kgs;
    private String tyreType="tubeless";
    

    // behaviours
    public void ignite(){}
    public void insertKey(){}       // newly inserted
    public void accelerate(){}
    public void brake(){}
    public void stop(){}


}


class TwoWheeler extends Vehicle
{
    // for Encapsulation of attribute purposes
    private static byte wheelsCount=2;
    private static String fuel="petrol";
    private static byte no_of_seats=2;
    private String engine_type="Two stroke petrol engine";
    
    // behaviour
    public void wheeling(){}
    private void kickerStart(){}                        // this is private because, without ignition (i.e)       
                                                        // inserting  key, we can't kickstart
    @Override
    public void ignite()
    {
        insertKey();
        kickerStart();
    }
    
}
class Scooty extends TwoWheeler
{
    // Encapsulation of attributes
    private byte underSeatStorageCapacity;

    // behaviour
    public void loadFront(){}
}
class Bike extends TwoWheeler {

    
    // can be encapsulated later
    private byte numberOfGears;

    // behaviour
    public void skit(){}
}




class ThreeWheeler extends Vehicle
{
    // can be encapsulated later
    private static byte wheelsCount=3;
    private byte numberOfSeats=3;

    private void crankerStart(){}                       // this is private because, without ignition (i.e)       
                                                        // inserting  key, we can't kickstart
    @Override
    public void ignite()
    {
        insertKey();
        crankerStart();
    }   

}
class Auto extends ThreeWheeler
{
    // can be encapsulated later
    private String fuel="petrol";

    //behaviours
    public void reverse(){}
}




class Fourwheeler extends Vehicle
{
    // can be encapsulated later
    private static byte wheelsCount=4;

    @Override
    public void ignite()
    {
        insertKey();
    }
}
class car extends Fourwheeler
{
    
    // can be encapsulated later
    private static String fuelType="";

}
class van extends Fourwheeler
{
    
    // can be encapsulated later
    private static String fuelType="Diesel";
}
class jeep extends Fourwheeler
{
    
    // can be encapsulated later
    private float climbingAngle;

    // behaviour
    public void climb(){}
}

public class VehicleMethodOverloading {
    public static void main(String[] args) {
        
    }
}