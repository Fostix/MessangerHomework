package Core.ClientModel;

public interface ClientSend {
    void sendTxtMsg(String msg);

    void sendAudioMsg(String msg);

    void sendImageMsg(String msg);

    void sendVideoMsg(String aMsg, String vMsg);
}
