package Core.ClientModel;

import Core.Chat;
import Core.MessageModel.*;

public abstract class Client{
    private String name;
    protected Chat chatroom;

    public Client(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        this.chatroom.appendClient(this);
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void join(Chat chatroom) {
        this.chatroom = chatroom;
        this.chatroom.appendClient(this);
    }

    public void printMessage(MessageModel msg) {
        System.out.printf("User‚ %s: %s\n", name, msg);
    }

    public String toString() {
        return String.format("%s", this.name);
    }
}