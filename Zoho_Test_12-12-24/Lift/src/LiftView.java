public class LiftView {

    private LiftModel liftModel;

    public LiftView()
    {
        liftModel=new LiftModel(this);
    }

    public void init(int[] liftArray, int source, int destination)
    {
        displayLiftPosition(liftArray, source, destination,null);
        // liftModel.assignLift(liftArray, source, destination);
        //after assigning
        // displayLiftPosition(liftArray, source, destination,liftModel.getAssignedLift());

        //after assigning nearest lift
        liftModel.assignNearestLift(liftArray, source, destination);
        displayLiftPosition(liftArray, source, destination,liftModel.getAssignedLift());

    }


    // public void displayLiftPosition(int[] liftArray, int source, int destination)
    // {
    //     System.out.println("Lift  : L1 L2 L3 L4 L5");
    //     System.out.println("Floor : "+liftArray[0]+"  "+liftArray[1]+"  "+liftArray[2]+"  "+liftArray[3]+"  "+liftArray[4]+"\n\n\n");
    // }
    //overloading displayLiftPosition()


    public void displayLiftPosition(int[] liftArray, int source, int destination,String assignedLift)
    {
        if(assignedLift!=null)      
        {
            System.out.println(assignedLift+" is assigned");
        }

        System.out.println("Lift  : L1 L2 L3 L4 L5");
        System.out.println("Floor : "+liftArray[0]+"  "+liftArray[1]+"  "+liftArray[2]+"  "+liftArray[3]+"  "+liftArray[4]+"\n\n\n");
    }



}
