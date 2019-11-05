package XMLParser.XMLParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	public List<TestingResult> getparseData()throws ParserConfigurationException {
	
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = null;
		try {
			File xmlFile = new File("xml_file\\testng-results.xml");
			doc = builder.parse(xmlFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<TestingResult> test_list = new ArrayList<TestingResult>();
		NodeList nodeList = doc.getElementsByTagName("testng-results");
		return test_list;

}

}