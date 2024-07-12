package lab2;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    private List<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void updatePayment(Payment payment) {
        for (int i = 0; i < payments.size(); i++) {
            if (payments.get(i).getId() == payment.getId()) {
                payments.set(i, payment);
                break;
            }
        }
    }

    public Payment getPayment(int id) {
        for (Payment payment : payments) {
            if (payment.getId() == id) {
                return payment;
            }
        }
        return null;
    }
}

