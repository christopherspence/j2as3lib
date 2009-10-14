package away3dline.core.utils;

import away3dlite.materials.Material;
import flash.display.BitmapData;
import flash.utils.ByteArray;

/**
 * Helper class for casting assets to usable objects 
 */
public class Cast {

	/**
	 * [static] Casts the given data value as a bitmapdata object.
	 * @param data
	 * @return
	 */
	public static BitmapData bitmap(Object data) {
		return new BitmapData();
	}
	
	/**
	 * [static] Casts the given data value as a bytearray.
	 * @param data
	 * @return
	 */
	public static ByteArray bytearray(Object data) {
		return new ByteArray();
	}
	
	/**
	 * [static] Casts the given data value as a color.
	 * @param data
	 * @return
	 */
	public static int color(Object data) {
		return 0;
	}
	
	/**
	 * [static] Casts the given data value as a material object.
	 * @param data
	 * @return
	 */
	public static Material material(Object data) {
		return new Material();
	}
	
	/**
	 * [static] Casts the given data value as a string.
	 * @param data
	 * @return
	 */
	public static String string(Object data) {
		return "";
	}
	
	/**
	 * Casts the given data value as an xml object. 
	 * @param data
	 * @return
	 */
	public static XML xml(Object data) {
		return new XML();
	}
	
}
