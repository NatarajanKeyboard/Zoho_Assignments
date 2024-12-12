public class LiftModel {

    private LiftView liftView;
    private String assignedLift;

    public LiftModel(LiftView liftView)
    {
        this.liftView=liftView;
    }

    public String getAssignedLift()
    {
        return assignedLift;
    }

    // public void assignLift(int[] liftArray, int source, int destination)
    // {
    //     assignedLift="L1";
    //     liftArray[0]=destination;
        
    // }

    public void assignNearestLift(int[] liftArray, int source, int destination)
    {
        int min=10_000;
        int minIndex=0;
        for(int index=4;index>=0;index--)
        {
            int floor=liftArray[index];
            System.out.println(Math.abs(floor-source));
            if(Math.abs(floor-source)<min)
            {
                min=floor;
                minIndex=index;
            }
        }
        System.out.println(min+" "+minIndex);
        assignedLift="L"+(minIndex+1);
        System.out.println(assignedLift);
        liftArray[minIndex]=destination;
        
    }

}
