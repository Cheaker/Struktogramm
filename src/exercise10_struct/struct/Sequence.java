package exercise10_struct.struct;

import java.util.Iterator;
import java.util.List;

public class Sequence implements Struct , Iterable{

	protected List<Struct> children;


	public Sequence(List<Struct> c) {
		children = c;

	}

	@Override
	public Iterator iterator() {
		return children.iterator();
	}

	@Override
	public void accept(StructVisitor s) {
		s.visitSequence(this);
	}
}
