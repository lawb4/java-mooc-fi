package Fundamentals_I.Part_5.ObjectsAndReferences.Money;

public class Main {
    public static void main(String[] args) {
        Money a = new Money(10, 75);
        Money b = new Money(3, 50);


        Money d = a.plus(b);
        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e
        System.out.println("d = " + d);

        c = c.minus(a);
        System.out.println("===");

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
