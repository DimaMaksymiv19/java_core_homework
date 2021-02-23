package Main.Homework4;

public class MyCalculator implements Numerable{
    public MyCalculator(){

    }

    @Override
    public double plus(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double minus(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
