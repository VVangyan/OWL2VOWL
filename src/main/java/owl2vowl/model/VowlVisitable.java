/*
 * VowlVisitable.java
 *
 */

package owl2vowl.model;

import owl2vowl.model.visitor.VowlElementVisitor;

/**
 *
 */
public interface VowlVisitable {

	void accept(VowlElementVisitor visitor);
}
