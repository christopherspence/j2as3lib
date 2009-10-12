package away3dlite.core.clip;

public class RectangleClipping extends Clipping {

	/**
	 * 
	 */
	public RectangleClipping() {}
	
	/**
	 * 
	 * @param minX Minimum allowed x value for primitives.
	 */
	public RectangleClipping(int minX) {}
	
	/**
	 * 
	 * @param minX Minimum allowed x value for primitives.
	 * @param maxX Maximum allowed x value for primitives. 
	 */
	public RectangleClipping(int minX, int maxX) {}
	
	/**
	 * 
	 * @param minX Minimum allowed x value for primitives.
	 * @param maxX Maximum allowed x value for primitives. 
	 * @param minY Minimum allowed y value for primitives. 
	 */
	public RectangleClipping(int minX, int maxX, int minY) {}
	
	/**
	 * 
	 * @param minX Minimum allowed x value for primitives.
	 * @param maxX Maximum allowed x value for primitives. 
	 * @param minY Minimum allowed y value for primitives. 
	 * @param maxY Maximum allowed y value for primitives. 
	 */
	public RectangleClipping(int minX, int maxX, int minY, int maxY) {}
	
	/**
	 * 
	 * @param minX Minimum allowed x value for primitives.
	 * @param maxX Maximum allowed x value for primitives. 
	 * @param minY Minimum allowed y value for primitives. 
	 * @param maxY Maximum allowed y value for primitives. 
	 * @param minZ Minimum allowed z value for primitives. 
	 */
	public RectangleClipping(int minX, int maxX, int minY, int maxY, int minZ) {}
	
	/**
	 * 
	 * @param minX Minimum allowed x value for primitives.
	 * @param maxX Maximum allowed x value for primitives. 
	 * @param minY Minimum allowed y value for primitives. 
	 * @param maxY Maximum allowed y value for primitives. 
	 * @param minZ Minimum allowed z value for primitives. 
	 * @param maxZ Maximum allowed z value for primitives. 
	 */
	public RectangleClipping(int minX, int maxX, int minY, int maxY, int minZ, int maxZ) {}
	
	public Clipping clone(Clipping object) {
		return new Clipping();
	}
}
