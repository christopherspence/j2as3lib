package away3dlite.animators.bones;

import flash.base.Vector;

public class SkinVertex {
	/**
	 * 
	 */
	public Vector controllers;
	
	/**
	 * 
	 */
	public Vector weights;
	
	/**
	 * 
	 */
	public SkinVertex() {}
	
	public SkinVertex clone() {
		return new SkinVertex();
	}
	
	public void update() {}
	
	public void updateVertices(int startIndex, Vector vertices) {}
}
