package xyz.LogicalDevz.MailSender;

public class NotNetworkException extends RuntimeException {


    public NotNetworkException() {
        super("NotNetworkException, you need internet connection to send the email");
    }

    public NotNetworkException(String detailMessage) {
        super(detailMessage);
    }
}
