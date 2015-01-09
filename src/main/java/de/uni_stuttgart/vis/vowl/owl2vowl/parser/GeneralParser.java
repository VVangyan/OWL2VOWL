/*
 * GeneralParsing.java
 *
 */

package de.uni_stuttgart.vis.vowl.owl2vowl.parser;

import de.uni_stuttgart.vis.vowl.owl2vowl.constants.Annotations;
import de.uni_stuttgart.vis.vowl.owl2vowl.constants.Standard_Iris;
import de.uni_stuttgart.vis.vowl.owl2vowl.constants.Vowl_Lang;
import de.uni_stuttgart.vis.vowl.owl2vowl.model.nodes.BaseNode;
import de.uni_stuttgart.vis.vowl.owl2vowl.model.nodes.classes.OwlThing;
import de.uni_stuttgart.vis.vowl.owl2vowl.parser.container.MapData;
import de.uni_stuttgart.vis.vowl.owl2vowl.parser.container.OntologyInformation;
import de.uni_stuttgart.vis.vowl.owl2vowl.pipes.FormatText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

import java.util.*;

/**
 *
 */
public class GeneralParser {
	private static final Logger logger = LogManager.getLogger(GeneralParser.class);
	private static final boolean LOG_ANNOTATIONS = false;
	protected OntologyInformation ontologyInformation;
	protected OWLOntology ontology;
	protected OWLDataFactory factory;
	protected MapData mapData;
	protected String rdfsLabel = "";
	protected String rdfsComment = "";
	protected String rdfsIsDefinedBy = "";
	protected String owlVersionInfo = "";
	protected Boolean isDeprecated = false;
	protected Map<String, String> comments;
	protected Map<String, String> languageToLabel;
	protected String iri;
	protected OWLOntologyManager ontologyManager;

	public GeneralParser(OntologyInformation ontologyInformation, MapData mapData) {
		this.ontologyInformation = ontologyInformation;
		this.mapData = mapData;
		ontology = ontologyInformation.getOntology();
		factory = ontologyInformation.getFactory();
		ontologyManager = ontologyInformation.getManager();
		languageToLabel = new HashMap<String, String>();
	}

	public String getIri() {
		return iri;
	}

	public void setIri(String iri) {
		this.iri = iri;
	}

	public void parseAnnotations(OWLEntity entity) {
		reset();

		OWLAnnotationProperty labelProp = factory.getOWLAnnotationProperty(OWLRDFVocabulary.RDFS_LABEL.getIRI());
		OWLAnnotationProperty commentProp = factory.getOWLAnnotationProperty(OWLRDFVocabulary.RDFS_COMMENT.getIRI());

		languageToLabel = parseLanguage(entity, labelProp);
		languageToLabel.put(Vowl_Lang.LANG_DEFAULT, FormatText.cutQuote(extractNameFromIRI(entity.getIRI().toString())));
		comments = parseLanguage(entity, commentProp);

		for (OWLOntology currentOntology : ontologyManager.getOntologies()) {
			for (OWLAnnotation owlPropAno : entity.getAnnotations(currentOntology)) {
				OWLAnnotationProperty annotationProperty = owlPropAno.getProperty();
				OWLAnnotationValue annotationValue = owlPropAno.getValue();

				if (annotationProperty.isComment()) {
					rdfsComment = annotationValue.toString();
				} else if (annotationProperty.isDeprecated()) {
					isDeprecated = true;
				} else if (annotationProperty.isLabel()) {
					rdfsLabel = annotationValue.toString();
				} else if (annotationProperty.toString().equals(Annotations.RDFS_DEFINED_BY)) {
					rdfsIsDefinedBy = annotationValue.toString();
				} else if (annotationProperty.toString().equals(Annotations.OWL_VERSIONINFO)) {
					owlVersionInfo = annotationValue.toString();
				} else if (LOG_ANNOTATIONS) {
					System.out.println("Not used annotation: " + owlPropAno);
				}
			}
		}
	}

	protected void reset() {
		rdfsLabel = "";
		rdfsComment = "";
		isDeprecated = false;
		rdfsIsDefinedBy = "";
		owlVersionInfo = "";
		languageToLabel = null;
	}

