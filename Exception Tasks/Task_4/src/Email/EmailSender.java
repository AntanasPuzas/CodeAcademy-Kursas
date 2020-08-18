package Email;

import Exceptions.NetworkException;
import Utilities.NetworkConnector;

import java.util.List;

public class EmailSender {
    public void sendEmail(List<Email> emailList) throws InterruptedException {
        for (Email email : emailList) {
            System.out.println("Sending email to " + email.getRecipient());
            try {
                NetworkConnector.send(email);
                email.setStatus(Status.SENT);
                System.out.println("Email to " + email.getRecipient() + " delivered");
                System.out.println();
            } catch (NetworkException ex) {
                new NetworkException();
                System.out.println("Failed to send an email to " + email.getRecipient());
                System.out.println();
                Thread.sleep(3000);
                System.out.println("Redelivering email to " + email.getRecipient());
                email.setStatus(Status.RE_SENT);
                try {
                    NetworkConnector.send(email);
                    email.setStatus(Status.SENT);
                    System.out.println("Email to " + email.getRecipient() + " delivered");
                    System.out.println();
                } catch (NetworkException ex2) {
                    new NetworkException();
                    System.out.println("Failed to send an email to " + email.getRecipient());
                    System.out.println("Not sending this email anymore, fuck off");
                    System.out.println();
                }
            }
        }
    }
}
