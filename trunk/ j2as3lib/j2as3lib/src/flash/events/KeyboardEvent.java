package flash.events;

public class KeyboardEvent extends Event {

	// CONSTANTS
	
	/**
	 * [static] The KeyboardEvent.KEY_DOWN constant defines the value of the type property of a keyDown event object.
	 */
	public static final String KEY_DOWN = "keyDown";
	
	/**
	 * [static] The KeyboardEvent.KEY_UP constant defines the value of the type property of a keyDown event object.
	 */
	public static final String KEY_UP = "keyUp";
	
	// PROPERTY
	
	/**
	 * Indicates whether the Alt key is active (true) or inactive (false) on Windows; indicates whether the Option key is active on Mac OS. 
	 */
	public boolean altKey;
	
	/**
	 * Contains the character code value of the key pressed or released. The character code values are English keyboard values. For example, if you press Shift+3, charCode is # on a Japanese keyboard, just as it is on an English keyboard. 
	 */
	public byte charCode;	
	
	/**
	 * AIR Only. Indicates whether the Command key is active (true) or inactive (false). Supported for Mac OS only. On Mac OS, the commandKey property has the same value as the ctrlKey property. 
	 */
	public byte commandKey;
	
	/**
	 * Indicates whether the Control key is active (true) or inactive (false). On Windows and Linux, this is also true when the Ctrl key is active. 
	 */
	public boolean controlKey;
	
	/**
	 * On Windows and Linux, indicates whether the Ctrl key is active (true) or inactive (false); On Mac OS, indicates whether either the Ctrl key or the Command key is active. 
	 */
	public boolean ctrlKey;
	
	/**
	 * The key code value of the key pressed or released. 
	 */
	public byte keyCode;
	
	/**
	 * Indicates the location of the key on the keyboard. This is useful for differentiating keys that appear more than once on a keyboard. For example, you can differentiate between the left and right Shift keys by the value of this property: KeyLocation.LEFT for the left and KeyLocation.RIGHT for the right. Another example is differentiating between number keys pressed on the standard keyboard (KeyLocation.STANDARD) versus the numeric keypad (KeyLocation.NUM_PAD). 
	 */
	public byte keyLocation;
	
	/**
	 * Indicates whether the Shift key modifier is active (true) or inactive (false). 
	 */
	public boolean shiftKey;
	
	// METHODS
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 */
	public KeyboardEvent() {}
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 */
	public KeyboardEvent(String type) {}
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 */
	public KeyboardEvent(String type, boolean bubbles) {}
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 */
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable) {}
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 */
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue) {}
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 * @param keyCodeValue The key code value of the key pressed or released. 
	 */
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue, byte keyCodeValue) {}
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 * @param keyCodeValue The key code value of the key pressed or released. 
	 * @param keyLocationValue The location of the key on the keyboard. 
	 */
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue, byte keyCodeValue, byte keyLocationValue) {}
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 * @param keyCodeValue The key code value of the key pressed or released. 
	 * @param keyLocationValue The location of the key on the keyboard. 
	 * @param ctrlKeyValue On Windows, indicates whether the Ctrl key is activated. On Mac, indicates whether either the Ctrl key or the Command key is activated.
	 */
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue, byte keyCodeValue, byte keyLocationValue, boolean ctrlKeyValue) {}
		   
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 * @param keyCodeValue The key code value of the key pressed or released. 
	 * @param keyLocationValue The location of the key on the keyboard. 
	 * @param ctrlKeyValue On Windows, indicates whether the Ctrl key is activated. On Mac, indicates whether either the Ctrl key or the Command key is activated.
	 * @param altKeyValue Indicates whether the Alt key modifier is activated (Windows only). 
	 */		
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue, byte keyCodeValue, byte keyLocationValue, boolean ctrlKeyValue, boolean altKeyValue) {}
		   
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 * @param keyCodeValue The key code value of the key pressed or released. 
	 * @param keyLocationValue The location of the key on the keyboard. 
	 * @param ctrlKeyValue On Windows, indicates whether the Ctrl key is activated. On Mac, indicates whether either the Ctrl key or the Command key is activated.
	 * @param altKeyValue Indicates whether the Alt key modifier is activated (Windows only). 
	 * @param shiftKeyValue Indicates whether the Shift key modifier is activated. 
	 */	
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue, byte keyCodeValue, byte keyLocationValue, boolean ctrlKeyValue, boolean altKeyValue,
	       boolean shiftKeyValue) {}	
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 * @param keyCodeValue The key code value of the key pressed or released. 
	 * @param keyLocationValue The location of the key on the keyboard. 
	 * @param ctrlKeyValue On Windows, indicates whether the Ctrl key is activated. On Mac, indicates whether either the Ctrl key or the Command key is activated.
	 * @param altKeyValue Indicates whether the Alt key modifier is activated (Windows only). 
	 * @param shiftKeyValue Indicates whether the Shift key modifier is activated. 
	 * @param controlKeyValue Indicates whether the Control key is activated on Mac, and whether the Control or Ctrl keys are activated on WIndows and Linux. 
	 */
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue, byte keyCodeValue, byte keyLocationValue, boolean ctrlKeyValue, boolean altKeyValue,
			boolean shiftKeyValue, boolean controlKeyValue) {}	
	
	/**
	 * Creates an Event object that contains specific information about keyboard events. Event objects are passed as parameters to event listeners. 
	 * @param type The type of the event. Possible values are: KeyboardEvent.KEY_DOWN and KeyboardEvent.KEY_UP
	 * @param bubbles  Determines whether the Event object participates in the bubbling stage of the event flow.
	 * @param cancelable Determines whether the Event object can be canceled. 
	 * @param charCodeValue The character code value of the key pressed or released. The character code values returned are English keyboard values. For example, if you press Shift+3, the Keyboard.charCode() property returns # on a Japanese keyboard, just as it does on an English keyboard. 
	 * @param keyCodeValue The key code value of the key pressed or released. 
	 * @param keyLocationValue The location of the key on the keyboard. 
	 * @param ctrlKeyValue On Windows, indicates whether the Ctrl key is activated. On Mac, indicates whether either the Ctrl key or the Command key is activated.
	 * @param altKeyValue Indicates whether the Alt key modifier is activated (Windows only). 
	 * @param shiftKeyValue Indicates whether the Shift key modifier is activated. 
	 * @param controlKeyValue Indicates whether the Control key is activated on Mac, and whether the Control or Ctrl keys are activated on WIndows and Linux. 
	 * @param commandKeyValue Indicates whether the Command key is activated (Mac only). 
	 */
	public KeyboardEvent(String type, boolean bubbles, boolean cancelable, byte charCodeValue, byte keyCodeValue, byte keyLocationValue, boolean ctrlKeyValue, boolean altKeyValue,
					 	 boolean shiftKeyValue, boolean controlKeyValue, boolean commandKeyValue) {}
	
	
	/**
	 * Creates a copy of the KeyboardEvent object and sets the value of each property to match that of the original. 
	 */
	@Override
	public Event clone() {
		return new Event();
	}
	
	/**
	 *  Returns a string that contains all the properties of the KeyboardEvent object. The string is in the following format:[KeyboardEvent type=value bubbles=value cancelable=value ... shiftKey=value]
	 */
	@Override
	public String toString() {
		return "";
	}
	
	/**
	 * Indicates that the display should be rendered after processing of this event completes, if the display list has been modified 
	 */
	public void updateAfterEvent() {}
}
