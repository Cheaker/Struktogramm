package exercise10_struct.struct;

import java.util.Iterator;
import java.util.List;

public class Sequence implements Struct {

	protected List<Struct> children;


	private SequenceIterator iterator;

	public Sequence(List<Struct> c) {
		children = c;
		iterator = new SequenceIterator(c);
	}

	public Iterator getIterator() {
		return iterator.iterator();
	}



}
