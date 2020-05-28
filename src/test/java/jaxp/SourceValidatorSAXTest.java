package jaxp;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class SourceValidatorSAXTest {
	final static String xsdfile = "repxsd.rcid00015.xsd";
	final static String xmlfile = "RC00015-00000010.xml";
	final static String xsdfile2 = "repxsd.rcid99999.xsd";
	final static String xmlfile2 = "RC99999-00000001.xml";
	final static String xmlerrorfile2 = "RC99999-00000001_fejl.xml";
	final static String errorfile = "errorfile.txt";

	/*
	@Test
	public void test() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		assert(sv2 instanceof SourceValidatorSAX);
		
		
		try {
			sv2.validateXML(xsdfile, xmlfile);
			assert(true);
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(false);
		}

	}

	@Test
	public void testNofiles() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML("",  "");
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(true);
		}
	}

	@Test
	public void testMissingfile1() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML("", xmlfile);
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(true);
		}
	}

	@Test
	public void testMissingfile2() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML(xsdfile, "");
		} catch (FileNotFoundException e) {
			assert(true);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(false);
		}
	}

	@Test
	public void testNullFile() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML(null, null);
		} catch (NullPointerException e) {
			assert(true);
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(false);
		}
	}
	@Test
	public void testNullFile1() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML(xsdfile, null);
		} catch (NullPointerException e) {
			assert(true);
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(false);
		}
	}
	@Test
	public void testNullFile2() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML(null, xmlfile);
		} catch (NullPointerException e) {
			assert(true);
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(false);
		}
	}

	@Test
	public void testErrorFile1() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML(xsdfile2, xmlerrorfile2);
		} catch (NullPointerException e) {
			assert(false);
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(true);
		}
		
	}

	@Test
	public void testErrorFile2() {
		SourceValidatorSAX sv2 = new SourceValidatorSAX();
		
		try {
			sv2.validateXML(xsdfile, errorfile);
		} catch (NullPointerException e) {
			assert(false);
		} catch (FileNotFoundException e) {
			assert(false);
		} catch (IOException e) {
			assert(false);
		} catch (SAXException e) {
			assert(true);
		}
	}
*/
}
