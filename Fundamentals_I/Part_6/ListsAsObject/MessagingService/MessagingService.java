package Fundamentals_I.Part_6.ListsAsObject.MessagingService;

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messageService;

    public MessagingService() {
        this.messageService = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messageService.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return messageService;
    }
}
