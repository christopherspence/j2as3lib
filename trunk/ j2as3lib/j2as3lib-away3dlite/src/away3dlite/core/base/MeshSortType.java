package away3dlite.core.base;

public class MeshSortType {
	
	/**
	 * Sorts the faces in the mesh using their furthest vertex z-depth. 
	 */
	public final String BACK = "back";
	
	/**
	 * Sorts the faces in the mesh using their center z-depth ie. the average between all vertices. 
	 */
	public final String CENTER = "center";
	
	/**
	 * Sorts the faces in the mesh using their nearest vertex z-depth. 
	 */
	public final String FRONT = "front";
}
