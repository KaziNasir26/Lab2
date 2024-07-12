package lab2;

public class Pet extends Entity {
    private String name;
    private String type;
    private String breed;
    private int age;
    private int careProfileId;
    private int clientId;

    public Pet(int id, String name, String type, String breed, int age, int careProfileId, int clientId) {
        setId(id);
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.careProfileId = careProfileId;
        this.clientId = clientId;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public  getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCareProfileId() {
        return careProfileId;
    }

    public void setCareProfileId(int careProfileId) {
        this.careProfileId = careProfileId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}

