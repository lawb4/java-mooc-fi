package Fundamentals_I.Part_5.LearningOOP.___Clock;

public class Main {
    public static void main(String[] args) {

        Clock clock = new Clock();

        while (true) {
            System.out.println(clock);
            clock.advance();
        }

        /*ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);

        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);

            seconds.advance();

            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0){
                    hours.advance();
                }
            }
        }*/
    }
}
