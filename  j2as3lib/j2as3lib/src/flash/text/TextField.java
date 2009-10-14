package flash.text;

import flash.display.*;
import flash.geom.Rectangle;

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
	
	/**
	 * The color of the text field border. The default value is 0x000000 (black). This property can be retrieved or set, even if there currently is no border, but the color is visible only if the text field has the border property set to true. 
	 */
	public int borderColor;
	
	/**
	 *  An integer (1-based index) that indicates the bottommost line that is currently visible in the specified text field. Think of the text field as a window onto a block of text. The scrollV property is the 1-based index of the topmost visible line in the window.
	 *  All the text between the lines indicated by scrollV and bottomScrollV is currently visible in the text field.
	 */
	public int bottomScrollV;
	
	/**
	 *  The index of the insertion point (caret) position. If no insertion point is displayed, the value is the position the insertion point would be if you restored focus to the field (typically where the insertion point last was, or 0 if the field has not had focus).
	 *  Selection span indexes are zero-based (for example, the first position is 0, the second position is 1, and so on).
	 */
	public int caretIndex;
	
	/**
	 * A Boolean value that specifies whether extra white space (spaces, line breaks, and so on) in a text field with HTML text should be removed. The default value is false. The condenseWhite property only affects text set with the htmlText property, not the text property. If you set text with the text property, condenseWhite is ignored. 
	 */
	public boolean condenseWhite;
	
	/**
	 * 
	 */
	public NativeMenu contextMenu;
	
	/**
	 * Specifies the format applied to newly inserted text, such as text inserted with the replaceSelectedText() method or text entered by a user. 
	 */
	public TextFormat defaultTextFormat;
	
	/**
	 * Specifies whether the text field is a password text field. If the value of this property is true, the text field is treated as a password text field and hides the input characters using asterisks instead of the actual characters. If false, the text field is not treated as a password text field. When password mode is enabled, the Cut and Copy commands and their corresponding keyboard shortcuts will not function. This security mechanism prevents an unscrupulous user from using the shortcuts to discover a password on an unattended computer. 
	 */
	public boolean displayAsPassword;
	
	/**
	 * Specifies whether to render by using embedded font outlines. If false, Flash Player renders the text field by using device fonts. 
	 */
	public boolean embedFonts;
	
	/**
	 * The type of grid fitting used for this text field. This property applies only if the flash.text.AntiAliasType property of the text field is set to flash.text.AntiAliasType.ADVANCED. 
	 */
	public String gridFitType;
	
	/**
	 * Contains the HTML representation of the text field's contents. 
	 */
	public String htmlText;
	
	/**
	 * The number of characters in a text field. A character such as tab (\t) counts as one character. 
	 */
	public int length;
	
	/**
	 *  The maximum number of characters that the text field can contain, as entered by a user. A script can insert more text than maxChars allows; the maxChars property indicates only how much text a user can enter. If the value of this property is 0, a user can enter an unlimited amount of text. The default value is 0.
	 */
	public int maxChars;
	
	/**
	 *  The maximum value of scrollH. 
	 */
	public int maxScrollH;
	
	/**
	 *  The maximum value of scrollV. 
	 */
	public int maxScrollV;
	
	/**
	 *  A Boolean value that indicates whether Flash Player should automatically scroll multiline text fields when the user clicks a text field and rolls the mouse wheel. By default, this value is true. This property is useful if you want to prevent mouse wheel scrolling of text fields, or implement your own text field scrolling. 
	 */
	public boolean mouseWheelEnabled;
	
	/**
	 *  Indicates whether the text field is a multiline text field. If the value is true, the text field is multiline; if the value is false, the text field is a single-line text field. The default value is false.
	 */
	public boolean multiline;
	
	/**
	 * Defines the number of text lines in a multiline text field. If wordWrap property is set to true, the number of lines increases when text wraps. 
	 */
	public int numLines;
	
	/**
	 * Indicates the set of characters that a user can enter into the text field. If the value of the restrict property is null, you can enter any character. If the value of the restrict property is an empty string, you cannot enter any character. If the value of the restrict property is a string of characters, you can enter only characters in the string into the text field. The string is scanned from left to right. You can specify a range by using the hyphen (-) character. This only restricts user interaction; a script may put any text into the text field. This property does not synchronize with the Embed font options in the Property inspector.
	 */
	public String restrict;
	
	/**
	 * The current horizontal scrolling position. If the scrollH property is 0, the text is not horizontally scrolled. This property value is an integer that represents the horizontal position in pixels. 
	 */
	public int scrollH;
	
	/**
	 * The vertical position of text in a text field. The scrollV property is useful for directing users to a specific paragraph in a long passage, or creating scrolling text fields. 
	 */
	public int scrollV;
	
	/**
	 * A Boolean value that indicates whether the text field is selectable. The value true  indicates that the text is selectable. The selectable property controls whether a text field is selectable, not whether a text field is editable. A dynamic text field can be selectable even if it is not editable. If a dynamic text field is not selectable, the user cannot select its text. 
	 */
	public boolean selectable;
	
	/**
	 * The zero-based character index value of the first character in the current selection. For example, the first character is 0, the second character is 1, and so on. If no text is selected, this property is the value of caretIndex. 
	 */
	public int selectionBeginIndex;
	
	/**
	 * The zero-based character index value of the last character in the current selection. For example, the first character is 0, the second character is 1, and so on. If no text is selected, this property is the value of caretIndex. 
	 */
	public int selectionEndIndex;
	
	/**
	 * The sharpness of the glyph edges in this text field. This property applies only if the flash.text.AntiAliasType property of the text field is set to flash.text.AntiAliasType.ADVANCED. The range for sharpness is a number from -400 to 400. If you attempt to set sharpness to a value outside that range, Flash sets the property to the nearest value in the range (either -400 or 400). 
	 */
	public int sharpness;
	
	/**
	 * Attaches a style sheet to the text field. For information on creating style sheets, see the StyleSheet class and Programming ActionScript 3.0. 
	 */
	public StyleSheet styleSheet;
	
	/**
	 * A string that is the current text in the text field.
	 */
	public String text;
	
	/**
	 *  The color of the text in a text field, in hexadecimal format. The hexadecimal color system uses six digits to represent color values. Each digit has sixteen possible values or characters. The characters range from 0 to 9 and then A to F. For example, black is 0x000000; white is 0xFFFFFF. 
	 */
	public int textColor;
	
	/**
	 *  The height of the text in pixels. 
	 */
	public float textHeight;
	
	/**
	 *  The width of the text in pixels. 
	 */
	public float textWidth;
	
	/**
	 *  The thickness of the glyph edges in this text field. This property applies only when flash.text.AntiAliasType is set to flash.text.AntiAliasType.ADVANCED. 
	 */
	public int thickness;
	
	/**
	 *  The type of the text field. Either one of the following TextFieldType constants: TextFieldType.DYNAMIC, which specifies a dynamic text field, which a user cannot edit, or TextFieldType.INPUT, which specifies an input text field, which a user can edit. The default value is dynamic.
	 */
	public String type;
	
	/**
	 *  Specifies whether to copy and paste the text formatting along with the text. When set to true, Flash Player will also copy and paste formatting (such as alignment, bold, and italics) when you copy and paste between text fields. Both the origin and destination text fields for the copy and paste procedure must have useRichTextClipboard set to true. The default value is false. 
	 */
	public boolean useRichTextclipboard;
	
	/**
	 * A Boolean value that indicates whether the text field has word wrap. If the value of wordWrap is true, the text field has word wrap; if the value is false, the text field does not have word wrap. The default value is false. 
	 */
	public boolean wordWrap;
	
	/**
	 *  Creates a new TextField instance. After you create the TextField instance, call the addChild() or addChildAt() method of the parent DisplayObjectContainer object to add the TextField instance to the display list. The default size for a text field is 100 x 100 pixels.
	 */
	public TextField() {}
	
	// METHODS
	
	/**
	 * Appends the string specified by the newText parameter to the end of the text of the text field. This method is more efficient than an addition assignment (+=) on a text property (such as someTextField.text += moreText), particularly for a text field that contains a significant amount of content. 
	 */
	public void appendText(String newText) {} 
	
	/**
	 * Returns a rectangle that is the bounding box of the character. 
	 * @param charIndex The zero-based index value for the character (for example, the first position is 0, the second position is 1, and so on). 
	 * @return A rectangle with x and y minimum and maximum values defining the bounding box of the character. 
	 */
	public Rectangle getCharBoundaries(int charIndex) {
		return new Rectangle();
	}
	
	/**
	 * Returns the zero-based index value of the character at the point specified by the x  and y parameters. 
	 * @param x The x coordinate of the character. 
	 * @param y The y coordinate of the character. 
	 * @return The zero-based index value of the character (for example, the first position is 0, the second position is 1, and so on). Returns -1 if the point is not over any character. 
	 */
	public int getCharIndexAtPoint(int x, int y) {
		return 0;
	}
	
	/**
	 * Given a character index, returns the index of the first character in the same paragraph. 
	 * @param charIndex The zero-based index value of the character (for example, the first character is 0, the second character is 1, and so on). 
	 * @return The zero-based index value of the first character in the same paragraph. 
	 */
	public int getFirstCharInParagraph(int charIndex) {
		return 0;
	}
	
	/**
	 * Returns a DisplayObject reference for the given id, for an image or SWF file that has been added to an HTML-formatted text field by using an <img> tag. The <img> tag is in the following format: <img src = 'filename.jpg' id = 'instanceName' >
	 * @param id The id to match (in the id attribute of the <img> tag). 
	 * @return The display object corresponding to the image or SWF file with the matching id attribute in the <img> tag of the text field. For media loaded from an external source, this object is a Loader object, and, once loaded, the media object is a child of that Loader object. For media embedded in the SWF file, this is the loaded object. If there is no <img> tag with the matching id, the method returns null. 
	 */
	public DisplayObject getImageReference(String id) {
		return new DisplayObject();
	}
	
	/**
	 * Returns the zero-based index value of the line at the point specified by the x  and y parameters. 
	 * @param x The x coordinate of the line. 
	 * @param y The y coordinate of the line. 
	 * @return The zero-based index value of the line (for example, the first line is 0, the second line is 1, and so on). Returns -1 if the point is not over any line.
	 */
	public int getLineIndexAtPoint(int x, int y) {
		return 0;
	}
	
	/**
	 * Returns the zero-based index value of the line containing the character specified by the charIndex parameter. 
	 * @param charIndex The zero-based index value of the character (for example, the first character is 0, the second character is 1, and so on). 
	 * @return The zero-based index value of the line. 
	 */
	public int getLineIndexOfChar(int charIndex) {
		return 0;
	}
	
	/**
	 * Returns the number of characters in a specific text line. 
	 * @param lineIndex The line number for which you want the length. 
	 * @return
	 */
	public int getLineLength(int lineIndex) {
		return 0;
	}
	
	/**
	 * Returns metrics information about a given text line. 
	 * @param lineIndex The line number for which you want metrics information. 
	 * @return A TextLineMetrics object. 
	 */
	public TextLineMetrics getLineMetrics(int lineIndex) {
		return new TextLineMetrics();
	}
	
	/**
	 * Returns the character index of the first character in the line that the lineIndex parameter specifies. 
	 * @param lineIndex The zero-based index value of the line (for example, the first line is 0, the second line is 1, and so on). 
	 * @return The zero-based index value of the first character in the line. 
	 */
	public int getLineOffset(int lineIndex) {
		return 0;
	}

	/**
	 * Returns the text of the line specified by the lineIndex parameter. 
	 * @param lineIndex The zero-based index value of the line (for example, the first line is 0, the second line is 1, and so on). 
	 * @return The text string contained in the specified line. 
	 */
	public String getLineText(int lineIndex) {
		return "";
	}
	
	/**
	 * Given a character index, returns the length of the paragraph containing the given character. The length is relative to the first character in the paragraph (as returned by getFirstCharInParagraph()), not to the character index passed in. 
	 * @param charIndex The zero-based index value of the character (for example, the first character is 0, the second character is 1, and so on). 
	 * @return Returns the number of characters in the paragraph. 
	 */
	public int getParagraphLength(int charIndex) {
		return 0;
	}
	
	/**
	 * Returns a TextFormat object that contains formatting information for the range of text that the beginIndex and endIndex parameters specify. Only properties that are common to the entire text specified are set in the resulting TextFormat object. Any property that is mixed, meaning that it has different values at different points in the text, has a value of null. 
	 * @return The TextFormat object that represents the formatting properties for the specified text. 
	 */
	public TextFormat getTextFormat() {
		return new TextFormat();
	}
	
	/**
	 * Returns a TextFormat object that contains formatting information for the range of text that the beginIndex and endIndex parameters specify. Only properties that are common to the entire text specified are set in the resulting TextFormat object. Any property that is mixed, meaning that it has different values at different points in the text, has a value of null. 
	 * @param beginIndex Optional; an integer that specifies the starting location of a range of text within the text field.
	 * @return The TextFormat object that represents the formatting properties for the specified text. 
	 */
	public TextFormat getTextFormat(int beginIndex) {
		return new TextFormat();
	}
	
	/**
	 * Returns a TextFormat object that contains formatting information for the range of text that the beginIndex and endIndex parameters specify. Only properties that are common to the entire text specified are set in the resulting TextFormat object. Any property that is mixed, meaning that it has different values at different points in the text, has a value of null. 
	 * @param beginIndex Optional; an integer that specifies the starting location of a range of text within the text field. 
	 * @param endIndex Optional; an integer that specifies the position of the first character after the desired text span. As designed, if you specify beginIndex and endIndex values, the text from beginIndex to endIndex-1 is read. 
	 * @return The TextFormat object that represents the formatting properties for the specified text. 
	 */
	public TextFormat getTextFormat(int beginIndex, int endIndex) {
		return new TextFormat();
	}
	
	/**
	 * Replaces the current selection with the contents of the value parameter. The text is inserted at the position of the current selection, using the current default character format and default paragraph format. The text is not treated as HTML. 
	 * @param value The string to replace the currently selected text. 
	 */
	public void replaceSelectedText(String value) {}
	
	/**
	 * Replaces the range of characters that the beginIndex and endIndex parameters specify with the contents of the newText parameter. As designed, the text from beginIndex to endIndex-1 is replaced. 
	 * @param beginIndex The zero-based index value for the start position of the replacement range. 
	 * @param endIndex The zero-based index position of the first character after the desired text span. 
	 * @param newText The text to use to replace the specified range of characters. 
	 */
	public void replaceText(int beginIndex, int endIndex, String newText) {}
	
	/**
	 * Sets as selected the text designated by the index values of the first and last characters, which are specified with the beginIndex  and endIndex parameters. If the two parameter values are the same, this method sets the insertion point, just as if you set the caretIndex property. 
	 * @param beginIndex The zero-based index value of the first character in the selection (for example, the first character is 0, the second character is 1, and so on). 
	 * @param endIndex The zero-based index value of the last character in the selection. 
	 */
	public void setSelection(int beginIndex, int endIndex) {}
	
	/**
	 * Applies the text formatting that the format parameter specifies to the specified text in a text field. The value of format must be a TextFormat object that specifies the desired text formatting changes. Only the non-null properties of format are applied to the text field. Any property of format that is set to null is not applied. By default, all of the properties of a newly created TextFormat object are set to null. 
	 * @param format A TextFormat object that contains character and paragraph formatting information. 
	 */
	public void setTextFormat(TextFormat format) {}
	
	/**
	 * Applies the text formatting that the format parameter specifies to the specified text in a text field. The value of format must be a TextFormat object that specifies the desired text formatting changes. Only the non-null properties of format are applied to the text field. Any property of format that is set to null is not applied. By default, all of the properties of a newly created TextFormat object are set to null. 
	 * @param format A TextFormat object that contains character and paragraph formatting information. 
	 * @param beginIndex Optional; an integer that specifies the zero-based index position specifying the first character of the desired range of text. 
	 */
	public void setTextFormat(TextFormat format, int beginIndex) {}
	
	/**
	 * Applies the text formatting that the format parameter specifies to the specified text in a text field. The value of format must be a TextFormat object that specifies the desired text formatting changes. Only the non-null properties of format are applied to the text field. Any property of format that is set to null is not applied. By default, all of the properties of a newly created TextFormat object are set to null. 
	 * @param format A TextFormat object that contains character and paragraph formatting information. 
	 * @param beginIndex Optional; an integer that specifies the zero-based index position specifying the first character of the desired range of text. 
	 * @param endIndex Optional; an integer that specifies the first character after the desired text span. As designed, if you specify beginIndex and endIndex values, the text from beginIndex to endIndex-1 is updated. 
	 */
	public void setTextFormat(TextFormat format, int beginIndex, int endIndex) {}
	
	// EVENTS
	
	
}
