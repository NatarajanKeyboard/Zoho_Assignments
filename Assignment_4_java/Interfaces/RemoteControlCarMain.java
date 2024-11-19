package Interfaces;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface RemoteControlCar {

    public void drive();
    public int getDistanceTravelled();
}
class ProductionRemoteControlCar implements  RemoteControlCar,Comparable<ProductionRemoteControlCar>
{
    private int distanceTravelled=0;
    private int numberOfVictories=0;

    

    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int victories) {
        this.numberOfVictories = victories;
    }

    @Override
    public void drive() {
        this.distanceTravelled+=10;
    }   
    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories); }

}
class ExperimentalRemoteControlCar implements RemoteControlCar
{
    private int distanceTravelled=0;
    @Override
    public void drive() {
        this.distanceTravelled+=20;
    }   
    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

}
class TestTrack{

    static void race(RemoteControlCar car)
    {
        car.drive();
    }
    static List<ProductionRemoteControlCar>getRankedCars(List<ProductionRemoteControlCar> cars)
    {
        Collections.sort(cars);
        return cars;
    }
    
    
    
}
public class RemoteControlCarMain {

    
    public static void main(String[] args) {
        ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
        prod.drive();
        System.out.println(prod.getDistanceTravelled());
        
        
        ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
        exp.drive();
        System.out.println(exp.getDistanceTravelled());

        TestTrack.race(new ProductionRemoteControlCar());
        TestTrack.race(new ExperimentalRemoteControlCar());


        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(2);
        prc2.setNumberOfVictories(3);
        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);
        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);

        System.out.println();

        
    }
    
}