package Core.DataModel;

import Core.ClientModel.Model;

public class DbUsers<M extends Model> extends BaseStorage<M>{
    public M getByName(String name) {
        for (M user : base) {
            if (base.getName() == name) {
                return user;
            }
        }
        return null;
    }
}