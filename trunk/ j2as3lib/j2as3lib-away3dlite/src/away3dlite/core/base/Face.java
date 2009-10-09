package away3dlite.core.base;

import away3dlite.materials.Material;
import flash.base.Function;
import flash.geom.Vector3D;

public class Face {
	
	/**
	 * selected function for calculating the screen Z coordinate of the face.
	 */
	public Function calculateScreenZ;
	
	/**
	 * Index value of the first vertex in the face.
	 */
	public int i0;
	
	/**
	 * Index value of the second vertex in the face.
	 */
	public int i1;
	
	/**
	 * Index value of the third vertex in the face.
	 */
	public int i2;
	
	/**
	 * Index value of the face.
	 */
	public int index;
	
	/**
	 * Material of the face.
	 */
	public Material material;
	
	/**
	 * t index of the first mapping value.
	 */
	public int t0;
	
	/**
	 * t index of the second mapping value.
	 */
	public int t1;
	
	/**
	 * t index of the third mapping value.
	 */
	public int t2;
	
	/**
	 * u index of the first mapping value.	
	 */
	public int u0;
	
	/**
	 * u index of the second mapping value.
	 */
	public int u1;
	
	/**
	 * u index of the third mapping value.
	 */
	public int u2;
	
	/**
	 * v index of the first mapping value.
	 */
	public int v0;
	
	/**
	 * v index of the second mapping value.
	 */
	public int v1;
	
	/**
	 * v index of the third mapping value.
	 */
	public int v2;
	
	/**
	 * x index of the first screen vertex.
	 */
	public int x0;
	
	/**
	 * x index of the second screen vertex.
	 */
	public int x1;
	
	/**
	 * x index of the third screen vertex.
	 */
	public int x2;
	
	/**
	 * y index of the first screen vertex.
	 */
	public int y0;
	
	/**
	 * y index of the second screen vertex.
	 */
	public int y1;
	
	/**
	 * y index of the third screen vertex.
	 */
	public int y2;
	
	public Face() {}
	
	public Face(Mesh mesh, int i) {}
	
	/**
	 * Returns the average screen Z coordinate of the face.
	 * @return
	 */
	public int calculateAverageZ() {
		return 0;
	}
	
	/**
	 * Returns the furthest screen Z coordinate of the face.
	 * @return
	 */
	public int calculateFurthestZ() {
		return 0;
	}
	
	/**
	 * Returns the nearest screen Z coordinate of the face.
	 * @return
	 */
	public int calculateNearestZ() {
		return 0;
	}
	
	/**
	 * Returns the uvt coordinate of the face at the given screen coordinate.
	 * @param x
	 * @param y
	 * @return
	 */
	public Vector3D calculateUVT(int x, int y) {
		return new Vector3D();
	}
}
