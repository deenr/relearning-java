package oop;

public class Polymorphism {
    public static void main(String[] args) {
        NotificationHandler handler = new NotificationHandler();

        SMSNotification smsNotification = new SMSNotification();
        handler.trigger(smsNotification);
        
        EmailNotification emailNotification = new EmailNotification();
        handler.trigger(emailNotification);
        
        PushNotification pushNotification = new PushNotification();
        handler.trigger(pushNotification); 
    }
}

class NotificationHandler {
    void trigger(Notification notification) {
        notification.send();
    }
}

interface Notification {
    void send();
}

class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("An SMS has been sent!");
    }
}

class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("An email has been sent!");
    }
}

class PushNotification implements Notification {
    @Override
    public void send() {
        System.out.println("A notification has been pushed!");
    }
}

