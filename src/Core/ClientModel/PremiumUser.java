package Core.ClientModel;

import Core.Chat;

public class PremiumUser extends Client {
    public PremiumUser(String name, Chat chatroom) {
        super(name, chatroom);
    }

    public PremiumUser(String name) {
        super(name);
    }
}
