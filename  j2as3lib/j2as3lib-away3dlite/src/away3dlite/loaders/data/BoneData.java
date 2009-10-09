package away3dlite.loaders.data;

import away3dlite.containers.ObjectContainer3D;
import flash.base.Array;

public class BoneData extends ContainerData {
	
	/**
	 * An array containing the child 3d objects of the container. 
	 */
	public Array children;
	
	/**
	 * Reference to the 3d container object of the resulting container. 
	 */
	public ObjectContainer3D container;
	
	/**
	 * Returns the maximum x value of the container data 
	 */
	public int maxX;
	
	/**
	 * Returns the maximum y value of the container data 
	 */
	public int maxY;
	
	/**
	 * Returns the maximum z value of the container data 
	 */
	public int maxZ;
	
	/**
	 * Returns the minimum x value of the container data 
	 */
	public int minX;
	
	/**
	 * Returns the minimum y value of the container data 
	 */
	public int minY;
	
	/**
	 * Returns the minimum z value of the container data 
	 */
	public int minZ;
	
	
}
