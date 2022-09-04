package Core.ClientModel;

import Core.Chat;
import Core.MessageModel.Interfaces.SendImageAndAudioMsg;
import Core.MessageModel.AudioMessage;
import Core.MessageModel.ImageMessage;

public class Donate extends RegularUser implements SendImageAndAudioMsg {
    public Donate(String name, Chat chatroom) {
        super(name, chatroom);
    }

    public Donate(String name) {
        super(name);
    }
    @Override
    public void sendAudioMsg(String msg) {
        chatroom.sendMessage(new AudioMessage(msg), this);
    }
    @Override
    public void sendImageMsg(String msg) {
        chatroom.sendMessage(new ImageMessage(msg), this);
    }
}
