package Core.DataModel;

import Core.ClientModel.Client;

import java.util.Iterator;

public interface Repository<C extends Client>{
    void add(C user);

    C getByName(String name);

    C getById(int id);

    int getCount();

    //Iterator iterator();

    //int getId();

    void remove(int id);
}