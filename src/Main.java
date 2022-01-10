public class Main {
    public static void main(String[] args) {
        var calculatorFactory = new CalculatorFactory();
        try {
            var sum = calculatorFactory.getCalculator("+");
            var mul = calculatorFactory.getCalculator("*");
            var div = calculatorFactory.getCalculator("/");
            var sub = calculatorFactory.getCalculator("-");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a = 8;
        int b = 2;
        String operation = "+";
        CalculatorConnection calculatorConnection = CalculatorConnection.getCalculatorConnection(a, b, operation);
    }
}
