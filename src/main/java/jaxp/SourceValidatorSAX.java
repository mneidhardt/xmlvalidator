package jaxp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SourceValidatorSAX implements ErrorHandler {
	private final int maxerrors;
	private int errors = 0;
	
	
	public SourceValidatorSAX() {
		this.maxerrors = 1000; 
	}

	public SourceValidatorSAX(int maxerrors) {
		this.maxerrors = maxerrors; 
	}

	public void warning(SAXParseException ex) throws SAXException {
		  System.err.println("Warning: " + buildString(ex));
	  }

	  public void error(SAXParseException ex) throws SAXException {
		  this.errors += 1;

		  System.err.println("Error: (" + this.errors + ") " + buildString(ex));
		  
		  if (this.errors >= maxerrors) {
			  throw ex;
		  }
	  }

	  public void fatalError(SAXParseException ex) throws SAXException {
		  System.err.println("Fatal Error: " + buildString(ex));
	      throw ex;
	  }

	  protected String buildString(SAXParseException ex) {
	      String result = ex.getSystemId();
	      if (result != null) {
	          int index = result.lastIndexOf('/');
	          if (index != -1)
	              result = result.substring(index + 1);
	      }
	      result += ":" + ex.getLineNumber() + ":" + ex.getColumnNumber() + ": " + ex.getMessage();
	      return result;
	  }


	public void validateXML(String xsdfile, String xmlfile)
			throws IOException, FileNotFoundException, SAXException {

		File xsdFile = new File(xsdfile);
		File xmlFile = new File(xmlfile);
		
		long t0 = System.currentTimeMillis();
		
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = null;
		schema = factory.newSchema(xsdFile);

		Validator validator = schema.newValidator();
		SourceValidatorSAX errhandler = new SourceValidatorSAX(this.maxerrors);
		validator.setErrorHandler(errhandler);

		SAXSource source = new SAXSource(new InputSource(new FileReader(xmlFile)));

		validator.validate(source);
		
		if (errhandler.getErrorCount() == 0) {
			System.out.println("OK. " + ((System.currentTimeMillis()-t0)/1000.0d) + " seconds.");
		} else {
			System.err.println("Error. " + errhandler.getErrorCount() + " errors found.");
		}
	}
	
	public int getErrorCount() {
		return this.errors;
	}

	public static void main(String[] args) throws IOException, FileNotFoundException, SAXException {
		SourceValidatorSAX sv2;
		
		if (args.length > 2) {
			 sv2 = new SourceValidatorSAX(Integer.parseInt(args[2]));
		} else {
			sv2 = new SourceValidatorSAX();
		}
		sv2.validateXML(args[0], args[1]);
	}

}
