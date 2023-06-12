package Fundamentals_I.Part_4.DecreasingCounter;

/*
Part I. Implementation of the decrement() method

Implement the decrement() method in the class body in such a way that
it decrements the value variable of the object it's being called on by one.
Once you're done with the decrement() method,
the main program of the previous example should work to produce the example output.

Part II. The counter's value cannot be negative

Implement the decrement() in such a way that the counter's value never becomes negative.
This means that if the value of the counter is 0, it cannot be decremented.
A conditional statement is useful here.

Part III. Resetting the counter value
Create the method public void reset() for the counter that resets the value of the counter to 0.

 */
public class Main {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
