package away3dlite.core.render;

import away3dlite.core.base.Face;

/**
 * Standard renderer for a view.  
 */
public class BasicRenderer extends Renderer {
	
	/**
	 * Creates a new BasicRenderer object.
	 */
	public BasicRenderer() {}
	
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
