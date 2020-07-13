package Email;

enum Status {
    NEW,
    SENT,
    RE_SENT;
}

public class Email {
    private String content;
    private String topic;
    private String recipient;
    private Status status;

    public Email(String recipient, String topic, String content) {
        this.content = content;
        this.topic = topic;
        this.recipient = recipient;
        this.status = Status.NEW;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
