package exercise10_struct.struct;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Wladimir on 20.01.2018.
 */
public class Interpreter implements StructVisitor {

    private HashMap<String, Integer> variables = new HashMap<>();

    @Override
    public void visitSequence(Sequence s) {
        Iterator i = s.iterator();
        Struct str;
        while (i.hasNext()) {
            str = (Struct) i.next();
            str.accept(this);
        }
    }

    @Override
    public void visitAssignZeroCommand(AssignZeroCommand c) {

        String varName = c.getVar();
        variables.put(varName, 0);

    }

    @Override
    public void visitAssignPlusOneCommand(AssignPlusNCommand c) {
        String varName = c.getVar();

        if (variables.containsKey(varName))
            variables.put(varName, variables.get(varName) + c.getN());

        else variables.put(varName, c.getN());
    }

    @Override
    public void visitLessThanConditional(LessThanConditional c) {

        if (variables.get(c.getVarX()) < variables.get(c.getVarY()) ){
            c.conclusion.accept(this);
        } else{
            c.alternative.accept(this);
        }
    }

    public void printVariables(){
        for (Map.Entry<String, Integer> entry : variables.entrySet()){
            System.out.println(entry.getKey()+ " = " + entry.getValue());
        }
    }
}
