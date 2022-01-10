public class CalculatorFactory {
    public Calculator getCalculator(String s) throws Exception{
        switch (s){
            case "+":
                return new Sum();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "-":
                return new Sub();
            default:
                throw new Exception("Wrong operation");
        }
    }
}
