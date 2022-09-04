package Core.MessageModel;

public class ImageMessage extends MessageModel{
    private String photo;

    public ImageMessage(String photo) {
        this.photo = photo;
    }

    @Override
    public String play() {
        return String.format("Просмотр: %s", this.photo);
    }

    @Override
    public String toString() {
        return String.format("%s", this.photo);
    }
}
