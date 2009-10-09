package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class Plane extends AbstractPrimitive {
	
	/**
	 * Defines the height of the plane.
	 */
	public int height;
	
	/**
	 * Defines the number of vertical segments that make up the plane.
	 */
	public int segmentsH;
	
	/**
	 * Defines the number of horizontal segments that make up the plane.
	 */
	public int segmentsW;
	
	/**
	 * Defines the width of the plane.
	 */
	public int width;
	
	/**
	 * Defines whether the coordinates of the plane points use a yUp orientation (true) or a zUp orientation (false).
	 */
	public boolean yUp;
	
	/**
	 * Plane constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the Plane, 'height' the height, 'segmentsW' the number of segments around the Plane horizontally and 'segmentsH' the number of segments vertically.
	 */
	public Plane() {}
	
	/**
	 * Constructor for a plane object. The init object parameters are : 'width'/'height' defines the size of the plane, 'segments' defines the number of segments for width and height unless overriden, 'segmentsW' defines number segments the plane is split into horizontally and 'segmentsH' how many segments plane is split into vertically.
	 * @param material Defines the global material used on the faces in the Plane. 
	 */
	public Plane(Material material) {}
	
	/**
	 * Constructor for a plane object. The init object parameters are : 'width'/'height' defines the size of the plane, 'segments' defines the number of segments for width and height unless overriden, 'segmentsW' defines number segments the plane is split into horizontally and 'segmentsH' how many segments plane is split into vertically.
	 * @param material Defines the global material used on the faces in the Plane. 
	 * @param width Defines the width of the plane.  
	 */
	public Plane(Material material, int width) {}
	
	/**
	 * Constructor for a plane object. The init object parameters are : 'width'/'height' defines the size of the plane, 'segments' defines the number of segments for width and height unless overriden, 'segmentsW' defines number segments the plane is split into horizontally and 'segmentsH' how many segments plane is split into vertically.
	 * @param material Defines the global material used on the faces in the Plane. 
	 * @param width Defines the width of the plane.  
	 * @param height Defines the height of the Plane. 
	 */
	public Plane(Material material, int width, int height) {}
	
	/**
	 * Constructor for a plane object. The init object parameters are : 'width'/'height' defines the size of the plane, 'segments' defines the number of segments for width and height unless overriden, 'segmentsW' defines number segments the plane is split into horizontally and 'segmentsH' how many segments plane is split into vertically.
	 * @param material Defines the global material used on the faces in the Plane. 
	 * @param width Defines the width of the plane.  
	 * @param height Defines the height of the Plane. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Plane.
	 */
	public Plane(Material material, int radius, int height, int segmentsW) {}
	
	/**
	 * Constructor for a plane object. The init object parameters are : 'width'/'height' defines the size of the plane, 'segments' defines the number of segments for width and height unless overriden, 'segmentsW' defines number segments the plane is split into horizontally and 'segmentsH' how many segments plane is split into vertically.
	 * @param material Defines the global material used on the faces in the Plane. 
	 * @param width Defines the width of the plane.  
	 * @param height Defines the height of the Plane. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Plane. 
	 * @param segmentsH Defines the number of vertical segments that make up the Plane. 
	 */
	public Plane(Material material, int width, int height, int segmentsW, int segmentsH) {}
	
	
	/**
	 * Constructor for a plane object. The init object parameters are : 'width'/'height' defines the size of the plane, 'segments' defines the number of segments for width and height unless overriden, 'segmentsW' defines number segments the plane is split into horizontally and 'segmentsH' how many segments plane is split into vertically.
	 * @param material Defines the global material used on the faces in the Plane. 
	 * @param width Defines the width of the plane.  
	 * @param height Defines the height of the Plane. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Plane. 
	 * @param segmentsH Defines the number of vertical segments that make up the Plane. 
	 * @param yUp Defines whether the coordinates of the Plane points use a yUp orientation (true) or a zUp orientation (false). 
	 */
	public Plane(Material material, int width, int height, int segmentsW, int segmentsH,
				 boolean yUp) {}
	
	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	@Override
	protected void buildPrimitive() {}
	
	/**
	 * Duplicates the Plane properties to another Plane object. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone() {
		return new Object3D();
	}
	
	/**
	 * Duplicates the Plane properties to another Plane object. 
	 * @param object [optional] The new object instance into which all properties are copied. The default is Plane. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone(Object3D object) {
		return new Object3D();
	}
	
}

