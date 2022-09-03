package Core.ClientModel;

import Core.Chat;
import Core.MessageModel.*;

public abstract class Client implements ClientSend {
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

    @Override
    public void sendTxtMsg(String msg) {
        chatroom.sendMessage(new TxtMessage(msg), this);
    }

    @Override
    public void sendAudioMsg(String msg) {
        chatroom.sendMessage(new AudioMessage(msg), this);
    }

    @Override
    public void sendImageMsg(String msg) {
        chatroom.sendMessage(new ImageMessage(msg), this);
    }

    @Override
    public void sendVideoMsg(String aMsg, String vMsg) {
        chatroom.sendMessage(new VideoMessage(aMsg, vMsg), this);
    }
}