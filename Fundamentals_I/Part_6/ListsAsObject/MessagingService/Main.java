package Fundamentals_I.Part_6.ListsAsObject.MessagingService;

public class Main {
    public static void main(String[] args) {
        MessagingService mts = new MessagingService();
        Message m1 = new Message("Hugh", "Hi, wanna meet this Friday?");
        Message m2 = new Message("???", "Sure, make it 8 near ???");

        mts.add(m1);
        mts.add(m2);

        for (Message message : mts.getMessages()){
            System.out.println(message);
        }
    }
}
