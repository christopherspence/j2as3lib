package away3dlite.cameras;


import flash.geom.Matrix3D;
import away3dlite.core.base.Object3D;

public class Camera3D extends Object3D {
	
	/**
	 * Defines the distance from the focal point of the camera to the viewing plane.
	 */
	public float focus;
	
	/**
	 * [read-only] Returns the 3d matrix representing the camera projection for the view.
	 */
	public Matrix3D projectionMatrix3D;
	
	/**
	 * Defines the overall scale value of the view.
	 */
	public float zoom;
	
	// METHODS
	
	/**
	 * Creates a new Camera3D object.
	 */
	public Camera3D(int zoom, int focus) {}
}
