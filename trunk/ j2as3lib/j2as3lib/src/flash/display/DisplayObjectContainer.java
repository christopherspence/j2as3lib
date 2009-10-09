package flash.display;

import flash.base.Array;
import flash.geom.Point;

public class DisplayObjectContainer extends InteractiveObject {

	// TODO - PROPERTIES 
	
	/**
	 * Calling the new DisplayObjectContainer() constructor throws an ArgumentError exception.
	 */
	public DisplayObjectContainer() {
		
	}
	
	/**
	 * Adds a child DisplayObject instance to this DisplayObjectContainer instance.
	 * @param child
	 * @return
	 */
	public DisplayObject addChild(DisplayObject child) {
		return new DisplayObject();		
	}
	
	/**
	 * Adds a child DisplayObject instance to this DisplayObjectContainer instance.
	 * @param child
	 * @param index
	 * @return
	 */
	public DisplayObject addChildAt(DisplayObject child, int index) {
		return new DisplayObject();		
	}
	
	/**
	 * Indicates whether the security restrictions would cause any display objects to be omitted from the list returned by calling the DisplayObjectContainer.getObjectsUnderPoint() method with the specified point point.
	 */
	public boolean areInaccessibleObjectsUnderPoint(Point point) {
		return true;
	}
	
	/**
	 * Determines whether the specified display object is a child of the DisplayObjectContainer instance or the instance itself.
	 */
	public boolean contains(DisplayObject child) {
		return true;
	}
	
	/**
	 * Returns the child display object instance that exists at the specified index.
	 * @param index
	 * @return
	 */
	public DisplayObject getChildAt(int index) {
		return new DisplayObject();
	}
	
	/**
	 * Returns the child display object that exists with the specified name.
	 * @param name
	 * @return
	 */
	public DisplayObject getChildByName(String name) {
		return new DisplayObject();		
	}
	
	/**
	 * Returns the index position of a child DisplayObject instance.
	 * @param child
	 * @return
	 */
	public int getChildIndex(DisplayObject child) {
		return 0;
	}
	
	/**
	 * Returns an array of objects that lie under the specified point and are children (or grandchildren, and so on) of this DisplayObjectContainer instance.
	 * @param point
	 * @return
	 */
	public Array getObjectsUnderPoint(Point point) {		
		return new Array() {};
	}
	
	/**
	 * Removes the specified child DisplayObject instance from the child list of the DisplayObjectContainer instance.
	 * @param child
	 * @return
	 */
	public DisplayObject removeChild(DisplayObject child) {
		return new DisplayObject();		
	}
	
	/**
	 * Removes a child DisplayObject from the specified index position in the child list of the DisplayObjectContainer.
	 * @param child
	 * @return
	 */
	public DisplayObject removeChildAt(DisplayObject child) {
		return new DisplayObject();
	}
	
	/**
	 * Changes the position of an existing child in the display object container.
	 * @param child
	 * @param index
	 */
	public void setChildIndex(DisplayObject child, int index) {}
	
	/**
	 * Swaps the z-order (front-to-back order) of the two specified child objects.
	 * @param child1
	 * @param child2
	 */
	public void swapChildren(DisplayObject child1, DisplayObject child2) {}
	
	/**
	 * Swaps the z-order (front-to-back order) of the child objects at the two specified index positions in the child list.
	 * @param index1
	 * @param index2
	 */
	public void swapChildrenAt(int index1, int index2) {}
	
}
