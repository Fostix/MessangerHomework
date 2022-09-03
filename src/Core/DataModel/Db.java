package Core.DataModel;

import Core.ClientModel.Client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Db<C extends Client> implements Repository<C>, Iterable {
    ArrayList<C> users = new ArrayList<>();

    @Override
    public void add(C user) {
        users.add(user);
    }

    @Override
    public C getByName(String name) {
        for (C user : users) {
            if (user.getName() == name) {
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

    @Override
    public void remove(int id) {
        users.remove(id);
    }

    @Override
    public boolean equals(Object o) {
        return users.contains(o);
    }

    @Override
    public Iterator iterator() {
        Iterator<C> iterator = new Iterator<C>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public C next() {
                return users.get(index++);
            }
        };
        return iterator;
    }
}