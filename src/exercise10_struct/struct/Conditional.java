package exercise10_struct.struct;

public abstract class Conditional implements Struct {

	protected Struct conclusion;
	protected Struct alternative;
	
	public Conditional(Struct conclusion, Struct alternative) {
		this.conclusion = conclusion;
		this.alternative = alternative;
	}

	public Struct getConclusion() {
		return conclusion;
	}

	public Struct getAlternative() {
		return alternative;
	}
	
}
