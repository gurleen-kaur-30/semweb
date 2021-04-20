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
 * Source Class: Professor <br>
 * @version generated on Sat Apr 03 10:21:32 IST 2021 by prateksha
 */

public interface Professor extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#teaches
     */
     
    /**
     * Gets all property values for the teaches property.<p>
     * 
     * @returns a collection of values for the teaches property.
     */
    Collection<? extends Course> getTeaches();

    /**
     * Checks if the class has a teaches property value.<p>
     * 
     * @return true if there is a teaches property value.
     */
    boolean hasTeaches();

    /**
     * Adds a teaches property value.<p>
     * 
     * @param newTeaches the teaches property value to be added
     */
    void addTeaches(Course newTeaches);

    /**
     * Removes a teaches property value.<p>
     * 
     * @param oldTeaches the teaches property value to be removed.
     */
    void removeTeaches(Course oldTeaches);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
