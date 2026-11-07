package java;


interface Calculator {
    int calculate(int a, int b);
}

class CalculatorDemo {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + sub.calculate(a, b));
        System.out.println("Multiplication: " + mul.calculate(a, b));
        System.out.println("Division: " + div.calculate(a, b));
    }
}