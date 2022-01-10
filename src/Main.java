public class Main {
    public static void main(String[] args) {
        var calculatorFactory = new CalculatorFactory();
        try {
            var sum = calculatorFactory.getCalculator("+");
            var mul = calculatorFactory.getCalculator("*");
            var div = calculatorFactory.getCalculator("/");
            var sub = calculatorFactory.getCalculator("-");

            System.out.println(sum.calculate(5, 2));
            System.out.println(mul.calculate(5, 2));
            System.out.println(div.calculate(6, 2));
            System.out.println(sub.calculate(9, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
