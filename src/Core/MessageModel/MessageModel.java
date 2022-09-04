package Core.MessageModel;

import Core.ClientModel.Client;
import Core.ClientModel.Model;
import Core.ID;

public abstract class MessageModel extends Model {
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

    public abstract String play();
}