package flash.base;

public class Object {

	/*
	 * Creates an Object object and stores a reference to the object's constructor method in the object's constructor property.  
	 */
	public Object() {}
	
	/**
	 * Indicates whether an object has a specified property defined. 
	 * @param name
	 * @return
	 */
	public boolean hasOwnProperty(String name) { return true; }
	
	/**
	 * Indicates whether an instance of the Object class is in the prototype chain of the object specified as the parameter. 
	 */
	public boolean isPrototypeOf(Object theClass) { return true; }	
	
	/**
	 * Indicates whether the specified property exists and is enumerable.
	 * @param name
	 * @return
	 */
	public boolean propertyIsEnumerable(String name) { return true; }
	
	/**
	 * Sets the availability of a dynamic property for loop operations.
	 */
	public void setPropertyIsEnumerable(String name, boolean isEnum) {} 
	
	/**
	 * Returns the string representation of the specified object.
	 */
	public String toString() { return ""; }
	
	/**
	 * Returns the primitive value of the specified object. 
	 * @return
	 */
	public Object valueOf() { return new Object(); }
	
}
