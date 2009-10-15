package flash.utils;

import flash.events.Event;

public class TimerEvent extends Event {
	// PROPERTIES
	
	/**
	 * [static] Defines the value of the type property of a timer event object.
	 */
	public static final String TIMER = "timer";
	
	/**
	 * [static] Defines the value of the type property of a timerComplete event object.
	 */
	public static final String TIMER_COMPLETE = "timerComplete";
	
	//METHODS
	
	/**
	 * 
	 * @param type The type of the event. Event listeners can access this information through the inherited type property. 
	 * @param bubbles Determines whether the Event object bubbles. Event listeners can access this information through the inherited bubbles property.
	 * @param cancelable Determines whether the Event object can be canceled. Event listeners can access this information through the inherited cancelable property. 
	 */
	public TimerEvent(String type, boolean bubbles, boolean cancelable) {}
	
	/**
	 * Creates a copy of the TimerEvent object and sets each property's value to match that of the original.
	 * @return A new TimerEvent object with property values that match those of the original.  
	 */
	@Override
	public Event clone() {
		return new Event();
	}
	
	/**
	 *  Returns a string that contains all the properties of the TimerEvent object. The string is in the following format: [TimerEvent type=value bubbles=value cancelable=value]
	 *  @return A string that contains all the properties of the TimerEvent object. 
	 */
	@Override
	public String toString() {
		return "";
	}
	
	/**
	 * nstructs Flash Player or the AIR runtime to render after processing of this event completes, if the display list has been modified. 
	 */
	public void updateAfterEvent() {}
	
	
}
