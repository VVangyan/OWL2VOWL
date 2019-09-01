/*
 * VowlClassVisitor.java
 *
 */

package owl2vowl.model.visitor;

import owl2vowl.model.entities.nodes.classes.VowlClass;
import owl2vowl.model.entities.nodes.classes.VowlThing;
import owl2vowl.model.entities.nodes.datatypes.VowlDatatype;
import owl2vowl.model.entities.nodes.datatypes.VowlLiteral;

/**
 *
 */
public interface VowlClassVisitor {
	void visit(VowlThing vowlThing);

	void visit(VowlClass vowlClass);

	void visit(VowlLiteral vowlLiteral);

	void visit(VowlDatatype vowlDatatype);
}
