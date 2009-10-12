package away3dlite.containers;

import away3dlite.cameras.Camera3D;
import away3dlite.core.clip.Clipping;
import away3dlite.core.render.Renderer;
import flash.display.Sprite;

public class View3D extends Sprite {
	
	/**
	 * Camera used when rendering.
	 */
	public Camera3D camera;
	
	/**
	 * Clipping used when rendering.
	 */
	public Clipping clipping;
	
	/**
	 * Forces mousemove events to fire even when cursor is static.
	 */
	public boolean mouseZeroMove;
	
	/**
	 * [read-only] Returns the total amount of faces rendered in the last executed render 
	 */
	public int renderedFaces;
	
	/**
	 * [read-only] Returns the total amount of objects rendered in the last executed render 
	 */
	public int renderedObject;
	
	/**
	 * Renderer object used to traverse the scenegraph and output the drawing primitives required to render the scene to the view.
	 */
	public Renderer renderer;
	
	/**
	 * Scene used when rendering.
	 */
	public Scene3D scene;
	
	/**
	 * [read-only] Returns the total amount of faces processed in the last executed render 
	 */
	public int totalFaces;
	
	/**
	 * 	[read-only] Returns the total amount of 3d objects processed in the last executed render 
	 */
	public int totalObjects;
	
	/**
	 * Creates a new View3D object.
	 */
	public View3D() {}
	
	/**
	 * Creates a new View3D object.
	 * @param scene  Scene used when rendering.
	 */
	public View3D(Scene3D scene) {}
	
	/**
	 * Creates a new View3D object.
	 * @param scene Scene used when rendering.
	 * @param camera
	 */
	public View3D(Scene3D scene, Camera3D camera) {}
	
	/**
	 * Creates a new View3D object.
	 * @param scene  Scene used when rendering.
	 * @param camera
	 * @param renderer
	 */
	public View3D(Scene3D scene, Camera3D camera, Renderer renderer) {}
	
	/**
	 * Creates a new View3D object.
	 * @param scene  Scene used when rendering.
	 * @param camera
	 * @param renderer
	 * @param clipping
	 */
	public View3D(Scene3D scene, Camera3D camera, Renderer renderer, Clipping clipping) {}	
	
	
}
