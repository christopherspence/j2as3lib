package flash.text;

import flash.display.*;

/**
 * The TextField class is used to create display objects for text display and input. All dynamic and input text fields in a SWF file are instances of the TextField class. You can give a text field an instance name in the Property inspector and use the methods and properties of the TextField class to manipulate it with ActionScript. TextField instance names are displayed in the Movie Explorer and in the Insert Target Path dialog box in the Actions panel.
 * 
 */
public class TextField extends InteractiveObject {
	
	/**
	 *	 When set to true and the text field is not in focus, Flash Player highlights the selection in the text field in gray.
	 */
	public boolean alwaysShowSelection;
	
	/**
	 * The type of anti-aliasing used for this text field.
	 */
	public String antiAliasType;
	
	/**
	 * Controls automatic sizing and alignment of text fields.
	 */
	public String autoSize;
	
	/**
	 * Specifies whether the text field has a background fill.
	 */
	public boolean background;
	
	/**
	 * The color of the text field background.
	 */
	public boolean backgroundColor;
	
	/**
	 * Specifies whether the text field has a border.
	 */
	public boolean border;
	
	
	// ...
	
	/**
	 * A string that is the current text in the text field.
	 */
	public String text;
	
	
	
}
