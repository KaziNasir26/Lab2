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


}
