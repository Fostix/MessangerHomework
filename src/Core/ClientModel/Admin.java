package Core.ClientModel;

import Core.Chat;

public class Admin extends Client{
    public Admin(String name, Chat chatroom) {
        super(name, chatroom);
    }
    public void printInfo() {
        chatroom.printInfo();
        chatroom.getId();
    }
}
