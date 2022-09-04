package Core.ClientModel;

import Core.Chat;
import Core.MessageModel.Interfaces.SendTxtMsg;
import Core.MessageModel.TxtMessage;

public class RegularUser extends Client implements SendTxtMsg {
    public RegularUser(String name, Chat chatroom) {
        super(name, chatroom);
    }

    public RegularUser(String name) {
        super(name);
    }

    public void sendTxtMsg(String msg) {
        chatroom.sendMessage(new TxtMessage(msg), this);
    }
}
