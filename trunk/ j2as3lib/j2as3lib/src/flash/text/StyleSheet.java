package flash.text;

import flash.base.Array;
import flash.events.EventDispatcher;

/**
 * 
 */
public class StyleSheet extends EventDispatcher {
	
	// PROPERTIES
	
	/**
	 * [read-only] An array that contains the names (as strings) of all of the styles registered in this style sheet.
	 */
	public Array styleNames() { 
		return new Array();
	}
	
	// METHODS
	
	/**
	 * Creates a new StyleSheet object.
	 */
	public StyleSheet() {}
	
	/**
	 * Removes all styles from the style sheet object.
	 */
	public void clear() {}
	
	/**
	 * Returns a copy of the style object associated with the style named styleName.
	 * @param styleName A string that specifies the name of the style to retrieve. 
	 * @return An object.
	 */
	public Object getStyle(String styleName) {
		return new Object();
	}
	
	/**
	 * Parses the CSS in CSSText and loads the style sheet with it. If a style in CSSText is already in styleSheet, the properties in styleSheet are retained, and only the ones in CSSText  are added or changed in styleSheet. 
	 * @param CSSText The CSS text to parse (a string). 
	 */
	public void parseCSS(String CSSText) {}
	
	/**
	 * Adds a new style with the specified name to the style sheet object. If the named style does not already exist in the style sheet, it is added. If the named style already exists in the style sheet, it is replaced. If the styleObject parameter is null, the named style is removed. 
	 * @param styleName A string that specifies the name of the style to add to the style sheet. 
	 * @param styleObject An object that describes the style, or null. 
	 */
	public void setStyle(String styleName, Object styleObject) {}
	
	/**
	 * Extends the CSS parsing capability. Advanced developers can override this method by extending the StyleSheet class. 
	 * @param formatObject An object that describes the style, containing style rules as properties of the object, or null. 
	 * @return A TextFormat object containing the result of the mapping of CSS rules to text format properties. 
	 */
	public TextFormat transform(Object formatObject) {
		return new TextFormat();
	}	
}
