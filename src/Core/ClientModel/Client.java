package Core.ClientModel;

import Core.Chat;
import Core.MessageModel.AudioMessage;
import Core.MessageModel.ImageMessage;
import Core.MessageModel.MessageModel;
import Core.MessageModel.TxtMessage;

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
        System.out.printf("User‚ %s: %s\n", name, msg);
    }

    public void sendTxtMsg(String msg) {
        chatroom.sendMessage(new TxtMessage(msg), this);
    }

    public void sendAudioMsg(String msg) {
        chatroom.sendMessage(new AudioMessage(msg), this);
    }

    public void sendImageMsg(String msg) {
        chatroom.sendMessage(new ImageMessage(msg), this);
    }
}