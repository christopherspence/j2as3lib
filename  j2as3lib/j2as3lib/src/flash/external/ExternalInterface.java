package flash.external;

import flash.base.Function;
import flash.base.Object;

public class ExternalInterface extends Object {
	// PROPERTIES
	
	/**
	 * [static] [read-only] Indicates whether this player is in a container that offers an external interface.
	 */
	public static boolean available;
	
	/**
	 * [static] Indicates whether the external interface should attempt to pass ActionScript exceptions to the current browser and JavaScript exceptions to Flash Player.
	 */
	public static boolean marshallExceptions;
	
	/**
	 * [static] [read-only] Returns the id attribute of the object tag in Internet Explorer, or the name attribute of the embed tag in Netscape.
	 */
	public static String objectID;
	
	// METHODS
	
	/**
	 * [static] Registers an ActionScript method as callable from the container.
	 */
	public static void addCallback(String functionName, Function closure) {}
	
	/*
	 * [static] Calls a function exposed by the Flash Player container, passing zero or more arguments.
	 */
	public static Object call(String functionName) {
		return new Object();
	}
	
	/*
	 * [static] Calls a function exposed by the Flash Player container, passing zero or more arguments.
	 */
	public static Object call(String functionName, Object... arguments) {
		return new Object();
	}
}
