/*
 * VowlObjectProperty.java
 *
 */

package owl2vowl.model.entities.properties;

import owl2vowl.constants.PropertyType;
import owl2vowl.constants.VowlAttribute;
import owl2vowl.model.visitor.VowlElementVisitor;
import owl2vowl.model.visitor.VowlPropertyVisitor;
import org.semanticweb.owlapi.model.IRI;

/**
 *
 */
public class VowlObjectProperty extends AbstractProperty {
	public VowlObjectProperty(IRI iri) {
		super(iri, PropertyType.OBJECT);
		addAttribute(VowlAttribute.OBJECT);
	}

	@Override
	public void accept(VowlElementVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void accept(VowlPropertyVisitor visitor) {
		visitor.visit(this);
	}
}
