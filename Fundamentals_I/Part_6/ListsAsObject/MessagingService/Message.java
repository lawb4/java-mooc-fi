package Fundamentals_I.Part_6.ListsAsObject.MessagingService;

import java.util.Objects;

public class Message {

    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return this.sender + ": " + this.content;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {      //location
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Message other = (Message) obj;

        return (!Objects.equals(this.sender, other.sender))
                && (!Objects.equals((this.content), other.content));
    }


}
