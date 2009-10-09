package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class Cone extends AbstractPrimitive {
	
	/**
	 * Defines the height of the cone.
	 */
	public int height;
	
	/**
	 * Defines whether the end of the cone is left open (true) or closed (false).
	 */
	public boolean openEnded;
	
	/**
	 * Defines the radius of the cone base. 
	 */
	public int radius;
	
	/**
	 * Defines the number of vertical segments that make up the cone.
	 */
	public int segmentsH;
	
	/**
	 * Defines the number of horizontal segments that make up the cone.
	 */
	public int segmentsW;
	
	/**
	 * Defines whether the coordinates of the cone points use a yUp orientation (true) or a zUp orientation (false).
	 */
	public boolean yUp;
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 */
	public Cone() {}
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cone. 
	 */
	public Cone(Material material) {}
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cone. 
	 * @param radius Defines the radius of the cone base. 
	 */
	public Cone(Material material, int radius) {}
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cone. 
	 * @param radius Defines the radius of the cone base. 
	 * @param height Defines the height of the cone. 
	 */
	public Cone(Material material, int radius, int height) {}
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cone. 
	 * @param radius Defines the radius of the cone base. 
	 * @param height Defines the height of the cone. 
	 * @param segmentsW Defines the number of horizontal segments that make up the cone.
	 */
	public Cone(Material material, int radius, int height, int segmentsW) {}
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cone. 
	 * @param radius Defines the radius of the cone base. 
	 * @param height Defines the height of the cone. 
	 * @param segmentsW Defines the number of horizontal segments that make up the cone. 
	 * @param segmentsH Defines the number of vertical segments that make up the cone. 
	 */
	public Cone(Material material, int radius, int height, int segmentsW, int segmentsH) {}
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cone. 
	 * @param radius Defines the radius of the cone base. 
	 * @param height Defines the height of the cone. 
	 * @param segmentsW Defines the number of horizontal segments that make up the cone. 
	 * @param segmentsH Defines the number of vertical segments that make up the cone. 
	 * @param openEnded Defines whether the end of the cone is left open (true) or closed (false). 
	 */
	public Cone(Material material, int radius, int height, int segmentsW, int segmentsH,
				boolean openEnded) {}
	
	/**
	 * Cone constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the cone, 'height' the height, 'segmentsW' the number of segments around the cone horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cone. 
	 * @param radius Defines the radius of the cone base. 
	 * @param height Defines the height of the cone. 
	 * @param segmentsW Defines the number of horizontal segments that make up the cone. 
	 * @param segmentsH Defines the number of vertical segments that make up the cone. 
	 * @param openEnded Defines whether the end of the cone is left open (true) or closed (false). 
	 * @param yUp Defines whether the coordinates of the cone points use a yUp orientation (true) or a zUp orientation (false). 
	 */
	public Cone(Material material, int radius, int height, int segmentsW, int segmentsH,
				boolean openEnded, boolean yUp) {}
	
	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	@Override
	protected void buildPrimitive() {}
	
	/**
	 * Duplicates the cone properties to another Cone object. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone() {
		return new Object3D();
	}
	
	/**
	 * Duplicates the cone properties to another Cone object. 
	 * @param object [optional] The new object instance into which all properties are copied. The default is Cone. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone(Object3D object) {
		return new Object3D();
	}
	
}
