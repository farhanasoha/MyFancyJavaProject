public class CalculatorConnection {
    private static CalculatorConnection instance=null;
    private CalculatorConnection(int a, int b, String operation){
        var calculator = new Calculator(a, b, operation);
    }
    public static CalculatorConnection getCalculatorConnection(int a, int b, String operation) {
        if (instance== null )
            instance = new CalculatorConnection(a, b, operation) ;

        return instance;
    }
}
