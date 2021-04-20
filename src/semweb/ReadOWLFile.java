package semweb;

import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;  
public class ReadOWLFile 
{  
	public static void main(String argv[])   
	{  
		try   
		{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("college_with_instances.owl");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList instancesList = doc.getElementsByTagName("ClassAssertion");
			for (int itr = 0; itr < instancesList.getLength(); itr++)   
			{  
				Node node = instancesList.item(itr);  
				Element eElement = (Element) node;  
				
				Node className = eElement.getElementsByTagName("Class").item(0);
				Element classNameElement = (Element) className;
				
				Node namedIndividual = eElement.getElementsByTagName("NamedIndividual").item(0);
				Element namedIndividualElement = (Element) namedIndividual;
				
				String instanceName = namedIndividualElement.getAttribute("IRI");
				
//				DefaultStudent instanceName = new classNameElement.getAttribute("IRI")();
				
				System.out.println(instanceName + " belong to the class: "+ classNameElement.getAttribute("IRI"));  
			}  
		}   
		catch (Exception e)   
		{  
			e.printStackTrace();  
		}  
	}  
}  