package away3dlite.cameras;

import away3dlite.core.base.Object3D;

/**
 * Extended camera used to hover round a specified target object. 
 */
public class HoverCamera3D extends TargetCamera3D {

	/**
	 * Distance between the camera and the specified target.
	 */
	public int distance;
	
	/**
	 * Maximum bounds for the tiltAngle.
	 */
	public int maxTiltAngle;
	
	/**
	 * Minimum bounds for the tiltAngle.
	 */
	public int minTiltAngle;
	
	/**
	 * Rotation of the camera in degrees around the y axis.
	 */
	public int panAngle;
	
	/**
	 * Fractional step taken each time the hover() method is called.
	 */
	public int steps;
	
	/**
	 * Elevation angle of the camera in degrees.
	 */
	public int tiltAngle;
	
	/**
	 * Defines whether the value of the pan angle wraps when over 360 degrees or under 0 degrees.
	 */
	public boolean wrapPanAngle;
	
	/**
	 * Fractional difference in distance between the horizontal camera orientation and vertical camera orientation
	 */
	public int yfactor;
	
	/**
	 * Creates a new HoverCamera3D object.
	 */
	public HoverCamera3D() {
		super(1, 1, null);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Creates a new HoverCamera3D object.
	 * @param zoom Defines the distance from the focal point of the camera to the viewing plane. 
	 */
	public HoverCamera3D(int zoom) {
		super(1, 1, null);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Creates a new HoverCamera3D object.
	 * @param zoom Defines the distance from the focal point of the camera to the viewing plane. 
	 * @param focus Defines the overall scale value of the view.
	 * @target The 3d object targeted by the camera. 
	 */
	public HoverCamera3D(int zoom, int focus) {
		super(1, 1, null);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Creates a new HoverCamera3D object.
	 * @param zoom Defines the distance from the focal point of the camera to the viewing plane. 
	 * @param focus Defines the overall scale value of the view. 
	 * @target The 3d object targeted by the camera.
	 */
	public HoverCamera3D(int zoom, int focus, Object3D target) {
		super(1, 1, null);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Creates a new HoverCamera3D object.
	 * @param zoom Defines the distance from the focal point of the camera to the viewing plane. 
	 * @param focus Defines the overall scale value of the view. 
	 * @target The 3d object targeted by the camera.
	 * @param panAngle
	 */
	public HoverCamera3D(int zoom, int focus, Object3D target, int panAngle) {
		super(zoom, focus);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Creates a new HoverCamera3D object.
	 * @param zoom Defines the distance from the focal point of the camera to the viewing plane. 
	 * @param focus Defines the overall scale value of the view. 
	 * @target The 3d object targeted by the camera.
	 * @param panAngle
	 * @param tiltAngle
	 */
	public HoverCamera3D(int zoom, int focus, Object3D target, int panAngle, 
						 int tiltAngle) {
		super(zoom, focus);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Creates a new HoverCamera3D object.
	 * @param zoom Defines the distance from the focal point of the camera to the viewing plane. 
	 * @param focus Defines the overall scale value of the view. 
	 * @target The 3d object targeted by the camera.
	 * @param panAngle
	 * @param tiltAngle
	 * @param distance
	 */
	public HoverCamera3D(int zoom, int focus, Object3D target, int panAngle, 
						 int tiltAngle, int distance) {
		super(zoom, focus);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Updates the camera orientation. Values are calculated using the defined tiltAngle, panAngle and steps variables. 
	 * @param jumpTo Determines if step property is used. Defaults to false. 
	 * @return True if the camera position was updated, otherwise false. 
	 */
	public boolean hover(boolean jumpTo) {
		return true;
	}
	
	
	
}
