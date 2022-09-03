package Core.MessageModel;

public class VideoMessage extends AudioMessage{
    private String videoMessage;
    public VideoMessage(String audioMessage, String videoMessage) {
        super(audioMessage);
        this.videoMessage = videoMessage;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %s", this.videoMessage);
    }
}
