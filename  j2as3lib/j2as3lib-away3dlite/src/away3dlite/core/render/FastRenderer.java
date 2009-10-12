package away3dlite.core.render;

import away3dlite.core.base.Face;

/**
 *
 */
public class FastRenderer extends Renderer {
	
	/**
	 * Determines whether 3d objects are sorted in the view.
	 */
	public boolean sortObjects;
	
	/**
	 * Creates a new BasicRenderer object.
	 */
	public FastRenderer() {}
	
	/**
	 * Returns the face object directly under the given point. 
	 * @param x The x coordinate of the point. 
	 * @param y The y coordinate of the point.
	 */
	public Face getFaceUnderPoint(int x, int y) {
		return new Face();
	}
	
	/**
	 * Renders the contents of the scene to the view. 
	 */
	public void render() {}
}