	/**
	 * Logs all axioms of the given entity.
	 *
	 * @param entity The desired entity.
	 */
	protected void logAxioms(OWLEntity entity) {
		logger.info(entity);

		for (OWLAxiom owlAxiom : entity.getReferencingAxioms(ontology)) {
			logger.info("\tAxiom: " + owlAxiom);
		}
	}

	/**
	 * Processes all available languages in the given rdf property of the owl entity.
	 *
	 * @param entity   The entity to search in,
	 * @param property The desired property like rdf:comment or rdfs:label
	 * @return A mapping of language to the value.
	 */
	protected Map<String, String> parseLanguage(OWLEntity entity, OWLAnnotationProperty property) {
		Map<String, String> workingMap = new HashMap<String, String>();

		for (OWLOntology owlOntology : ontologyManager.getOntologies()) {
			for (OWLAnnotation owlAnnotation : entity.getAnnotations(owlOntology, property)) {
				if (owlAnnotation.getValue() instanceof OWLLiteral) {
					OWLLiteral val = (OWLLiteral) owlAnnotation.getValue();

					if (val.isRDFPlainLiteral()) {
						if (val.getLang().isEmpty()) {
							workingMap.put(Vowl_Lang.LANG_UNSET, val.getLiteral());
							mapData.getAvailableLanguages().add(Vowl_Lang.LANG_UNSET);
						} else {
							workingMap.put(val.getLang(), val.getLiteral());
							mapData.getAvailableLanguages().add(val.getLang());
						}
					}
				}
			}
		}

		return workingMap;
	}

	protected String extractNameFromIRI(String iri) {
		String name;

		if (iri.contains("#")) {
			// IRI contains a # -> take name behind #
			name = iri.substring(iri.indexOf("#") + 1);
		} else {
			if (iri.contains("/")) {
				// IRI contains / -> take name behind the last /
				name = iri.substring(iri.lastIndexOf("/") + 1);
			} else {
				// No suitable name found.
				name = "";
			}
		}

		return name;
	}

	protected BaseNode findNode(String nodeIRI) {
		return mapData.findNode(nodeIRI);
	}

	/**
	 * Returns a list of nodes which could be found.
	 * Logs the iri if the corresponding node couldn't be found.
	 * @param nodeIRIS The desired IRIs.
	 * @return A list of nodes.
	 */
	protected List<BaseNode> findNodes(List<String> nodeIRIS) {
		List<BaseNode> nodes = new ArrayList<BaseNode>();

		for (String s : nodeIRIS) {
			// Skip Things
			if (s.equals(Standard_Iris.OWL_THING_CLASS_URI)) {
				continue;
			}

			BaseNode node = mapData.findNode(s);

			if (node != null) {
				nodes.add(node);
			} else {
				logger.error("Could not find node: " + s);
			}
		}

		return nodes;
	}

	/**
	 * Searches for a thing which is not connected to any class. Only possible connections are:
	 * Things, Literal and Datatypes
	 * TODO vielleicht sofort neues erzeugen, wenn keins vorhanden?
	 *
	 * @return The id of a not connected thing.
	 */
	protected BaseNode getDisconnectedThing() {
		for (Map.Entry<String, OwlThing> i : mapData.getThingMap().entrySet()) {
			if (i.getValue().isFree()) {
				return i.getValue();
			}
		}

		OwlThing newThing = new OwlThing();
		mapData.getThingMap().put(newThing.getId(), newThing);

		return newThing;
	}

	public void handleOntologyInfo() {
		OntoInfoParser parser = new OntoInfoParser(ontologyInformation, mapData);
		parser.execute();
	}

	public void handleClass(Set<OWLClass> classes) {
		GeneralParser parser = new ClassParser(ontologyInformation, mapData, classes);
		parser.execute();
	}

	public void handleDatatype(Set<OWLDatatype> datatypes) {
		GeneralParser parser = new DatatypeParser(ontologyInformation, mapData, datatypes);
		parser.execute();
	}

	public void handleObjectProperty(Set<OWLObjectProperty> objectProperties) {
		GeneralParser parser = new ObjectPropertyParser(ontologyInformation, mapData, objectProperties);
		parser.execute();
	}

	public void handleDatatypeProperty(Set<OWLDataProperty> dataProperties) {
		GeneralParser parser = new DatatypePropertyParser(ontologyInformation, mapData, dataProperties);
		parser.execute();
	}

	/**
	 * Should be implemented in inherited classes.
	 */
	protected void execute() {
	}
}
