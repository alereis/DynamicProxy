import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class ParserXML{
	public static void main (String argv []){
	    Map<String, HashMap<String, String>> policies = new HashMap<String, HashMap<String, String>>();

	    try {
	    	 
	    	SAXParserFactory factory = SAXParserFactory.newInstance();
	    	SAXParser saxParser = factory.newSAXParser();
	     
	    	DefaultHandler handler = new DefaultHandler() {	     
		    	boolean bfname = false;
		    	boolean blname = false;
		    	boolean bnname = false;
		     
		    	public void startElement(String uri, String localName,String qName, 
		                    Attributes attributes) throws SAXException {
		     
		    		if (qName.equalsIgnoreCase("role-name")) {
		    			bfname = true;
		    		}
		     
		    		if (qName.equalsIgnoreCase("class-name")) {
		    			blname = true;
		    		}
		     
		    		if (qName.equalsIgnoreCase("method-name")) {
		    			bnname = true;
		    		}
		    	}
		     
		    	public void endElement(String uri, String localName,
		    		String qName) throws SAXException {
		     
		    		//System.out.println("End Element :" + qName);
		    	}
		     
		    	public void characters(char ch[], int start, int length) throws SAXException {
		     
		    		if (bfname) {
		    			System.out.println("Role Name : " + new String(ch, start, length));
		    			bfname = false;
		    		}
		     
		    		if (blname) {
		    			System.out.println("Class Name : " + new String(ch, start, length));
		    			blname = false;
		    		}
		     
		    		if (bnname) {
		    			System.out.println("Method Name : " + new String(ch, start, length));
		    			bnname = false;
		    		}
		    	}	     
	        };
	     
	        saxParser.parse("src/policy.xml", handler);
	     
	    } catch (Exception e) {
	           e.printStackTrace();
	    }	     
	}
}