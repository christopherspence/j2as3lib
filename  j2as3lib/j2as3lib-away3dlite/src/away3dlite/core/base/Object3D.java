package away3dlite.core.base;

import away3dlite.containers.Scene3D;
import away3dlite.loaders.utils.AnimationLibrary;
import away3dlite.loaders.utils.GeometryLibrary;
import away3dlite.loaders.utils.MaterialLibrary;
import flash.geom.*;
import flash.display.Sprite;

public class Object3D extends Sprite {
	
	
	// PROPERTIES
	
	/**
	 * Used in the loaders to store all parsed animation data contained in the model.
	 */
	public AnimationLibrary animationLibrary;
	
	/**
	 * Used in loaders to store all parsed geometry data contained in the model.
	 */
	public GeometryLibrary geometryLibrary;
	
	/**
	 *   An optional layer sprite used to draw into instead of the default view.
	 */
	public Sprite layer;
	
	/**
	 * Used in loaders to store all parsed materials contained in the model.
	 */
	public MaterialLibrary materialLibrary;
	
	/**
	 * [read-only] Returns a 3d vector representing the local position of the 3d object.
	 */
	public Vector3D position;	
	
	/**
	 * [read-only] Returns the scene to which the 3d object belongs 
	 */
	public Scene3D scene;
	
	/**
	 * [read-only] Returns a 3d matrix representing the absolute transformation of the 3d object in the scene.
	 */
	public Matrix3D sceneMatrix3D;
	
	/**
	 * [read-only] Returns the z-sorting position of the 3d object.
	 */
	public int screenZ;
	
	/**
	 * Returns the type of 3d object.
	 */
	public String type;
	
	/**
	 * Returns the source url of the 3d object, or the name of the family of generative geometry objects if not loaded from an external source.
	 */
	public String url;
	
	/**
	 * [read-only] Returns a 3d matrix representing the absolute transformation of the 3d object in the view.
	 */
	public Matrix3D viewMatrix3D;
	
	/**
	 * Creates a new Object3D object.
	 */
	public Object3D() {}
	
	/**
	 * Duplicates the 3d object's properties to another Object3D object 
	 * @param object
	 */
	public Object3D(Object3D object) {}
	
	/**
	 * Duplicates the 3d object's properties to another Object3D object 
	 * @param target
	 * @param upAxis
	 */
	public void lookAt(Vector3D target, Vector3D upAxis) {}		
}
