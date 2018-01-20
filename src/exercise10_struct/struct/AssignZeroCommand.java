package exercise10_struct.struct;

public class AssignZeroCommand extends AssignCommand {

	public AssignZeroCommand(String var) {
		super(var);
	}

	@Override
	public void accept(StructVisitor s) {
		s.visitAssignZeroCommand(this);
	}
}
