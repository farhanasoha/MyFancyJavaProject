public class Sub extends Calculator{
    public Sub(int a, int b, String operation) {
        super(a, b, operation);
    }

    public int calculate(int a, int b) {
        return a-b;
    }
}
