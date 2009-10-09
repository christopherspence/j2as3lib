package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class Cylinder extends AbstractPrimitive {
	
	/**
	 * Defines the height of the cylinder.
	 */
	public int height;
	
	/**
	 * Defines whether the ends of the cylinder are left open (true) or closed (false).
	 */
	public boolean openEnded;
	
	/**
	 * Defines the radius of the cylinder. 
	 */
	public int radius;
	
	/**
	 * Defines the number of vertical segments that make up the cylinder.
	 */
	public int segmentsH;
	
	/**
	 * Defines the number of horizontal segments that make up the cylinder.
	 */
	public int segmentsW;
	
	/**
	 * Defines whether the coordinates of the cylinder points use a yUp orientation (true) or a zUp orientation (false).
	 */
	public boolean yUp;
	
	/**
	 * Cylinder constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the Cylinder, 'height' the height, 'segmentsW' the number of segments around the Cylinder horizontally and 'segmentsH' the number of segments vertically.
	 */
	public Cylinder() {}
	
	/**
	 * Creates a new Cylinder object.
	 * @param material Defines the global material used on the faces in the Cylinder. 
	 */
	public Cylinder(Material material) {}
	
	/**
	 * Creates a new Cylinder object.
	 * @param material Defines the global material used on the faces in the Cylinder. 
	 * @param radius Defines the radius of the Cylinder base. 
	 */
	public Cylinder(Material material, int radius) {}
	
	/**
	 * Creates a new Cylinder object.
	 * @param material Defines the global material used on the faces in the Cylinder. 
	 * @param radius Defines the radius of the Cylinder base. 
	 * @param height Defines the height of the Cylinder. 
	 */
	public Cylinder(Material material, int radius, int height) {}
	
	/**
	 * Creates a new Cylinder object.
	 * @param material Defines the global material used on the faces in the Cylinder. 
	 * @param radius Defines the radius of the Cylinder base. 
	 * @param height Defines the height of the Cylinder. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cylinder.
	 */
	public Cylinder(Material material, int radius, int height, int segmentsW) {}
	
	/**
	 * Creates a new Cylinder object.
	 * @param material Defines the global material used on the faces in the Cylinder. 
	 * @param radius Defines the radius of the Cylinder base. 
	 * @param height Defines the height of the Cylinder. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cylinder. 
	 * @param segmentsH Defines the number of vertical segments that make up the Cylinder. 
	 */
	public Cylinder(Material material, int radius, int height, int segmentsW, int segmentsH) {}
	
	/**
	 * Creates a new Cylinder object.
	 * @param material Defines the global material used on the faces in the Cylinder. 
	 * @param radius Defines the radius of the Cylinder base. 
	 * @param height Defines the height of the Cylinder. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cylinder. 
	 * @param segmentsH Defines the number of vertical segments that make up the Cylinder. 
	 * @param openEnded Defines whether the end of the Cylinder is left open (true) or closed (false). 
	 */
	public Cylinder(Material material, int radius, int height, int segmentsW, int segmentsH,
				boolean openEnded) {}
	
	/**
	 * Creates a new Cylinder object.
	 * @param material Defines the global material used on the faces in the Cylinder. 
	 * @param radius Defines the radius of the Cylinder base. 
	 * @param height Defines the height of the Cylinder. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cylinder. 
	 * @param segmentsH Defines the number of vertical segments that make up the Cylinder. 
	 * @param openEnded Defines whether the end of the Cylinder is left open (true) or closed (false). 
	 * @param yUp Defines whether the coordinates of the Cylinder points use a yUp orientation (true) or a zUp orientation (false). 
	 */
	public Cylinder(Material material, int radius, int height, int segmentsW, int segmentsH,
				boolean openEnded, boolean yUp) {}
	
	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	@Override
	protected void buildPrimitive() {}
	
	/**
	 * Duplicates the cylinder properties to another Cylinder object. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone() {
		return new Object3D();
	}
	
	/**
	 * Duplicates the Cylinder properties to another Cylinder object. 
	 * @param object [optional] The new object instance into which all properties are copied. The default is Cylinder. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone(Object3D object) {
		return new Object3D();
	}
	
}
