package flash.display;

import java.lang.reflect.Array;

import flash.events.*;
import flash.geom.*;
import flash.accessibility.*;

public class DisplayObject extends EventDispatcher {
	
	
	// Properties
	/**
	 * The current accessibility options for this display object.
	 */
	public AccessibilityProperties accessibilityProperties;
	
	/**
	 * Indicates the alpha transparency value of the object specified.
	 */
	public float alpha;
	
	/**
	 * A value from the BlendMode class that specifies which blend mode to use.
	 */
	public String blendMode;
	
	/**
	 * [write-only] Sets a shader that is used for blending the foreground and background.
	 */
	public Shader blendShader;
	
	/**
	 * If set to true, Flash Player or Adobe AIR caches an internal bitmap representation of the display object.
	 */
	public boolean cacheAsBitmap;
	
	/**
	 * An indexed array that contains each filter object currently associated with the display object.
	 */
	public Array filters;
	
	/**
	 * Indicates the height of the display object, in pixels.
	 */
	public int height;
	
	/**
	 * [read-only] Returns a LoaderInfo object containing information about loading the file to which this display object belongs.
	 */
	public LoaderInfo loaderInfo;
	
	/**
	 * The calling display object is masked by the specified mask object.
	 */
	public DisplayObject mask;
	
	/**
	 * [read-only] Indicates the x coordinate of the mouse position, in pixels.
	 */
	public int mouseX;
	
	/**
	 * [read-only] Indicates the y coordinate of the mouse position, in pixels.
	 */
	public int mouseY;
	
	/**
	 * Indicates the instance name of the DisplayObject.
	 */
	public String name;
	
	/**
	 * Specifies whether the display object is opaque with a certain background color.
	 */
	public Object opaqueBackground;
	
	/**
	 * [read-only] Indicates the DisplayObjectContainer object that contains this display object.
	 */
	public DisplayObjectContainer parent;
	
	/**
	 * [read-only] For a display object in a loaded SWF file, the root property is the top-most display object in the portion of the display list's tree structure represented by that SWF file.
	 */
	public DisplayObject root;
	
	/**
	 * Indicates the rotation of the DisplayObject instance, in degrees, from its original orientation.
	 */
	public int rotation;
	
	/**
	 * Indicates the x-axis rotation of the DisplayObject instance, in degrees, from its original orientation relative to the 3D parent container.
	 */
	public int rotationX;
	
	/**
	 * Indicates the y-axis rotation of the DisplayObject instance, in degrees, from its original orientation relative to the 3D parent container.
	 */
	public int rotationY;
	
	/**
	 * Indicates the z-axis rotation of the DisplayObject instance, in degrees, from its original orientation relative to the 3D parent container.
	 */
	public int rotationZ;

	/**
	 * The current scaling grid that is in effect.
	 */
	public Rectangle scale9Grid;
	
	/**
	 * Indicates the horizontal scale (percentage) of the object as applied from the registration point.
	 */
	public int scaleX;
	
	/**
	 * Indicates the vertical scale (percentage) of the object as applied from the registration point.
	 */
	public int scaleY;
	
	/**
	 * Indicates the depth scale (percentage) of the object as applied from the registration point.
	 */
	public int scaleZ;

	/**
	 * The scroll rectangle bounds of the display object.
	 */
	public Rectangle scrollRect;
	
	/**
	 * [read-only] The Stage of the display object.
	 */
	public Stage stage;
	
	/**
	 * An object with properties pertaining to a display object's matrix, color transform, and pixel bounds.
	 */
	public Transform transform;
	
	/**
	 * Whether or not the display object is visible.
	 */
	public boolean visible;
	
	/**
	 * Indicates the width of the display object, in pixels.
	 */
	public int width;
	
	/**
	 * Indicates the x coordinate of the DisplayObject instance relative to the local coordinates of the parent DisplayObjectContainer.
	 */
	public int x;
	
	/**
	 * Indicates the y coordinate of the DisplayObject instance relative to the local coordinates of the parent DisplayObjectContainer.
	 */
	public int y;
	
	/**
	 * Indicates the z coordinate of the DisplayObject instance relative to the local coordinates of the parent DisplayObjectContainer.
	 */
	public int z;
	
	// Methods
	public Rectangle getBounds(DisplayObject targetCoordinateSpace) {
		return new Rectangle();
	}
	
	public Rectangle getRect(DisplayObject targetCoordinateSpace) {
		return new Rectangle();
	}
	
	public Point globalToLocal(Point point) {
		return new Point();
	}
	
	public Vector3D globalToLocal3D(Point point) {
		return new Vector3D();
	}
	
	public boolean hitTestObject(DisplayObject obj) {
		return true;
	}
	
	public Point local3DToGlobal(Vector3D point3d) {
		return new Point();		
	}
	
	public Point localToGlobal(Point point) {
		return new Point();
	}
}
