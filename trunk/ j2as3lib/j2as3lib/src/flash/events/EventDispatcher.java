package flash.events;

import flash.base.Object;
import flash.base.Function;

public class EventDispatcher extends Object {
	
	/**
	 * Aggregates an instance of the EventDispatcher class.
	 */
	public EventDispatcher() {}
	
	/**
	 * Aggregates an instance of the EventDispatcher class.
	 * @param target
	 */
	public EventDispatcher(IEventDispatcher target) {}
	
	/**
	 * Registers an event listener object with an EventDispatcher object so that the listener receives notification of an event.
	 * @param type
	 * @param listener
	 */
	public void addEventListener(String type, EventHandler listener) {} 
	
	/**
	 * Registers an event listener object with an EventDispatcher object so that the listener receives notification of an event. 
	 */
	public void addEventListener(String type, EventHandler listener, boolean useCapture, int priority, boolean useWeakReference) {}
	
	/**
	 * Dispatches an event into the event flow.
	 * @param event
	 * @return
	 */
	public boolean dispatchEvent(Event event) {
		return true;
	}
	
	/**
	 * Checks whether the EventDispatcher object has any listeners registered for a specific type of event.
	 * @param type
	 * @return
	 */
	public boolean hasEventListener(String type) {
		return true;
	}
	
	/**
	 * Removes a listener from the EventDispatcher object.
	 * @param type
	 * @return
	 */
	public boolean removeEventListener(String type) {
		return true;
	}
	
	/**
	 * Removes a listener from the EventDispatcher object.
	 * @param type
	 * @param listener
	 * @param useCapture
	 * @return
	 */
	public boolean removeEventListener(String type, Function listener, boolean useCapture) {
		return true;
	}
	
	/**
	 * Checks whether an event listener is registered with this EventDispatcher object or any of its ancestors for the specified event type.
	 * @param type
	 * @return
	 */
	public boolean willTrigger(String type) {
		return true;		
	}
}
