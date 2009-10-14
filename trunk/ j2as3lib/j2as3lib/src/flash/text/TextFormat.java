package flash.text;

import flash.base.Array;
import flash.base.Object;

public class TextFormat extends Object {
	// PROPERTIES
	
	/**
	 * Indicates the alignment of the paragraph.
	 */
	public String align;
	
	/**
	 * Indicates the block indentation in pixels.
	 */
	public Object blockIndent;
	
	/**
	 * Specifies whether the text is boldface.
	 */
	public Object bold;
	
	/**
	 * Indicates that the text is part of a bulleted list.
	 */
	public Object bullet;
	
	/**
	 * Indicates the color of the text.
	 */
	public Object color;
	
	/**
	 * The name of the font for text in this text format, as a string.
	 */
	public String font;
	
	/**
	 * Indicates the indentation from the left margin to the first character in the paragraph.
	 */
	public Object indent;
	
	/**
	 * Indicates whether text in this text format is italicized.
	 */
	public Object italic;
	
	/**
	 * A Boolean value that indicates whether kerning is enabled (true) or disabled (false).
	 */
	public Object kerning;
	
	/**
	 * An integer representing the amount of vertical space (called leading) between lines.
	 */
	public Object leading;
	
	/**
	 * The left margin of the paragraph, in pixels.
	 */
	public Object leftMargin;
	
	/**
	 * A number representing the amount of space that is uniformly distributed between all characters.
	 */
	public Object letterSpacing;
	
	/**
	 * The right margin of the paragraph, in pixels.
	 */
	public Object rightMargin;
	
	/**
	 * The point size of text in this text format.
	 */
	public Object size;
	
	/**
	 * Specifies custom tab stops as an array of non-negative integers.
	 */
	public Array tabStops;
	
	/**
	 * Indicates the target window where the hyperlink is displayed.
	 */
	public String target;
	
	/**
	 * Indicates whether the text that uses this text format is underlined (true) or not (false).
	 */
	public Object underline;
	
	/**
	 * Indicates the target URL for the text in this text format.
	 */
	public String url;	
	
	// METHODS
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 */
	public TextFormat() {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 */
	public TextFormat(String font) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 */
	public TextFormat(String font, Object size) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 */
	public TextFormat(String font, Object size, Object color) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 * @param url The URL to which the text in this text format hyperlinks. If url is an empty string, the text does not have a hyperlink. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline, String url) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields.
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 * @param url The URL to which the text in this text format hyperlinks. If url is an empty string, the text does not have a hyperlink. 
	 * @param target The target window where the hyperlink is displayed. If the target window is an empty string, the text is displayed in the default target window _self. If the url parameter is set to an empty string or to the value null, you can get or set this property, but the property will have no effect. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline, String url, String target) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields.
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 * @param url The URL to which the text in this text format hyperlinks. If url is an empty string, the text does not have a hyperlink. 
	 * @param target The target window where the hyperlink is displayed. If the target window is an empty string, the text is displayed in the default target window _self. If the url parameter is set to an empty string or to the value null, you can get or set this property, but the property will have no effect. 
	 * @param align The alignment of the paragraph, as a TextFormatAlign value. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline, String url, String target,
			  String align) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields. 
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 * @param url The URL to which the text in this text format hyperlinks. If url is an empty string, the text does not have a hyperlink. 
	 * @param target The target window where the hyperlink is displayed. If the target window is an empty string, the text is displayed in the default target window _self. If the url parameter is set to an empty string or to the value null, you can get or set this property, but the property will have no effect. 
	 * @param align The alignment of the paragraph, as a TextFormatAlign value. 
	 * @param leftMargin Indicates the left margin of the paragraph, in pixels. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline, String url, String target,
			  String align, Object leftMargin) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields.
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 * @param url The URL to which the text in this text format hyperlinks. If url is an empty string, the text does not have a hyperlink. 
	 * @param target The target window where the hyperlink is displayed. If the target window is an empty string, the text is displayed in the default target window _self. If the url parameter is set to an empty string or to the value null, you can get or set this property, but the property will have no effect. 
	 * @param align The alignment of the paragraph, as a TextFormatAlign value. 
	 * @param leftMargin Indicates the left margin of the paragraph, in pixels. 
	 * @param rightMargin Indicates the right margin of the paragraph, in pixels. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline, String url, String target,
			  String align, Object leftMargin, Object rightMargin) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields.
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 * @param url The URL to which the text in this text format hyperlinks. If url is an empty string, the text does not have a hyperlink. 
	 * @param target The target window where the hyperlink is displayed. If the target window is an empty string, the text is displayed in the default target window _self. If the url parameter is set to an empty string or to the value null, you can get or set this property, but the property will have no effect. 
	 * @param align The alignment of the paragraph, as a TextFormatAlign value. 
	 * @param leftMargin Indicates the left margin of the paragraph, in pixels. 
	 * @param rightMargin Indicates the right margin of the paragraph, in pixels. 
	 * @param indent An integer that indicates the indentation from the left margin to the first character in the paragraph. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline, String url, String target,
			  String align, Object leftMargin, Object rightMargin, Object indent) {}
	
	/**
	 * Creates a TextFormat object with the specified properties. You can then change the properties of the TextFormat object to change the formatting of text fields.
	 * @param font The name of a font for text as a string. 
	 * @param size An integer that indicates the point size. 
	 * @param color The color of text using this text format. A number containing three 8-bit RGB components; for example, 0xFF0000 is red, and 0x00FF00 is green.
	 * @param bold A Boolean value that indicates whether the text is boldface. 
	 * @param italic A Boolean value that indicates whether the text is italicized. 
	 * @param underline A Boolean value that indicates whether the text is underlined. 
	 * @param url The URL to which the text in this text format hyperlinks. If url is an empty string, the text does not have a hyperlink. 
	 * @param target The target window where the hyperlink is displayed. If the target window is an empty string, the text is displayed in the default target window _self. If the url parameter is set to an empty string or to the value null, you can get or set this property, but the property will have no effect. 
	 * @param align The alignment of the paragraph, as a TextFormatAlign value. 
	 * @param leftMargin Indicates the left margin of the paragraph, in pixels. 
	 * @param rightMargin Indicates the right margin of the paragraph, in pixels. 
	 * @param indent An integer that indicates the indentation from the left margin to the first character in the paragraph. 
	 * @param leading A number that indicates the amount of leading vertical space between lines. 
	 */
	public TextFormat(String font, Object size, Object color, Object bold, Object italic, Object underline, String url, String target,
					  String align, Object leftMargin, Object rightMargin, Object indent, Object leading) {}
	
	
}
