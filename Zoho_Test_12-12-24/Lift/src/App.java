public class App {

    private App()
    {
            
    }
    public static void main(String[] input)
    {
        int[] liftArray={5,2,7,9,0};        //the initial lift positions


        // converting the input 
        int source=Integer.parseInt(input[0]);
        int destination=Integer.parseInt(input[1]);

        new LiftView().init(liftArray,source,destination);
    }
}
