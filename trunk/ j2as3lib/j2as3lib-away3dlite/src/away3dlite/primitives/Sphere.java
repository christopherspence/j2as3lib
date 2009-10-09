package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class Sphere extends AbstractPrimitive {
	
	/**
	 * Defines the radius of the sphere.
	 */
	public int radius;
	
	/**
	 * Defines the number of vertical segments that make up the sphere.
	 */
	public int segmentsH;
	
	/**
	 * Defines the number of horizontal segments that make up the sphere.
	 */
	public int segmentsW;
	
	/**
	 * Defines whether the coordinates of the sphere points use a yUp orientation (true) or a zUp orientation (false).
	 */
	public boolean yUp;
	
	// METHODS
	
	/**
	 * Creates a new Sphere object.
	 */
	public Sphere() {}
	
	/**
	 * Creates a new Sphere object.
	 * @param material material Defines the global material used on the faces in the sphere. 
	 */
	public Sphere(Material material) {}
	
	/**
	 * Creates a new Sphere object.
	 * @param material material Defines the global material used on the faces in the sphere. 
	 * @param radiusNumber Defines the radius of the sphere base. 
	 */
	public Sphere(Material material, int radius) {}
	
	/**
	 * Creates a new Sphere object.
	 * @param material material Defines the global material used on the faces in the sphere. 
	 * @param radiusNumber Defines the radius of the sphere base. 
	 * @param segmentsW Defines the number of horizontal segments that make up the sphere. 
	 */
	public Sphere(Material material, int radius, int segmentsW) {}
	
	/**
	 * Creates a new Sphere object.
	 * @param material material Defines the global material used on the faces in the sphere. 
	 * @param radiusNumber Defines the radius of the sphere base. 
	 * @param segmentsW Defines the number of horizontal segments that make up the sphere. 
	 * @param segmentsH Defines the number of vertical segments that make up the sphere. 
	 */
	public Sphere(Material material, int radius, int segmentsW, int segmentsH) {}
	
	/**
	 * Creates a new Sphere object.
	 * @param material Defines the global material used on the faces in the sphere. 
	 * @param radiusNumber Defines the radius of the sphere base. 
	 * @param segmentsW Defines the number of horizontal segments that make up the sphere. 
	 * @param segmentsH Defines the number of vertical segments that make up the sphere. 
	 * @param yUp Defines whether the coordinates of the sphere points use a yUp orientation (true) or a zUp orientation (false). 
	 */
	public Sphere(Material material, int radius, int segmentsW, int segmentsH, boolean yUp) {}
	
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
