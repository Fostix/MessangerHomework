package Core;

import Core.ClientModel.Client;
import Core.MessageModel.MessageModel;

public interface Chat {
    void sendMessage(MessageModel mm, Client me);

    void appendClient(Client c);

    void printInfo();

    void removeUser(int id);

    void checkAllMessages();
}