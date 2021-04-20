package semweb;
import java.io.File;
import javax.persistence.*;
import java.util.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import com.db4o.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;





import java.io.File;  
public class Main2
{  
	public static void main(String argv[])   
	{  

		try   
		{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("src/college_with_instances.owl");  
			OWLOntologyManager om = OWLManager.createOWLOntologyManager();
			OWLOntology o = om.loadOntologyFromOntologyDocument(file);
			CollegeProtege_instances college = new CollegeProtege_instances(o);
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			// setObjectProperties(doc);
			// setDataProperties(doc);
			
			Class[]  cls = getClasses("semweb");
			HashMap<Class, Method> map = parseClassesToGetMethods(cls);
			createIndividuals(doc, college, map);
			
		}   
		catch (Exception e)   
		{  
			e.printStackTrace();  
		}  
	}  

	public static HashMap<Class, Method> parseClassesToGetMethods(Class[] cls){
		HashMap<Class, Method> map = new HashMap<Class, Method>();
		for(Class c : cls) {
			for(Method m: c.getMethods()) {
				if(m.getName().length() >= 6 && m.getName().substring(0,6).equals("getAll")) {
					map.put(c, m);
				}
			}
		}
		
		return map;
	}
	
	private static Class[] getClasses(String packageName)
	        throws ClassNotFoundException, IOException {
	    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	    assert classLoader != null;
	    String path = packageName.replace('.', '/');
	    Enumeration<URL> resources = classLoader.getResources(path);
	    List<File> dirs = new ArrayList<File>();
	    while (resources.hasMoreElements()) {
	        URL resource = resources.nextElement();
	        dirs.add(new File(resource.getFile()));
	    }
	    ArrayList<Class> classes = new ArrayList<Class>();
	    for (File directory : dirs) {
	        classes.addAll(findClasses(directory, packageName));
	    }
	    return classes.toArray(new Class[classes.size()]);
	}

	/**
	 * Recursive method used to find all classes in a given directory and subdirs.
	 *
	 * @param directory   The base directory
	 * @param packageName The package name for classes found inside the base directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
	    List<Class> classes = new ArrayList<Class>();
	    if (!directory.exists()) {
	        return classes;
	    }
	    File[] files = directory.listFiles();
	    for (File file : files) {
	        if (file.isDirectory()) {
	            assert !file.getName().contains(".");
	            classes.addAll(findClasses(file, packageName + "." + file.getName()));
	        } else if (file.getName().endsWith(".class")) {
	            classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
	        }
	    }
	    return classes;
	}
	public static void createIndividuals(Document doc, CollegeProtege_instances college, HashMap<Class, Method> map) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("college.odb");
		 EntityManager em = emf.createEntityManager();
	     em.getTransaction().begin();

		NodeList instancesList = doc.getElementsByTagName("ClassAssertion");
		for (int itr = 0; itr < instancesList.getLength(); itr++)   
		{  
			Node node = instancesList.item(itr);  
			Element eElement = (Element) node;  
			
			Node classTag = eElement.getElementsByTagName("Class").item(0);
			Element classTagElement = (Element) classTag;
			
			Node namedIndividual = eElement.getElementsByTagName("NamedIndividual").item(0);
			Element namedIndividualElement = (Element) namedIndividual;
			
			String instanceName = namedIndividualElement.getAttribute("IRI");
			String className = classTagElement.getAttribute("IRI");
		
			className = className.substring(1);
			System.out.println(instanceName + " belong to the class: "+ className); 
			System.out.println(className);
			 
			MTech m1 = college.getMTech("#Rachna");
			em.persist(m1);
	        em.getTransaction().commit();

			}
//			try{
//				
//				 for (Student c : college.getAllIMTechInstances()) {
//					 	System.out.println(c.getOwlIndividual());
//					 	for(int m : c.getHasDebt()) {
//					 		System.out.println(m);
//					 	} 
//				 }
//				 
//				MTech m1 = college.getMTech("Rachna");
//			} finally {
//			}
		}   
	}

