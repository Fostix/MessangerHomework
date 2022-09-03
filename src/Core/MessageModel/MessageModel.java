package Core.MessageModel;

import Core.ID;

public abstract class MessageModel {
    private ID id;
    public MessageModel() {
        ID id = new ID();
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}