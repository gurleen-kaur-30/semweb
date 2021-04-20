package semweb;
import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: PhD <br>
 * @version generated on Sat Apr 03 10:21:32 IST 2021 by prateksha
 */

public interface PhD extends Student {

    /* ***************************************************
     * Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasDebt
     */
     
    /**
     * Gets all property values for the hasDebt property.<p>
     * 
     * @returns a collection of values for the hasDebt property.
     */
    Collection<? extends Integer> getHasDebt();

    /**
     * Checks if the class has a hasDebt property value.<p>
     * 
     * @return true if there is a hasDebt property value.
     */
    boolean hasHasDebt();

    /**
     * Adds a hasDebt property value.<p>
     * 
     * @param newHasDebt the hasDebt property value to be added
     */
    void addHasDebt(Integer newHasDebt);

    /**
     * Removes a hasDebt property value.<p>
     * 
     * @param oldHasDebt the hasDebt property value to be removed.
     */
    void removeHasDebt(Integer oldHasDebt);



    /* ***************************************************
     * Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasRollNumber
     */
     
    /**
     * Gets all property values for the hasRollNumber property.<p>
     * 
     * @returns a collection of values for the hasRollNumber property.
     */
    Collection<? extends Integer> getHasRollNumber();

    /**
     * Checks if the class has a hasRollNumber property value.<p>
     * 
     * @return true if there is a hasRollNumber property value.
     */
    boolean hasHasRollNumber();

    /**
     * Adds a hasRollNumber property value.<p>
     * 
     * @param newHasRollNumber the hasRollNumber property value to be added
     */
    void addHasRollNumber(Integer newHasRollNumber);

    /**
     * Removes a hasRollNumber property value.<p>
     * 
     * @param oldHasRollNumber the hasRollNumber property value to be removed.
     */
    void removeHasRollNumber(Integer oldHasRollNumber);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
