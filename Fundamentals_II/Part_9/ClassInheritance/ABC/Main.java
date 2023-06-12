package Fundamentals_II.Part_9.ClassInheritance.ABC;

public class Main {
    public static void main(String[] args) {
        //A a = new A();
        //B b = new B();
        // As far as I'm concerned, class C now can
        // access all the methods from A and B classes
        C c = new C();

        c.a();
        c.b();
        c.c();
    }
}
