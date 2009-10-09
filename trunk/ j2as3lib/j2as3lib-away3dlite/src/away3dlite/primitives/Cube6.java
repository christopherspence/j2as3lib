package away3dlite.primitives;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;

public class Cube6 extends AbstractPrimitive {
	
	/**
	 * Defines the depth of the cube
	 */
	public int depth;
	
	/**
	 * Defines the height of the cube.
	 */
	public int height;
	
	/**
	 *  Defines the texture mapping border in pixels used around each face of the cube.
	 */
	public int pixelBorder;
	
	/**
	 * Defines the number of depth segments that make up the cube.
	 */
	public int segmentsD;
	
	/**
	 * Defines the number of vertical segments that make up the Cube6.
	 */
	public int segmentsH;
	
	/**
	 * Defines the number of horizontal segments that make up the Cube6.
	 */
	public int segmentsW;
	
	/**
	 * Defines the width of the cube.
	 */
	public int width;
	
	/**
	 * 
	 */
	public Cube6() {}
	
	/**
	 * 
	 * @param material Defines the global material used on the faces in the cube6. 
	 */
	public Cube6(Material material) {}
	
	/**
	 * Cube6 constructor takes an init object has a single parameter. The init object can define the 'radius' of the base of the Cube6, 'height' the height, 'segmentsW' the number of segments around the Cube6 horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the cube6.  
	 * @param radius Defines the radius of the Cube6 base. 
	 */
	public Cube6(Material material, int width) {}
	
	/**
	 * Cube6 constructor takes an init object has a single parameter. The init object can define the 'width' of the base of the Cube6, 'height' the height, 'segmentsW' the number of segments around the Cube6 horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the Cube6. 
	 * @param width Defines the width of the Cube6. 
	 * @param height Defines the height of the Cube6. 
	 */
	public Cube6(Material material, int width, int height) {}
	
	/**
	 * Cube6 constructor takes an init object has a single parameter. The init object can define the 'width' of the base of the Cube6, 'height' the height, 'segmentsW' the number of segments around the Cube6 horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the Cube6. 
	 * @param width Defines the width of the Cube6. 
	 * @param height Defines the height of the Cube6. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cube6.
	 */
	public Cube6(Material material, int width, int height, int segmentsW) {}
	
	/**
	 * Cube6 constructor takes an init object has a single parameter. The init object can define the 'width' of the base of the Cube6, 'height' the height, 'segmentsW' the number of segments around the Cube6 horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the Cube6. 
	 * @param width Defines the width of the Cube6. 
	 * @param height Defines the height of the Cube6. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cube6. 
	 * @param segmentsH Defines the number of vertical segments that make up the Cube6. 
	 */
	public Cube6(Material material, int width, int height, int segmentsW, int segmentsH) {}
	
	/**
	 * Cube6 constructor takes an init object has a single parameter. The init object can define the 'width' of the base of the Cube6, 'height' the height, 'segmentsW' the number of segments around the Cube6 horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the Cube6. 
	 * @param width Defines the width of the Cube6. 
	 * @param height Defines the height of the Cube6. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cube6. 
	 * @param segmentsH Defines the number of vertical segments that make up the Cube6. 
	 * @param segmentsD Defines the the number of depth segments that make up the cube. 
	 */
	public Cube6(Material material, int width, int height, int segmentsW, int segmentsH,
				 int segmentsD) {}
	
	/**
	 * Cube6 constructor takes an init object has a single parameter. The init object can define the 'width' of the base of the Cube6, 'height' the height, 'segmentsW' the number of segments around the Cube6 horizontally and 'segmentsH' the number of segments vertically.
	 * @param material Defines the global material used on the faces in the Cube6. 
	 * @param width Defines the width of the Cube6. 
	 * @param height Defines the height of the Cube6. 
	 * @param segmentsW Defines the number of horizontal segments that make up the Cube6. 
	 * @param segmentsH Defines the number of vertical segments that make up the Cube6. 
	 * @param segmentsD Defines the the number of depth segments that make up the cube.  
	 * @param pixelBorder Defines the texture mapping border in pixels used around each face of the cube.  
	 */
	public Cube6(Material material, int width, int height, int segmentsW, int segmentsH,
			int segmentsD, int pixelBorder) {}
	
	
	/**
	 * Builds the vertex, face and uv objects that make up the 3d primitive. 
	 */
	@Override
	protected void buildPrimitive() {}
	
	/**
	 * Duplicates the Cube6 properties to another Cube6 object. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone() {
		return new Object3D();
	}
	
	/**
	 * Duplicates the Cube6 properties to another Cube6 object. 
	 * @param object [optional] The new object instance into which all properties are copied. The default is Cube6. 
	 * @return The new object instance with duplicated properties applied. 
	 */
	public Object3D clone(Object3D object) {
		return new Object3D();
	}
	
}
