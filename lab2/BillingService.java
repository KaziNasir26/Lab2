package lab2;

import java.util.ArrayList;
import java.util.List;

public class BillingService {
    private List<Billing> billings = new ArrayList<>();

    public void addBilling(Billing billing) {
        billings.add(billing);
    }

    public void updateBilling(Billing billing) {
        for (int i = 0; i < billings.size(); i++) {
            if (billings.get(i).getId() == billing.getId()) {
                billings.set(i, billing);
                break;
            }
        }
    }

    public Billing getBilling(int id) {
        for (Billing billing : billings) {
            if (billing.getId() == id) {
                return billing;
            }
        }
        return null;
    }
}
