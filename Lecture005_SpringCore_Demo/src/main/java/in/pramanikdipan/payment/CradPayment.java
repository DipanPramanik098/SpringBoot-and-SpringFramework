package in.pramanikdipan.payment;

import org.springframework.stereotype.Component;

@Component
public class CradPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Paying Via Card");
    }
}
