package semweb;



import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;

/**
 * Vocabulary class to provide access to the Manchester OWL API representatives for 
 * various entities in the ontology used to generate this code.<p> 
 * 
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: ${javaClass}
 *
 * @version generated on Sat Apr 03 10:21:32 IST 2021 by prateksha
 */

public class Vocabulary {

	private static final OWLDataFactory factory = OWLManager.createOWLOntologyManager().getOWLDataFactory();

    /* ***************************************************
     * Class http://www.semanticweb.org/prateksha/ontologies/2021/1/college#College
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class COLLEGE.<p>
     * 
     */
    public static final OWLClass CLASS_COLLEGE = factory.getOWLClass(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#College"));

    /* ***************************************************
     * Class http://www.semanticweb.org/prateksha/ontologies/2021/1/college#Course
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class COURSE.<p>
     * 
     */
    public static final OWLClass CLASS_COURSE = factory.getOWLClass(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#Course"));

    /* ***************************************************
     * Class http://www.semanticweb.org/prateksha/ontologies/2021/1/college#MTech
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class MTECH.<p>
     * 
     */
    public static final OWLClass CLASS_MTECH = factory.getOWLClass(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#MTech"));

    /* ***************************************************
     * Class http://www.semanticweb.org/prateksha/ontologies/2021/1/college#PhD
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class PHD.<p>
     * 
     */
    public static final OWLClass CLASS_PHD = factory.getOWLClass(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#PhD"));

    /* ***************************************************
     * Class http://www.semanticweb.org/prateksha/ontologies/2021/1/college#Professor
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class PROFESSOR.<p>
     * 
     */
    public static final OWLClass CLASS_PROFESSOR = factory.getOWLClass(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#Professor"));

    /* ***************************************************
     * Class http://www.semanticweb.org/prateksha/ontologies/2021/1/college#Student
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class STUDENT.<p>
     * 
     */
    public static final OWLClass CLASS_STUDENT = factory.getOWLClass(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#Student"));

    /* ***************************************************
     * Class http://www.semanticweb.org/prateksha/ontologies/2021/1/college#iMTech
     */

    /**
     * A constant to give access to the Manchester OWL api representation of the class IMTECH.<p>
     * 
     */
    public static final OWLClass CLASS_IMTECH = factory.getOWLClass(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#iMTech"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#admits
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property ADMITS.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_ADMITS = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#admits"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#employs
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property EMPLOYS.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_EMPLOYS = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#employs"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#taughtBy
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property TAUGHTBY.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_TAUGHTBY = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#taughtBy"));

    /* ***************************************************
     * Object Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#teaches
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the object property TEACHES.<p>
     * 
     */
    public static final OWLObjectProperty OBJECT_PROPERTY_TEACHES = factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#teaches"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasDebt
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HASDEBT.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HASDEBT = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasDebt"));

    /* ***************************************************
     * Data Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasRollNumber
     */
     
    /**
     * A constant to give access to the Manchester OWL API representation of the data property HASROLLNUMBER.<p>
     * 
     */
    public static final OWLDataProperty DATA_PROPERTY_HASROLLNUMBER = factory.getOWLDataProperty(IRI.create("http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasRollNumber"));


}
