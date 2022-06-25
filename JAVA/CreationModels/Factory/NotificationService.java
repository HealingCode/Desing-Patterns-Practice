public class NotificationService{
  public static void main(String[] args) {
    NotificationFactory notificatinFactory = new NotificationFactory();
    Notification notificationSMS = notificatinFactory.createNotification("SMS");
    Notification notificationEmail = notificatinFactory.createNotification("EMAIL");
    Notification notificationPuhs = notificatinFactory.createNotification("PUSH");

    notificationSMS.notifyUser();
    notificationEmail.notifyUser();
    notificationPuhs.notifyUser();
  }
}
