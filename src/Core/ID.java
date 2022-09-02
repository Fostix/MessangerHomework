package Core;

import java.util.Objects;
import java.util.Random;

public class ID {
    private Integer id;

    public ID() {
        Random r = new Random();
        this.id = r.nextInt(Integer.MAX_VALUE);
    }

    public ID(Integer id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID id1 = (ID) o;
        return Objects.equals(id, id1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
