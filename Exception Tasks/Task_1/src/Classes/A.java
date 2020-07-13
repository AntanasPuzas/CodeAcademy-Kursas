package Classes;

public class A {
    public double division(double first, double second) {
        B b = new B();
        double result = -1;
        try {
            result = b.division(first, second);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
        return result;
    }
}
