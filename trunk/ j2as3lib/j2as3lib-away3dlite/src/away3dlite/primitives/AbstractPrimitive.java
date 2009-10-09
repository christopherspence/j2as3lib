package away3dlite.primitives;

import flash.base.Vector;
import away3dlite.core.base.Mesh;
import away3dlite.materials.Material;

public class AbstractPrimitive extends Mesh {

	// PROPERTIES
	
	/**
	 * [read-only] Returns the faces used in the mesh.
	 */
	public Vector faces;
	
	/**
	 * [read-only] Returns the 3d vertices used in the mesh.
	 */
	public Vector vertices;
	
	// METHODS
	
	public AbstractPrimitive() {}
	
	/**
	 * 
	 * @param material Defines the global material used on the faces in the primitive. 
	 */
	public AbstractPrimitive(Material material) {}
	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	protected void buildPrimitive() {}
	
	/**
	 * 
	 */
	protected void updatePrimitive() {}
}
