package semweb;
import impl.*;
import java.util.Collection;

import javax.persistence.Entity;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: College <br>
 * @version generated on Sat Apr 03 10:21:32 IST 2021 by prateksha
 */

@Entity
public interface College extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#admits
     */
     
    /**
     * Gets all property values for the admits property.<p>
     * 
     * @returns a collection of values for the admits property.
     */
    Collection<? extends Student> getAdmits();

    /**
     * Checks if the class has a admits property value.<p>
     * 
     * @return true if there is a admits property value.
     */
    boolean hasAdmits();

    /**
     * Adds a admits property value.<p>
     * 
     * @param newAdmits the admits property value to be added
     */
    void addAdmits(Student newAdmits);

    /**
     * Removes a admits property value.<p>
     * 
     * @param oldAdmits the admits property value to be removed.
     */
    void removeAdmits(Student oldAdmits);


    /* ***************************************************
     * Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#employs
     */
     
    /**
     * Gets all property values for the employs property.<p>
     * 
     * @returns a collection of values for the employs property.
     */
    Collection<? extends Professor> getEmploys();

    /**
     * Checks if the class has a employs property value.<p>
     * 
     * @return true if there is a employs property value.
     */
    boolean hasEmploys();

    /**
     * Adds a employs property value.<p>
     * 
     * @param newEmploys the employs property value to be added
     */
    void addEmploys(Professor newEmploys);

    /**
     * Removes a employs property value.<p>
     * 
     * @param oldEmploys the employs property value to be removed.
     */
    void removeEmploys(Professor oldEmploys);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
