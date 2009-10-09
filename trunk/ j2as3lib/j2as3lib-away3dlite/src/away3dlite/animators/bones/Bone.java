package away3dlite.animators.bones;

import away3dlite.containers.ObjectContainer3D;
import away3dlite.core.base.Object3D;

public class Bone {

	/**
	 * Collada 3.05B id value 
	 */
	public String boneId;
	
	/**
	 * the joint object of the bone 
	 */
	public ObjectContainer3D joint;
	
	/**
	 * Defines the euler angle of rotation of the 3d object around the x-axis, relative to the local coordinates of the parent ObjectContainer3D.
	 */
	public float jointRotationX;
	
	/**
	 * Defines the euler angle of rotation of the 3d object around the y-axis, relative to the local coordinates of the parent ObjectContainer3D.
	 */
	public float jointRotationY;
	
	/**
	 * Defines the euler angle of rotation of the 3d object around the z-axis, relative to the local coordinates of the parent ObjectContainer3D.
	 */
	public float jointRotationZ;
	
	/**
	 * Defines the scale of the 3d object along the x-axis, relative to local coordinates.
	 */
	public float jointScaleX;
	
	/**
	 * Defines the scale of the 3d object along the y-axis, relative to local coordinates.
	 */
	public float jointScaleY;
	
	/**
	 * Defines the scale of the 3d object along the z-axis, relative to local coordinates.
	 */
	public float jointScaleZ;
	
	/**
	 * Creates a new Bone object.
	 */
	public Bone() {}
	
	/**
	 * Duplicates the 3d object's properties to another Bone object 
	 */
	public Object3D clone() {
		return new Object3D();
	}
	
	/**
	 * Duplicates the 3d object's properties to another Bone object
	 * @param object [optional] The new object instance into which all properties are copied. The default is Bone
	 * @return
	 */
	public Object3D clone(Object3D object) {
		return new Object3D();
	}	
	
}
