package lab2;

public class Client extends Entity {
    private String name;
    private String phoneNumber;
    private String address;

    public Client(int id, String name, String phoneNumber, String address) {
        setId(id);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


}

