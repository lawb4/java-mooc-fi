package Fundamentals_I.Part_5.Overloading.OverloadedCounter;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        //this.value++;
        this.increase(1);
    }

    public void decrease() {
        //this.value--;
        this.decrease(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }
}
