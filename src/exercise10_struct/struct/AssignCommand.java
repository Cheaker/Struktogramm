package exercise10_struct.struct;

public abstract class AssignCommand implements Struct {
	
	protected String var;
	
	public AssignCommand(String var) {
		this.var = var;
	}
	
	public String getVar() {
		return var;
	}
	
}
