package homeworkWeek4;

public class SimpleCalculator {

    // main method
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();  // creating object
        calculator.setFirstNumber(5.0);  // calling instance method with one parameter
        calculator.setSecondNumber(4);  // calling instance method with one parameter
        System.out.println("add= " + calculator.getAdditionResult()); // calling instance method without parameter
        System.out.println("subtract= " + calculator.getSubtractionResult()); // calling instance method without parameter
        calculator.setFirstNumber(5.25);  // calling instance method with one parameter
        calculator.setSecondNumber(0); // calling instance method with one parameter
        System.out.println("multiply= " + calculator.getMultiplicationResult());  // calling instance method without parameter
        System.out.println("divide= " + calculator.getDivisionResult()); // calling instance method without parameter
    }

    // instance variable
    private double firstNumber;
    private double secondNumber;

    // instance method without parameter
    public double getFirstNumber() {
        return firstNumber;
    }

    // instance method without parameter
    public double getSecondNumber() {
        return secondNumber;
    }

    // instance method with one parameter
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // instance method with one parameter
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // instance method without parameter
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // instance method without parameter
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // instance method without parameter
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // instance method without parameter
    public double getDivisionResult() {

        if (secondNumber == 0) {
            return this.secondNumber = 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
