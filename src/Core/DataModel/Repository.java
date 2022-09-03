package Core.DataModel;

import Core.ClientModel.Client;

public interface Repository<C extends Client> {
    void add(C user);

    C getByName(String name);

    C getById(int id);

    int getCount();

    void remove(int id);
}