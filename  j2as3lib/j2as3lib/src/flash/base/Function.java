package flash.base;

import flash.base.Object;

public class Function extends Object {
	
	/**
	 * Specifies the value of thisObject to be used within any function that ActionScript calls.
	 * @param thisArg
	 * @param argArray
	 */
	public void apply(Object thisArg, Object argArray) {}
	
	/**
	 * Invokes the function represented by a Function object.
	 * @param thisArg
	 * @param args
	 */
	public void call(Object thisArg, Object... args) {}
}
