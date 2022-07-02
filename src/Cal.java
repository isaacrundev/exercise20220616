
public class Cal {
    private double num1;
    private double num2;

    public Cal() {
    }

    public Cal(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void add(Double num1, Double num2) {
        double result = num1 + num2;
        System.out.printf("%.0f%s%.0f%s%.0f%n", num1, "+", num2, "=", result);
    }

    public void subtract(Double num1, Double num2) {
        double result = num1 - num2;
        System.out.printf("%.0f%s%.0f%s%.0f%n", num1, "-", num2, "=", result);
    }

    public void multiply(Double num1, Double num2) {
        double result = num1 * num2;
        System.out.printf("%.0f%s%.0f%s%.0f%n", num1, "*", num2, "=", result);
    }

    public void divide(Double num1, Double num2) {

        // if (num2.equals(0.0)) {
        // System.out.println("Can't divide by zero");
        // } else {
        double result = num1 / num2;
        System.out.printf("%.0f%s%.0f%s%.2f%n", num1, "/", num2, "=", result);
        // }

    }
}
