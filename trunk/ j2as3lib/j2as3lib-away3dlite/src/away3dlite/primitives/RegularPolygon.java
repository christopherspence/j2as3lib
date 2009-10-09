package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class RegularPolygon extends AbstractPrimitive {
	
	/**
	 * Defines the radius of the regular polygon. 
	 */
	public int radius;
	
	/**
	 * Defines the number of horizontal segments that make up the regular polygon.
	 */
	public int segmentsW;
	
	/**
	 * Defines whether the coordinates of the regular polygon points use a yUp orientation (true) or a zUp orientation (false).
	 */
	public boolean yUp;
	
	/**
	 * RegularPolygon constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the RegularPolygon, 'height' the height, 'segmentsW' the number of segments around the RegularPolygon horizontally and 'segmentsH' the number of segments vertically.
	 */
	public RegularPolygon() {}
	
	/**
	 * RegularPolygon constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the RegularPolygon, 'height' the height, 'segmentsW' the number of segments around the RegularPolygon horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the RegularPolygon. 
	 */
	public RegularPolygon(Material material) {}
	
	/**
	 * RegularPolygon constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the RegularPolygon, 'height' the height, 'segmentsW' the number of segments around the RegularPolygon horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the RegularPolygon. 
	 * @param radius Defines the radius of the RegularPolygon base. 
	 */
	public RegularPolygon(Material material, int radius) {}
	
	/**
	 * RegularPolygon constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the RegularPolygon, 'height' the height, 'segmentsW' the number of segments around the RegularPolygon horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the RegularPolygon. 
	 * @param radius Defines the radius of the RegularPolygon base. 
	 * @param segmentsW Defines the number of horizontal segments that make up the RegularPolygon. 
	 */
	public RegularPolygon(Material material, int radius, int segmentsW) {}
	
	/**
	 * RegularPolygon constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the RegularPolygon, 'height' the height, 'segmentsW' the number of segments around the RegularPolygon horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the RegularPolygon. 
	 * @param radius Defines the radius of the RegularPolygon base. 
	 * @param segmentsW Defines the number of horizontal segments that make up the RegularPolygon. 
	 * @param yUp Defines whether the coordinates of the regular polygon points use a yUp orientation (true) or a zUp orientation (false). Defaults to true.
	 */
	public RegularPolygon(Material material, int radius, int segmentsW, boolean yUp) {}
	
	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	@Override
	protected void buildPrimitive() {}
	
	/**
	 * Duplicates the RegularPolygon properties to another RegularPolygon object. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone() {
		return new Object3D();
	}
	
	/**
	 * Duplicates the RegularPolygon properties to another RegularPolygon object. 
	 * @param object [optional] The new object instance into which all properties are copied. The default is RegularPolygon. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone(Object3D object) {
		return new Object3D();
	}
	
}
