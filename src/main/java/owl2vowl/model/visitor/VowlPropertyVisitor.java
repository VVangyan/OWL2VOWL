/*
 * VowlPropertyVisitor.java
 *
 */

package owl2vowl.model.visitor;

import owl2vowl.model.entities.properties.TypeOfProperty;
import owl2vowl.model.entities.properties.VowlDatatypeProperty;
import owl2vowl.model.entities.properties.VowlObjectProperty;

/**
 *
 */
public interface VowlPropertyVisitor {
	void visit(VowlObjectProperty vowlObjectProperty);

	void visit(VowlDatatypeProperty vowlDatatypeProperty);

	void visit(TypeOfProperty typeOfProperty);
}
