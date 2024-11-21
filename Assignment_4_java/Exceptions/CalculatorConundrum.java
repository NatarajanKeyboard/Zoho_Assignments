 class IllegalOperationException extends Exception {
    public IllegalOperationException(String message) {
        System.out.println(message);
    }

    // public IllegalOperationException(String message, Throwable cause) {
    //     super(message, cause);
    // }
}
public class CalculatorConundrum {
    
    public String calculate(int operand1, int operand2, String operation){
        try{
            if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
            }
            if (operation.isEmpty()) {
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            

        switch (operation) {
            case "+":
                return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            case "*":
                return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            case "/":
                try {
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage()+" is not valid");
                }break;
            default:
                try 
                {
                    throw new IllegalOperationException("Operation " + operation + " does not exist");
                } 
                catch (IllegalOperationException e) 
                {
                    // System.out.println("Operation " + operation + " does not exist");
                    // e.getMessage();
                }
        }}
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        
        return "";
    }

    public static void main(String[] args) {
        CalculatorConundrum calculator = new CalculatorConundrum();
        
        System.out.println(calculator.calculate(16, 51, "+"));
        System.out.println(calculator.calculate(32, 6, "*"));
        System.out.println(calculator.calculate(512, 4, "/"));
        System.out.println(calculator.calculate(512, 0, "/"));
        
        calculator.calculate(10, 1, null);
        // => throws IllegalArgumentException with message "Operation cannot be null"

        calculator.calculate(10, 1, "");
        // => throws IllegalArgumentException with message "Operation cannot be empty"

        calculator.calculate(10, 1, "-");
        // => throws IllegalOperationException with message "Operation '-' does not exist"
        
    }
}
