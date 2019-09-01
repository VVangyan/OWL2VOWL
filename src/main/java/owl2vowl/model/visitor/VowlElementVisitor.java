/*
 * VowlElementVisitor.java
 *
 */

package owl2vowl.model.visitor;

import owl2vowl.model.individuals.VowlIndividual;

/**
 *
 */
public interface VowlElementVisitor extends VowlClassVisitor, VowlPropertyVisitor {
	void visit(VowlIndividual vowlIndividual);
}
