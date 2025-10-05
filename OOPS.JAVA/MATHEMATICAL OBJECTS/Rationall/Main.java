package Rationall;


public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 7);
        Rational r2 = new Rational(9, 5);  

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        Rational sum = r1.add(r2);
        Rational difference = r1.subtract(r2);
        Rational product = r1.multiply(r2);
        Rational quotient = r1.divide(r2);

        System.out.println(r1 + " + " + r2 + " = " + sum);
        System.out.println(r1 + " - " + r2 + " = " + difference);
        System.out.println(r1 + " * " + r2 + " = " + product);
        System.out.println(r1 + " / " + r2 + " = " + quotient);
    }
}


