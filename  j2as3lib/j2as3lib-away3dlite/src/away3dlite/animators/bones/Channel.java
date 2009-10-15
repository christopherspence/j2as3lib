package away3dlite.animators.bones;

import away3dlite.containers.ObjectContainer3D;
import away3dlite.core.base.Object3D;
import flash.base.Array;

public class Channel {
	
	// PROPERTIES
	
	public Array inTangent;
	
	public Array interpolations;
	
	public String name;
	
	public Array outTangent;
	
	public Array param;
	
	public Object3D target;
	
	public Array times;
	
	public Array type;
	
	// METHODS
	
	/**
	 * 
	 */
	public Channel(String name) {}
	
	/**
	 * 
	 * @param object
	 * @return
	 */
	public Channel clone(ObjectContainer3D object) {
		return new Channel("");
	}
	
	/**
	 * Updates the channel's target with the data point at the given time in seconds.
	 * @param time Defines the time in seconds of the playhead of the animation. 
	 * @param interpolate [optional] Defines whether the animation interpolates between channel points Defaults to true. 
	 */
	public void update(float time, boolean interpolate) {
		
	}
}
