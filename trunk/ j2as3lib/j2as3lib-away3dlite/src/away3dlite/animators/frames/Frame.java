package away3dlite.animators.frames;

import flash.base.Vector;

public class Frame {
	
	/**
	 * The name of the frame.
	 */
	public String name;
	
	/**
	 * The array of vertices contained inside the frame 
	 */
	public Vector vertices;
	
	/**
	 * The array of vertices contained inside the frame. 
	 * @param name The name of the frame.
	 * @param vertices An array of Vertex objects.
	 */
	public Frame(String name, Vector vertices) {}
	
	/**
	 * Returns a string representation of the Frame object
	 */
	public String toString() {
		return "";
	}
}
