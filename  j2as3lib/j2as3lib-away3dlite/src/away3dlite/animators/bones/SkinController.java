package away3dlite.animators.bones;

import away3dlite.containers.ObjectContainer3D;
import flash.base.Vector;
import flash.geom.Matrix3D;

public class SkinController {
	
	/**
	 * Defines the 3d matrix that transforms the position of the Bone to the position of the SkinVertices. 
	 */
	public Matrix3D bindMatrix;
	
	/**
	 * Reference to the joint of the controlling Bone object.
	 */
	public ObjectContainer3D joint;
	
	/**
	 * Reference to the name of the controlling Bone object. 
	 */
	public String name;
	
	/**
	 * Defines the containing 3d object that holds the Mesh to which the SkinVertex objects belong.
	 */
	public ObjectContainer3D parent;
	
	/**
	 * Store of all SkinVertex being controlled 
	 */
	public Vector skinVertices;
	
	/**
	 * [read-only] Returns the 3d transform matrix to apply to the SkinVertex objects.
	 */
	public Matrix3D transformMatrix3D;
	
	/**
	 * Updates the 3d transform matrix.
	 */
	public void update() {}
	
	
}
