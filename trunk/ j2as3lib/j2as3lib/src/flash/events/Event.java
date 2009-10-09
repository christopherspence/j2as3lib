package flash.events;

import flash.base.Object;

public class Event extends Object {
	// PROPERTIES
	
	/**
	 * [read-only] Indicates whether an event is a bubbling event.
	 */
	public boolean bubbles;
	
	/**
	 * [read-only] Indicates whether the behavior associated with the event can be prevented.
	 */
	public boolean cancelable;
	
	/**
	 * [read-only] The object that is actively processing the Event object with an event listener.
	 */
	public Object currentTarget;

	/**
	 * [read-only] The current phase in the event flow.
	 */
	public int eventPhase;
	
	/**
	 * [read-only] The event target.
	 */
	public Object target;
	
	/**
	 * [read-only] The type of event.
	 */
	public String type;
	
	// TODO - METHODS
}
