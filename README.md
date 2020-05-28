# xmlvalidator
Sax based xml validation
I needed a SAX based validator, and found it in (I think) Apache Xerces.

I didn't make this, I just made a few small changes, primarily by adding this line:

System.setProperty("jdk.xml.maxOccurLimit", "99999");

By default, the maximum value for maxOccurs is 5000.
https://docs.oracle.com/javase/tutorial/jaxp/limits/limits.html
