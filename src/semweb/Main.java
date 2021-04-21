package semweb;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import semweb.CollegeProtege_instances;
import impl.*;

public class Main{
	/**
	 * 
	 */


	public static void main(String[] args) {
//		System.out.println("yo");
//	}
		try {
			System.out.println("yo");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/college_db.odb");
//		EntityManager em = emf.createEntityManager();
//		File file = new File("src/college_with_instances.owl");  
//		OWLOntologyManager om = OWLManager.createOWLOntologyManager();
//		OWLOntology o = om.loadOntologyFromOntologyDocument(file);
//		CollegeProtege_instances college = new CollegeProtege_instances(o);
//        Collection<? extends College>  list_colleges = college.getAllCollegeInstances();
//        em.getTransaction().begin();
//        for (College c : list_colleges) {
//        	em.persist(c);
//        	System.out.println(c);
//        }
//
//        	
//        
//        Collection<? extends IMTech> list_students = college.getAllIMTechInstances();
//        for (Student s : list_students) {
//        	em.persist(s);
//            System.out.println(s.getHasDebt());
//        }
//        
//        Collection<? extends MTech> list_mtech = college.getAllMTechInstances();
//        for (Student s : list_mtech) {
//        	em.persist(s);
//            System.out.println(s.getHasDebt());
//        }
//        em.getTransaction().commit();
//
//		MTech m1 = college.getMTech("http://www.semanticweb.org/prateksha/ontologies/2021/1/college/#Rachna");
//		System.out.println(m1);
//		em.close();
//        emf.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

    }
}