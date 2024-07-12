package lab2;

public class Billing extends Entity {
    private int clientId;
    private int reservationId;
    private double amount;
    private String billingDate;

    public Billing(int id, int clientId, int reservationId, double amount, String billingDate) {
        setId(id);
        this.clientId = clientId;
        this.reservationId = reservationId;
        this.amount = amount;
        this.billingDate = billingDate;
    }

    // Getters and setters
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }
}
