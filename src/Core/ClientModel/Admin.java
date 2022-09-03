package Core.ClientModel;

import Core.Chat;

public class Admin extends PremiumUser{
    public Admin(String name, Chat chatroom) {
        super(name, chatroom);
    }
    public void printInfo() {
        chatroom.printInfo();
    }

    public void removeUser(int id) {
        chatroom.removeUser(id);
    }
}
