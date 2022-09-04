package Core.MessageModel;

public class TxtMessage extends MessageModel{
    private String txtMessage;

    public TxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }

    @Override
    public String play() {
        return String.format("Чтение:%s", this.txtMessage);
    }

    @Override
    public String toString() {
        return String.format("%s", this.txtMessage);
    }
}
