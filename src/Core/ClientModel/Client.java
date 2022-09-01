package Core.ClientModel;

import Core.Chat;
import Core.MessageModel.MessageModel;

public abstract class Client {
    public String name;
    private Chat chatroom;


    public Client(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        this.chatroom.appendClient(this);
    }

    public Client(String name) {
        this.name = name;

    }
    public void join(Chat chatroom) {
        this.chatroom = chatroom;
    }

    public void printMessage(MessageModel msg) {
        System.out.printf("Core.ClientModel.User‚ %s: %s\n", name, msg.text);
    }

    public void sendMsg(String text) {
        var mm = new MessageModel(text);
        chatroom.sendMessage(mm, this);
    }
}