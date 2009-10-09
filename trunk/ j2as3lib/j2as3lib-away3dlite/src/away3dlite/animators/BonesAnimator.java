package away3dlite.animators;

import away3dlite.animators.bones.Channel;
import away3dlite.animators.bones.SkinController;
import away3dlite.containers.ObjectContainer3D;

public class BonesAnimator {
	
	// PROPERTIES
	
	/**
	 * Defines the total length of the animation in seconds
	 */
	public int length;
	
	/**
	 * Defines whether the animation will loop 
	 */
	public boolean loop;
	
	/**
	 * Defines the start of the animation in seconds. 
	 */
	public int Number;
	
	// METHODS
	
	/**
	 * Adds an animation channel to the animation timeline. 
	 */
	public void addChannel(Channel channel) {}
	
	/**
	 * Adds a SkinController and all associated SkinVertex objects to the animation. 
	 */
	public void addSkinController(SkinController skinController) {}
	
	/**
	 * Clones the animation data into a new BonesAnimator object. 
	 * @param object
	 * @return
	 */
	public BonesAnimator clone(ObjectContainer3D object) {
		return new BonesAnimator();		
	}
	
	/**
	 * Updates all channels in the animation with the given time in seconds. 
	 * @param time Defines the time in seconds of the playhead of the animation. 
	 */
	public void update(int time) {}
	
	/**
	 * Updates all channels in the animation with the given time in seconds. 
	 * @param time Defines the time in seconds of the playhead of the animation. 
	 * @param interpolate [optional] Defines whether the animation interpolates between channel points Defaults to true. 
	 */
	public void update(int time, boolean interpolate) {}
	
}
