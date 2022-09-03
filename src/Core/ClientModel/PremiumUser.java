package Core.ClientModel;

import Core.Chat;
import Core.MessageModel.AudioMessage;
import Core.MessageModel.ImageMessage;
import Core.MessageModel.VideoMessage;

public class PremiumUser extends Donate implements SendVideoMsg{
    public PremiumUser(String name, Chat chatroom) {
        super(name, chatroom);
    }

    public PremiumUser(String name) {
        super(name);
    }
    @Override
    public void sendVideoMsg(String aMsg, String vMsg) {
        chatroom.sendMessage(new VideoMessage(aMsg, vMsg), this);
    }
}
