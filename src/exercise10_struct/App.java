package exercise10_struct;

import java.util.Arrays;

import exercise10_struct.struct.*;

public class App {

	public static void main(String[] args) {
		Struct p = new Sequence(Arrays.asList(
				       new AssignZeroCommand("res"),
		               new AssignPlusNCommand("x", 2),
		               new AssignPlusNCommand("y", 42),
		               new LessThanConditional("x", "y",
		            	   new AssignPlusNCommand("res", 1),
		            	   new Sequence(Arrays.asList()))));

		Interpreter interpreter = new Interpreter();

		p.accept(interpreter);

		interpreter.printVariables();
	}

}
