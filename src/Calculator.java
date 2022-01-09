public class Calculator {
    int a;
    int b;
    String operation;

    public Calculator(int a, int b, String operation) {
        super();
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    public int calculate() throws Exception{
        switch (operation){
            case "+":
                return a+b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                throw new Exception("Invalid Input!");
        }
        
    }
}
