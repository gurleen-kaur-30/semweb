package impl;

import semweb.*;

import java.io.Serializable;
import java.net.URI;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultIMTech <br>
 * @version generated on Sat Apr 03 10:21:32 IST 2021 by prateksha
 */

@Entity
public class DefaultIMTech extends WrappedIndividualImpl implements IMTech, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long id;

	private Collection<? extends Integer> debt;
	private String name;

	public DefaultIMTech(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
        this.debt = getHasDebt();
        name = iri.getShortForm();
    	System.out.println(this.debt);
    }





    /* ***************************************************
     * Data Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasDebt
     */
     
    public Collection<? extends Integer> getHasDebt() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDEBT, Integer.class);
    }

    public boolean hasHasDebt() {
		return !getHasDebt().isEmpty();
    }

    public void addHasDebt(Integer newHasDebt) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDEBT, newHasDebt);
    }

    public void removeHasDebt(Integer oldHasDebt) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDEBT, oldHasDebt);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/prateksha/ontologies/2021/1/college#hasRollNumber
     */
     
    public Collection<? extends Integer> getHasRollNumber() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASROLLNUMBER, Integer.class);
    }

    public boolean hasHasRollNumber() {
		return !getHasRollNumber().isEmpty();
    }

    public void addHasRollNumber(Integer newHasRollNumber) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASROLLNUMBER, newHasRollNumber);
    }

    public void removeHasRollNumber(Integer oldHasRollNumber) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASROLLNUMBER, oldHasRollNumber);
    }


}
