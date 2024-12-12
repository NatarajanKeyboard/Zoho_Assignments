public class LiftView {

    private LiftModel liftModel;

    public LiftView()
    {
        liftModel=new LiftModel(this);
    }

    

    public void displayLiftPosition(int[] liftArray, int source, int destination)
    {
        System.out.println("Lift  : L1 L2 L3 L4 L5");
        System.out.println("Floor : "+liftArray[0]+"  "+liftArray[1]+"  "+liftArray[2]+"  "+liftArray[3]+"  "+liftArray[4]);
    }
}
