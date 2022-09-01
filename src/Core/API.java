package Core;

import Core.ClientModel.Client;
import Core.MessageModel.MessageModel;

class API {
    Chat chatroom;

    MessageModel sendMessageModel(MessageModel mm, Client user) {
        chatroom.sendMessage(mm, user);
        var res = new MessageModel();
        res.id = 1;
        res.text = "{'result':true}";
        return res;
    }

    MessageModel appendClient(Client client) {
        chatroom.appendClient(client);
        var res = new MessageModel();
        res.id = 1;
        res.text = "{'result_append':true}";
        return res;
    }
}