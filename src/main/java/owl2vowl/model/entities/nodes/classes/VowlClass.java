/*
 * VowlClass.java
 *
 */

package owl2vowl.model.entities.nodes.classes;

import owl2vowl.constants.NodeType;
import owl2vowl.model.visitor.VowlElementVisitor;
import org.semanticweb.owlapi.model.IRI;

public class VowlClass extends AbstractClass {

	public VowlClass(IRI iri) {
		super(iri, NodeType.TYPE_CLASS);
	}

	@Override
	public void accept(VowlElementVisitor visitor) {
		visitor.visit(this);
	}

}
