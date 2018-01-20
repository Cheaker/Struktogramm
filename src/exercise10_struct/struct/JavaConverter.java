package exercise10_struct.struct;

import java.util.Iterator;

/**
 * Created by Wladimir on 20.01.2018.
 */
public class JavaConverter implements StructVisitor {
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
        System.out.println(c.getVar() + " = " + 0);
    }

    @Override
    public void visitAssignPlusOneCommand(AssignPlusNCommand c) {
        System.out.println(c.getVar() + " = " + c.getVar() + " + " + c.getN());
    }

    @Override
    public void visitLessThanConditional(LessThanConditional c) {
        System.out.println("if ("+c.getVarX()+" < "+ c.getVarY() + "){" );
        c.conclusion.accept(this);
        System.out.println("} else {");
        c.alternative.accept(this);
        System.out.println("}");
    }
}
