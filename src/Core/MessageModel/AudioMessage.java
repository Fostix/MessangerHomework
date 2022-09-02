package Core.MessageModel;

public class AudioMessage extends MessageModel{
    private String audioMessage;

    public AudioMessage(String audioMessage) {
        this.audioMessage = audioMessage;
    }

    @Override
    public String toString() {
        return String.format("Воспроизведение: %s", this.audioMessage);
    }
}
