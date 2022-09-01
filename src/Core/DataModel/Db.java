package Core.DataModel;

import Core.ClientModel.Client;
import Core.Repository;

import java.util.ArrayList;

public class Db implements Repository {

    ArrayList<Client> users = new ArrayList<>();

    @Override
    public void add(Client user) {
        users.add(user);
    }

    @Override
    public Client getByName(String name) {
        for (Client user : users) {
            if (user.name == name) {
                return user;
            }
        }
        return null;
    }

    @Override
    public Client getById(int id) {

        return users.get(id);
    }

    @Override
    public int getCount() {

        return users.size();
    }

}