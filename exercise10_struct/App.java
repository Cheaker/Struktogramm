package exercise10_struct;

import java.util.Arrays;

import exercise10_struct.struct.AssignPlusNCommand;
import exercise10_struct.struct.AssignZeroCommand;
import exercise10_struct.struct.LessThanConditional;
import exercise10_struct.struct.Sequence;
import exercise10_struct.struct.Struct;

public class App {

	public static void main(String[] args) {
		Struct p = new Sequence(Arrays.asList(
				       new AssignZeroCommand("res"),
		               new AssignPlusNCommand("x", 2),
		               new LessThanConditional("x", "y",
		            	   new AssignPlusNCommand("res", 1),
		            	   new Sequence(Arrays.asList()))));
	}

}
