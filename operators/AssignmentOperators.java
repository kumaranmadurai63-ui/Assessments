package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 20;

        a += 10;
        System.out.println("After += : " + a);

        a -= 5;
        System.out.println("After -= : " + a);

        a *= 2;
        System.out.println("After *= : " + a);

        a /= 5;
        System.out.println("After /= : " + a);
    }
}