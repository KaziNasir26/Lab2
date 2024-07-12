package lab2;

public class CareProfile extends Entity {
    private String feedingInstructions;
    private String medicationList;
    private String medicationInstructions;
    private int petId;

    public CareProfile(int id, String feedingInstructions, String medicationList, String medicationInstructions, int petId) {
        setId(id);
        this.feedingInstructions = feedingInstructions;
        this.medicationList = medicationList;
        this.medicationInstructions = medicationInstructions;
        this.petId = petId;
    }


}
