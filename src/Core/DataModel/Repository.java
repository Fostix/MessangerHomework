package Core.DataModel;

import Core.ClientModel.Client;
import Core.ClientModel.Model;

public interface Repository<M extends Model>{
    void add(M model);

    M getById(int id);

    int getCount();

    String remove(int id);
}