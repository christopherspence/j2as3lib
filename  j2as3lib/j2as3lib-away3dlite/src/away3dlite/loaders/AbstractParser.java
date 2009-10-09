package away3dlite.loaders;

import flash.base.Function;
import flash.base.Object;
import flash.events.EventDispatcher;

import away3dlite.core.base.Object3D;
import away3dlite.loaders.utils.GeometryLibrary;
import away3dlite.loaders.utils.MaterialLibrary;
import away3dlite.materials.Material;


public class AbstractParser extends EventDispatcher {

	/**
	 *  [read-only] Retuns a 3d container object used for storing the parsed 3d object. 
	 */
	public Object3D container;
	
	/**
	 * [read-only] Retuns a geometryLibrary object used for storing the parsed geometry data. 
	 */
	public GeometryLibrary geometryLibrary;
	
	/**
	 * Overrides all materials in the model. 
	 */
	public Material material;
	
	/**
	 * [read-only] Retuns a materialLibrary object used for storing the parsed material objects. 
	 */
	public MaterialLibrary materialLibrary;
	
	/**
	 * [read-write] Overrides materials in the model using name:value pairs. 
	 */
	public Object materials;
	
	/**
	 * [read-only] Returns the total number of data chunks parsed 
	 */
	public int parsedChunks;
	
	/**
	 * Defines a timeout period for file parsing (in milliseconds).
	 */
	public int parseTimeout = 40000;
	
	/**
	 * [read-only] Returns the total number of data chunks available 
	 */
	public int totalChunks;
	
	// METHODS
	public AbstractParser() {}
	
	/**
	 * Default method for adding a parseError event listener 
	 * @param listener The listener function 
	 */
	public void addOnError(Function listener) {}
	
	/**
	 * 	Default method for adding a parseProgress event listener 
	 * @param listener
	 */
	public void addOnProgress(Function listener) {}
	
	/**
	 * Default method for adding a parseSuccess event listener 
	 * @param listener The listener function 
	 */
	public void addOnSuccess(Function listener) {}
	
	/**
	 * 
	 * @param data The file data to be parsed. Can be in text or binary form. 
	 * @return The parsed 3d object. 
	 */
	public Object3D parseGeometry(Object data) {
		return new Object3D();
	}
	
	/**
	 * Default method for removing a parseError event listener 
	 * @param listener The listener function 
	 */
	public void removeOnError(Function listener) {}
	
	/**
	 * Default method for removing a parseProgress event listener 
	 * @param listener The listener function
	 */
	public void removeOnProgress(Function listener) {}
	
	/**
	 * Default method for removing a parseSuccess event listener 
	 * @param listener The listener function 
	 */
	public void removeOnSuccess(Function listener) {}
	
	// TODO - Events
	
	
}
