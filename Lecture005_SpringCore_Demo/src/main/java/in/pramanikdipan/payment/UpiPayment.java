package in.pramanikdipan.payment;

public class UpiPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Paying Via UPI");
    }
}
