interface Notifier {
    void send(String message);
}

abstract class BaseNotifier implements Notifier {
    protected String recipient;

    public BaseNotifier(String recipient) {
        this.recipient = recipient;
    }
}

class EmailNotifier extends BaseNotifier {
    public EmailNotifier(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class SMSNotifier extends BaseNotifier {
    public SMSNotifier(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

    class Mains {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier("user@example.com");
        Notifier sms = new SMSNotifier("123-456-7890");
        email.send("Meeting at 10 AM");
        sms.send("Your order has shipped");
    }
}