package away3dlite.core.base;

import away3dlite.materials.Material;
import flash.base.Vector;
import flash.geom.*;

public class Mesh extends Object3D {

	/**
	 * Determines whether the faces in the mesh are visible on both sides (true) or just the front side (false).
	 */
	public boolean bothsides;
	
	/**
	 * [read-only] Returns the faces used in the mesh.
	 */
	public Vector faces;
	
	/**
	 * Determines the global material used on the faces in the mesh.
	 */
	public Material material;
	
	/**
	 * Determines if the faces in the mesh are sorted.
	 */
	public boolean sortFaces = true;
	
	/**
	 * Determines by which mechanism vertices are sorted.
	 */
	public String sortType;
	
	/**
	 * [read-only] Returns the 3d vertices used in the mesh.
	 */
	public Vector vertices;
}
