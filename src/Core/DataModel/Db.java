package Core.DataModel;

import Core.ClientModel.Client;

import java.util.ArrayList;

public class Db<C extends Client> implements Repository<C> {

    ArrayList<C> users = new ArrayList<>();

    @Override
    public void add(C user) {
        users.add(user);
    }

    @Override
    public C getByName(String name) {
        for (C user : users) {
            if (user.name == name) {
                return user;
            }
        }
        return null;
    }

    @Override
    public C getById(int id) {
        return users.get(id);
    }

    @Override
    public int getCount() {
        return users.size();
    }
}