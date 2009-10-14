package flash.events;

import flash.base.Object;

public class Event extends Object {
	// CONSTANTS
	
	/**
	 * [static] The Event.ACTIVATE constant defines the value of the type property of an activate event object.
	 */
	public static final String ACTIVATE = "activate";
	
	/**
	 * [static] The Event.ADDED constant defines the value of the type property of an added event object.
	 */
	public static final String ADDED = "added";
	
	/**
	 * 	[static] The Event.ADDED_TO_STAGE constant defines the value of the type property of an addedToStage event object.
	 */
	public static final String ADDED_TO_STAGE = "addedToStage";
	
	/**
	 * [static] The Event.CANCEL constant defines the value of the type property of a cancel event object.
	 */
	public static final String CANCEL = "cancel";
	
	/**
	 * [static] The Event.CHANGE constant defines the value of the type property of a change event object.
	 */
	public static final String CHANGE = "change";
	
	/**
	 * [static] The Event.CLOSE constant defines the value of the type property of a close event object.
	 */
	public static final String CLOSE = "close";
	
	/**
	 * AIR Only. [static] The Event.CLOSING constant defines the value of the type property of a closing event object.
	 */
	public static final String CLOSING = "closing";
	
	/**
	 * 	[static] The Event.COMPLETE constant defines the value of the type property of a complete event object.
	 */
	public static final String COMPLETE = "complete";
	
	/**
	 * [static] The Event.CONNECT constant defines the value of the type property of a connect event object.
	 */
	public static final String CONNECT = "connect";
	
	/**
	 * [static] The Event.DEACTIVATE constant defines the value of the type property of a deactivate event object.
	 */
	public static final String DEACTIVATE = "deactivate";
	
	/**
	 * [static] Defines the value of the type property of a displaying event object.
	 */
	public static final String DISPLAYING = "displaying";
	
	/**
	 * [static] The Event.ENTER_FRAME constant defines the value of the type property of an enterFrame event object.
	 */
	public static final String ENTER_FRAME = "enterFrame";
		
	/**
	 * AIR Only. [static] The Event.EXITING constant defines the value of the type property of an exiting event object.
	 */
	public static final String EXITING = "exiting";
	
	/**
	 * [static] The Event.FULL_SCREEN constant defines the value of the type property of a fullScreen event object.
	 */
	public static final String FULLSCREEN = "fullScreen";
	
	/**
	 * AIR Only. [static] The Event.HTML_BOUNDS_CHANGE constant defines the value of the type property of an htmlBoundsChange event object.
	 */
	public static final String HTML_BOUNDS_CHANGE = "htmlBoundsChange";
	
	/**
	 * AIR Only. [static] The Event.HTML_DOM_INITIALIZE constant defines the value of the type property of an htmlDOMInitialize event object.
	 */
	public static final String HTML_DOM_INITIALIZE = "htmlDOMInitialize";
	
	/**
	 * AIR Only. [static] The Event.HTML_RENDER constant defines the value of the type property of an htmlRender event object.
	 */
	public static final String HTML_RENDER = "htmlRender";
	
	/**
	 * [static] The Event.ID3 constant defines the value of the type property of an id3 event object.
	 */
	public static final String ID3 = "id3";
	
	/**
	 * [static] The Event.INIT constant defines the value of the type property of an init event object.
	 */
	public static final String INIT = "init";
	
	/**
	 * AIR Only. [static] The Event.LOCATION_CHANGE constant defines the value of the type property of a locationChange event object.
	 */
	public static final String LOCATION_CHANGE = "locationChange";
	
	/**
	 * [static] The Event.MOUSE_LEAVE constant defines the value of the type property of a mouseLeave event object.
	 */
	public static final String MOUSE_LEAVE = "mouseLeave";
	
	/**
	 * AIR Only. [static] The Event.NETWORK_CHANGE constant defines the value of the type property of a networkChange event object.
	 */
	public static final String NETWORK_CHANGE = "networkChange";
	
	/**
	 * [static] The Event.OPEN constant defines the value of the type property of an open event object.
	 */
	public static final String OPEN = "open";
	
	/**
	 * [static] The Event.REMOVED constant defines the value of the type property of a removed event object.
	 */
	public static final String REMOVED = "removed";
	
