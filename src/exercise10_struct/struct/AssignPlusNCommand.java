package exercise10_struct.struct;

public class AssignPlusNCommand extends AssignCommand {

	protected int n;
	
	public AssignPlusNCommand(String var, int n) {
		super(var);
		
		this.n = n;
	}

	public int getN() {
		return n;
	}	
}
