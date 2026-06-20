package in.pramanikdipan;

import in.pramanikdipan.notification.EmailService;
import in.pramanikdipan.notification.NotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NotificationService notification = new EmailService();
//        OrderService order = new OrderService(notification);
        OrderService order = new OrderService();
        order.setNotification(notification);
        order.placeOrder();
    }
}

// IoC --> Inversion Of Control