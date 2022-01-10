public class CalculatorFactory {
    public Calculator getCalculator(String s) throws Exception{
        switch (s){
            case "-":
                return new Sub(5,2, "-");
            default:
                throw new Exception("Wrong operation");
        }
    }
}