	/**
	 * [static] The Event.REMOVED_FROM_STAGE constant defines the value of the type property of a removedFromStage event object.
	 */
	public static final String REMOVED_FROM_STAGE = "removedFromStage";
	
	/**
	 * [static] The Event.RENDER constant defines the value of the type property of a render event object.
	 */
	public static final String RENDER = "render";
	
	/**
	 * [static] The Event.RESIZE constant defines the value of the type property of a resize event object.
	 */
	public static final String RESIZE = "resize";
	
	/**
	 * [static] The Event.SCROLL constant defines the value of the type property of a scroll event object.
	 */
	public static final String SCROLL = "scroll";
	
	/**
	 * [static] The Event.SELECT constant defines the value of the type property of a select event object.
	 */
	public static final String SELECT = "select";
	
	/**
	 * [static] The Event.SOUND_COMPLETE constant defines the value of the type property of a soundComplete event object.
	 */
	public static final String SOUND_COMPLETE = "soundComplete";
	
	/**
	 * [static] The Event.TAB_CHILDREN_CHANGE constant defines the value of the type property of a tabChildrenChange event object.
	 */
	public static final String TAB_CHILDREN_CHANGE = "tabChildrenChange";
	
	/**
	 * [static] The Event.TAB_ENABLED_CHANGE constant defines the value of the type property of a tabEnabledChange event object.
	 */
	public static final String TAB_ENABLED_CHANGE = "tabEnabledChange";
	
	/**
	 * [static] The Event.TAB_INDEX_CHANGE constant defines the value of the type property of a tabIndexChange event object.
	 */
	public static final String TAB_INDEX_CHANGE = "tabIndexChange";
	
	/**
	 * [static] The Event.UNLOAD constant defines the value of the type property of an unload event object.
	 */
	public static final String UNLOAD = "unload";
	
	/**
	 * AIR Only. [static] The Event.USER_IDLE constant defines the value of the type property of a userIdle event object.
	 */
	public static final String USER_IDLE = "userIdle";
	
	/**
	 * AIR Only. [static] The Event.USER_PRESENT constant defines the value of the type property of a userPresent event object.
	 */
	public static final String USER_PRESENT = "userPresent";
	
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
	
	// METHODS

	/**
	 * Duplicates an instance of an Event subclass. 
	 */
	public Event clone() {
		return new Event();
	}
	
	/**
	 * A utility function for implementing the toString() method in custom ActionScript 3.0 Event classes. Overriding the toString() method is recommended, but not required.
	 * @param className The name of your custom Event class. In the previous example, the className parameter is PingEvent.
	 * @param arguments The properties of the Event class and the properties that you add in your custom Event class. In the previous example, the ...arguments parameter includes type, bubbles, cancelable, eventPhase, and URL. 
	 * @return
	 */
	public String formatToString(String className, Object... arguments) {
		return "";
	}
	
	/**
	 * Checks whether the preventDefault() method has been called on the event. If the preventDefault() method has been called, returns true; otherwise, returns false. 
	 * @return If preventDefault() has been called, returns true; otherwise, returns false. 
	 */
	public boolean isDefaultPrevented() {
		return true;
	}
	
	/**
	 * Cancels an event's default behavior if that behavior can be canceled. 
	 */
	public void preventDefault() {}
	
	/**
	 * Prevents processing of any event listeners in the current node and any subsequent nodes in the event flow. This method takes effect immediately, and it affects event listeners in the current node. In contrast, the stopPropagation() method doesn't take effect until all the event listeners in the current node finish processing.
	 */
	public void stopImmediatePropagation() {}
	
	/**
	 * Prevents processing of any event listeners in nodes subsequent to the current node in the event flow. This method does not affect any event listeners in the current node (currentTarget). In contrast, the stopImmediatePropagation() method prevents processing of event listeners in both the current node and subsequent nodes. Additional calls to this method have no effect. This method can be called in any phase of the event flow.
	 */
	public void stopPropagation() {}
	
	/**
	 * Returns a string containing all the properties of the Event object. The string is in the following format:
	 * [Event type=value bubbles=value cancelable=value]
	 */
	public String toString() {
		return "";
	}
	
	
}
