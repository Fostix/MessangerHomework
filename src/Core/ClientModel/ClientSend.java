package Core.ClientModel;

import Core.MessageModel.AudioMessage;
import Core.MessageModel.ImageMessage;
import Core.MessageModel.TxtMessage;

public interface ClientSend {
    void sendTxtMsg(String msg);

    void sendAudioMsg(String msg);

    void sendImageMsg(String msg);

    void sendVideoMsg(String aMsg, String vMsg);
}
