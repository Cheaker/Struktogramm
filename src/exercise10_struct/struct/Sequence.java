package exercise10_struct.struct;

import java.util.List;

public class Sequence implements Struct {
	
	protected List<Struct> children;
	
	public Sequence(List<Struct> c) {
		children = c;
	}
	
}
