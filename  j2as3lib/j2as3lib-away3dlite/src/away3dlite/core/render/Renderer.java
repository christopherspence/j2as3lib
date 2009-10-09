package away3dlite.core.render;

import away3dlite.core.base.Face;

public class Renderer {
	
	/**
	 * Creates a new Renderer object.
	 */
	public Renderer() {}
	
	/**
	 * Returns the face object directly under the given point.
	 * @param x
	 * @param y
	 * @return
	 */
	public Face getFaceUnderPoint(int x, int y) {
		return new Face();
	}
	
	/**
	 * Renders the contents of the scene to the view.
	 */
	public void render() {}

}
