package exercise10_struct.struct;

public class LessThanConditional extends Conditional {
	
	protected String varX, varY;
	
	public LessThanConditional(String varX, String varY, Struct conclusion, Struct alternative) {
		super(conclusion, alternative);
		
		this.varX = varX;
		this.varY = varY;
	}

	public String getVarX() {
		return varX;
	}

	public String getVarY() {
		return varY;
	}

	@Override
	public void accept(StructVisitor s) {
		s.visitLessThanConditional(this);
	}
}
