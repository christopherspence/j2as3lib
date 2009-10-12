package away3dlite.cameras;

import away3dlite.core.base.Object3D;

/**
 * Extended camera used to automatically look at a specified target object.
 */
public class TargetCamera3D extends Camera3D {

	/**
	 * The 3d object targeted by the camera.
	 */
	public Object3D target;	
	
	public TargetCamera3D(int zoom, int focus) {
			super(zoom, focus);
		// TODO Auto-generated constructor stub
	}

	public TargetCamera3D(int zoom, int focus, Object3D target) {
		super(zoom, focus);
		// TODO Auto-generated constructor stub
	}

}
