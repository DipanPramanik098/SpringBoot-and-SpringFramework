package in.pramanikdipan;

import in.pramanikdipan.payment.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        PaymentService s = new PaymentService();
//        OrderService order = new OrderService(s);
//        order.placeOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);

        order.placeOrder();

        PaymentService p = context.getBean(PaymentService.class);
        p.pay();
    }

//    class Student{
//        private Srring name;
//        private int age;
//
//        public Student() {
//
//        }
//        public void getAttendence(){
//
//        }
//        public void print(){
//
//        }
//    }
}
