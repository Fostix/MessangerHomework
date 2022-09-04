package Core.DataModel;

import Core.ClientModel.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseStorage<M extends Model> implements Iterable, Repository<M> {
    protected List<M> base = new ArrayList<>();

    @Override
    public Iterator iterator() {
        Iterator<M> iterator = new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < base.size();
            }

            @Override
            public M next() {
                return base.get(index++);
            }
        };
        return iterator;
    }

    @Override
    public void add(M model) {
        base.add(model);
    }

    @Override
    public M getById(int id) {
        return base.get(id);
    }

    @Override
    public int getCount() {
        return base.size();
    }

    @Override
    public String remove(int id) {
        return base.remove(id).toString();
    }

    @Override
    public boolean equals(Object o) {
        return base.contains(o);
    }
}