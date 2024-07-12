package lab2;

public class Reservation extends Entity {
    private int clientId;
    private int petId;
    private String startDate;
    private String endDate;

    public Reservation(int id, int clientId, int petId, String startDate, String endDate) {
        setId(id);
        this.clientId = clientId;
        this.petId = petId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
