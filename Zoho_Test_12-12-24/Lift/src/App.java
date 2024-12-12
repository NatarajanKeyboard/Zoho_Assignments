public class App {

    private App()
    {
            
    }
    public static void main(String[] input)
    {
        int[] liftArray={0,0,0,0,0};        //the initial lift positions

        // converting the input 
        int source=Integer.parseInt(input[0]);
        int destination=Integer.parseInt(input[1]);

        new LiftView().displayLiftPosition(liftArray,source,destination);
    }
}
