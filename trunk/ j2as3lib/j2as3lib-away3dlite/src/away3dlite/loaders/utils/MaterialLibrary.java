package away3dlite.loaders.utils;

import flash.utils.Dictionary;

public class MaterialLibrary extends Dictionary {

	/**
	 * Flag to determine if any of the contained textures require a file load.
	 */
	public boolean loadRequired;
	
	/**
	 * The root directory path to the texture files.
	 */
	public String texturePath;
}
