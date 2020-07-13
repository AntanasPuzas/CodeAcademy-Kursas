package Email;

import Exceptions.NetworkException;
import Utilities.NetworkConnector;

import java.util.List;

public class EmailSender {
    public void sendEmail(List<Email> emailList) throws InterruptedException {
        NetworkConnector connector = new NetworkConnector();
        for (Email email : emailList) {
            System.out.println("Sending email to " + email.getRecipient());
            try {
                connector.send(email);
                email.setStatus(Status.SENT);
                System.out.println("Email to " + email.getRecipient() + " delivered");
                System.out.println();
            } catch (NetworkException ex) {
                System.out.println("Failed to send email to " + email.getRecipient());
                System.out.println();
                email.setStatus(Status.RE_SENT);
                Thread.sleep(3000);
                System.out.println("Redelivering email to " + email.getRecipient());
                System.out.println("Email to " + email.getRecipient() + " delivered");
                System.out.println();
            }
        }
    }
}
