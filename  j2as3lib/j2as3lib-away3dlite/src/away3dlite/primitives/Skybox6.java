package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class Skybox6 extends AbstractPrimitive {
	
	/**
	 * Defines the texture mapping border in pixels used around each face of the skybox.
	 */
	public int pixelBorder;
	
	/**
	 * Defines the number of segments that make up each face of the skybox.
	 */
	public int segments;
	
	/**
	 * Defines the dimensions of the skybox.
	 */
	public int size;

	/**
	 * Creates a new Skybox6 object.
	 */
	public Skybox6() {}
	
	/**
	 * Creates a new Skybox6 object.
	 * @param material Defines the global material used on the faces in the skybox. 
	 */
	public Skybox6(Material material) {}
	
	/**
	 * Creates a new Skybox6 object.
	 * @param material Defines the global material used on the faces in the skybox. 
	 * @param size Defines the size of the skybox. 
	 */
	public Skybox6(Material material, int size) {}
	
	/**
	 * Creates a new Skybox6 object. 
	 * @param material Defines the global material used on the faces in the skybox. 
	 * @param size Defines the size of the skybox. 
	 * @param segments Defines the number of segments that make up each face of the skybox. 
	 */
	public Skybox6(Material material, int size, int segments) {}
	
	/**
	 * Creates a new Skybox6 object.
	 * @param material Defines the global material used on the faces in the skybox. 
	 * @param size Defines the size of the skybox. 
	 * @param segments Defines the number of segments that make up each face of the skybox. 
	 * @param pixelBorder Defines the texture mapping border in pixels used around each face of the skybox. 
	 */
	public Skybox6(Material material, int size, int segments, int pixelBorder) {}
	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	@Override
	protected void buildPrimitive() {}	
		
	/**
	 * Duplicates the cone properties to another Skybox6 object. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone() {
		return new Object3D();
	}
	
	/**
	 * Duplicates the cone properties to another Cone object. 
	 * @param object [optional] The new object instance into which all properties are copied. The default is Skybox6. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone(Object3D object) {
		return new Object3D();
	}
}
