package exercise10_struct.struct;

import java.util.Iterator;
import java.util.List;

public class Sequence implements Struct , Iterable{

	protected List<Struct> children;


	private SequenceIterator iterator;

	public Sequence(List<Struct> c) {
		children = c;
		iterator = new SequenceIterator(c);
	}

	@Override
	public Iterator iterator() {
		return iterator;
	}

	@Override
	public void accept(StructVisitor s) {
		s.visitSequence(this);
	}
}
