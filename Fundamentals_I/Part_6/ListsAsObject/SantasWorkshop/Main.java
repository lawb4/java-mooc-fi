package Fundamentals_I.Part_6.ListsAsObject.SantasWorkshop;

public class Main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift book1 = new Gift("Ha", 3);

        Package giftSack = new Package();
        giftSack.addGift(book);
        giftSack.addGift(book1);
        System.out.println(giftSack.totalWeight());
    }
}
