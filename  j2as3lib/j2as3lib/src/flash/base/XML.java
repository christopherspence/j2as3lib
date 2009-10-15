package flash.base;

/**
 * The XML class contains methods and properties for working with XML objects.  
 */
public class XML extends Object {
	
	/**
	 * [static] Determines whether XML comments are ignored when XML objects parse the source XML data.
	 */
	public static boolean ignoreComments;
	
	/**
	 * [static] Determines whether XML processing instructions are ignored when XML objects parse the source XML data.
	 */
	public static boolean ignoreProcessingInstructions;
	
	/**
	 * [static] Determines the amount of indentation applied by the toString() and toXMLString() methods when the XML.prettyPrinting property is set to true.
	 */
	public static int prettyIndent;	
	
	/**
	 * [static] Determines whether the toString() and toXMLString() methods normalize white space characters between some tags.
	 */
	public static boolean prettyPrinting;
	
	
	// METHODS
	
	/**
	 * Creates a new XML object. You must use the constructor to create an XML object before you call any of the methods of the XML class. 
	 */
	public XML() {}
	
	/**
	 * Adds a namespace to the set of in-scope namespaces for the XML object. If the namespace already exists in the in-scope namespaces for the XML object (with a prefix matching that of the given parameter), then the prefix of the existing namespace is set to undefined. If the input parameter is a Namespace object, it's used directly. If it's a QName object, the input parameter's URI is used to create a new namespace; otherwise, it's converted to a String and a namespace is created from the String. 
	 * @param ns The namespace to add to the XML object. 
	 * @return The new XML object, with the namespace added. 
	 */
	public XML addNamespace(Object ns) {
		return new XML();
	}
	
	/**
	 * Appends the given child to the end of the XML object's properties. The appendChild() method takes an XML object, an XMLList object, or any other data type that is then converted to a String. 
	 * @param child The XML object to append. 
	 * @return The XML object to append. 
	 */
	public XML appendChild(Object child) {
		return new XML();
	}
	
	/**
	 * Returns the XML value of the attribute that has the name matching the attributeName  parameter. Attributes are found within XML elements. In the following example, the element has an attribute named "gender" with the value "boy": <first gender="boy">John</first>. 
	 * @param attributeName The name of the attribute. 
	 * @return An XMLList object or an empty XMLList object. Returns an empty XMLList object when an attribute value has not been defined. 
	 */
	public XMLList attribute(Object attributeName) {
		return new XMLList();
	}
	
	/**
	 * Returns a list of attribute values for the given XML object. Use the name() method with the attributes() method to return the name of an attribute. Use @* to return the names of all attributes. 
	 * @return The list of attribute values. 
	 */
	public XMLList attributes() {
		return new XMLList();
	}
	
	/**
	 * Lists the children of an XML object. An XML child is an XML element, text node, comment, or processing instruction.
	 * Use the propertyName parameter to list the contents of a specific XML child. For example, to return the contents of a child named <first>, use child.name("first"). You can generate the same result by using the child's index number. The index number identifies the child's position in the list of other XML children. For example, name.child(0) returns the first child in a list. 
	 * @param propertyName The element name or integer of the XML child. 
	 * @return An XMLList object of child nodes that match the input parameter. 
	 */
	public XMLList child(Object propertyName) {
		return new XMLList();
	}
	
	/**
	 * Identifies the zero-indexed position of this XML object within the context of its parent. 
	 * @return The position of the object. Returns -1 as well as positive integers. 
	 */
	public int childIndex() {
		return 0;
	}
	
	/**
	 * Lists the children of the XML object in the sequence in which they appear. An XML child is an XML element, text node, comment, or processing instruction. 
	 * @return An XMLList object of the XML object's children. 
	 */
	public XMLList children() {
		return new XMLList();
	}
	
	/**
	 * Lists the properties of the XML object that contain XML comments. 
	 * @return An XMLList object of the properties that contain comments. 
	 */
	public XMLList comments() {
		return new XMLList();
	}
	
	/**
	 * Compares the XML object against the given value parameter. 
	 * @return A value to compare against the current XML object. 
	 */
	public boolean contains() {
		return true;
	}
	
	/**
	 * Returns a copy of the given XML object. The copy is a duplicate of the entire tree of nodes. The copied XML object has no parent and returns null if you attempt to call the parent() method. 
	 * @return The copy of the object.
	 */
	public XML copy() {
		return new XML();
	}

	/**
	 * Returns an object with the following properties set to the default values: ignoreComments, ignoreProcessingInstructions, ignoreWhitespace, prettyIndent, and prettyPrinting. The default values are as follows:
     * ignoreComments = true
     * ignoreProcessingInstructions = true
     * ignoreWhitespace = true
     * prettyIndent = 2
     * prettyPrinting = true 
	 * @return An object with properties set to the default settings. 
	 */
	public static Object defaultSettings() {
		return new Object();
	}
	
	/**
	 * Returns all descendants (children, grandchildren, great-grandchildren, and so on) of the XML object that have the given name parameter. The name parameter is optional. The name parameter can be a QName object, a String data type or any other data type that is then converted to a String data type. 
	 * @return An XMLList object of matching descendants. If there are no descendants, returns an empty XMLList object. 
	 */
	public XMLList descendants() {
		return new XMLList();
	}
	
	/**
	 * Returns all descendants (children, grandchildren, great-grandchildren, and so on) of the XML object that have the given name parameter. The name parameter is optional. The name parameter can be a QName object, a String data type or any other data type that is then converted to a String data type. 
	 * @name The name of the element to match. 
	 * @return An XMLList object of matching descendants. If there are no descendants, returns an empty XMLList object. 
	 */
	public XMLList descendants(Object name) {
		return new XMLList();
	}
	
	/**
	 * Lists the elements of an XML object. An element consists of a start and an end tag; for example <first></first>. The name parameter is optional. The name parameter can be a QName object, a String data type, or any other data type that is then converted to a String data type. Use the name parameter to list a specific element. For example, the element "first" returns "John" in this example: <first>John</first>. 
	 * @return An XMLList object of the element's content. The element's content falls between the start and end tags. If you use the asterisk (*) to call all elements, both the element's tags and content are returned.  
	 */
	public XMLList elements() {
		return new XMLList();
	}
	
	/**
	 * Lists the elements of an XML object. An element consists of a start and an end tag; for example <first></first>. The name parameter is optional. The name parameter can be a QName object, a String data type, or any other data type that is then converted to a String data type. Use the name parameter to list a specific element. For example, the element "first" returns "John" in this example: <first>John</first>. 
	 * @param name The name of the element. An element's name is surrounded by angle brackets. For example, "first" is the name in this example: <first></first>. 
	 * @return An XMLList object of the element's content. The element's content falls between the start and end tags. If you use the asterisk (*) to call all elements, both the element's tags and content are returned. 
	 */
	public XMLList elements(Object name) {
		return new XMLList();
	}
	
	/**
	 * Checks to see whether the XML object contains complex content. An XML object contains complex content if it has child elements. XML objects that representing attributes, comments, processing instructions, and text nodes do not have complex content. However, an object that contains these can still be considered to contain complex content (if the object has child elements). 
	 * @return If the XML object contains complex content, true; otherwise false. 
	 */
	public boolean hasComplexContent() {
		return true;
	}
	
	
}
