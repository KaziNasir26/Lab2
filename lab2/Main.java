package lab2;

public class Main {
    public static void main(String[] args) {
        // Initialize services
        ClientService clientService = new ClientService();
        PetService petService = new PetService();
        CareProfileService careProfileService = new CareProfileService();
        ReservationService reservationService = new ReservationService();
        BillingService billingService = new BillingService();
        PaymentService paymentService = new PaymentService();

        // Add a new client
        Client client = new Client(1, "John Doe", "555-1234", "123 Elm Street");
        clientService.addClient(client);

        // Add a new pet
        Pet pet = new Pet(1, "Buddy", "Dog", "Golden Retriever", 3, 1, 1);
        petService.addPet(pet);

        // Create a care profile for the pet
        CareProfile careProfile = new CareProfile(1, "Feed twice daily", "None", "N/A", 1);
        careProfileService.addCareProfile(careProfile);

        // Create a reservation
        Reservation reservation = new Reservation(1, 1, 1, "2024-07-01", "2024-07-10");
        reservationService.addReservation(reservation);


        // Create a billing record
        Billing billing = new Billing(1, 1, 1, 300.00, "2024-07-11");
        billingService.addBilling(billing);

        // Create a payment record
        Payment payment = new Payment(1, 1, 300.00, "2024-07-11", "Credit Card");
        paymentService.addPayment(payment);

        // Update client's phone number
        client.setPhoneNumber("555-5678");
        clientService.updateClient(client);

        // Update pet's age
        pet.setAge(4);
        petService.updatePet(pet);

        // Update care profile
        careProfile.setFeedingInstructions("Feed three times daily");
        careProfileService.updateCareProfile(careProfile);

        // Retrieve and print client, pet, reservation, billing, and payment details
        Client retrievedClient = clientService.getClient(1);
        Pet retrievedPet = petService.getPet(1);
        CareProfile retrievedCareProfile = careProfileService.getCareProfile(1);
        Reservation retrievedReservation = reservationService.getReservation(1);
        Billing retrievedBilling = billingService.getBilling(1);
        Payment retrievedPayment = paymentService.getPayment(1);

        System.out.println("Client: " + retrievedClient.getName() + ", Phone: " + retrievedClient.getPhoneNumber());
        System.out.println("Pet: " + retrievedPet.getName() + ", Age: " + retrievedPet.getAge());
        System.out.println("Care Profile: " + retrievedCareProfile.getFeedingInstructions());
        System.out.println("Reservation: " + retrievedReservation.getStartDate() + " to " + retrievedReservation.getEndDate());
        System.out.println("Billing: Amount - $" + retrievedBilling.getAmount() + ", Date - " + retrievedBilling.getBillingDate());
        System.out.println("Payment: Amount Paid - $" + retrievedPayment.getAmountPaid() + ", Method - " + retrievedPayment.getPaymentMethod());
    }
}
