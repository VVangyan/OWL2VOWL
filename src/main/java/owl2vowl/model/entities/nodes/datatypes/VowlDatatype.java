/*
 * VowlDatatype.java
 *
 */

package owl2vowl.model.entities.nodes.datatypes;

import owl2vowl.constants.NodeType;
import owl2vowl.model.visitor.VowlElementVisitor;
import org.semanticweb.owlapi.model.IRI;

/**
 *
 */
public class VowlDatatype extends AbstractDatatype {
	public VowlDatatype(IRI iri) {
		super(iri, NodeType.TYPE_DATATYPE);
	}

	@Override
	public void accept(VowlElementVisitor visitor) {
		visitor.visit(this);
	}
}
