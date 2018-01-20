package exercise10_struct.struct;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Wladimir on 20.01.2018.
 */
public class SequenceIterator implements Iterator{

    private final List<Struct> children;

    public SequenceIterator(List<Struct> c) {
        this.children = c;
    }


    @Override
    public boolean hasNext() {
        return children.iterator().hasNext();
    }

    @Override
    public Object next() {
        return children.iterator().next();
    }
}
