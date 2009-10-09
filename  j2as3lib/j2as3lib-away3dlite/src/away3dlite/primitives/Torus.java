package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class Torus extends AbstractPrimitive {
	
	/**
	 * Defines the radius of the Torus.
	 */
	public float radius;
	
	/**
	 * Defines the number of radial  segments that make up the torus.
	 */
	public int segmentsR;
	
	/**
	 * Defines the number of tubular  segments that make up the torus.
	 */
	public int segmentsT;
	
	/**
	 * Defines the tube radius of the torus.
	 */
	public float tube;
	
	/**
	 * Defines whether the coordinates of the Torus points use a yUp orientation (true) or a zUp orientation (false).
	 */
	public boolean yUp;
	
	// METHODS
	
	/**
	 * Creates a new Torus object.
	 */
	public Torus() {}
	
	/**
	 * Creates a new Torus object.
	 * @param material material Defines the global material used on the faces in the Torus. 
	 */
	public Torus(Material material) {}
	
	/**
	 * Creates a new Torus object.
	 * @param material material Defines the global material used on the faces in the Torus. 
	 * @param radius Defines the radius of the Torus base. 
	 */
	public Torus(Material material, int radius) {}
	
	/**
	 * Creates a new Torus object.
	 * @param material Defines the global material used on the faces in the Torus. 
	 * @param radius Defines the overall radius of the torus. 
	 * @param tube Defines the tube radius of the torus.
	 */
	public Torus(Material material, int radius, int tube) {}
	
	
	/**
	 * Creates a new Torus object.
	 * @param material material Defines the global material used on the faces in the Torus. 
	 * @param radius Defines the overall radius of the torus. 
	 * @param tube Defines the tube radius of the torus. 
	 * @param segmentsR Defines the number of radial  segments that make up the Torus. 
	 */
	public Torus(Material material, int radius, int tube, int segmentsR) {}
	
	/**
	 * Creates a new Torus object.
	 * @param material material Defines the global material used on the faces in the Torus. 
	 * @param radius Defines the overall radius of the torus. 
	 * @param tube Defines the tube radius of the torus. 
	 * @param segmentsR Defines the number of radial  segments that make up the Torus. 
	 * @param segmentsT Defines the number of vertical segments that make up the Torus. 
	 */
	public Torus(Material material, int radius, int tube, int segmentsR, int segmentsT) {}
	
	/**
	 * Creates a new Torus object.
	 * @param material Defines the global material used on the faces in the Torus. 
	 * @param radius Defines the radius of the Torus base. 
	 * @param tube Defines the overall radius of the torus. 
	 * @param segmentsR Defines the number of radial  segments that make up the Torus. 
	 * @param segmentsT Defines the number of vertical segments that make up the Torus. 
	 * @param yUp Defines whether the coordinates of the Torus points use a yUp orientation (true) or a zUp orientation (false). 
	 */
	public Torus(Material material, int radius, int segmentsR, int segmentsT, int tube, boolean yUp) {}	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	@Override
	protected void buildPrimitive() {}
	
	/**
	 * Duplicates the torus properties to another Torus object. 
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
