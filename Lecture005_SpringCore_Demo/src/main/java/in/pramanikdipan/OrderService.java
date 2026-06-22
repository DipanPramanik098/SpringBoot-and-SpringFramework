package in.pramanikdipan;

import in.pramanikdipan.payment.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//
    private PaymentService paymentService;
//    @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();

        System.out.println("Order Placed");
    }
}
