package Core.ClientModel;

import Core.Chat;

public class RegularUser extends Client{
    public RegularUser(String name, Chat chatroom) {
        super(name, chatroom);
    }

    public RegularUser(String name) {
        super(name);
    }
}
