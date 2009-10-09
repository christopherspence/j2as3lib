package away3dlite.animators;

import flash.base.Vector;
import away3dlite.core.base.Mesh;

/**
 * Animates a series of Frame objects in sequence in a mesh. 
 */
public class MovieMesh extends Mesh {

	// CONSTANTS
	public final int ANIM_LOOP = 2;
	
	public final int ANIM_NORMAL = 1;
	
	public final int ANIM_STOP = 4;
	
	/**
	 * Number of animation frames to display per second 
	 */
	public int fps = 24;
	
	/**
	 * The array of frames that make up the animation sequence.
	 */
	public Vector frames;
	
	/**
	 * Defines the current keyframe.
	 */
	public int keyframe;
	
	/**
	 * Creates a new MovieMesh object that provides a "keyframe animation"/"vertex animation"/"mesh deformation" framework for subclass loaders.
	 */
	public MovieMesh() {}
	
	public void addFrame(Frame frame) {}
	
	public void loop(int begin, int end) {}
}
