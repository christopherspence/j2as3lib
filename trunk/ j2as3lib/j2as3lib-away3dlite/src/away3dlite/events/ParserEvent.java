package away3dlite.events;

import away3dlite.core.base.Object3D;
import away3dlite.loaders.AbstractParser;
import flash.events.Event;

public class ParserEvent extends Event {

	// CONSTANTS
	
	/**
	 * Defines the value of the type property of a parseError event object. 
	 */
	public static final String PARSE_ERROR = "parseError";
	
	/**
	 * Defines the value of the type property of a parseProgress event object. 
	 */
	public static final String PAGE_PROGRESS = "parseProgress";
	
	/**
	 * Defines the value of the type property of a parseSuccess event object. 
	 */
	public static final String PARSE_SUCCESS = "parseSuccess";
	
	// PROPERTIES
	
	/**
	 * A reference to the loader object that is relevant to the event.
	 */
	public AbstractParser parser;
	
	/**
	 * A reference to the parsed object that is relevant to the event.
	 */
	public Object3D result;
	
	public ParserEvent() {}
	
	/**
	 * 
	 * @param type The type of the event. Possible values are: Loader3DEvent.PARSE_SUCCESS, Loader3DEvent.PARSE_ERROR and Loader3DEvent.PARSE_PROGRESS. 
	 * @param parser A reference to the parser object that is relevant to the event. 
	 * @param result A reference to the parsed object that is relevant to the event. 
	 */
	public ParserEvent(String type, AbstractParser parser, Object3D result) {}
	
	// METHODS
	
	/**
	 * Creates a copy of the Loader3DEvent object and sets the value of each property to match that of the original. 
	 */
	@Override
	public Event clone() {
		return new Event();
	}
}
