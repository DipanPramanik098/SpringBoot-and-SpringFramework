package in.pramanikdipan;

//import in.pramanikdipan.notification.EmailService;
//import in.pramanikdipan.notification.NotificationService;
//import in.pramanikdipan.notification.PopUpNotificationService;
//import in.pramanikdipan.notification.SmsService;

import in.pramanikdipan.notification.NotificationService;

public class OrderService {
//    EmailService notification = new EmailService();

//    NotificationService notification = new EmailService();
//    NotificationService notification2 = new SmsService();
//    NotificationService notification3 = new PopUpNotificationService();
//

    NotificationService notification;
    public OrderService(NotificationService notification){
        this.notification = notification;
    }
    public OrderService(){

    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder(){
        System.out.println("Order Placed");
//        notification.sendNotification();
//        notification2.sendNotification();
//        notification3.sendNotification();

        notification.sendNotification();
    }
}
//a class should ask what it needs and not build everything itself