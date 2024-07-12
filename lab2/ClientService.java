package lab2;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void updateClient(Client client) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == client.getId()) {
                clients.set(i, client);
                break;
            }
        }
    }

    public Client getClient(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }
}
