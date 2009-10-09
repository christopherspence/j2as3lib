package away3dlite.events;

import away3dlite.core.base.Object3D;
import away3dlite.materials.Material;
import flash.events.Event;
import flash.geom.Vector3D;

public class MouseEvent3D extends Event {

	// CONSTANTS
	/**
	 * [static] Defines the value of the type property of a mouseDown3d event object.
	 */
	public String MOUSE_DOWN = "mouseDown3d";
	
	/**
	 * [static] Defines the value of the type property of a mouseMove3d event object.
	 */
	public String MOUSE_MOVE = "mouseMove3d";
	
	/**
	 * [static] Defines the value of the type property of a mouseOut3d event object.
	 */
	public String MOUSE_OUT = "mouseOut3d";
	
	/*
	 * [static] Defines the value of the type property of a mouseOver3d event object.
	 */
	public String MOUSE_OVER = "mouseOver3d";
	
	/*
	 * [static] Defines the value of the type property of a mouseUp3d event object.
	 */
	public String MOUSE_UP = "mouseUp3d";
		
	/*
	 * [static] Defines the value of the type property of a rollOut3d event object.
	 */
	public String ROLL_OUT = "rollOut3d";
	
	/*
	 * [static] Defines the value of the type property of a rollOver3d event object.
	 */
	public String ROLL_OVER = "rollOver3d";
	
	// PROPERTIES 
	
	/**
	 * Indicates whether the Control key is active (true) or inactive (false).
	 */
	public boolean ctrlKey;

	/**
	 *  The material of the 3d element inside which the event took place.
	 */	
	public Material material;
	
	/**
	 *  The 3d object inside which the event took place.
	 */
	public Object3D object;
	
	/**
	 *  The xyz coordinate at which the event occurred in global scene coordinates.
	 */
	public Vector3D scenePosition;
	
	/**
	 * The horizontal coordinate at which the event occurred in view coordinates.
	 */
	public int screenX;
	
	/**
	 * The vertical coordinate at which the event occurred in view coordinates.
	 */
	public int screenY;
	
	/**
	 * Indicates whether the Shift key is active (true) or inactive (false).
	 */
	public boolean shiftKey;
	
	/**
	 * The uvt coordinate inside the triangle where the event took place.
	 */
	public Vector3D uvt;
	
	/**
	 * The view object inside which the event took place.
	 */
	public View3D view;
	
	// METHODS
	
	/**
	 * Creates a new MouseEvent3D object.
	 */
	public MouseEvent3D(String type) {}
	
	/**
	 * Creates a copy of the MouseEvent3D object and sets the value of each property to match that of the original.
	 */
	public Event clone() {
		return new Event();		
	}
	
	
}
