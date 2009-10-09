package away3dlite.core.clip;

import flash.events.EventDispatcher;

public class Clipping extends EventDispatcher {

	/**
	 * Maximum allowed x value for primitives
	 */
	public int maxX;

	/**
	 * Maximum allowed y value for primitives 
	 */
	public int maxY;
	
	/**
	 * Maximum allowed z value for primitives 
	 */
	public int maxZ;
	
	/**
	 * Minimum allowed x value for primitives.
	 */
	public int minX;
	
	/**
	 * Minimum allowed y value for primitives
	 */
	public int minY;
	
	/**
	 * Minimum allowed z value for primitives 
	 */
	public int minZ;
	
	/**
	 * Creates a new Clipping object.
	 */
	public Clipping(int minX, int maxX, int minY, int maxY, int minZ, int maxZ) {}
	
	/**
	 * Creates a new Clipping object.
	 */
	public Clipping() {}

	/*
	 * Duplicates the clipping object's properties to another Clipping object 
	 */
	public Clipping clone(Clipping object) { 
		return new Clipping();
	}
}
